// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class GetVccRouteEntryResponseBody extends TeaModel {
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
    public GetVccRouteEntryResponseBodyContent content;

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
     * <p>BDBCC783-84CA-5733-8EEA-645C88B9009C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetVccRouteEntryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVccRouteEntryResponseBody self = new GetVccRouteEntryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVccRouteEntryResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetVccRouteEntryResponseBody setContent(GetVccRouteEntryResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public GetVccRouteEntryResponseBodyContent getContent() {
        return this.content;
    }

    public GetVccRouteEntryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetVccRouteEntryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetVccRouteEntryResponseBodyContent extends TeaModel {
        /**
         * <p>Destination CIDR Block</p>
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
         * <p>1648085472000</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The message that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>Next Hop Instance</p>
         * 
         * <strong>example:</strong>
         * <p>local</p>
         */
        @NameInMap("NextHopId")
        public String nextHopId;

        /**
         * <p>Next Hop Type</p>
         * 
         * <strong>example:</strong>
         * <p>VCC</p>
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
         * <p>rg-aek2l4sq6l7u***</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>Route type</p>
         * 
         * <strong>example:</strong>
         * <p>System</p>
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
         * <p>The ID of the Lingjun connection instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vcc-cn-zvp2w222001</p>
         */
        @NameInMap("VccId")
        public String vccId;

        /**
         * <p>The ID of the route entry.</p>
         * 
         * <strong>example:</strong>
         * <p>vcc-rte-31ocvdhq</p>
         */
        @NameInMap("VccRouteEntryId")
        public String vccRouteEntryId;

        public static GetVccRouteEntryResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            GetVccRouteEntryResponseBodyContent self = new GetVccRouteEntryResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public GetVccRouteEntryResponseBodyContent setDestinationCidrBlock(String destinationCidrBlock) {
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }
        public String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        public GetVccRouteEntryResponseBodyContent setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetVccRouteEntryResponseBodyContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetVccRouteEntryResponseBodyContent setNextHopId(String nextHopId) {
            this.nextHopId = nextHopId;
            return this;
        }
        public String getNextHopId() {
            return this.nextHopId;
        }

        public GetVccRouteEntryResponseBodyContent setNextHopType(String nextHopType) {
            this.nextHopType = nextHopType;
            return this;
        }
        public String getNextHopType() {
            return this.nextHopType;
        }

        public GetVccRouteEntryResponseBodyContent setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetVccRouteEntryResponseBodyContent setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetVccRouteEntryResponseBodyContent setRouteType(String routeType) {
            this.routeType = routeType;
            return this;
        }
        public String getRouteType() {
            return this.routeType;
        }

        public GetVccRouteEntryResponseBodyContent setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetVccRouteEntryResponseBodyContent setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public GetVccRouteEntryResponseBodyContent setVccId(String vccId) {
            this.vccId = vccId;
            return this;
        }
        public String getVccId() {
            return this.vccId;
        }

        public GetVccRouteEntryResponseBodyContent setVccRouteEntryId(String vccRouteEntryId) {
            this.vccRouteEntryId = vccRouteEntryId;
            return this;
        }
        public String getVccRouteEntryId() {
            return this.vccRouteEntryId;
        }

    }

}
