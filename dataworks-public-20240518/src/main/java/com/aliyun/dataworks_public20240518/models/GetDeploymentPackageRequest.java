// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetDeploymentPackageRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000000001</p>
     */
    @NameInMap("DeploymentId")
    public Long deploymentId;

    /**
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <strong>example:</strong>
     * <p>dw_project</p>
     */
    @NameInMap("ProjectIdentifier")
    public String projectIdentifier;

    public static GetDeploymentPackageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDeploymentPackageRequest self = new GetDeploymentPackageRequest();
        return TeaModel.build(map, self);
    }

    public GetDeploymentPackageRequest setDeploymentId(Long deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }
    public Long getDeploymentId() {
        return this.deploymentId;
    }

    public GetDeploymentPackageRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public GetDeploymentPackageRequest setProjectIdentifier(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
        return this;
    }
    public String getProjectIdentifier() {
        return this.projectIdentifier;
    }

}
