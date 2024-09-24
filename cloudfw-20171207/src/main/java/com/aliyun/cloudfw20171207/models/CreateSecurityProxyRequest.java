// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateSecurityProxyRequest extends TeaModel {
    /**
     * <p>The status of the NAT firewall. Valid values:</p>
     * <ul>
     * <li><strong>open</strong>: enabled</li>
     * <li><strong>close</strong>: disabled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>close</p>
     */
    @NameInMap("FirewallSwitch")
    public String firewallSwitch;

    /**
     * <p>The language of the content within the response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the NAT gateway.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ngw-bp1okz6k7s4n4mnk5f1g3</p>
     */
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    /**
     * <p>The routes to be switched to the NAT gateway.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("NatRouteEntryList")
    public java.util.List<CreateSecurityProxyRequestNatRouteEntryList> natRouteEntryList;

    /**
     * <p>The name of the NAT firewall. The name must be 4 to 50 characters in length, and can contain letters, digits, and underscores (_). However, it cannot start with an underscore.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>nat-idmp-fir</p>
     */
    @NameInMap("ProxyName")
    public String proxyName;

    /**
     * <p>The region ID of the virtual private cloud (VPC).</p>
     * <blockquote>
     * <p> For more information about Cloud Firewall supported regions, see <a href="https://help.aliyun.com/document_detail/195657.html">Supported regions</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionNo")
    public String regionNo;

    /**
     * <p>Specifies whether to enable the strict mode. Valid values:</p>
     * <ul>
     * <li>1: yes</li>
     * <li>0: no</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("StrictMode")
    public Integer strictMode;

    /**
     * <p>The ID of the VPC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-uf6b5lyul0xfgv74i01ph</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The mode of the vSwitch that you want to use. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: automatic</li>
     * <li><strong>false</strong>: manual</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("VswitchAuto")
    public String vswitchAuto;

    /**
     * <p>The CIDR block of the vSwitch.</p>
     * 
     * <strong>example:</strong>
     * <p>0.0.0.0/0</p>
     */
    @NameInMap("VswitchCidr")
    public String vswitchCidr;

    /**
     * <p>The ID of the vSwitch. This parameter is required if you set the VswitchAuto parameter to true.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1sqg9wms9w9y1uxcs1x</p>
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
         * <p>The next hop of the original NAT gateway.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ngw-bp1okz6k7s4n4mnk5f1g3</p>
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
         * <p>The route table to which the default route of the NAT gateway belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vtb-2ze13wrgz7wsu9yiqeffg</p>
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
