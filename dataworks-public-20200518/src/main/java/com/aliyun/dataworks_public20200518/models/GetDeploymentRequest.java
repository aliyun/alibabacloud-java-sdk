// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDeploymentRequest extends TeaModel {
    /**
     * <p>The ID of the deployment task. A deployment task ID is generated when you call the <a href="https://help.aliyun.com/document_detail/173944.html">SubmitFile</a> or <a href="https://help.aliyun.com/document_detail/173956.html">DeployFile</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3000001</p>
     */
    @NameInMap("DeploymentId")
    public Long deploymentId;

    /**
     * <p>The ID of the DataWorks workspace. You can click the Workspace Manage icon in the upper-right corner of the DataStudio page to go to the Workspace Management page and view the workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The GUID of the DataWorks workspace. You can view the GUID in the upper part of the DataStudio page. You can also select another GUID to switch to another workspace.</p>
     * <p>You must specify either this parameter or the ProjectId parameter to determine the DataWorks workspace to which the operation is applied.</p>
     * 
     * <strong>example:</strong>
     * <p>dw_project</p>
     */
    @NameInMap("ProjectIdentifier")
    public String projectIdentifier;

    public static GetDeploymentRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDeploymentRequest self = new GetDeploymentRequest();
        return TeaModel.build(map, self);
    }

    public GetDeploymentRequest setDeploymentId(Long deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }
    public Long getDeploymentId() {
        return this.deploymentId;
    }

    public GetDeploymentRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public GetDeploymentRequest setProjectIdentifier(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
        return this;
    }
    public String getProjectIdentifier() {
        return this.projectIdentifier;
    }

}
