// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class PublishAndDeployTaskFlowResponseBody extends TeaModel {
    @NameInMap("DeployId")
    public Long deployId;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static PublishAndDeployTaskFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PublishAndDeployTaskFlowResponseBody self = new PublishAndDeployTaskFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public PublishAndDeployTaskFlowResponseBody setDeployId(Long deployId) {
        this.deployId = deployId;
        return this;
    }
    public Long getDeployId() {
        return this.deployId;
    }

    public PublishAndDeployTaskFlowResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public PublishAndDeployTaskFlowResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public PublishAndDeployTaskFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PublishAndDeployTaskFlowResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
