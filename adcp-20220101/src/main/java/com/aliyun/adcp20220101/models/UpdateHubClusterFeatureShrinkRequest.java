// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class UpdateHubClusterFeatureShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the EIP.</p>
     */
    @NameInMap("ApiServerEipId")
    public String apiServerEipId;

    @NameInMap("ArgoCDEnabled")
    public Boolean argoCDEnabled;

    @NameInMap("ArgoServerEnabled")
    public Boolean argoServerEnabled;

    @NameInMap("ArmsEnabled")
    public Boolean armsEnabled;

    /**
     * <p>Specifies whether to enable the audit logging feature. Valid values:</p>
     * <br>
     * <p>*   true: enables the audit logging feature.</p>
     * <p>*   false: disables the audit logging feature.</p>
     */
    @NameInMap("AuditLogEnabled")
    public Boolean auditLogEnabled;

    /**
     * <p>The ID of the cluster.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>Specifies whether to enable deletion protection for the cluster. After you enable deletion protection, you cannot delete the master instance in the console or by calling the DeleteHubCluster operation. Valid values:</p>
     * <br>
     * <p>*   true: enables deletion protection for the cluster.</p>
     * <p>*   false: disables deletion protection for the cluster. This is the default value.</p>
     */
    @NameInMap("DeletionProtection")
    public Boolean deletionProtection;

    /**
     * <p>Specifies whether to enable Alibaba Cloud Service Mesh (ASM). Valid values:</p>
     * <br>
     * <p>true: enables ASM. false: disables ASM.</p>
     */
    @NameInMap("EnableMesh")
    public Boolean enableMesh;

    /**
     * <p>The name of the cluster. The name must be 1 to 63 characters in length. It must start with a letter, and can contain letters, digits, underscores (\_), and hyphens (-).</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The limit on the prices of containers in the workflow. This parameter takes effect only if the WorkflowScheduleMode parameter is set to cost-optimized.</p>
     */
    @NameInMap("PriceLimit")
    public String priceLimit;

    /**
     * <p>Specifies whether to associate an elastic IP address (EIP) with the API server. Valid values:</p>
     * <br>
     * <p>*   true: associates an EIP with the API server. You can specify the ApiServerEipId parameter. If you do not specify the ApiServerEipId parameter, the system automatically creates an EIP.</p>
     * <p>*   false: disassociates an EIP from the API server.</p>
     */
    @NameInMap("PublicApiServerEnabled")
    public Boolean publicApiServerEnabled;

    @NameInMap("VSwitches")
    public String vSwitchesShrink;

    @NameInMap("WorkflowScheduleMode")
    public String workflowScheduleMode;

    public static UpdateHubClusterFeatureShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateHubClusterFeatureShrinkRequest self = new UpdateHubClusterFeatureShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateHubClusterFeatureShrinkRequest setApiServerEipId(String apiServerEipId) {
        this.apiServerEipId = apiServerEipId;
        return this;
    }
    public String getApiServerEipId() {
        return this.apiServerEipId;
    }

    public UpdateHubClusterFeatureShrinkRequest setArgoCDEnabled(Boolean argoCDEnabled) {
        this.argoCDEnabled = argoCDEnabled;
        return this;
    }
    public Boolean getArgoCDEnabled() {
        return this.argoCDEnabled;
    }

    public UpdateHubClusterFeatureShrinkRequest setArgoServerEnabled(Boolean argoServerEnabled) {
        this.argoServerEnabled = argoServerEnabled;
        return this;
    }
    public Boolean getArgoServerEnabled() {
        return this.argoServerEnabled;
    }

    public UpdateHubClusterFeatureShrinkRequest setArmsEnabled(Boolean armsEnabled) {
        this.armsEnabled = armsEnabled;
        return this;
    }
    public Boolean getArmsEnabled() {
        return this.armsEnabled;
    }

    public UpdateHubClusterFeatureShrinkRequest setAuditLogEnabled(Boolean auditLogEnabled) {
        this.auditLogEnabled = auditLogEnabled;
        return this;
    }
    public Boolean getAuditLogEnabled() {
        return this.auditLogEnabled;
    }

    public UpdateHubClusterFeatureShrinkRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdateHubClusterFeatureShrinkRequest setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
        return this;
    }
    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    public UpdateHubClusterFeatureShrinkRequest setEnableMesh(Boolean enableMesh) {
        this.enableMesh = enableMesh;
        return this;
    }
    public Boolean getEnableMesh() {
        return this.enableMesh;
    }

    public UpdateHubClusterFeatureShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateHubClusterFeatureShrinkRequest setPriceLimit(String priceLimit) {
        this.priceLimit = priceLimit;
        return this;
    }
    public String getPriceLimit() {
        return this.priceLimit;
    }

    public UpdateHubClusterFeatureShrinkRequest setPublicApiServerEnabled(Boolean publicApiServerEnabled) {
        this.publicApiServerEnabled = publicApiServerEnabled;
        return this;
    }
    public Boolean getPublicApiServerEnabled() {
        return this.publicApiServerEnabled;
    }

    public UpdateHubClusterFeatureShrinkRequest setVSwitchesShrink(String vSwitchesShrink) {
        this.vSwitchesShrink = vSwitchesShrink;
        return this;
    }
    public String getVSwitchesShrink() {
        return this.vSwitchesShrink;
    }

    public UpdateHubClusterFeatureShrinkRequest setWorkflowScheduleMode(String workflowScheduleMode) {
        this.workflowScheduleMode = workflowScheduleMode;
        return this;
    }
    public String getWorkflowScheduleMode() {
        return this.workflowScheduleMode;
    }

}
