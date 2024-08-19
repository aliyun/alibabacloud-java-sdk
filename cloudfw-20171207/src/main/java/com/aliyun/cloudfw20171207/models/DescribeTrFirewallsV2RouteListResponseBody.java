// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeTrFirewallsV2RouteListResponseBody extends TeaModel {
    /**
     * <p>The route tables of Cloud Firewall.</p>
     */
    @NameInMap("FirewallRouteDetailList")
    public java.util.List<DescribeTrFirewallsV2RouteListResponseBodyFirewallRouteDetailList> firewallRouteDetailList;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>ABF190A2-B4D0-53F6-995A-5690A721F91C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeTrFirewallsV2RouteListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTrFirewallsV2RouteListResponseBody self = new DescribeTrFirewallsV2RouteListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTrFirewallsV2RouteListResponseBody setFirewallRouteDetailList(java.util.List<DescribeTrFirewallsV2RouteListResponseBodyFirewallRouteDetailList> firewallRouteDetailList) {
        this.firewallRouteDetailList = firewallRouteDetailList;
        return this;
    }
    public java.util.List<DescribeTrFirewallsV2RouteListResponseBodyFirewallRouteDetailList> getFirewallRouteDetailList() {
        return this.firewallRouteDetailList;
    }

    public DescribeTrFirewallsV2RouteListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeTrFirewallsV2RouteListResponseBodyFirewallRouteDetailList extends TeaModel {
        /**
         * <p>The destination address of the route.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.10.0/25</p>
         */
        @NameInMap("TrFirewallRouteDestination")
        public String trFirewallRouteDestination;

        /**
         * <p>The ID of the next hop for the route.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-attach-hnxab1y0pxn16p****</p>
         */
        @NameInMap("TrFirewallRouteNexthop")
        public String trFirewallRouteNexthop;

        /**
         * <p>The ID of the routing policy.</p>
         * 
         * <strong>example:</strong>
         * <p>policy-04ecbbc6720d4f90****</p>
         */
        @NameInMap("TrFirewallRoutePolicyId")
        public String trFirewallRoutePolicyId;

        /**
         * <p>The ID of the route table to which the route entry belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vtb-2zeockxxxorv0mnhz****</p>
         */
        @NameInMap("TrFirewallRouteTableId")
        public String trFirewallRouteTableId;

        public static DescribeTrFirewallsV2RouteListResponseBodyFirewallRouteDetailList build(java.util.Map<String, ?> map) throws Exception {
            DescribeTrFirewallsV2RouteListResponseBodyFirewallRouteDetailList self = new DescribeTrFirewallsV2RouteListResponseBodyFirewallRouteDetailList();
            return TeaModel.build(map, self);
        }

        public DescribeTrFirewallsV2RouteListResponseBodyFirewallRouteDetailList setTrFirewallRouteDestination(String trFirewallRouteDestination) {
            this.trFirewallRouteDestination = trFirewallRouteDestination;
            return this;
        }
        public String getTrFirewallRouteDestination() {
            return this.trFirewallRouteDestination;
        }

        public DescribeTrFirewallsV2RouteListResponseBodyFirewallRouteDetailList setTrFirewallRouteNexthop(String trFirewallRouteNexthop) {
            this.trFirewallRouteNexthop = trFirewallRouteNexthop;
            return this;
        }
        public String getTrFirewallRouteNexthop() {
            return this.trFirewallRouteNexthop;
        }

        public DescribeTrFirewallsV2RouteListResponseBodyFirewallRouteDetailList setTrFirewallRoutePolicyId(String trFirewallRoutePolicyId) {
            this.trFirewallRoutePolicyId = trFirewallRoutePolicyId;
            return this;
        }
        public String getTrFirewallRoutePolicyId() {
            return this.trFirewallRoutePolicyId;
        }

        public DescribeTrFirewallsV2RouteListResponseBodyFirewallRouteDetailList setTrFirewallRouteTableId(String trFirewallRouteTableId) {
            this.trFirewallRouteTableId = trFirewallRouteTableId;
            return this;
        }
        public String getTrFirewallRouteTableId() {
            return this.trFirewallRouteTableId;
        }

    }

}
