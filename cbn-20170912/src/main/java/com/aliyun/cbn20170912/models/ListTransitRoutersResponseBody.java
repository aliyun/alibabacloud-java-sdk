// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRoutersResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("TransitRouters")
    public java.util.List<ListTransitRoutersResponseBodyTransitRouters> transitRouters;

    public static ListTransitRoutersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTransitRoutersResponseBody self = new ListTransitRoutersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTransitRoutersResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTransitRoutersResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTransitRoutersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTransitRoutersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListTransitRoutersResponseBody setTransitRouters(java.util.List<ListTransitRoutersResponseBodyTransitRouters> transitRouters) {
        this.transitRouters = transitRouters;
        return this;
    }
    public java.util.List<ListTransitRoutersResponseBodyTransitRouters> getTransitRouters() {
        return this.transitRouters;
    }

    public static class ListTransitRoutersResponseBodyTransitRouters extends TeaModel {
        @NameInMap("AliUid")
        public Long aliUid;

        @NameInMap("CenId")
        public String cenId;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Status")
        public String status;

        @NameInMap("SupportMulticast")
        public Boolean supportMulticast;

        @NameInMap("TransitRouterDescription")
        public String transitRouterDescription;

        @NameInMap("TransitRouterId")
        public String transitRouterId;

        @NameInMap("TransitRouterName")
        public String transitRouterName;

        @NameInMap("Type")
        public String type;

        public static ListTransitRoutersResponseBodyTransitRouters build(java.util.Map<String, ?> map) throws Exception {
            ListTransitRoutersResponseBodyTransitRouters self = new ListTransitRoutersResponseBodyTransitRouters();
            return TeaModel.build(map, self);
        }

        public ListTransitRoutersResponseBodyTransitRouters setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public ListTransitRoutersResponseBodyTransitRouters setCenId(String cenId) {
            this.cenId = cenId;
            return this;
        }
        public String getCenId() {
            return this.cenId;
        }

        public ListTransitRoutersResponseBodyTransitRouters setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListTransitRoutersResponseBodyTransitRouters setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListTransitRoutersResponseBodyTransitRouters setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListTransitRoutersResponseBodyTransitRouters setSupportMulticast(Boolean supportMulticast) {
            this.supportMulticast = supportMulticast;
            return this;
        }
        public Boolean getSupportMulticast() {
            return this.supportMulticast;
        }

        public ListTransitRoutersResponseBodyTransitRouters setTransitRouterDescription(String transitRouterDescription) {
            this.transitRouterDescription = transitRouterDescription;
            return this;
        }
        public String getTransitRouterDescription() {
            return this.transitRouterDescription;
        }

        public ListTransitRoutersResponseBodyTransitRouters setTransitRouterId(String transitRouterId) {
            this.transitRouterId = transitRouterId;
            return this;
        }
        public String getTransitRouterId() {
            return this.transitRouterId;
        }

        public ListTransitRoutersResponseBodyTransitRouters setTransitRouterName(String transitRouterName) {
            this.transitRouterName = transitRouterName;
            return this;
        }
        public String getTransitRouterName() {
            return this.transitRouterName;
        }

        public ListTransitRoutersResponseBodyTransitRouters setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
