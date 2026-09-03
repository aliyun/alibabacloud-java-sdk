// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class VerifyCenResponseBody extends TeaModel {
    /**
     * <p>The recommended IPv4 CIDR blocks. Three CIDR blocks are randomly recommended. This parameter is returned when <code>Status</code> is <code>Conflict</code>.</p>
     */
    @NameInMap("CidrBlocks")
    public java.util.List<String> cidrBlocks;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0AF9D857-AE96-53D6-B317-5DD665EC4EC0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of route information contained in the CEN instance.</p>
     */
    @NameInMap("RouteEntries")
    public java.util.List<VerifyCenResponseBodyRouteEntries> routeEntries;

    /**
     * <p>The result of the CIDR block conflict check.</p>
     * 
     * <strong>example:</strong>
     * <p>Access</p>
     */
    @NameInMap("Status")
    public String status;

    public static VerifyCenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VerifyCenResponseBody self = new VerifyCenResponseBody();
        return TeaModel.build(map, self);
    }

    public VerifyCenResponseBody setCidrBlocks(java.util.List<String> cidrBlocks) {
        this.cidrBlocks = cidrBlocks;
        return this;
    }
    public java.util.List<String> getCidrBlocks() {
        return this.cidrBlocks;
    }

    public VerifyCenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public VerifyCenResponseBody setRouteEntries(java.util.List<VerifyCenResponseBodyRouteEntries> routeEntries) {
        this.routeEntries = routeEntries;
        return this;
    }
    public java.util.List<VerifyCenResponseBodyRouteEntries> getRouteEntries() {
        return this.routeEntries;
    }

    public VerifyCenResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class VerifyCenResponseBodyRouteEntries extends TeaModel {
        /**
         * <p>The destination CIDR block of the route.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.XX.XX</p>
         */
        @NameInMap("DestinationCidrBlock")
        public String destinationCidrBlock;

        /**
         * <p>The instance ID of the network instance associated with the routing entry.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-uf62bu0xs5j8md54p****</p>
         */
        @NameInMap("NextHopInstanceId")
        public String nextHopInstanceId;

        /**
         * <p>The region ID of the route.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The route check result.</p>
         * 
         * <strong>example:</strong>
         * <p>Access</p>
         */
        @NameInMap("Status")
        public String status;

        public static VerifyCenResponseBodyRouteEntries build(java.util.Map<String, ?> map) throws Exception {
            VerifyCenResponseBodyRouteEntries self = new VerifyCenResponseBodyRouteEntries();
            return TeaModel.build(map, self);
        }

        public VerifyCenResponseBodyRouteEntries setDestinationCidrBlock(String destinationCidrBlock) {
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }
        public String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        public VerifyCenResponseBodyRouteEntries setNextHopInstanceId(String nextHopInstanceId) {
            this.nextHopInstanceId = nextHopInstanceId;
            return this;
        }
        public String getNextHopInstanceId() {
            return this.nextHopInstanceId;
        }

        public VerifyCenResponseBodyRouteEntries setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public VerifyCenResponseBodyRouteEntries setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
