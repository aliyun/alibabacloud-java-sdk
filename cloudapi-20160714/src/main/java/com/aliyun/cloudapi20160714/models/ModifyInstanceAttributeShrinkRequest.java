// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyInstanceAttributeShrinkRequest extends TeaModel {
    /**
     * <p>If delete VPC Ip block.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DeleteVpcIpBlock")
    public String deleteVpcIpBlock;

    /**
     * <p>If enable outbound IPv6 Traffic.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EgressIpv6Enable")
    public String egressIpv6Enable;

    /**
     * <p>The HTTPS policy.</p>
     * 
     * <strong>example:</strong>
     * <p>HTTPS2_TLS1_0</p>
     */
    @NameInMap("HttpsPolicy")
    public String httpsPolicy;

    /**
     * <p>If enable inbound IPv6 Traffic.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IPV6Enabled")
    public String IPV6Enabled;

    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>apigateway-ht-8xxxxxxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Instance Name</p>
     * 
     * <strong>example:</strong>
     * <p>apigatewayInstance</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>Custom private CIDR block.</p>
     * 
     * <strong>example:</strong>
     * <p>172.0.0.1/24</p>
     */
    @NameInMap("IntranetSegments")
    public String intranetSegments;

    /**
     * <p>Maintainable end time.</p>
     * 
     * <strong>example:</strong>
     * <p>23:00Z</p>
     */
    @NameInMap("MaintainEndTime")
    public String maintainEndTime;

    /**
     * <p>Maintainable start time.</p>
     * 
     * <strong>example:</strong>
     * <p>18:00Z</p>
     */
    @NameInMap("MaintainStartTime")
    public String maintainStartTime;

    /**
     * <p>The information about the CIDR block that API Gateway can use to access the virtual private cloud (VPC) of the backend service.</p>
     */
    @NameInMap("ToConnectVpcIpBlock")
    public String toConnectVpcIpBlockShrink;

    /**
     * <p>The token of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>c20d86c4-1eb3-4d0b-afe9-c586df1e2136</p>
     */
    @NameInMap("Token")
    public String token;

    /**
     * <p>Specifies whether to enable the self-calling domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
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
