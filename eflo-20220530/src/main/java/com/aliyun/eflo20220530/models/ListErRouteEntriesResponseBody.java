// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class ListErRouteEntriesResponseBody extends TeaModel {
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
    public ListErRouteEntriesResponseBodyContent content;

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
     * <p>A88DFED5-24B7-5A3E-87DE-380BF06F3C90</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListErRouteEntriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListErRouteEntriesResponseBody self = new ListErRouteEntriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListErRouteEntriesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListErRouteEntriesResponseBody setContent(ListErRouteEntriesResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public ListErRouteEntriesResponseBodyContent getContent() {
        return this.content;
    }

    public ListErRouteEntriesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListErRouteEntriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListErRouteEntriesResponseBodyContentData extends TeaModel {
        /**
         * <p>Destination CIDR Block</p>
         * 
         * <strong>example:</strong>
         * <p>100.64.1.100/32</p>
         */
        @NameInMap("DestinationCidrBlock")
        public String destinationCidrBlock;

        /**
         * <p>Lingjun HUB Instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>er-kkopgtne</p>
         */
        @NameInMap("ErId")
        public String erId;

        /**
         * <p>The ID of the route entry.</p>
         * 
         * <strong>example:</strong>
         * <p>er-rte-maysfadg</p>
         */
        @NameInMap("ErRouteEntryId")
        public String erRouteEntryId;

        /**
         * <p>The time when the cluster was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1640930901000</p>
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
         * <p>cn-wulanchabu</p>
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
         * <p>The ID of the tenant to which the resource belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1111156667137893</p>
         */
        @NameInMap("ResourceTenantId")
        public String resourceTenantId;

        /**
         * <p>Route type</p>
         * 
         * <strong>example:</strong>
         * <p>VCC</p>
         */
        @NameInMap("RouteType")
        public String routeType;

        /**
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li>Synchronizing</li>
         * <li>Available</li>
         * </ul>
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
         * <p>1111156667137893</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        public static ListErRouteEntriesResponseBodyContentData build(java.util.Map<String, ?> map) throws Exception {
            ListErRouteEntriesResponseBodyContentData self = new ListErRouteEntriesResponseBodyContentData();
            return TeaModel.build(map, self);
        }

        public ListErRouteEntriesResponseBodyContentData setDestinationCidrBlock(String destinationCidrBlock) {
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }
        public String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        public ListErRouteEntriesResponseBodyContentData setErId(String erId) {
            this.erId = erId;
            return this;
        }
        public String getErId() {
            return this.erId;
        }

        public ListErRouteEntriesResponseBodyContentData setErRouteEntryId(String erRouteEntryId) {
            this.erRouteEntryId = erRouteEntryId;
            return this;
        }
        public String getErRouteEntryId() {
            return this.erRouteEntryId;
        }

        public ListErRouteEntriesResponseBodyContentData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListErRouteEntriesResponseBodyContentData setNextHopId(String nextHopId) {
            this.nextHopId = nextHopId;
            return this;
        }
        public String getNextHopId() {
            return this.nextHopId;
        }

        public ListErRouteEntriesResponseBodyContentData setNextHopType(String nextHopType) {
            this.nextHopType = nextHopType;
            return this;
        }
        public String getNextHopType() {
            return this.nextHopType;
        }

        public ListErRouteEntriesResponseBodyContentData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListErRouteEntriesResponseBodyContentData setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListErRouteEntriesResponseBodyContentData setResourceTenantId(String resourceTenantId) {
            this.resourceTenantId = resourceTenantId;
            return this;
        }
        public String getResourceTenantId() {
            return this.resourceTenantId;
        }

        public ListErRouteEntriesResponseBodyContentData setRouteType(String routeType) {
            this.routeType = routeType;
            return this;
        }
        public String getRouteType() {
            return this.routeType;
        }

        public ListErRouteEntriesResponseBodyContentData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListErRouteEntriesResponseBodyContentData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

    public static class ListErRouteEntriesResponseBodyContent extends TeaModel {
        /**
         * <p>Lingjun HUB Route Entry Information List</p>
         */
        @NameInMap("Data")
        public java.util.List<ListErRouteEntriesResponseBodyContentData> data;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Total")
        public Long total;

        public static ListErRouteEntriesResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            ListErRouteEntriesResponseBodyContent self = new ListErRouteEntriesResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public ListErRouteEntriesResponseBodyContent setData(java.util.List<ListErRouteEntriesResponseBodyContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListErRouteEntriesResponseBodyContentData> getData() {
            return this.data;
        }

        public ListErRouteEntriesResponseBodyContent setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
