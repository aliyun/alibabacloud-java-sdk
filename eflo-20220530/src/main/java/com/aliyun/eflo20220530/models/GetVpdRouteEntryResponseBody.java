// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class GetVpdRouteEntryResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("Content")
    public GetVpdRouteEntryResponseBodyContent content;

    /**
     * <p>The error message. (If the instance is in the Exception state, the exception cause is prompted.)</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID of the current request</p>
     * 
     * <strong>example:</strong>
     * <p>9C50C9CD-E799-54DA-BA7A-1FAF3DF80857</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetVpdRouteEntryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVpdRouteEntryResponseBody self = new GetVpdRouteEntryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVpdRouteEntryResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetVpdRouteEntryResponseBody setContent(GetVpdRouteEntryResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public GetVpdRouteEntryResponseBodyContent getContent() {
        return this.content;
    }

    public GetVpdRouteEntryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetVpdRouteEntryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetVpdRouteEntryResponseBodyContent extends TeaModel {
        /**
         * <p>Destination CIDR block</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.0.0/0</p>
         */
        @NameInMap("DestinationCidrBlock")
        public String destinationCidrBlock;

        /**
         * <p>The time when the agent was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1678273219000</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>Next Hop Instance</p>
         * 
         * <strong>example:</strong>
         * <p>er-bmlqiym1</p>
         */
        @NameInMap("NextHopId")
        public String nextHopId;

        /**
         * <p>Next Hop Instance Type</p>
         * 
         * <strong>example:</strong>
         * <p>ER</p>
         */
        @NameInMap("NextHopType")
        public String nextHopType;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-wulanchabu</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>Resource group instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmv7mcq63uyhq</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>Route type</p>
         * 
         * <strong>example:</strong>
         * <p>BGP</p>
         */
        @NameInMap("RouteType")
        public String routeType;

        /**
         * <p>The status of the intervention entry. Valid value:</p>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>1655449505171</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <p>Lingjun CIDR block instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>vpd-ze3na0wf</p>
         */
        @NameInMap("VpdId")
        public String vpdId;

        /**
         * <p>Lingjun CIDR block route entry ID</p>
         * 
         * <strong>example:</strong>
         * <p>vpd-rte-toekyqel</p>
         */
        @NameInMap("VpdRouteEntryId")
        public String vpdRouteEntryId;

        public static GetVpdRouteEntryResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            GetVpdRouteEntryResponseBodyContent self = new GetVpdRouteEntryResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public GetVpdRouteEntryResponseBodyContent setDestinationCidrBlock(String destinationCidrBlock) {
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }
        public String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        public GetVpdRouteEntryResponseBodyContent setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetVpdRouteEntryResponseBodyContent setNextHopId(String nextHopId) {
            this.nextHopId = nextHopId;
            return this;
        }
        public String getNextHopId() {
            return this.nextHopId;
        }

        public GetVpdRouteEntryResponseBodyContent setNextHopType(String nextHopType) {
            this.nextHopType = nextHopType;
            return this;
        }
        public String getNextHopType() {
            return this.nextHopType;
        }

        public GetVpdRouteEntryResponseBodyContent setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetVpdRouteEntryResponseBodyContent setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetVpdRouteEntryResponseBodyContent setRouteType(String routeType) {
            this.routeType = routeType;
            return this;
        }
        public String getRouteType() {
            return this.routeType;
        }

        public GetVpdRouteEntryResponseBodyContent setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetVpdRouteEntryResponseBodyContent setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public GetVpdRouteEntryResponseBodyContent setVpdId(String vpdId) {
            this.vpdId = vpdId;
            return this;
        }
        public String getVpdId() {
            return this.vpdId;
        }

        public GetVpdRouteEntryResponseBodyContent setVpdRouteEntryId(String vpdRouteEntryId) {
            this.vpdRouteEntryId = vpdRouteEntryId;
            return this;
        }
        public String getVpdRouteEntryId() {
            return this.vpdRouteEntryId;
        }

    }

}
