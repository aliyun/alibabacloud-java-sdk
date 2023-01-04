// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class UpdateHubClusterFeatureRequest extends TeaModel {
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
    public java.util.List<UpdateHubClusterFeatureRequestUnits> units;

    public static UpdateHubClusterFeatureRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateHubClusterFeatureRequest self = new UpdateHubClusterFeatureRequest();
        return TeaModel.build(map, self);
    }

    public UpdateHubClusterFeatureRequest setApiServerEipId(String apiServerEipId) {
        this.apiServerEipId = apiServerEipId;
        return this;
    }
    public String getApiServerEipId() {
        return this.apiServerEipId;
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

    public UpdateHubClusterFeatureRequest setEnableArgoCD(Boolean enableArgoCD) {
        this.enableArgoCD = enableArgoCD;
        return this;
    }
    public Boolean getEnableArgoCD() {
        return this.enableArgoCD;
    }

    public UpdateHubClusterFeatureRequest setEnableMesh(Boolean enableMesh) {
        this.enableMesh = enableMesh;
        return this;
    }
    public Boolean getEnableMesh() {
        return this.enableMesh;
    }

    public UpdateHubClusterFeatureRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
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

    public UpdateHubClusterFeatureRequest setPublicApiServerEnabled(Boolean publicApiServerEnabled) {
        this.publicApiServerEnabled = publicApiServerEnabled;
        return this;
    }
    public Boolean getPublicApiServerEnabled() {
        return this.publicApiServerEnabled;
    }

    public UpdateHubClusterFeatureRequest setScheduleMode(String scheduleMode) {
        this.scheduleMode = scheduleMode;
        return this;
    }
    public String getScheduleMode() {
        return this.scheduleMode;
    }

    public UpdateHubClusterFeatureRequest setServerEnabled(Boolean serverEnabled) {
        this.serverEnabled = serverEnabled;
        return this;
    }
    public Boolean getServerEnabled() {
        return this.serverEnabled;
    }

    public UpdateHubClusterFeatureRequest setUnits(java.util.List<UpdateHubClusterFeatureRequestUnits> units) {
        this.units = units;
        return this;
    }
    public java.util.List<UpdateHubClusterFeatureRequestUnits> getUnits() {
        return this.units;
    }

    public static class UpdateHubClusterFeatureRequestUnitsVSwitches extends TeaModel {
        @NameInMap("VswitchId")
        public String vswitchId;

        @NameInMap("ZoneId")
        public String zoneId;

        public static UpdateHubClusterFeatureRequestUnitsVSwitches build(java.util.Map<String, ?> map) throws Exception {
            UpdateHubClusterFeatureRequestUnitsVSwitches self = new UpdateHubClusterFeatureRequestUnitsVSwitches();
            return TeaModel.build(map, self);
        }

        public UpdateHubClusterFeatureRequestUnitsVSwitches setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

        public UpdateHubClusterFeatureRequestUnitsVSwitches setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class UpdateHubClusterFeatureRequestUnits extends TeaModel {
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("VSwitches")
        public java.util.List<UpdateHubClusterFeatureRequestUnitsVSwitches> vSwitches;

        @NameInMap("VpcId")
        public String vpcId;

        public static UpdateHubClusterFeatureRequestUnits build(java.util.Map<String, ?> map) throws Exception {
            UpdateHubClusterFeatureRequestUnits self = new UpdateHubClusterFeatureRequestUnits();
            return TeaModel.build(map, self);
        }

        public UpdateHubClusterFeatureRequestUnits setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public UpdateHubClusterFeatureRequestUnits setVSwitches(java.util.List<UpdateHubClusterFeatureRequestUnitsVSwitches> vSwitches) {
            this.vSwitches = vSwitches;
            return this;
        }
        public java.util.List<UpdateHubClusterFeatureRequestUnitsVSwitches> getVSwitches() {
            return this.vSwitches;
        }

        public UpdateHubClusterFeatureRequestUnits setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
