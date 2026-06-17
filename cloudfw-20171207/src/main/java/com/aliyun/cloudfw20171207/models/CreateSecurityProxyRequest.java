// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateSecurityProxyRequest extends TeaModel {
    /**
     * <p>The security protection switch. Valid values:</p>
     * <ul>
     * <li><p><strong>open</strong>: on</p>
     * </li>
     * <li><p><strong>close</strong>: off</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>close</p>
     */
    @NameInMap("FirewallSwitch")
    public String firewallSwitch;

    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong> (default): Chinese</p>
     * </li>
     * <li><p><strong>en</strong>: English</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the NAT Gateway.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ngw-bp1okz6k7******</p>
     */
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    /**
     * <p>The list of routes of the NAT Gateway that you want to switch.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("NatRouteEntryList")
    public java.util.List<CreateSecurityProxyRequestNatRouteEntryList> natRouteEntryList;

    /**
     * <p>The name of the NAT firewall. The name must be 4 to 50 characters in length. It can contain letters, digits, Chinese characters, and underscores (<em>). The name cannot start with an underscore (</em>).</p>
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
     * <p>For more information about the regions where Cloud Firewall is available, see <a href="https://help.aliyun.com/document_detail/195657.html">Supported regions</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionNo")
    public String regionNo;

    /**
     * <p>Specifies whether to enable strict mode.</p>
     * <ul>
     * <li><p>1: enables strict mode</p>
     * </li>
     * <li><p>0: disables strict mode</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("StrictMode")
    public Integer strictMode;

    /**
     * <p>The ID of the VPC instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-uf6b5lyul0x******</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>Specifies whether to use the automatic vSwitch selection feature. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: automatic mode</p>
     * </li>
     * <li><p><strong>false</strong>: manual mode</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("VswitchAuto")
    public String vswitchAuto;

    /**
     * <p>The CIDR block of the vSwitch. This parameter is required if you use the automatic vSwitch selection feature.</p>
     * 
     * <strong>example:</strong>
     * <p>0.0.0.0/0</p>
     */
    @NameInMap("VswitchCidr")
    public String vswitchCidr;

    /**
     * <p>The ID of the vSwitch. This parameter is required if you use the manual vSwitch selection feature.</p>
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

    public CreateSecurityProxyRequest setFirewallSwitch(String firewallSwitch) {
        this.firewallSwitch = firewallSwitch;
        return this;
    }
    public String getFirewallSwitch() {
        return this.firewallSwitch;
    }

    public CreateSecurityProxyRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateSecurityProxyRequest setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
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

    public CreateSecurityProxyRequest setStrictMode(Integer strictMode) {
        this.strictMode = strictMode;
        return this;
    }
    public Integer getStrictMode() {
        return this.strictMode;
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
         * <p>The next hop of the original NAT Gateway.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ngw-bp1okz6******</p>
         */
        @NameInMap("NextHopId")
        public String nextHopId;

        /**
         * <p>The network type of the next hop. Set the value to NatGateway.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>NatGateway</p>
         */
        @NameInMap("NextHopType")
        public String nextHopType;

        /**
         * <p>The route table that contains the default route of the NAT Gateway.</p>
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
