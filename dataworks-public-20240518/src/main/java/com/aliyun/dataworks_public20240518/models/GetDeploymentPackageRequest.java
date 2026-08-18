// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetDeploymentPackageRequest extends TeaModel {
    /**
     * <p>The ID of the deployment package.</p>
     * <p>A deployment package ID is generated when you call <a href="https://help.aliyun.com/document_detail/173944.html">SubmitFile</a> or <a href="https://help.aliyun.com/document_detail/173956.html">DeployFile</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000000001</p>
     */
    @NameInMap("DeploymentId")
    public Long deploymentId;

    /**
     * <p>The ID of the DataWorks workspace.</p>
     * <p>You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the workspace configuration page to obtain the workspace ID.</p>
     * <p>This parameter specifies the DataWorks workspace for this API call.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The unique identifier of the DataWorks workspace, which is the English identifier displayed at the top of the DataStudio page for switching workspaces.</p>
     * <p>You must specify either this parameter or ProjectId to determine the DataWorks workspace for this API call.</p>
     * 
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
