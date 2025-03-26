// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class GetErRouteEntryResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Content")
    public GetErRouteEntryResponseBodyContent content;

    /**
     * <p>The error message. (If the instance is in the Exception state, the exception cause is prompted.)</p>
     * 
     * <strong>example:</strong>
     * <p>code: 400, Request was denied due to request throttling. request id: 7D177459-C1CF-5690-BB23-321D208B37D5</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID of the current request</p>
     * 
     * <strong>example:</strong>
     * <p>1F38A2E6-CB47-5369-95D2-96D0C287B4A5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetErRouteEntryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetErRouteEntryResponseBody self = new GetErRouteEntryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetErRouteEntryResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetErRouteEntryResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetErRouteEntryResponseBody setContent(GetErRouteEntryResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public GetErRouteEntryResponseBodyContent getContent() {
        return this.content;
    }

    public GetErRouteEntryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetErRouteEntryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetErRouteEntryResponseBodyContent extends TeaModel {
        /**
         * <p>Destination CIDR Block</p>
         * 
         * <strong>example:</strong>
         * <p>11.0.0.0/16</p>
         */
        @NameInMap("DestinationCidrBlock")
        public String destinationCidrBlock;

        /**
         * <p>Lingjun HUB Instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>er-aueyxxsy</p>
         */
        @NameInMap("ErId")
        public String erId;

        /**
         * <p>The ID of the route entry.</p>
         * 
         * <strong>example:</strong>
         * <p>er-rte-4q0jbylz</p>
         */
        @NameInMap("ErRouteEntryId")
        public String erRouteEntryId;

        /**
         * <p>The time when the cluster was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1666677783000</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>Next Hop Instance</p>
         * 
         * <strong>example:</strong>
         * <p>vcc-cn-209300qha01</p>
         */
        @NameInMap("NextHopId")
        public String nextHopId;

        /**
         * <p>Next Hop Instance Type</p>
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
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>Resource group instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekzb3n5lgk2ieq</p>
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

        public static GetErRouteEntryResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            GetErRouteEntryResponseBodyContent self = new GetErRouteEntryResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public GetErRouteEntryResponseBodyContent setDestinationCidrBlock(String destinationCidrBlock) {
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }
        public String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        public GetErRouteEntryResponseBodyContent setErId(String erId) {
            this.erId = erId;
            return this;
        }
        public String getErId() {
            return this.erId;
        }

        public GetErRouteEntryResponseBodyContent setErRouteEntryId(String erRouteEntryId) {
            this.erRouteEntryId = erRouteEntryId;
            return this;
        }
        public String getErRouteEntryId() {
            return this.erRouteEntryId;
        }

        public GetErRouteEntryResponseBodyContent setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetErRouteEntryResponseBodyContent setNextHopId(String nextHopId) {
            this.nextHopId = nextHopId;
            return this;
        }
        public String getNextHopId() {
            return this.nextHopId;
        }

        public GetErRouteEntryResponseBodyContent setNextHopType(String nextHopType) {
            this.nextHopType = nextHopType;
            return this;
        }
        public String getNextHopType() {
            return this.nextHopType;
        }

        public GetErRouteEntryResponseBodyContent setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetErRouteEntryResponseBodyContent setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetErRouteEntryResponseBodyContent setRouteType(String routeType) {
            this.routeType = routeType;
            return this;
        }
        public String getRouteType() {
            return this.routeType;
        }

        public GetErRouteEntryResponseBodyContent setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetErRouteEntryResponseBodyContent setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
