// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class ListVpdRouteEntriesResponseBody extends TeaModel {
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
    public ListVpdRouteEntriesResponseBodyContent content;

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
     * <p>039C3C3A-3C37-5672-80D5-D8CD48C676D1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListVpdRouteEntriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVpdRouteEntriesResponseBody self = new ListVpdRouteEntriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVpdRouteEntriesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListVpdRouteEntriesResponseBody setContent(ListVpdRouteEntriesResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public ListVpdRouteEntriesResponseBodyContent getContent() {
        return this.content;
    }

    public ListVpdRouteEntriesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListVpdRouteEntriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListVpdRouteEntriesResponseBodyContentData extends TeaModel {
        /**
         * <p>Destination CIDR block</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.0.0/0</p>
         */
        @NameInMap("DestinationCidrBlock")
        public String destinationCidrBlock;

        /**
         * <p>The time when the cluster was updated.</p>
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
         * <p>rg-acfmxhucx5ewuwy</p>
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
         * <p>Lingjun CIDR block instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>vpd-eoiy88ju</p>
         */
        @NameInMap("VpdId")
        public String vpdId;

        /**
         * <p>The ID of the route entry.</p>
         * 
         * <strong>example:</strong>
         * <p>vpd-rte-toekyqel</p>
         */
        @NameInMap("VpdRouteEntryId")
        public String vpdRouteEntryId;

        public static ListVpdRouteEntriesResponseBodyContentData build(java.util.Map<String, ?> map) throws Exception {
            ListVpdRouteEntriesResponseBodyContentData self = new ListVpdRouteEntriesResponseBodyContentData();
            return TeaModel.build(map, self);
        }

        public ListVpdRouteEntriesResponseBodyContentData setDestinationCidrBlock(String destinationCidrBlock) {
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }
        public String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        public ListVpdRouteEntriesResponseBodyContentData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListVpdRouteEntriesResponseBodyContentData setNextHopId(String nextHopId) {
            this.nextHopId = nextHopId;
            return this;
        }
        public String getNextHopId() {
            return this.nextHopId;
        }

        public ListVpdRouteEntriesResponseBodyContentData setNextHopType(String nextHopType) {
            this.nextHopType = nextHopType;
            return this;
        }
        public String getNextHopType() {
            return this.nextHopType;
        }

        public ListVpdRouteEntriesResponseBodyContentData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListVpdRouteEntriesResponseBodyContentData setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListVpdRouteEntriesResponseBodyContentData setResourceTenantId(String resourceTenantId) {
            this.resourceTenantId = resourceTenantId;
            return this;
        }
        public String getResourceTenantId() {
            return this.resourceTenantId;
        }

        public ListVpdRouteEntriesResponseBodyContentData setRouteType(String routeType) {
            this.routeType = routeType;
            return this;
        }
        public String getRouteType() {
            return this.routeType;
        }

        public ListVpdRouteEntriesResponseBodyContentData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListVpdRouteEntriesResponseBodyContentData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListVpdRouteEntriesResponseBodyContentData setVpdId(String vpdId) {
            this.vpdId = vpdId;
            return this;
        }
        public String getVpdId() {
            return this.vpdId;
        }

        public ListVpdRouteEntriesResponseBodyContentData setVpdRouteEntryId(String vpdRouteEntryId) {
            this.vpdRouteEntryId = vpdRouteEntryId;
            return this;
        }
        public String getVpdRouteEntryId() {
            return this.vpdRouteEntryId;
        }

    }

    public static class ListVpdRouteEntriesResponseBodyContent extends TeaModel {
        /**
         * <p>Lingjun CIDR block route entry list</p>
         */
        @NameInMap("Data")
        public java.util.List<ListVpdRouteEntriesResponseBodyContentData> data;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Total")
        public Long total;

        public static ListVpdRouteEntriesResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            ListVpdRouteEntriesResponseBodyContent self = new ListVpdRouteEntriesResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public ListVpdRouteEntriesResponseBodyContent setData(java.util.List<ListVpdRouteEntriesResponseBodyContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListVpdRouteEntriesResponseBodyContentData> getData() {
            return this.data;
        }

        public ListVpdRouteEntriesResponseBodyContent setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
