// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateSecurityProxyRequest extends TeaModel {
    @NameInMap("FirewallSwitch")
    public String firewallSwitch;

    @NameInMap("Lang")
    public String lang;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("NatRouteEntryList")
    public java.util.List<CreateSecurityProxyRequestNatRouteEntryList> natRouteEntryList;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProxyName")
    public String proxyName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionNo")
    public String regionNo;

    @NameInMap("StrictMode")
    public Integer strictMode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("VswitchAuto")
    public String vswitchAuto;

    @NameInMap("VswitchCidr")
    public String vswitchCidr;

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
         * <p>This parameter is required.</p>
         */
        @NameInMap("DestinationCidr")
        public String destinationCidr;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("NextHopId")
        public String nextHopId;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("NextHopType")
        public String nextHopType;

        /**
         * <p>This parameter is required.</p>
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
