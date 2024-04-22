// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class UpdateHubClusterFeatureShrinkRequest extends TeaModel {
    /**
     * <p>The Internet access control list (ACL). This parameter takes effect only if PublicAccessEnabled is set to true.</p>
     */
    @NameInMap("AccessControlList")
    public String accessControlListShrink;

    /**
     * <p>The ID of the EIP.</p>
     */
    @NameInMap("ApiServerEipId")
    public String apiServerEipId;

    /**
     * <p>Specifies whether to enable Argo CD. This parameter takes effect only if Profile is set to XFlow. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("ArgoCDEnabled")
    public Boolean argoCDEnabled;

    /**
     * <p>Specifies whether to enable high availability for Argo CD. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("ArgoCDHAEnabled")
    public Boolean argoCDHAEnabled;

    /**
     * <p>Specifies whether to enable ArgoEvents. Valid values:</p>
     * <br>
     * <p>- true</p>
     * <p>- false</p>
     */
    @NameInMap("ArgoEventsEnabled")
    public Boolean argoEventsEnabled;

    /**
     * <p>Specifies whether to enable the workflow instance UI. This parameter takes effect only if Profile is set to XFlow. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("ArgoServerEnabled")
    public Boolean argoServerEnabled;

    /**
     * <p>Specifies whether to enable the audit logging feature. Valid values:</p>
     * <br>
     * <p>*   true: enables the audit logging feature.</p>
     * <p>*   false: disables the audit logging feature.</p>
     */
    @NameInMap("AuditLogEnabled")
    public Boolean auditLogEnabled;

    /**
     * <p>The cluster ID.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>Specifies whether to enable the deletion protection feature for the cluster. After you enable the deletion protection feature for the cluster, you cannot delete the cluster in the console or by calling the DeleteHubCluster operation. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("DeletionProtection")
    public Boolean deletionProtection;

    /**
     * <p>Specifies whether to enable Service Mesh (ASM). Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("EnableMesh")
    public Boolean enableMesh;

    /**
     * <p>Specifies whether to enable Gateway. Valid values:</p>
     * <p>- true</p>
     * <p>- false</p>
     */
    @NameInMap("GatewayEnabled")
    public Boolean gatewayEnabled;

    /**
     * <p>Specifies whether to enable the monitoring dashboard feature for the workflow instance. This parameter takes effect only if Profile is set to XFlow. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("MonitorEnabled")
    public Boolean monitorEnabled;

    /**
     * <p>The name of the master instance. The name must be 1 to 63 characters in length. It must start with a letter, and can contain letters, digits, underscores (\_), and hyphens (-).</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The limit on the prices of containers in the workflow. This parameter takes effect only if the WorkflowScheduleMode parameter is set to cost-optimized.</p>
     */
    @NameInMap("PriceLimit")
    public String priceLimit;

    /**
     * <p>Specifies whether to enable public domain name resolution in the Argo CD or Argo Workflow console. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("PublicAccessEnabled")
    public Boolean publicAccessEnabled;

    /**
     * <p>Specifies whether to associate an elastic IP address (EIP) with the API server. Valid values:</p>
     * <br>
     * <p>*   true: associates an EIP with the API server. You can specify ApiServerEipId. If you do not specify ApiServerEipId, the system automatically creates an EIP.</p>
     * <p>*   false: disassociates an EIP from the API server.</p>
     */
    @NameInMap("PublicApiServerEnabled")
    public Boolean publicApiServerEnabled;

    /**
     * <p>The vSwitches.</p>
     */
    @NameInMap("VSwitches")
    public String vSwitchesShrink;

    /**
     * <p>The scheduling mode of the workflow. This parameter takes effect only if Profile is set to XFlow. Valid values:</p>
     * <br>
     * <p>*   cost-optimized: cost-prioritized scheduling mode.</p>
     * <p>*   stock-optimized: inventory-prioritized scheduling mode.</p>
     */
    @NameInMap("WorkflowScheduleMode")
    public String workflowScheduleMode;

    public static UpdateHubClusterFeatureShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateHubClusterFeatureShrinkRequest self = new UpdateHubClusterFeatureShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateHubClusterFeatureShrinkRequest setAccessControlListShrink(String accessControlListShrink) {
        this.accessControlListShrink = accessControlListShrink;
        return this;
    }
    public String getAccessControlListShrink() {
        return this.accessControlListShrink;
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

    public UpdateHubClusterFeatureShrinkRequest setArgoCDHAEnabled(Boolean argoCDHAEnabled) {
        this.argoCDHAEnabled = argoCDHAEnabled;
        return this;
    }
    public Boolean getArgoCDHAEnabled() {
        return this.argoCDHAEnabled;
    }

    public UpdateHubClusterFeatureShrinkRequest setArgoEventsEnabled(Boolean argoEventsEnabled) {
        this.argoEventsEnabled = argoEventsEnabled;
        return this;
    }
    public Boolean getArgoEventsEnabled() {
        return this.argoEventsEnabled;
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

    public UpdateHubClusterFeatureShrinkRequest setGatewayEnabled(Boolean gatewayEnabled) {
        this.gatewayEnabled = gatewayEnabled;
        return this;
    }
    public Boolean getGatewayEnabled() {
        return this.gatewayEnabled;
    }

    public UpdateHubClusterFeatureShrinkRequest setMonitorEnabled(Boolean monitorEnabled) {
        this.monitorEnabled = monitorEnabled;
        return this;
    }
    public Boolean getMonitorEnabled() {
        return this.monitorEnabled;
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

    public UpdateHubClusterFeatureShrinkRequest setPublicAccessEnabled(Boolean publicAccessEnabled) {
        this.publicAccessEnabled = publicAccessEnabled;
        return this;
    }
    public Boolean getPublicAccessEnabled() {
        return this.publicAccessEnabled;
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
