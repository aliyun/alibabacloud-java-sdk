// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateTaskFlowEdgesResponseBody extends TeaModel {
    /**
     * <p>UpdateTaskFlowEdges</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>WB01220505</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>Updates the start and end nodes of specified edges of a specified task flow at a time.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static UpdateTaskFlowEdgesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskFlowEdgesResponseBody self = new UpdateTaskFlowEdgesResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateTaskFlowEdgesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UpdateTaskFlowEdgesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UpdateTaskFlowEdgesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateTaskFlowEdgesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
