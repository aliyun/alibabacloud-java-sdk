// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class SwitchSecurityProxyRequest extends TeaModel {
    /**
     * <p>The language of the request and response. Valid values:</p>
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
     * <p>The route entry list for routing to be redirected or un-redirected. Maximum number of entries: 10,000. When RouteAction (divert or undivert) is specified, a non-empty list must be provided and used according to the incremental semantics. Each entry must include the RouteTableId, DestinationCidr, NextHopId, and NextHopType fields, and the combination of RouteTableId and DestinationCidr must be unique. In the Gateway Load Balancer (GWLB) architecture, when committed together with Switch=open, this parameter is used to specify the route entry for which traffic redirection is enabled in the current request. If no list is provided, the saved list is used. If no active list exists, a parameter error is returned.</p>
     */
    @NameInMap("NatRouteEntryList")
    public java.util.List<SwitchSecurityProxyRequestNatRouteEntryList> natRouteEntryList;

    /**
     * <p>The ID of the NAT firewall.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>proxy-natbf******</p>
     */
    @NameInMap("ProxyId")
    public String proxyId;

    /**
     * <p>Makes incremental traffic redirection changes to the route entry passed in this request. Other redirected route tables in the list are not affected. Valid values: divert (enables traffic redirection for the passed route entry) and undivert (shutdown of traffic redirection for the passed route entry). This parameter is active only when the firewall is in the traffic redirection state (normal). This parameter and Switch are mutually exclusive and cannot be both set to non-empty values at the same time. If this parameter is not specified or is set to an empty string, the incremental semantics are not used.</p>
     * 
     * <strong>example:</strong>
     * <p>divert</p>
     */
    @NameInMap("RouteAction")
    public String routeAction;

    /**
     * <p>The security protection switch. Valid values:</p>
     * <ul>
     * <li>open: Enabled.</li>
     * <li>close: Disabled.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>open</p>
     */
    @NameInMap("Switch")
    public String _switch;

    public static SwitchSecurityProxyRequest build(java.util.Map<String, ?> map) throws Exception {
        SwitchSecurityProxyRequest self = new SwitchSecurityProxyRequest();
        return TeaModel.build(map, self);
    }

    public SwitchSecurityProxyRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SwitchSecurityProxyRequest setNatRouteEntryList(java.util.List<SwitchSecurityProxyRequestNatRouteEntryList> natRouteEntryList) {
        this.natRouteEntryList = natRouteEntryList;
        return this;
    }
    public java.util.List<SwitchSecurityProxyRequestNatRouteEntryList> getNatRouteEntryList() {
        return this.natRouteEntryList;
    }

    public SwitchSecurityProxyRequest setProxyId(String proxyId) {
        this.proxyId = proxyId;
        return this;
    }
    public String getProxyId() {
        return this.proxyId;
    }

    public SwitchSecurityProxyRequest setRouteAction(String routeAction) {
        this.routeAction = routeAction;
        return this;
    }
    public String getRouteAction() {
        return this.routeAction;
    }

    public SwitchSecurityProxyRequest set_switch(String _switch) {
        this._switch = _switch;
        return this;
    }
    public String get_switch() {
        return this._switch;
    }

    public static class SwitchSecurityProxyRequestNatRouteEntryList extends TeaModel {
        /**
         * <p>The destination CIDR block of the route entry. When RouteAction is specified, only the default route 0.0.0.0/0 is supported. If other CIDR blocks are passed, a parameter error is returned.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.0.0/0</p>
         */
        @NameInMap("DestinationCidr")
        public String destinationCidr;

        /**
         * <p>The ID of the NAT gateway to which the route entry pointed before traffic redirection. You can obtain the ID by calling the DescribeSecurityProxyResources operation. When RouteAction is specified, this value must be consistent with the NAT gateway involved in the current operation. When traffic redirection is disabled, you must still pass this NAT gateway ID instead of the current next hop ID of the firewall.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ngw-bp1a2b3c4d5e6f7g8h9i0</p>
         */
        @NameInMap("NextHopId")
        public String nextHopId;

        /**
         * <p>The next hop type of the route entry before traffic redirection. When RouteAction is specified, this value is fixed to NatGateway and must be passed in pairs with NextHopId. If other values are passed, a parameter error is returned.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>NatGateway</p>
         */
        @NameInMap("NextHopType")
        public String nextHopType;

        /**
         * <p>The ID of the route table to which the route entry belongs. The route table must exist in the user\&quot;s VPC. This parameter and DestinationCidr are used together to locate a route. If the route does not exist, the task fails and a message indicating that the route entry does not exist is returned.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vtb-bp1a2b3c4d5e6f7g8h9i0</p>
         */
        @NameInMap("RouteTableId")
        public String routeTableId;

        public static SwitchSecurityProxyRequestNatRouteEntryList build(java.util.Map<String, ?> map) throws Exception {
            SwitchSecurityProxyRequestNatRouteEntryList self = new SwitchSecurityProxyRequestNatRouteEntryList();
            return TeaModel.build(map, self);
        }

        public SwitchSecurityProxyRequestNatRouteEntryList setDestinationCidr(String destinationCidr) {
            this.destinationCidr = destinationCidr;
            return this;
        }
        public String getDestinationCidr() {
            return this.destinationCidr;
        }

        public SwitchSecurityProxyRequestNatRouteEntryList setNextHopId(String nextHopId) {
            this.nextHopId = nextHopId;
            return this;
        }
        public String getNextHopId() {
            return this.nextHopId;
        }

        public SwitchSecurityProxyRequestNatRouteEntryList setNextHopType(String nextHopType) {
            this.nextHopType = nextHopType;
            return this;
        }
        public String getNextHopType() {
            return this.nextHopType;
        }

        public SwitchSecurityProxyRequestNatRouteEntryList setRouteTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            return this;
        }
        public String getRouteTableId() {
            return this.routeTableId;
        }

    }

}
