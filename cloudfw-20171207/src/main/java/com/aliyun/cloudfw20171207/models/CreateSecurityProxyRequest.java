// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateSecurityProxyRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the basic protection policies of the IPS. If this parameter is not specified, the system default (enabled) is used. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: disabled.</li>
     * <li><strong>1</strong>: enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BasicDefenseEnabled")
    public String basicDefenseEnabled;

    /**
     * <p>The deployment mode of the firewall service. Valid values:</p>
     * <ul>
     * <li><strong>PrimaryStandby</strong>: primary/secondary mode.</li>
     * <li><strong>MultiPrimary</strong>: active-active mode.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PrimaryStandby</p>
     */
    @NameInMap("FirewallServiceMode")
    public String firewallServiceMode;

    /**
     * <p>The list of zone IDs used by the firewall service.</p>
     */
    @NameInMap("FirewallServiceZones")
    public java.util.List<String> firewallServiceZones;

    /**
     * <p>The security protection switch. Valid values:</p>
     * <ul>
     * <li><strong>open</strong>: enabled.</li>
     * <li><strong>close</strong>: disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>close</p>
     */
    @NameInMap("FirewallSwitch")
    public String firewallSwitch;

    /**
     * <p>The zone of the firewall vSwitch.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing-b</p>
     */
    @NameInMap("FwVswitchZoneId")
    public String fwVswitchZoneId;

    /**
     * <p>The language of the response message. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The vSwitch CIDR block of the GWLB endpoint (GWLBe) in the active zone. This parameter applies only to NAT firewalls that use the GWLB architecture. For the GWLB architecture, this parameter is required along with MasterZoneId, StandbyZoneId, and StandbyVSwitchCidr. If any of these parameters is missing, ErrorParameters is returned. The vSwitch is created by the firewall creation node based on this vSwitch CIDR block. This parameter is not read for the ENI architecture.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.0.0/24</p>
     */
    @NameInMap("MasterVSwitchCidr")
    public String masterVSwitchCidr;

    /**
     * <p>The ID of the primary zone. This parameter applies only to NAT firewalls that use the GWLB architecture. For the GWLB architecture, this parameter is required along with MasterVSwitchCidr, StandbyZoneId, and StandbyVSwitchCidr. If any of these parameters is missing, ErrorParameters is returned. The value must be the same as the zone where the NAT gateway resides. This parameter is not read for the ENI architecture.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-h</p>
     */
    @NameInMap("MasterZoneId")
    public String masterZoneId;

    /**
     * <p>The ID of the NAT gateway.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ngw-bp1okz6k7******</p>
     */
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    /**
     * <p>The architecture type of the NAT firewall. Valid values: <strong>eni</strong> (traditional ENI architecture) and <strong>gwlb</strong> (new GWLB architecture). If this parameter is omitted or left empty, the firewall is created by using the ENI architecture, and no implicit selection is performed on the server side. You can obtain the recommended architecture from the response of the DescribeNatFirewallArchitecture operation and pass it back when you create the firewall.</p>
     * 
     * <strong>example:</strong>
     * <p>gwlb</p>
     */
    @NameInMap("NatMode")
    public String natMode;

    /**
     * <p>The list of routes to be switched for the NAT gateway.</p>
     */
    @NameInMap("NatRouteEntryList")
    public java.util.List<CreateSecurityProxyRequestNatRouteEntryList> natRouteEntryList;

    /**
     * <p>The name of the NAT firewall. The name must be 4 to 50 characters in length and can contain uppercase and lowercase letters, Chinese characters, digits, and underscores (_). It cannot start with an underscore.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>nat-firewall</p>
     */
    @NameInMap("ProxyName")
    public String proxyName;

    /**
     * <p>The region ID of the VPC.</p>
     * <blockquote>
     * <p>For more information about the regions supported by Cloud Firewall, see <a href="https://help.aliyun.com/document_detail/195657.html">Supported regions</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionNo")
    public String regionNo;

    /**
     * <p>The level of the IPS rule group. This parameter is valid only in block mode. If this parameter is not specified, the system default (medium) is used. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: none. The value is forced to 0 in monitor mode.</li>
     * <li><strong>1</strong>: loose.</li>
     * <li><strong>2</strong>: medium.</li>
     * <li><strong>3</strong>: strict.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("RuleClass")
    public String ruleClass;

    /**
     * <p>The IPS defense mode. This parameter is supported only by NAT firewalls that use the GWLB architecture. If this parameter is not specified, the system default (Block Mode) is used. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: monitor mode. Only alerting is triggered, and traffic is not blocked.</li>
     * <li><strong>1</strong>: Block Mode.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RunMode")
    public String runMode;

    /**
     * <p>The vSwitch CIDR block of the GWLBe in the standby zone. This parameter applies only to NAT firewalls that use the GWLB architecture. For the GWLB architecture, this parameter is required along with MasterZoneId, MasterVSwitchCidr, and StandbyZoneId. If any of these parameters is missing, ErrorParameters is returned. The vSwitch is created by the firewall creation node based on this vSwitch CIDR block. This parameter is not read for the ENI architecture.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.1.0/24</p>
     */
    @NameInMap("StandbyVSwitchCidr")
    public String standbyVSwitchCidr;

    /**
     * <p>The ID of the secondary zone. This parameter applies only to NAT firewalls that use the GWLB architecture. For the GWLB architecture, this parameter is required along with MasterZoneId, MasterVSwitchCidr, and StandbyVSwitchCidr. If any of these parameters is missing, ErrorParameters is returned. The value cannot be the same as MasterZoneId. If they are the same, ErrorZoneIdInvalid is returned. This parameter is not read for the ENI architecture.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-i</p>
     */
    @NameInMap("StandbyZoneId")
    public String standbyZoneId;

    /**
     * <p>Specifies whether to enable strict mode. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: enables strict mode.</li>
     * <li><strong>0</strong>: disables strict mode.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("StrictMode")
    public Integer strictMode;

    /**
     * <p>Specifies whether to enable the threat intelligence rules of the IPS. If this parameter is not specified, the system default (enabled) is used. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: disabled.</li>
     * <li><strong>1</strong>: enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ThreatIntelEnabled")
    public String threatIntelEnabled;

    /**
     * <p>Specifies whether to enable the Virtual Patches of the IPS. If this parameter is not specified, the system default (enabled) is used. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: disabled.</li>
     * <li><strong>1</strong>: enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("VirtualPatchEnabled")
    public String virtualPatchEnabled;

    /**
     * <p>The instance ID of the VPC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-uf6b5lyul0x******</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>Specifies whether to use the automatic mode for the vSwitch. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: automatic mode.</li>
     * <li><strong>false</strong>: manual mode.</li>
     * </ul>
     * <blockquote>
     * <p>Default value: <strong>true</strong>. If VswitchAuto is set to true, VswitchCidr is required and must be a valid CIDR block. If VswitchAuto is set to false, VswitchId is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("VswitchAuto")
    public String vswitchAuto;

    /**
     * <p>The CIDR block of the vSwitch. This parameter is required when the automatic mode is used for the vSwitch.</p>
     * 
     * <strong>example:</strong>
     * <p>0.0.0.0/0</p>
     */
    @NameInMap("VswitchCidr")
    public String vswitchCidr;

    /**
     * <p>The ID of the vSwitch. This parameter is required when the manual mode is used for the vSwitch.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1sqg9w******</p>
     */
    @NameInMap("VswitchId")
    public String vswitchId;

    public static CreateSecurityProxyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSecurityProxyRequest self = new CreateSecurityProxyRequest();
        return TeaModel.build(map, self);
    }

    public CreateSecurityProxyRequest setBasicDefenseEnabled(String basicDefenseEnabled) {
        this.basicDefenseEnabled = basicDefenseEnabled;
        return this;
    }
    public String getBasicDefenseEnabled() {
        return this.basicDefenseEnabled;
    }

    public CreateSecurityProxyRequest setFirewallServiceMode(String firewallServiceMode) {
        this.firewallServiceMode = firewallServiceMode;
        return this;
    }
    public String getFirewallServiceMode() {
        return this.firewallServiceMode;
    }

    public CreateSecurityProxyRequest setFirewallServiceZones(java.util.List<String> firewallServiceZones) {
        this.firewallServiceZones = firewallServiceZones;
        return this;
    }
    public java.util.List<String> getFirewallServiceZones() {
        return this.firewallServiceZones;
    }

    public CreateSecurityProxyRequest setFirewallSwitch(String firewallSwitch) {
        this.firewallSwitch = firewallSwitch;
        return this;
    }
    public String getFirewallSwitch() {
        return this.firewallSwitch;
    }

    public CreateSecurityProxyRequest setFwVswitchZoneId(String fwVswitchZoneId) {
        this.fwVswitchZoneId = fwVswitchZoneId;
        return this;
    }
    public String getFwVswitchZoneId() {
        return this.fwVswitchZoneId;
    }

    public CreateSecurityProxyRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateSecurityProxyRequest setMasterVSwitchCidr(String masterVSwitchCidr) {
        this.masterVSwitchCidr = masterVSwitchCidr;
        return this;
    }
    public String getMasterVSwitchCidr() {
        return this.masterVSwitchCidr;
    }

    public CreateSecurityProxyRequest setMasterZoneId(String masterZoneId) {
        this.masterZoneId = masterZoneId;
        return this;
    }
    public String getMasterZoneId() {
        return this.masterZoneId;
    }

    public CreateSecurityProxyRequest setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public CreateSecurityProxyRequest setNatMode(String natMode) {
        this.natMode = natMode;
        return this;
    }
    public String getNatMode() {
        return this.natMode;
    }

    public CreateSecurityProxyRequest setNatRouteEntryList(java.util.List<CreateSecurityProxyRequestNatRouteEntryList> natRouteEntryList) {
        this.natRouteEntryList = natRouteEntryList;
        return this;
    }
    public java.util.List<CreateSecurityProxyRequestNatRouteEntryList> getNatRouteEntryList() {
        return this.natRouteEntryList;
    }

    public CreateSecurityProxyRequest setProxyName(String proxyName) {
        this.proxyName = proxyName;
        return this;
    }
    public String getProxyName() {
        return this.proxyName;
    }

    public CreateSecurityProxyRequest setRegionNo(String regionNo) {
        this.regionNo = regionNo;
        return this;
    }
    public String getRegionNo() {
        return this.regionNo;
    }

    public CreateSecurityProxyRequest setRuleClass(String ruleClass) {
        this.ruleClass = ruleClass;
        return this;
    }
    public String getRuleClass() {
        return this.ruleClass;
    }

    public CreateSecurityProxyRequest setRunMode(String runMode) {
        this.runMode = runMode;
        return this;
    }
    public String getRunMode() {
        return this.runMode;
    }

    public CreateSecurityProxyRequest setStandbyVSwitchCidr(String standbyVSwitchCidr) {
        this.standbyVSwitchCidr = standbyVSwitchCidr;
        return this;
    }
    public String getStandbyVSwitchCidr() {
        return this.standbyVSwitchCidr;
    }

    public CreateSecurityProxyRequest setStandbyZoneId(String standbyZoneId) {
        this.standbyZoneId = standbyZoneId;
        return this;
    }
    public String getStandbyZoneId() {
        return this.standbyZoneId;
    }

    public CreateSecurityProxyRequest setStrictMode(Integer strictMode) {
        this.strictMode = strictMode;
        return this;
    }
    public Integer getStrictMode() {
        return this.strictMode;
    }

    public CreateSecurityProxyRequest setThreatIntelEnabled(String threatIntelEnabled) {
        this.threatIntelEnabled = threatIntelEnabled;
        return this;
    }
    public String getThreatIntelEnabled() {
        return this.threatIntelEnabled;
    }

    public CreateSecurityProxyRequest setVirtualPatchEnabled(String virtualPatchEnabled) {
        this.virtualPatchEnabled = virtualPatchEnabled;
        return this;
    }
    public String getVirtualPatchEnabled() {
        return this.virtualPatchEnabled;
    }

    public CreateSecurityProxyRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateSecurityProxyRequest setVswitchAuto(String vswitchAuto) {
        this.vswitchAuto = vswitchAuto;
        return this;
    }
    public String getVswitchAuto() {
        return this.vswitchAuto;
    }

    public CreateSecurityProxyRequest setVswitchCidr(String vswitchCidr) {
        this.vswitchCidr = vswitchCidr;
        return this;
    }
    public String getVswitchCidr() {
        return this.vswitchCidr;
    }

    public CreateSecurityProxyRequest setVswitchId(String vswitchId) {
        this.vswitchId = vswitchId;
        return this;
    }
    public String getVswitchId() {
        return this.vswitchId;
    }

    public static class CreateSecurityProxyRequestNatRouteEntryList extends TeaModel {
        /**
         * <p>The destination CIDR block of the default route.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.0.0/0</p>
         */
        @NameInMap("DestinationCidr")
        public String destinationCidr;

        /**
         * <p>The next hop ID of the original NAT gateway.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ngw-bp1okz6******</p>
         */
        @NameInMap("NextHopId")
        public String nextHopId;

        /**
         * <p>The network type of the next hop. Valid values: NatGateway.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>NatGateway</p>
         */
        @NameInMap("NextHopType")
        public String nextHopType;

        /**
         * <p>The ID of the route table to which the default route of the NAT gateway belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vtb-2ze1******</p>
         */
        @NameInMap("RouteTableId")
        public String routeTableId;

        public static CreateSecurityProxyRequestNatRouteEntryList build(java.util.Map<String, ?> map) throws Exception {
            CreateSecurityProxyRequestNatRouteEntryList self = new CreateSecurityProxyRequestNatRouteEntryList();
            return TeaModel.build(map, self);
        }

        public CreateSecurityProxyRequestNatRouteEntryList setDestinationCidr(String destinationCidr) {
            this.destinationCidr = destinationCidr;
            return this;
        }
        public String getDestinationCidr() {
            return this.destinationCidr;
        }

        public CreateSecurityProxyRequestNatRouteEntryList setNextHopId(String nextHopId) {
            this.nextHopId = nextHopId;
            return this;
        }
        public String getNextHopId() {
            return this.nextHopId;
        }

        public CreateSecurityProxyRequestNatRouteEntryList setNextHopType(String nextHopType) {
            this.nextHopType = nextHopType;
            return this;
        }
        public String getNextHopType() {
            return this.nextHopType;
        }

        public CreateSecurityProxyRequestNatRouteEntryList setRouteTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            return this;
        }
        public String getRouteTableId() {
            return this.routeTableId;
        }

    }

}
