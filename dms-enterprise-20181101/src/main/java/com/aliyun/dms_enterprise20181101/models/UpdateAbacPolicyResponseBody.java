// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateAbacPolicyResponseBody extends TeaModel {
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
     * <p>CE43759B-5A72-560A-BF3D-862F38B36B9E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("UpdatePolicyResult")
    public Long updatePolicyResult;

    public static UpdateAbacPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAbacPolicyResponseBody self = new UpdateAbacPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAbacPolicyResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UpdateAbacPolicyResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UpdateAbacPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateAbacPolicyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UpdateAbacPolicyResponseBody setUpdatePolicyResult(Long updatePolicyResult) {
        this.updatePolicyResult = updatePolicyResult;
        return this;
    }
    public Long getUpdatePolicyResult() {
        return this.updatePolicyResult;
    }

}
