// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class MakeTaskFlowInstanceSuccessResponseBody extends TeaModel {
    /**
     * <p>WB01220210</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>Sets the status of a task flow to "Successful".</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static MakeTaskFlowInstanceSuccessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MakeTaskFlowInstanceSuccessResponseBody self = new MakeTaskFlowInstanceSuccessResponseBody();
        return TeaModel.build(map, self);
    }

    public MakeTaskFlowInstanceSuccessResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public MakeTaskFlowInstanceSuccessResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public MakeTaskFlowInstanceSuccessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MakeTaskFlowInstanceSuccessResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
