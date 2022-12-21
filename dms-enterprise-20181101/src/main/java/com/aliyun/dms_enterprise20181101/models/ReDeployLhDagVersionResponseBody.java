// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ReDeployLhDagVersionResponseBody extends TeaModel {
    // The ID of the deployment record.
    @NameInMap("DeployId")
    public Long deployId;

    // The error code returned if the request fails.
    @NameInMap("ErrorCode")
    public String errorCode;

    // The error message returned if the request fails.
    @NameInMap("ErrorMessage")
    public String errorMessage;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request is successful. Valid values:
    // 
    // *   **true**: The request is successful.
    // *   **false**: The request fails.
    @NameInMap("Success")
    public Boolean success;

    public static ReDeployLhDagVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReDeployLhDagVersionResponseBody self = new ReDeployLhDagVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public ReDeployLhDagVersionResponseBody setDeployId(Long deployId) {
        this.deployId = deployId;
        return this;
    }
    public Long getDeployId() {
        return this.deployId;
    }

    public ReDeployLhDagVersionResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ReDeployLhDagVersionResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ReDeployLhDagVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReDeployLhDagVersionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
