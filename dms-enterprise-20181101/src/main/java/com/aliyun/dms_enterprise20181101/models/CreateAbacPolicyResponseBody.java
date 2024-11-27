// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateAbacPolicyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>12****</p>
     */
    @NameInMap("CreatePolicyResult")
    public Long createPolicyResult;

    /**
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>0C1CB646-1DE4-4AD0-B4A4-7D47DD52E931</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateAbacPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAbacPolicyResponseBody self = new CreateAbacPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAbacPolicyResponseBody setCreatePolicyResult(Long createPolicyResult) {
        this.createPolicyResult = createPolicyResult;
        return this;
    }
    public Long getCreatePolicyResult() {
        return this.createPolicyResult;
    }

    public CreateAbacPolicyResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateAbacPolicyResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateAbacPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAbacPolicyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
