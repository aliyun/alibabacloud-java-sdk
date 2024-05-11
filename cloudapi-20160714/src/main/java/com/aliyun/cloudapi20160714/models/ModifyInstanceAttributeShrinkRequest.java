// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyInstanceAttributeShrinkRequest extends TeaModel {
    @NameInMap("DeleteVpcIpBlock")
    public String deleteVpcIpBlock;

    @NameInMap("EgressIpv6Enable")
    public String egressIpv6Enable;

    @NameInMap("HttpsPolicy")
    public String httpsPolicy;

    @NameInMap("IPV6Enabled")
    public String IPV6Enabled;

    /**
     * <p>This parameter is required.</p>
     */
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
    public String toConnectVpcIpBlockShrink;

    @NameInMap("Token")
    public String token;

    @NameInMap("VpcSlbIntranetEnable")
    public String vpcSlbIntranetEnable;

    public static ModifyInstanceAttributeShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceAttributeShrinkRequest self = new ModifyInstanceAttributeShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceAttributeShrinkRequest setDeleteVpcIpBlock(String deleteVpcIpBlock) {
        this.deleteVpcIpBlock = deleteVpcIpBlock;
        return this;
    }
    public String getDeleteVpcIpBlock() {
        return this.deleteVpcIpBlock;
    }

    public ModifyInstanceAttributeShrinkRequest setEgressIpv6Enable(String egressIpv6Enable) {
        this.egressIpv6Enable = egressIpv6Enable;
        return this;
    }
    public String getEgressIpv6Enable() {
        return this.egressIpv6Enable;
    }

    public ModifyInstanceAttributeShrinkRequest setHttpsPolicy(String httpsPolicy) {
        this.httpsPolicy = httpsPolicy;
        return this;
    }
    public String getHttpsPolicy() {
        return this.httpsPolicy;
    }

    public ModifyInstanceAttributeShrinkRequest setIPV6Enabled(String IPV6Enabled) {
        this.IPV6Enabled = IPV6Enabled;
        return this;
    }
    public String getIPV6Enabled() {
        return this.IPV6Enabled;
    }

    public ModifyInstanceAttributeShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyInstanceAttributeShrinkRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ModifyInstanceAttributeShrinkRequest setIntranetSegments(String intranetSegments) {
        this.intranetSegments = intranetSegments;
        return this;
    }
    public String getIntranetSegments() {
        return this.intranetSegments;
    }

    public ModifyInstanceAttributeShrinkRequest setMaintainEndTime(String maintainEndTime) {
        this.maintainEndTime = maintainEndTime;
        return this;
    }
    public String getMaintainEndTime() {
        return this.maintainEndTime;
    }

    public ModifyInstanceAttributeShrinkRequest setMaintainStartTime(String maintainStartTime) {
        this.maintainStartTime = maintainStartTime;
        return this;
    }
    public String getMaintainStartTime() {
        return this.maintainStartTime;
    }

    public ModifyInstanceAttributeShrinkRequest setToConnectVpcIpBlockShrink(String toConnectVpcIpBlockShrink) {
        this.toConnectVpcIpBlockShrink = toConnectVpcIpBlockShrink;
        return this;
    }
    public String getToConnectVpcIpBlockShrink() {
        return this.toConnectVpcIpBlockShrink;
    }

    public ModifyInstanceAttributeShrinkRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public ModifyInstanceAttributeShrinkRequest setVpcSlbIntranetEnable(String vpcSlbIntranetEnable) {
        this.vpcSlbIntranetEnable = vpcSlbIntranetEnable;
        return this;
    }
    public String getVpcSlbIntranetEnable() {
        return this.vpcSlbIntranetEnable;
    }

}
