// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ModifyClusterSecurityGroupRuleRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ModifyType")
    public String modifyType;

    @NameInMap("NicType")
    public String nicType;

    @NameInMap("IpProtocol")
    public String ipProtocol;

    @NameInMap("PortRange")
    public String portRange;

    @NameInMap("WhiteIp")
    public String whiteIp;

    public static ModifyClusterSecurityGroupRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterSecurityGroupRuleRequest self = new ModifyClusterSecurityGroupRuleRequest();
        return TeaModel.build(map, self);
    }

    public ModifyClusterSecurityGroupRuleRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyClusterSecurityGroupRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyClusterSecurityGroupRuleRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ModifyClusterSecurityGroupRuleRequest setModifyType(String modifyType) {
        this.modifyType = modifyType;
        return this;
    }
    public String getModifyType() {
        return this.modifyType;
    }

    public ModifyClusterSecurityGroupRuleRequest setNicType(String nicType) {
        this.nicType = nicType;
        return this;
    }
    public String getNicType() {
        return this.nicType;
    }

    public ModifyClusterSecurityGroupRuleRequest setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
        return this;
    }
    public String getIpProtocol() {
        return this.ipProtocol;
    }

    public ModifyClusterSecurityGroupRuleRequest setPortRange(String portRange) {
        this.portRange = portRange;
        return this;
    }
    public String getPortRange() {
        return this.portRange;
    }

    public ModifyClusterSecurityGroupRuleRequest setWhiteIp(String whiteIp) {
        this.whiteIp = whiteIp;
        return this;
    }
    public String getWhiteIp() {
        return this.whiteIp;
    }

}
