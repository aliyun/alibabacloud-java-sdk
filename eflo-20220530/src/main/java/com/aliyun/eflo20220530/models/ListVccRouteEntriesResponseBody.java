// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class ListVccRouteEntriesResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
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
     * <p>The response parameters.</p>
     */
    @NameInMap("Content")
    public ListVccRouteEntriesResponseBodyContent content;

    /**
     * <p>response message, if the success request is</p>
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
     * <p>A88DFED5-24B7-5A3E-87DE-380BF06F3C90</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListVccRouteEntriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVccRouteEntriesResponseBody self = new ListVccRouteEntriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVccRouteEntriesResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListVccRouteEntriesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListVccRouteEntriesResponseBody setContent(ListVccRouteEntriesResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public ListVccRouteEntriesResponseBodyContent getContent() {
        return this.content;
    }

    public ListVccRouteEntriesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListVccRouteEntriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListVccRouteEntriesResponseBodyContentData extends TeaModel {
        /**
         * <p>Destination CIDR block</p>
         * 
         * <strong>example:</strong>
         * <p>10.192.32.0/24</p>
         */
        @NameInMap("DestinationCidrBlock")
        public String destinationCidrBlock;

        /**
         * <p>The time when the cluster was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1642745758000</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>Next Hop Instance</p>
         * 
         * <strong>example:</strong>
         * <p>vcc-cn-zvp2w222001</p>
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
         * <p>rg-aek2l4sq6l7unhi</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The ID of the tenant to which the resource belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1655449505171</p>
         */
        @NameInMap("ResourceTenantId")
        public String resourceTenantId;

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
         * <p>vcc-rte-maysfadg</p>
         */
        @NameInMap("VccRouteEntryId")
        public String vccRouteEntryId;

        public static ListVccRouteEntriesResponseBodyContentData build(java.util.Map<String, ?> map) throws Exception {
            ListVccRouteEntriesResponseBodyContentData self = new ListVccRouteEntriesResponseBodyContentData();
            return TeaModel.build(map, self);
        }

        public ListVccRouteEntriesResponseBodyContentData setDestinationCidrBlock(String destinationCidrBlock) {
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }
        public String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        public ListVccRouteEntriesResponseBodyContentData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListVccRouteEntriesResponseBodyContentData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListVccRouteEntriesResponseBodyContentData setNextHopId(String nextHopId) {
            this.nextHopId = nextHopId;
            return this;
        }
        public String getNextHopId() {
            return this.nextHopId;
        }

        public ListVccRouteEntriesResponseBodyContentData setNextHopType(String nextHopType) {
            this.nextHopType = nextHopType;
            return this;
        }
        public String getNextHopType() {
            return this.nextHopType;
        }

        public ListVccRouteEntriesResponseBodyContentData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListVccRouteEntriesResponseBodyContentData setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListVccRouteEntriesResponseBodyContentData setResourceTenantId(String resourceTenantId) {
            this.resourceTenantId = resourceTenantId;
            return this;
        }
        public String getResourceTenantId() {
            return this.resourceTenantId;
        }

        public ListVccRouteEntriesResponseBodyContentData setRouteType(String routeType) {
            this.routeType = routeType;
            return this;
        }
        public String getRouteType() {
            return this.routeType;
        }

        public ListVccRouteEntriesResponseBodyContentData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListVccRouteEntriesResponseBodyContentData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListVccRouteEntriesResponseBodyContentData setVccId(String vccId) {
            this.vccId = vccId;
            return this;
        }
        public String getVccId() {
            return this.vccId;
        }

        public ListVccRouteEntriesResponseBodyContentData setVccRouteEntryId(String vccRouteEntryId) {
            this.vccRouteEntryId = vccRouteEntryId;
            return this;
        }
        public String getVccRouteEntryId() {
            return this.vccRouteEntryId;
        }

    }

    public static class ListVccRouteEntriesResponseBodyContent extends TeaModel {
        /**
         * <p>List of Lingjun Connection Route Entries</p>
         */
        @NameInMap("Data")
        public java.util.List<ListVccRouteEntriesResponseBodyContentData> data;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Total")
        public Long total;

        public static ListVccRouteEntriesResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            ListVccRouteEntriesResponseBodyContent self = new ListVccRouteEntriesResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public ListVccRouteEntriesResponseBodyContent setData(java.util.List<ListVccRouteEntriesResponseBodyContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListVccRouteEntriesResponseBodyContentData> getData() {
            return this.data;
        }

        public ListVccRouteEntriesResponseBodyContent setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
