// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class CreateHubClusterRequest extends TeaModel {
    // Specifies whether to use a public IP address to expose the API server. Valid values: - true: uses a public IP address to expose the API server. - true: uses an internal IP address to expose the API server.
    @NameInMap("ApiServerPublicEip")
    public Boolean apiServerPublicEip;

    // Specifies whether to enable audit logs. Valid values: - true: enables audit logs. - false: disables audit logs.
    @NameInMap("AuditLogEnabled")
    public Boolean auditLogEnabled;

    @NameInMap("ClusterConfiguration")
    public CreateHubClusterRequestClusterConfiguration clusterConfiguration;

    // Specifies whether the security group is an advanced security group.
    @NameInMap("IsEnterpriseSecurityGroup")
    public Boolean isEnterpriseSecurityGroup;

    // The name of the master instance.
    @NameInMap("Name")
    public String name;

    // Scenario-oriented master control type. The value can be:
    // 
    // - `Default`: Standard scenario Master instance.
    // - `XFlow`: Workflow scenario master instance.
    // 
    // Default Value: `Default`.
    @NameInMap("Profile")
    public String profile;

    // The ID of the region. You can call the DescribeRegions operation to query available regions.
    @NameInMap("RegionId")
    public String regionId;

    // The ID of the vSwitch.
    @NameInMap("VSwitches")
    public String vSwitches;

    // The ID of the virtual private cloud (VPC) to which the master instance belongs. You can call the DescribeVpcs operation to query available VPCs.
    @NameInMap("VpcId")
    public String vpcId;

    public static CreateHubClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateHubClusterRequest self = new CreateHubClusterRequest();
        return TeaModel.build(map, self);
    }

    public CreateHubClusterRequest setApiServerPublicEip(Boolean apiServerPublicEip) {
        this.apiServerPublicEip = apiServerPublicEip;
        return this;
    }
    public Boolean getApiServerPublicEip() {
        return this.apiServerPublicEip;
    }

    public CreateHubClusterRequest setAuditLogEnabled(Boolean auditLogEnabled) {
        this.auditLogEnabled = auditLogEnabled;
        return this;
    }
    public Boolean getAuditLogEnabled() {
        return this.auditLogEnabled;
    }

    public CreateHubClusterRequest setClusterConfiguration(CreateHubClusterRequestClusterConfiguration clusterConfiguration) {
        this.clusterConfiguration = clusterConfiguration;
        return this;
    }
    public CreateHubClusterRequestClusterConfiguration getClusterConfiguration() {
        return this.clusterConfiguration;
    }

    public CreateHubClusterRequest setIsEnterpriseSecurityGroup(Boolean isEnterpriseSecurityGroup) {
        this.isEnterpriseSecurityGroup = isEnterpriseSecurityGroup;
        return this;
    }
    public Boolean getIsEnterpriseSecurityGroup() {
        return this.isEnterpriseSecurityGroup;
    }

    public CreateHubClusterRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateHubClusterRequest setProfile(String profile) {
        this.profile = profile;
        return this;
    }
    public String getProfile() {
        return this.profile;
    }

    public CreateHubClusterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateHubClusterRequest setVSwitches(String vSwitches) {
        this.vSwitches = vSwitches;
        return this;
    }
    public String getVSwitches() {
        return this.vSwitches;
    }

    public CreateHubClusterRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public static class CreateHubClusterRequestClusterConfigurationWorkflowUnitsVSwitches extends TeaModel {
        @NameInMap("VswitchId")
        public String vswitchId;

        @NameInMap("ZoneId")
        public String zoneId;

        public static CreateHubClusterRequestClusterConfigurationWorkflowUnitsVSwitches build(java.util.Map<String, ?> map) throws Exception {
            CreateHubClusterRequestClusterConfigurationWorkflowUnitsVSwitches self = new CreateHubClusterRequestClusterConfigurationWorkflowUnitsVSwitches();
            return TeaModel.build(map, self);
        }

        public CreateHubClusterRequestClusterConfigurationWorkflowUnitsVSwitches setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

        public CreateHubClusterRequestClusterConfigurationWorkflowUnitsVSwitches setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class CreateHubClusterRequestClusterConfigurationWorkflowUnits extends TeaModel {
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("VSwitches")
        public java.util.List<CreateHubClusterRequestClusterConfigurationWorkflowUnitsVSwitches> vSwitches;

        @NameInMap("VpcId")
        public String vpcId;

        public static CreateHubClusterRequestClusterConfigurationWorkflowUnits build(java.util.Map<String, ?> map) throws Exception {
            CreateHubClusterRequestClusterConfigurationWorkflowUnits self = new CreateHubClusterRequestClusterConfigurationWorkflowUnits();
            return TeaModel.build(map, self);
        }

        public CreateHubClusterRequestClusterConfigurationWorkflowUnits setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public CreateHubClusterRequestClusterConfigurationWorkflowUnits setVSwitches(java.util.List<CreateHubClusterRequestClusterConfigurationWorkflowUnitsVSwitches> vSwitches) {
            this.vSwitches = vSwitches;
            return this;
        }
        public java.util.List<CreateHubClusterRequestClusterConfigurationWorkflowUnitsVSwitches> getVSwitches() {
            return this.vSwitches;
        }

        public CreateHubClusterRequestClusterConfigurationWorkflowUnits setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class CreateHubClusterRequestClusterConfiguration extends TeaModel {
        @NameInMap("ArgoServerEnabled")
        public Boolean argoServerEnabled;

        @NameInMap("PriceLimit")
        public String priceLimit;

        @NameInMap("WorflowEnabled")
        public Boolean worflowEnabled;

        @NameInMap("WorkflowScheduleMode")
        public String workflowScheduleMode;

        @NameInMap("WorkflowUnits")
        public java.util.List<CreateHubClusterRequestClusterConfigurationWorkflowUnits> workflowUnits;

        public static CreateHubClusterRequestClusterConfiguration build(java.util.Map<String, ?> map) throws Exception {
            CreateHubClusterRequestClusterConfiguration self = new CreateHubClusterRequestClusterConfiguration();
            return TeaModel.build(map, self);
        }

        public CreateHubClusterRequestClusterConfiguration setArgoServerEnabled(Boolean argoServerEnabled) {
            this.argoServerEnabled = argoServerEnabled;
            return this;
        }
        public Boolean getArgoServerEnabled() {
            return this.argoServerEnabled;
        }

        public CreateHubClusterRequestClusterConfiguration setPriceLimit(String priceLimit) {
            this.priceLimit = priceLimit;
            return this;
        }
        public String getPriceLimit() {
            return this.priceLimit;
        }

        public CreateHubClusterRequestClusterConfiguration setWorflowEnabled(Boolean worflowEnabled) {
            this.worflowEnabled = worflowEnabled;
            return this;
        }
        public Boolean getWorflowEnabled() {
            return this.worflowEnabled;
        }

        public CreateHubClusterRequestClusterConfiguration setWorkflowScheduleMode(String workflowScheduleMode) {
            this.workflowScheduleMode = workflowScheduleMode;
            return this;
        }
        public String getWorkflowScheduleMode() {
            return this.workflowScheduleMode;
        }

        public CreateHubClusterRequestClusterConfiguration setWorkflowUnits(java.util.List<CreateHubClusterRequestClusterConfigurationWorkflowUnits> workflowUnits) {
            this.workflowUnits = workflowUnits;
            return this;
        }
        public java.util.List<CreateHubClusterRequestClusterConfigurationWorkflowUnits> getWorkflowUnits() {
            return this.workflowUnits;
        }

    }

}
