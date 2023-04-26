// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class ListVpdRouteEntriesResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Content")
    public ListVpdRouteEntriesResponseBodyContent content;

    @NameInMap("Message")
    public String message;

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

        @NameInMap("VpdId")
        public String vpdId;

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
        @NameInMap("Data")
        public java.util.List<ListVpdRouteEntriesResponseBodyContentData> data;

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
