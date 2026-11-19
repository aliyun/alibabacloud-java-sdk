// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListStreamTaskManagersRequest extends TeaModel {
    /**
     * <p>The deployment instance ID. You can obtain the value from the deploymentInstanceId returned in the operation record or historical run instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7db678957dc449aab0086b931c9f8218</p>
     */
    @NameInMap("DeploymentInstanceId")
    public String deploymentInstanceId;

    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>The ID of the operator.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    /**
     * <p>The ID of the Dataphin project to which the task belongs. This parameter is used for permission verification in the production environment.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7299592831043008</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static ListStreamTaskManagersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListStreamTaskManagersRequest self = new ListStreamTaskManagersRequest();
        return TeaModel.build(map, self);
    }

    public ListStreamTaskManagersRequest setDeploymentInstanceId(String deploymentInstanceId) {
        this.deploymentInstanceId = deploymentInstanceId;
        return this;
    }
    public String getDeploymentInstanceId() {
        return this.deploymentInstanceId;
    }

    public ListStreamTaskManagersRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public ListStreamTaskManagersRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public ListStreamTaskManagersRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
