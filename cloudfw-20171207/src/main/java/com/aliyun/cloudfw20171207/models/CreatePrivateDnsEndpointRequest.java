// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreatePrivateDnsEndpointRequest extends TeaModel {
    /**
     * <p>The name of the private instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("AccessInstanceName")
    public String accessInstanceName;

    /**
     * <p>The type of the cloud firewall. Valid values:</p>
     * <ul>
     * <li><strong>internet</strong></li>
     * <li><strong>vpc</strong></li>
     * <li><strong>nat</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     */
    @NameInMap("FirewallType")
    public java.util.List<String> firewallType;

    /**
     * <p>The IP protocol. Valid values:</p>
     * <ul>
     * <li><strong>TCP</strong></li>
     * <li><strong>UDP</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>UDP</p>
     */
    @NameInMap("IpProtocol")
    public String ipProtocol;

    /**
     * <p>The UID of the Alibaba Cloud member account. This parameter is required when you use Cloud Firewall to manage member accounts.</p>
     * 
     * <strong>example:</strong>
     * <p>258039427902****</p>
     */
    @NameInMap("MemberUid")
    public Long memberUid;

    /**
     * <p>The port number.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("Port")
    public Integer port;

    /**
     * <p>The primary DNS server.</p>
     * 
     * <strong>example:</strong>
     * <p>1.1.1.1</p>
     */
    @NameInMap("PrimaryDns")
    public String primaryDns;

    /**
     * <p>The ID of the primary vSwitch. The zone of PrimaryVSwitchId and StandbyVSwitchId must be a zone that supports private DNS. Otherwise, an error is returned. The region must also be in the supported list.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-uf6b0dkyryer8******</p>
     */
    @NameInMap("PrimaryVSwitchId")
    public String primaryVSwitchId;

    /**
     * <p>The IP address of the primary vSwitch.</p>
     * 
     * <strong>example:</strong>
     * <p>10.1.1.1</p>
     */
    @NameInMap("PrimaryVSwitchIp")
    public String primaryVSwitchIp;

    /**
     * <p>The private DNS type. When PrivateDnsType is set to Custom, Port and IpProtocol are required. When PrivateDnsType is set to PrivateZone, the backend automatically sets the port to 53 and uses the default protocol. Valid values:</p>
     * <ul>
     * <li><strong>PrivateZone</strong></li>
     * <li><strong>Custom</strong> (default)</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Custom</p>
     */
    @NameInMap("PrivateDnsType")
    public String privateDnsType;

    /**
     * <p>The region ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionNo")
    public String regionNo;

    /**
     * <p>The secondary DNS server.</p>
     * 
     * <strong>example:</strong>
     * <p>1.1.1.2</p>
     */
    @NameInMap("StandbyDns")
    public String standbyDns;

    /**
     * <p>The ID of the secondary vSwitch. The zone of PrimaryVSwitchId and StandbyVSwitchId must be a zone that supports private DNS. Otherwise, error code -200534 is returned. The region must also be in the supported list.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-8vb6jk75wfcwn******</p>
     */
    @NameInMap("StandbyVSwitchId")
    public String standbyVSwitchId;

    /**
     * <p>The IP address of the secondary vSwitch.</p>
     * 
     * <strong>example:</strong>
     * <p>10.2.2.2</p>
     */
    @NameInMap("StandbyVSwitchIp")
    public String standbyVSwitchIp;

    /**
     * <p>The instance ID of the VPC-connected instance.</p>
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
