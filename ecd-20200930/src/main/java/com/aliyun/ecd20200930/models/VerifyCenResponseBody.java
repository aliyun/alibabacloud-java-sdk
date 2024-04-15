// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class VerifyCenResponseBody extends TeaModel {
    /**
     * <p>The recommended IPv4 CIDR blocks. Three CIDR blocks are randomly recommended. This parameter is returned when the `Status` value is `Conflict`.</p>
     */
    @NameInMap("CidrBlocks")
    public java.util.List<String> cidrBlocks;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The routes provided by the CEN instance.</p>
     */
    @NameInMap("RouteEntries")
    public java.util.List<VerifyCenResponseBodyRouteEntries> routeEntries;

    /**
     * <p>The check result of CIDR block conflict.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   InvalidCen.CenUidInvalid: The Alibaba Cloud account is invalid or the Alibaba Cloud account does not have the permission to access WUYING Workspace.</p>
     * <p>*   VerifyCode.InvalidTokenCode: The verification code is invalid.</p>
     * <p>*   VerifyCode.ReachTokenRetryTime: The maximum number of times for entering a verification code reaches the limit.</p>
     * <p>*   Conflict: A CIDR block conflict exists. If the verification result of at least one route is Conflict, Conflict is returned for this parameter.</p>
     * <p>*   Access: The verification is passed. If the verification result for all routes is Access, Access is returned for this parameter.</p>
     * <p>*   InvalidCen.ParameterCenInstanceId: The Alibaba Cloud account does not own the CEN instance.</p>
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
         * <p>The CIDR block of the route.</p>
         */
        @NameInMap("DestinationCidrBlock")
        public String destinationCidrBlock;

        /**
         * <p>The ID of the instance corresponding to the route.</p>
         */
        @NameInMap("NextHopInstanceId")
        public String nextHopInstanceId;

        /**
         * <p>The region ID of the route.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The verification result of the route.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   Conflict: A CIDR block conflict exists.</p>
         * <p>*   Access: The verification is passed.</p>
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
