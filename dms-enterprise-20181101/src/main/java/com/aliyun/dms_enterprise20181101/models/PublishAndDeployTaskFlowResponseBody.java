// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class PublishAndDeployTaskFlowResponseBody extends TeaModel {
    @NameInMap("DeployId")
    public Long deployId;

    /**
     * <p><PublishAndDeployTaskFlowResponse></p>
     * <p>    <RequestId>64E26249-B61F-51C6-B6DF-47EFF50128CC</RequestId></p>
     * <p>    <ErrorCode>UnknownError</ErrorCode></p>
     * <p>    <ErrorMessage>Unknown server error</ErrorMessage></p>
     * <p>    <Success>true</Success></p>
     * <p></PublishAndDeployTaskFlowResponse></p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>Publishes and deploys a task flow.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>12**</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>WB01220210</p>
     */
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
