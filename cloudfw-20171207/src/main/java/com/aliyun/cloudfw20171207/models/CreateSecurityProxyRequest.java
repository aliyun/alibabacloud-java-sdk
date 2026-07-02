// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateSecurityProxyRequest extends TeaModel {
    /**
     * <p>The security protection switch. Valid values:</p>
     * <ul>
     * <li><strong>open</strong>: enabled</li>
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
     * <p>The language of the content within the response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese</li>
     * <li><strong>en</strong>: English.</li>
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
     * <p>ngw-bp1okz6k7******</p>
     */
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    /**
     * <p>The list of routes to be switched for the NAT gateway.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("NatRouteEntryList")
    public java.util.List<CreateSecurityProxyRequestNatRouteEntryList> natRouteEntryList;

    /**
     * <p>The name of the NAT firewall. The name can contain uppercase and lowercase letters, Chinese characters, digits, and underscores (_). The name must be 4 to 50 characters in length and cannot start with an underscore.</p>
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
     * <p>Specifies whether to enable strict mode.</p>
     * <ul>
     * <li>1: Enable strict mode.</li>
     * <li>0: Disable strict mode.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("StrictMode")
    public Integer strictMode;

    /**
     * <p>The VPC-connected instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-uf6b5lyul0x******</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>Specifies whether to use the automatic vSwitch mode. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: automatic mode</li>
     * <li><strong>false</strong>: manual mode.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("VswitchAuto")
    public String vswitchAuto;

    /**
     * <p>The CIDR block of the vSwitch. This parameter is required when the vSwitch is in automatic mode.</p>
     * 
     * <strong>example:</strong>
     * <p>0.0.0.0/0</p>
     */
    @NameInMap("VswitchCidr")
    public String vswitchCidr;

    /**
     * <p>The vSwitch ID. This parameter is required when the vSwitch is in manual mode.</p>
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
         * <p>The next hop address of the original NAT gateway.</p>
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
         * <p>The route table that contains the default route of the NAT gateway.</p>
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
