// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class AddMetaDataComponentResponseBody extends TeaModel {
    /**
     * <p>The ID of the newly created data source. Subsequent operations reference this data source by this ID or the data source name.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("data")
    public Long data;

    /**
     * <p>The error code. An empty string is returned if the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <p>The error message. An empty string is returned if the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("errMessage")
    public String errMessage;

    /**
     * <p>The request ID, which is used to locate and troubleshoot issues with this call.</p>
     * 
     * <strong>example:</strong>
     * <p>4C467B38-3910-4477-9B0B-6963D83B4E72</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. A value of true indicates success. A value of false indicates failure. If the call fails, use errCode and errMessage to troubleshoot the issue.</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static AddMetaDataComponentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddMetaDataComponentResponseBody self = new AddMetaDataComponentResponseBody();
        return TeaModel.build(map, self);
    }

    public AddMetaDataComponentResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

    public AddMetaDataComponentResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public AddMetaDataComponentResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public AddMetaDataComponentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddMetaDataComponentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
