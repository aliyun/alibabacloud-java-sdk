// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GrafanaWorkspaceVpcRegionDetail extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>fc、ansm</p>
     */
    @NameInMap("fcConfig")
    public String fcConfig;

    /**
     * <strong>example:</strong>
     * <p>配置ID</p>
     */
    @NameInMap("id")
    public Long id;

    /**
     * <strong>example:</strong>
     * <p>Uninitialized</p>
     */
    @NameInMap("installStatus")
    public String installStatus;

    /**
     * <strong>example:</strong>
     * <p>vpc-abc*****</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("regionId")
    public String regionId;

    @NameInMap("securityGroupId")
    public String securityGroupId;

    @NameInMap("securityGroupIds")
    public java.util.List<String> securityGroupIds;

    /**
     * <strong>example:</strong>
     * <p>10988**********</p>
     */
    @NameInMap("userId")
    public String userId;

    @NameInMap("vSwitchId")
    public String vSwitchId;

    @NameInMap("vSwitchIds")
    public java.util.List<String> vSwitchIds;

    /**
     * <strong>example:</strong>
     * <p>vpc-2ze4siu98**********</p>
     */
    @NameInMap("vpcId")
    public String vpcId;

    public static GrafanaWorkspaceVpcRegionDetail build(java.util.Map<String, ?> map) throws Exception {
        GrafanaWorkspaceVpcRegionDetail self = new GrafanaWorkspaceVpcRegionDetail();
        return TeaModel.build(map, self);
    }

    public GrafanaWorkspaceVpcRegionDetail setFcConfig(String fcConfig) {
        this.fcConfig = fcConfig;
        return this;
    }
    public String getFcConfig() {
        return this.fcConfig;
    }

    public GrafanaWorkspaceVpcRegionDetail setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GrafanaWorkspaceVpcRegionDetail setInstallStatus(String installStatus) {
        this.installStatus = installStatus;
        return this;
    }
    public String getInstallStatus() {
        return this.installStatus;
    }

    public GrafanaWorkspaceVpcRegionDetail setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GrafanaWorkspaceVpcRegionDetail setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GrafanaWorkspaceVpcRegionDetail setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public GrafanaWorkspaceVpcRegionDetail setSecurityGroupIds(java.util.List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }
    public java.util.List<String> getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    public GrafanaWorkspaceVpcRegionDetail setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public GrafanaWorkspaceVpcRegionDetail setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public GrafanaWorkspaceVpcRegionDetail setVSwitchIds(java.util.List<String> vSwitchIds) {
        this.vSwitchIds = vSwitchIds;
        return this;
    }
    public java.util.List<String> getVSwitchIds() {
        return this.vSwitchIds;
    }

    public GrafanaWorkspaceVpcRegionDetail setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
