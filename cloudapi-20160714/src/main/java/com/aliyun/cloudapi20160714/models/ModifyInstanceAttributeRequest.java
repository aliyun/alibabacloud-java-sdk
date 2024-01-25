// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyInstanceAttributeRequest extends TeaModel {
    @NameInMap("DeleteVpcIpBlock")
    public String deleteVpcIpBlock;

    @NameInMap("EgressIpv6Enable")
    public String egressIpv6Enable;

    @NameInMap("HttpsPolicy")
    public String httpsPolicy;

    @NameInMap("IPV6Enabled")
    public String IPV6Enabled;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("IntranetSegments")
    public String intranetSegments;

    @NameInMap("MaintainEndTime")
    public String maintainEndTime;

    @NameInMap("MaintainStartTime")
    public String maintainStartTime;

    @NameInMap("ToConnectVpcIpBlock")
    public ModifyInstanceAttributeRequestToConnectVpcIpBlock toConnectVpcIpBlock;

    @NameInMap("Token")
    public String token;

    @NameInMap("VpcSlbIntranetEnable")
    public String vpcSlbIntranetEnable;

    public static ModifyInstanceAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceAttributeRequest self = new ModifyInstanceAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceAttributeRequest setDeleteVpcIpBlock(String deleteVpcIpBlock) {
        this.deleteVpcIpBlock = deleteVpcIpBlock;
        return this;
    }
    public String getDeleteVpcIpBlock() {
        return this.deleteVpcIpBlock;
    }

    public ModifyInstanceAttributeRequest setEgressIpv6Enable(String egressIpv6Enable) {
        this.egressIpv6Enable = egressIpv6Enable;
        return this;
    }
    public String getEgressIpv6Enable() {
        return this.egressIpv6Enable;
    }

    public ModifyInstanceAttributeRequest setHttpsPolicy(String httpsPolicy) {
        this.httpsPolicy = httpsPolicy;
        return this;
    }
    public String getHttpsPolicy() {
        return this.httpsPolicy;
    }

    public ModifyInstanceAttributeRequest setIPV6Enabled(String IPV6Enabled) {
        this.IPV6Enabled = IPV6Enabled;
        return this;
    }
    public String getIPV6Enabled() {
        return this.IPV6Enabled;
    }

    public ModifyInstanceAttributeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyInstanceAttributeRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ModifyInstanceAttributeRequest setIntranetSegments(String intranetSegments) {
        this.intranetSegments = intranetSegments;
        return this;
    }
    public String getIntranetSegments() {
        return this.intranetSegments;
    }

    public ModifyInstanceAttributeRequest setMaintainEndTime(String maintainEndTime) {
        this.maintainEndTime = maintainEndTime;
        return this;
    }
    public String getMaintainEndTime() {
        return this.maintainEndTime;
    }

    public ModifyInstanceAttributeRequest setMaintainStartTime(String maintainStartTime) {
        this.maintainStartTime = maintainStartTime;
        return this;
    }
    public String getMaintainStartTime() {
        return this.maintainStartTime;
    }

    public ModifyInstanceAttributeRequest setToConnectVpcIpBlock(ModifyInstanceAttributeRequestToConnectVpcIpBlock toConnectVpcIpBlock) {
        this.toConnectVpcIpBlock = toConnectVpcIpBlock;
        return this;
    }
    public ModifyInstanceAttributeRequestToConnectVpcIpBlock getToConnectVpcIpBlock() {
        return this.toConnectVpcIpBlock;
    }

    public ModifyInstanceAttributeRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public ModifyInstanceAttributeRequest setVpcSlbIntranetEnable(String vpcSlbIntranetEnable) {
        this.vpcSlbIntranetEnable = vpcSlbIntranetEnable;
        return this;
    }
    public String getVpcSlbIntranetEnable() {
        return this.vpcSlbIntranetEnable;
    }

    public static class ModifyInstanceAttributeRequestToConnectVpcIpBlock extends TeaModel {
        @NameInMap("CidrBlock")
        public String cidrBlock;

        @NameInMap("Customized")
        public Boolean customized;

        @NameInMap("VswitchId")
        public String vswitchId;

        @NameInMap("ZoneId")
        public String zoneId;

        public static ModifyInstanceAttributeRequestToConnectVpcIpBlock build(java.util.Map<String, ?> map) throws Exception {
            ModifyInstanceAttributeRequestToConnectVpcIpBlock self = new ModifyInstanceAttributeRequestToConnectVpcIpBlock();
            return TeaModel.build(map, self);
        }

        public ModifyInstanceAttributeRequestToConnectVpcIpBlock setCidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        public ModifyInstanceAttributeRequestToConnectVpcIpBlock setCustomized(Boolean customized) {
            this.customized = customized;
            return this;
        }
        public Boolean getCustomized() {
            return this.customized;
        }

        public ModifyInstanceAttributeRequestToConnectVpcIpBlock setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

        public ModifyInstanceAttributeRequestToConnectVpcIpBlock setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
