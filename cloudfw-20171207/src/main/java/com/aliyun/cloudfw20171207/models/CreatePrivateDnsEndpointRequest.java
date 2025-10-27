// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreatePrivateDnsEndpointRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AccessInstanceName")
    public String accessInstanceName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("FirewallType")
    public java.util.List<String> firewallType;

    /**
     * <strong>example:</strong>
     * <p>UDP</p>
     */
    @NameInMap("IpProtocol")
    public String ipProtocol;

    /**
     * <strong>example:</strong>
     * <p>258039427902****</p>
     */
    @NameInMap("MemberUid")
    public Long memberUid;

    /**
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("Port")
    public Integer port;

    /**
     * <strong>example:</strong>
     * <p>1.1.1.1</p>
     */
    @NameInMap("PrimaryDns")
    public String primaryDns;

    /**
     * <strong>example:</strong>
     * <p>vsw-uf6b0dkyryer8******</p>
     */
    @NameInMap("PrimaryVSwitchId")
    public String primaryVSwitchId;

    /**
     * <strong>example:</strong>
     * <p>10.1.1.1</p>
     */
    @NameInMap("PrimaryVSwitchIp")
    public String primaryVSwitchIp;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Custom</p>
     */
    @NameInMap("PrivateDnsType")
    public String privateDnsType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionNo")
    public String regionNo;

    /**
     * <strong>example:</strong>
     * <p>1.1.1.2</p>
     */
    @NameInMap("StandbyDns")
    public String standbyDns;

    /**
     * <strong>example:</strong>
     * <p>vsw-8vb6jk75wfcwn******</p>
     */
    @NameInMap("StandbyVSwitchId")
    public String standbyVSwitchId;

    /**
     * <strong>example:</strong>
     * <p>10.2.2.2</p>
     */
    @NameInMap("StandbyVSwitchIp")
    public String standbyVSwitchIp;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-uf6b5lyul0x******</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static CreatePrivateDnsEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePrivateDnsEndpointRequest self = new CreatePrivateDnsEndpointRequest();
        return TeaModel.build(map, self);
    }

    public CreatePrivateDnsEndpointRequest setAccessInstanceName(String accessInstanceName) {
        this.accessInstanceName = accessInstanceName;
        return this;
    }
    public String getAccessInstanceName() {
        return this.accessInstanceName;
    }

    public CreatePrivateDnsEndpointRequest setFirewallType(java.util.List<String> firewallType) {
        this.firewallType = firewallType;
        return this;
    }
    public java.util.List<String> getFirewallType() {
        return this.firewallType;
    }

    public CreatePrivateDnsEndpointRequest setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
        return this;
    }
    public String getIpProtocol() {
        return this.ipProtocol;
    }

    public CreatePrivateDnsEndpointRequest setMemberUid(Long memberUid) {
        this.memberUid = memberUid;
        return this;
    }
    public Long getMemberUid() {
        return this.memberUid;
    }

    public CreatePrivateDnsEndpointRequest setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public CreatePrivateDnsEndpointRequest setPrimaryDns(String primaryDns) {
        this.primaryDns = primaryDns;
        return this;
    }
    public String getPrimaryDns() {
        return this.primaryDns;
    }

    public CreatePrivateDnsEndpointRequest setPrimaryVSwitchId(String primaryVSwitchId) {
        this.primaryVSwitchId = primaryVSwitchId;
        return this;
    }
    public String getPrimaryVSwitchId() {
        return this.primaryVSwitchId;
    }

    public CreatePrivateDnsEndpointRequest setPrimaryVSwitchIp(String primaryVSwitchIp) {
        this.primaryVSwitchIp = primaryVSwitchIp;
        return this;
    }
    public String getPrimaryVSwitchIp() {
        return this.primaryVSwitchIp;
    }

    public CreatePrivateDnsEndpointRequest setPrivateDnsType(String privateDnsType) {
        this.privateDnsType = privateDnsType;
        return this;
    }
    public String getPrivateDnsType() {
        return this.privateDnsType;
    }

    public CreatePrivateDnsEndpointRequest setRegionNo(String regionNo) {
        this.regionNo = regionNo;
        return this;
    }
    public String getRegionNo() {
        return this.regionNo;
    }

    public CreatePrivateDnsEndpointRequest setStandbyDns(String standbyDns) {
        this.standbyDns = standbyDns;
        return this;
    }
    public String getStandbyDns() {
        return this.standbyDns;
    }

    public CreatePrivateDnsEndpointRequest setStandbyVSwitchId(String standbyVSwitchId) {
        this.standbyVSwitchId = standbyVSwitchId;
        return this;
    }
    public String getStandbyVSwitchId() {
        return this.standbyVSwitchId;
    }

    public CreatePrivateDnsEndpointRequest setStandbyVSwitchIp(String standbyVSwitchIp) {
        this.standbyVSwitchIp = standbyVSwitchIp;
        return this;
    }
    public String getStandbyVSwitchIp() {
        return this.standbyVSwitchIp;
    }

    public CreatePrivateDnsEndpointRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
