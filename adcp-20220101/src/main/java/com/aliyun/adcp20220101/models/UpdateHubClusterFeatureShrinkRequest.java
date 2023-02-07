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

    /**
     * <p>Specifies whether to enable audit logs. Valid values: - true: enable audit logs. - false: disables audit logs.</p>
     */
    @NameInMap("AuditLogEnabled")
    public Boolean auditLogEnabled;

    /**
     * <p>The ID of the master instance.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>Specifies whether to enable deletion protection for the master instance. After you enable deletion protection, you cannot delete the master instance in the console or by calling API operations. Valid values:</p>
     */
    @NameInMap("DeletionProtection")
    public Boolean deletionProtection;

    /**
     * <p>Specifies whether to enable Service Mesh (ASM). Valid values: true: enables ASM. false: disables ASM.</p>
     */
    @NameInMap("EnableMesh")
    public Boolean enableMesh;

    /**
     * <p>The name of the master instance. The name must be 1 to 63 characters in length, and can contain letters and digits. The name must start with a letter. The name can contain letters, digits, underscores (_), and hyphens (-).</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("PriceLimit")
    public String priceLimit;

    /**
     * <p>Specifies whether to associate an elastic IP address (EIP) with the API server. Default value: false. To associate an EIP with the API server, set the value to true. You can use a custom EIP by setting the ApiServerEipId parameter. If you do not set the ApiServerEipId parameter, the system automatically creates an EIP.</p>
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
