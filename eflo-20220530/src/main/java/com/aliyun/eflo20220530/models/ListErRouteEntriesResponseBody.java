// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class ListErRouteEntriesResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Content")
    public ListErRouteEntriesResponseBodyContent content;

    @NameInMap("Message")
    public String message;

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
        @NameInMap("DestinationCidrBlock")
        public String destinationCidrBlock;

        @NameInMap("ErId")
        public String erId;

        @NameInMap("ErRouteEntryId")
        public String erRouteEntryId;

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
        @NameInMap("Data")
        public java.util.List<ListErRouteEntriesResponseBodyContentData> data;

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
