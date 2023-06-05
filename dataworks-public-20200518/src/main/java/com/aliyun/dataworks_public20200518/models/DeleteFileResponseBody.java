// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteFileResponseBody extends TeaModel {
    /**
     * <p>The ID of the request. You can troubleshoot errors based on the ID.</p>
     */
    @NameInMap("DeploymentId")
    public Long deploymentId;

    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <br>
     * <p>*   true: The request is successful.</p>
     * <p>*   false: The request fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the deployment task that deploys the file. If the file has been committed, an asynchronous process is triggered to delete the file in the scheduling system. The value of this parameter is used to call the GetDeployment operation to poll the status of the asynchronous process.</p>
     * <br>
     * <p>If this parameter is empty, the file is deleted and the polling is not required.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The error code returned.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteFileResponseBody self = new DeleteFileResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteFileResponseBody setDeploymentId(Long deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }
    public Long getDeploymentId() {
        return this.deploymentId;
    }

    public DeleteFileResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DeleteFileResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DeleteFileResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DeleteFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteFileResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
