// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class LlmSmartCallResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>UUID</p>
     */
    @NameInMap("CallRecordId")
    public String callRecordId;

    /**
     * <strong>example:</strong>
     * <p>NoPermission</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>5D8BD6E8-28D9-5451-BBA1-3D3DCA6971F6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public String success;

    public static LlmSmartCallResponseBody build(java.util.Map<String, ?> map) throws Exception {
        LlmSmartCallResponseBody self = new LlmSmartCallResponseBody();
        return TeaModel.build(map, self);
    }

    public LlmSmartCallResponseBody setCallRecordId(String callRecordId) {
        this.callRecordId = callRecordId;
        return this;
    }
    public String getCallRecordId() {
        return this.callRecordId;
    }

    public LlmSmartCallResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public LlmSmartCallResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public LlmSmartCallResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public LlmSmartCallResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
