// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class UpdateDeploymentResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DeploymentId")
    public String deploymentId;

    @NameInMap("Version")
    public String version;

    @NameInMap("DeployMetadata")
    public String deployMetadata;

    public static UpdateDeploymentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeploymentResponseBody self = new UpdateDeploymentResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDeploymentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateDeploymentResponseBody setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }
    public String getDeploymentId() {
        return this.deploymentId;
    }

    public UpdateDeploymentResponseBody setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public UpdateDeploymentResponseBody setDeployMetadata(String deployMetadata) {
        this.deployMetadata = deployMetadata;
        return this;
    }
    public String getDeployMetadata() {
        return this.deployMetadata;
    }

}
