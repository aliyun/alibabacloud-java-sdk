// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ReDeployLhDagVersionResponseBody extends TeaModel {
    /**
     * <p>The ID of the deployment record.</p>
     * 
     * <strong>example:</strong>
     * <p>15990</p>
     */
    @NameInMap("DeployId")
    public Long deployId;

    /**
     * <p>The error code returned if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>403</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>035C92E0-2EAD-50E5-A6DD-550F5F73D7CE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request is successful.</li>
     * <li><strong>false</strong>: The request fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
