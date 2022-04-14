// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class CreateHubClusterRequest extends TeaModel {
    @NameInMap("ApiServerPublicEip")
    public Boolean apiServerPublicEip;

    @NameInMap("AuditLogEnabled")
    public Boolean auditLogEnabled;

    @NameInMap("AuditLogProject")
    public String auditLogProject;

    @NameInMap("AuditLogStoreTTL")
    public String auditLogStoreTTL;

    @NameInMap("ControlPlaneLogEnabled")
    public Boolean controlPlaneLogEnabled;

    @NameInMap("ControlPlaneLogProject")
    public String controlPlaneLogProject;

    @NameInMap("ControlPlaneLogTTL")
    public String controlPlaneLogTTL;

    // 是否企业安全组
    @NameInMap("IsEnterpriseSecurityGroup")
    public Boolean isEnterpriseSecurityGroup;

    // 集群名称
    @NameInMap("Name")
    public String name;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("VSwitches")
    public String vSwitches;

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

    public CreateHubClusterRequest setAuditLogProject(String auditLogProject) {
        this.auditLogProject = auditLogProject;
        return this;
    }
    public String getAuditLogProject() {
        return this.auditLogProject;
    }

    public CreateHubClusterRequest setAuditLogStoreTTL(String auditLogStoreTTL) {
        this.auditLogStoreTTL = auditLogStoreTTL;
        return this;
    }
    public String getAuditLogStoreTTL() {
        return this.auditLogStoreTTL;
    }

    public CreateHubClusterRequest setControlPlaneLogEnabled(Boolean controlPlaneLogEnabled) {
        this.controlPlaneLogEnabled = controlPlaneLogEnabled;
        return this;
    }
    public Boolean getControlPlaneLogEnabled() {
        return this.controlPlaneLogEnabled;
    }

    public CreateHubClusterRequest setControlPlaneLogProject(String controlPlaneLogProject) {
        this.controlPlaneLogProject = controlPlaneLogProject;
        return this;
    }
    public String getControlPlaneLogProject() {
        return this.controlPlaneLogProject;
    }

    public CreateHubClusterRequest setControlPlaneLogTTL(String controlPlaneLogTTL) {
        this.controlPlaneLogTTL = controlPlaneLogTTL;
        return this;
    }
    public String getControlPlaneLogTTL() {
        return this.controlPlaneLogTTL;
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

}
