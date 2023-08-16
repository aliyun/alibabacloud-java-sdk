// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListDynamicRoutesResponseBody extends TeaModel {
    @NameInMap("DynamicRoutes")
    public java.util.List<ListDynamicRoutesResponseBodyDynamicRoutes> dynamicRoutes;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalNum")
    public Integer totalNum;

    public static ListDynamicRoutesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDynamicRoutesResponseBody self = new ListDynamicRoutesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDynamicRoutesResponseBody setDynamicRoutes(java.util.List<ListDynamicRoutesResponseBodyDynamicRoutes> dynamicRoutes) {
        this.dynamicRoutes = dynamicRoutes;
        return this;
    }
    public java.util.List<ListDynamicRoutesResponseBodyDynamicRoutes> getDynamicRoutes() {
        return this.dynamicRoutes;
    }

    public ListDynamicRoutesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDynamicRoutesResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static class ListDynamicRoutesResponseBodyDynamicRoutes extends TeaModel {
        @NameInMap("ApplicationIds")
        public java.util.List<String> applicationIds;

        @NameInMap("ApplicationType")
        public String applicationType;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("DynamicRouteId")
        public String dynamicRouteId;

        @NameInMap("DynamicRouteType")
        public String dynamicRouteType;

        @NameInMap("Name")
        public String name;

        @NameInMap("NextHop")
        public String nextHop;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("RegionIds")
        public java.util.List<String> regionIds;

        @NameInMap("Status")
        public String status;

        @NameInMap("TagIds")
        public java.util.List<String> tagIds;

        public static ListDynamicRoutesResponseBodyDynamicRoutes build(java.util.Map<String, ?> map) throws Exception {
            ListDynamicRoutesResponseBodyDynamicRoutes self = new ListDynamicRoutesResponseBodyDynamicRoutes();
            return TeaModel.build(map, self);
        }

        public ListDynamicRoutesResponseBodyDynamicRoutes setApplicationIds(java.util.List<String> applicationIds) {
            this.applicationIds = applicationIds;
            return this;
        }
        public java.util.List<String> getApplicationIds() {
            return this.applicationIds;
        }

        public ListDynamicRoutesResponseBodyDynamicRoutes setApplicationType(String applicationType) {
            this.applicationType = applicationType;
            return this;
        }
        public String getApplicationType() {
            return this.applicationType;
        }

        public ListDynamicRoutesResponseBodyDynamicRoutes setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListDynamicRoutesResponseBodyDynamicRoutes setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListDynamicRoutesResponseBodyDynamicRoutes setDynamicRouteId(String dynamicRouteId) {
            this.dynamicRouteId = dynamicRouteId;
            return this;
        }
        public String getDynamicRouteId() {
            return this.dynamicRouteId;
        }

        public ListDynamicRoutesResponseBodyDynamicRoutes setDynamicRouteType(String dynamicRouteType) {
            this.dynamicRouteType = dynamicRouteType;
            return this;
        }
        public String getDynamicRouteType() {
            return this.dynamicRouteType;
        }

        public ListDynamicRoutesResponseBodyDynamicRoutes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDynamicRoutesResponseBodyDynamicRoutes setNextHop(String nextHop) {
            this.nextHop = nextHop;
            return this;
        }
        public String getNextHop() {
            return this.nextHop;
        }

        public ListDynamicRoutesResponseBodyDynamicRoutes setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ListDynamicRoutesResponseBodyDynamicRoutes setRegionIds(java.util.List<String> regionIds) {
            this.regionIds = regionIds;
            return this;
        }
        public java.util.List<String> getRegionIds() {
            return this.regionIds;
        }

        public ListDynamicRoutesResponseBodyDynamicRoutes setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListDynamicRoutesResponseBodyDynamicRoutes setTagIds(java.util.List<String> tagIds) {
            this.tagIds = tagIds;
            return this;
        }
        public java.util.List<String> getTagIds() {
            return this.tagIds;
        }

    }

}
