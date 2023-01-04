// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class UpdateHubClusterFeatureShrinkRequest extends TeaModel {
    // The ID of the EIP.
    @NameInMap("ApiServerEipId")
    public String apiServerEipId;

    // Specifies whether to enable audit logs. Valid values: - true: enable audit logs. - false: disables audit logs.
    @NameInMap("AuditLogEnabled")
    public Boolean auditLogEnabled;

    // The ID of the master instance.
    @NameInMap("ClusterId")
    public String clusterId;

    // Specifies whether to enable deletion protection for the master instance. After you enable deletion protection, you cannot delete the master instance in the console or by calling API operations. Valid values:
    @NameInMap("DeletionProtection")
    public Boolean deletionProtection;

    // Whether to enable ArgoCD.
    // 
    // - true Enabled
    // - false Disabled
    @NameInMap("EnableArgoCD")
    public Boolean enableArgoCD;

    // Specifies whether to enable Service Mesh (ASM). Valid values: true: enables ASM. false: disables ASM.
    @NameInMap("EnableMesh")
    public Boolean enableMesh;

    @NameInMap("Enabled")
    public Boolean enabled;

    // The name of the master instance. The name must be 1 to 63 characters in length, and can contain letters and digits. The name must start with a letter. The name can contain letters, digits, underscores (_), and hyphens (-).
    @NameInMap("Name")
    public String name;

    @NameInMap("PriceLimit")
    public String priceLimit;

    // Specifies whether to associate an elastic IP address (EIP) with the API server. Default value: false. To associate an EIP with the API server, set the value to true. You can use a custom EIP by setting the ApiServerEipId parameter. If you do not set the ApiServerEipId parameter, the system automatically creates an EIP.
    @NameInMap("PublicApiServerEnabled")
    public Boolean publicApiServerEnabled;

    @NameInMap("ScheduleMode")
    public String scheduleMode;

    @NameInMap("ServerEnabled")
    public Boolean serverEnabled;

    @NameInMap("Units")
    public String unitsShrink;

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

    public UpdateHubClusterFeatureShrinkRequest setEnableArgoCD(Boolean enableArgoCD) {
        this.enableArgoCD = enableArgoCD;
        return this;
    }
    public Boolean getEnableArgoCD() {
        return this.enableArgoCD;
    }

    public UpdateHubClusterFeatureShrinkRequest setEnableMesh(Boolean enableMesh) {
        this.enableMesh = enableMesh;
        return this;
    }
    public Boolean getEnableMesh() {
        return this.enableMesh;
    }

    public UpdateHubClusterFeatureShrinkRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
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

    public UpdateHubClusterFeatureShrinkRequest setScheduleMode(String scheduleMode) {
        this.scheduleMode = scheduleMode;
        return this;
    }
    public String getScheduleMode() {
        return this.scheduleMode;
    }

    public UpdateHubClusterFeatureShrinkRequest setServerEnabled(Boolean serverEnabled) {
        this.serverEnabled = serverEnabled;
        return this;
    }
    public Boolean getServerEnabled() {
        return this.serverEnabled;
    }

    public UpdateHubClusterFeatureShrinkRequest setUnitsShrink(String unitsShrink) {
        this.unitsShrink = unitsShrink;
        return this;
    }
    public String getUnitsShrink() {
        return this.unitsShrink;
    }

}
