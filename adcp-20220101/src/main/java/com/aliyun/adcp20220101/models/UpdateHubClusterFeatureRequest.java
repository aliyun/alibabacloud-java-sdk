// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class UpdateHubClusterFeatureRequest extends TeaModel {
    @NameInMap("AccessControlList")
    public java.util.List<String> accessControlList;

    /**
     * <p>The ID of the EIP.</p>
     */
    @NameInMap("ApiServerEipId")
    public String apiServerEipId;

    @NameInMap("ArgoCDEnabled")
    public Boolean argoCDEnabled;

    @NameInMap("ArgoCDHAEnabled")
    public Boolean argoCDHAEnabled;

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

    @NameInMap("MonitorEnabled")
    public Boolean monitorEnabled;

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

    @NameInMap("PublicAccessEnabled")
    public Boolean publicAccessEnabled;

    /**
     * <p>Specifies whether to associate an elastic IP address (EIP) with the API server. Valid values:</p>
     * <br>
     * <p>*   true: associates an EIP with the API server. You can specify the ApiServerEipId parameter. If you do not specify the ApiServerEipId parameter, the system automatically creates an EIP.</p>
     * <p>*   false: disassociates an EIP from the API server.</p>
     */
    @NameInMap("PublicApiServerEnabled")
    public Boolean publicApiServerEnabled;

    @NameInMap("VSwitches")
    public java.util.List<String> vSwitches;

    @NameInMap("WorkflowScheduleMode")
    public String workflowScheduleMode;

    public static UpdateHubClusterFeatureRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateHubClusterFeatureRequest self = new UpdateHubClusterFeatureRequest();
        return TeaModel.build(map, self);
    }

    public UpdateHubClusterFeatureRequest setAccessControlList(java.util.List<String> accessControlList) {
        this.accessControlList = accessControlList;
        return this;
    }
    public java.util.List<String> getAccessControlList() {
        return this.accessControlList;
    }

    public UpdateHubClusterFeatureRequest setApiServerEipId(String apiServerEipId) {
        this.apiServerEipId = apiServerEipId;
        return this;
    }
    public String getApiServerEipId() {
        return this.apiServerEipId;
    }

    public UpdateHubClusterFeatureRequest setArgoCDEnabled(Boolean argoCDEnabled) {
        this.argoCDEnabled = argoCDEnabled;
        return this;
    }
    public Boolean getArgoCDEnabled() {
        return this.argoCDEnabled;
    }

    public UpdateHubClusterFeatureRequest setArgoCDHAEnabled(Boolean argoCDHAEnabled) {
        this.argoCDHAEnabled = argoCDHAEnabled;
        return this;
    }
    public Boolean getArgoCDHAEnabled() {
        return this.argoCDHAEnabled;
    }

    public UpdateHubClusterFeatureRequest setArgoServerEnabled(Boolean argoServerEnabled) {
        this.argoServerEnabled = argoServerEnabled;
        return this;
    }
    public Boolean getArgoServerEnabled() {
        return this.argoServerEnabled;
    }

    public UpdateHubClusterFeatureRequest setAuditLogEnabled(Boolean auditLogEnabled) {
        this.auditLogEnabled = auditLogEnabled;
        return this;
    }
    public Boolean getAuditLogEnabled() {
        return this.auditLogEnabled;
    }

    public UpdateHubClusterFeatureRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdateHubClusterFeatureRequest setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
        return this;
    }
    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    public UpdateHubClusterFeatureRequest setEnableMesh(Boolean enableMesh) {
        this.enableMesh = enableMesh;
        return this;
    }
    public Boolean getEnableMesh() {
        return this.enableMesh;
    }

    public UpdateHubClusterFeatureRequest setMonitorEnabled(Boolean monitorEnabled) {
        this.monitorEnabled = monitorEnabled;
        return this;
    }
    public Boolean getMonitorEnabled() {
        return this.monitorEnabled;
    }

    public UpdateHubClusterFeatureRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateHubClusterFeatureRequest setPriceLimit(String priceLimit) {
        this.priceLimit = priceLimit;
        return this;
    }
    public String getPriceLimit() {
        return this.priceLimit;
    }

    public UpdateHubClusterFeatureRequest setPublicAccessEnabled(Boolean publicAccessEnabled) {
        this.publicAccessEnabled = publicAccessEnabled;
        return this;
    }
    public Boolean getPublicAccessEnabled() {
        return this.publicAccessEnabled;
    }

    public UpdateHubClusterFeatureRequest setPublicApiServerEnabled(Boolean publicApiServerEnabled) {
        this.publicApiServerEnabled = publicApiServerEnabled;
        return this;
    }
    public Boolean getPublicApiServerEnabled() {
        return this.publicApiServerEnabled;
    }

    public UpdateHubClusterFeatureRequest setVSwitches(java.util.List<String> vSwitches) {
        this.vSwitches = vSwitches;
        return this;
    }
    public java.util.List<String> getVSwitches() {
        return this.vSwitches;
    }

    public UpdateHubClusterFeatureRequest setWorkflowScheduleMode(String workflowScheduleMode) {
        this.workflowScheduleMode = workflowScheduleMode;
        return this;
    }
    public String getWorkflowScheduleMode() {
        return this.workflowScheduleMode;
    }

}
