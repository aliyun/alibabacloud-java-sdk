// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListStreamTaskManagersRequest extends TeaModel {
    /**
     * <p>The ID of the Flink deployment instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7db678957dc449aab0086b931c9f8218</p>
     */
    @NameInMap("DeploymentInstanceId")
    public String deploymentInstanceId;

    /**
     * <p>The ID of the operating tenant. After the gateway verifies that the current identity has access to the tenant, it injects the tenant ID into the backend.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>The optional ID of the operating user. This parameter follows the identity verification rules of the gateway and is not directly bound to the backend user ID.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    /**
     * <p>The project ID.</p>
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
