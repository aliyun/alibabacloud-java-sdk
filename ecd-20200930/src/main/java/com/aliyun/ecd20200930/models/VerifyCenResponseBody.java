// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class VerifyCenResponseBody extends TeaModel {
    /**
     * <p>The recommended IPv4 CIDR blocks. Three CIDR blocks are randomly recommended. This parameter is returned when the <code>Status</code> value is <code>Conflict</code>.</p>
     */
    @NameInMap("CidrBlocks")
    public java.util.List<String> cidrBlocks;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0AF9D857-AE96-53D6-B317-5DD665EC4EC0</p>
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
     * <p>Valid values:</p>
     * <ul>
     * <li>InvalidCen.CenUidInvalid: The Alibaba Cloud account is invalid or the Alibaba Cloud account does not have the permission to access Elastic Desktop Service.</li>
     * <li>VerifyCode.InvalidTokenCode: The verification code is invalid.</li>
     * <li>VerifyCode.ReachTokenRetryTime: The maximum number of times for entering a verification code reaches the limit.</li>
     * <li>Conflict: A CIDR block conflict exists. If the verification result of at least one route is Conflict, Conflict is returned for this parameter.</li>
     * <li>Access: The verification is passed. If the verification result for all routes is Access, Access is returned for this parameter.</li>
     * <li>InvalidCen.ParameterCenInstanceId: The Alibaba Cloud account does not own the CEN instance.</li>
     * </ul>
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
         * <p>The CIDR block of the route.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.111.3****</p>
         */
        @NameInMap("DestinationCidrBlock")
        public String destinationCidrBlock;

        /**
         * <p>The ID of the instance corresponding to the route.</p>
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
         * <p>The verification result of the route.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Conflict: A CIDR block conflict exists.</li>
         * <li>Access: The verification is passed.</li>
         * </ul>
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
