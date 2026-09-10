// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class GetLhmDWResourceGroupStatusResponseBody extends TeaModel {
    /**
     * <p>The business data returned by the operation as a string. The specific content varies by operation.</p>
     * 
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("data")
    public String data;

    /**
     * <p>The error code. This parameter is an empty string if the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <p>The error message. This parameter is an empty string if the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("errMessage")
    public String errMessage;

    /**
     * <p>The request ID. You can use this ID to locate and troubleshoot issues related to this call.</p>
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
     * <li>false: The call failed. Use errCode and errMessage to troubleshoot the issue.</li>
     * </ul>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetLhmDWResourceGroupStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLhmDWResourceGroupStatusResponseBody self = new GetLhmDWResourceGroupStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLhmDWResourceGroupStatusResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetLhmDWResourceGroupStatusResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GetLhmDWResourceGroupStatusResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public GetLhmDWResourceGroupStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLhmDWResourceGroupStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
