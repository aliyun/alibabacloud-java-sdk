// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class CreateFunctionDeploymentResponseBody extends TeaModel {
    @NameInMap("DeploymentId")
    public String deploymentId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UploadSignedUrl")
    public String uploadSignedUrl;

    public static CreateFunctionDeploymentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFunctionDeploymentResponseBody self = new CreateFunctionDeploymentResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFunctionDeploymentResponseBody setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }
    public String getDeploymentId() {
        return this.deploymentId;
    }

    public CreateFunctionDeploymentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateFunctionDeploymentResponseBody setUploadSignedUrl(String uploadSignedUrl) {
        this.uploadSignedUrl = uploadSignedUrl;
        return this;
    }
    public String getUploadSignedUrl() {
        return this.uploadSignedUrl;
    }

}
