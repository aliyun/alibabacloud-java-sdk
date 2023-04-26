// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class ListVccRouteEntriesResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Content")
    public ListVccRouteEntriesResponseBodyContent content;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ListVccRouteEntriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVccRouteEntriesResponseBody self = new ListVccRouteEntriesResponseBody();
        return TeaModel.build(map, self);
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
        @NameInMap("DestinationCidrBlock")
        public String destinationCidrBlock;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("NextHopId")
        public String nextHopId;

        @NameInMap("NextHopType")
        public String nextHopType;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ResourceTenantId")
        public String resourceTenantId;

        @NameInMap("RouteType")
        public String routeType;

        @NameInMap("Status")
        public String status;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("VccId")
        public String vccId;

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
        @NameInMap("Data")
        public java.util.List<ListVccRouteEntriesResponseBodyContentData> data;

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
