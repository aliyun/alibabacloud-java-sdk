// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeTrFirewallsV2RouteListResponseBody extends TeaModel {
    @NameInMap("FirewallRouteDetailList")
    public java.util.List<DescribeTrFirewallsV2RouteListResponseBodyFirewallRouteDetailList> firewallRouteDetailList;

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
        @NameInMap("TrFirewallRouteDestination")
        public String trFirewallRouteDestination;

        @NameInMap("TrFirewallRouteNexthop")
        public String trFirewallRouteNexthop;

        @NameInMap("TrFirewallRoutePolicyId")
        public String trFirewallRoutePolicyId;

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
