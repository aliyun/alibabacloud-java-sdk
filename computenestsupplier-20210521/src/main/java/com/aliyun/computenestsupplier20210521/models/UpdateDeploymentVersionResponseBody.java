// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class UpdateDeploymentVersionResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DeploymentId")
    public String deploymentId;

    @NameInMap("Version")
    public String version;

    @NameInMap("DeployMetadata")
    public String deployMetadata;

    public static UpdateDeploymentVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeploymentVersionResponseBody self = new UpdateDeploymentVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDeploymentVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateDeploymentVersionResponseBody setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }
    public String getDeploymentId() {
        return this.deploymentId;
    }

    public UpdateDeploymentVersionResponseBody setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public UpdateDeploymentVersionResponseBody setDeployMetadata(String deployMetadata) {
        this.deployMetadata = deployMetadata;
        return this;
    }
    public String getDeployMetadata() {
        return this.deployMetadata;
    }

}
