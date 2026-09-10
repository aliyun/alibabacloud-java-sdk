// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class GetSqlTransTableMetaInfoResponseBody extends TeaModel {
    /**
     * <p>The list of table names parsed from the script.</p>
     */
    @NameInMap("data")
    public java.util.List<String> data;

    /**
     * <p>The error code. This value is an empty string if the call succeeds.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <p>The error message. This value is an empty string if the call succeeds.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("errMessage")
    public String errMessage;

    /**
     * <p>The request ID that uniquely identifies the call. Provide this value when troubleshooting issues.</p>
     * 
     * <strong>example:</strong>
     * <p>4C467B38-3910-4477-9B0B-6963D83B4E72</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. Valid values:</p>
     * <ul>
     * <li>true: The call is successful.</li>
     * <li>false: The call failed. Check errCode and errMessage for troubleshooting.</li>
     * </ul>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetSqlTransTableMetaInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSqlTransTableMetaInfoResponseBody self = new GetSqlTransTableMetaInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSqlTransTableMetaInfoResponseBody setData(java.util.List<String> data) {
        this.data = data;
        return this;
    }
    public java.util.List<String> getData() {
        return this.data;
    }

    public GetSqlTransTableMetaInfoResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GetSqlTransTableMetaInfoResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public GetSqlTransTableMetaInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSqlTransTableMetaInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
