// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class VerifyCenResponseBody extends TeaModel {
    // The three random IPv4 CIDR blocks that are recommended. If the returned value of the Status parameter is Conflict, this parameter is returned.
    @NameInMap("CidrBlocks")
    public java.util.List<String> cidrBlocks;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The information about the routes of the CEN instance.
    @NameInMap("RouteEntries")
    public java.util.List<VerifyCenResponseBodyRouteEntries> routeEntries;

    // The verification result for all routes. The valid values include:
    // 
    // *   Access: The route verification succeeds. If the verification result for all routes is Access, Access is returned for this parameter.
    // *   Conflict: A CIDR block conflict exists. If the verification result of at least one route is Conflict, Conflict is returned for this parameter.
    // *   InvalidCen.ParameterCenInstanceId: The ID of the CEN instance and the ID of the Alibaba Cloud account are invalid. The CEN instance does not belong to the Alibaba Cloud account.
    // *   InvalidCen.CenUidInvalid: The Alibaba Cloud account is invalid or the Alibaba Cloud account is not granted the required permissions to access Elastic Desktop Service (EDS).
    // *   VerifyCode.InvalidTokenCode: The verification code is invalid.
    // *   VerifyCode.ReachTokenRetryTime: The retries of entering the verification code reaches the upper limit.
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
        // The CIDR block of the route.
        @NameInMap("DestinationCidrBlock")
        public String destinationCidrBlock;

        // The ID of the network instance that is attached to the route.
        @NameInMap("NextHopInstanceId")
        public String nextHopInstanceId;

        // The ID of the region where the route resides.
        @NameInMap("RegionId")
        public String regionId;

        // The verification result for a route. The valid values include:
        // 
        // *   Access: The route verification succeeds.
        // *   Conflict: A CIDR block conflict exists.
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
