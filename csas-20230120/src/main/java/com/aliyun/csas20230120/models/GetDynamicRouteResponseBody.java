// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetDynamicRouteResponseBody extends TeaModel {
    @NameInMap("DynamicRoute")
    public GetDynamicRouteResponseBodyDynamicRoute dynamicRoute;

    @NameInMap("RequestId")
    public String requestId;

    public static GetDynamicRouteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDynamicRouteResponseBody self = new GetDynamicRouteResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDynamicRouteResponseBody setDynamicRoute(GetDynamicRouteResponseBodyDynamicRoute dynamicRoute) {
        this.dynamicRoute = dynamicRoute;
        return this;
    }
    public GetDynamicRouteResponseBodyDynamicRoute getDynamicRoute() {
        return this.dynamicRoute;
    }

    public GetDynamicRouteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDynamicRouteResponseBodyDynamicRoute extends TeaModel {
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

        public static GetDynamicRouteResponseBodyDynamicRoute build(java.util.Map<String, ?> map) throws Exception {
            GetDynamicRouteResponseBodyDynamicRoute self = new GetDynamicRouteResponseBodyDynamicRoute();
            return TeaModel.build(map, self);
        }

        public GetDynamicRouteResponseBodyDynamicRoute setApplicationIds(java.util.List<String> applicationIds) {
            this.applicationIds = applicationIds;
            return this;
        }
        public java.util.List<String> getApplicationIds() {
            return this.applicationIds;
        }

        public GetDynamicRouteResponseBodyDynamicRoute setApplicationType(String applicationType) {
            this.applicationType = applicationType;
            return this;
        }
        public String getApplicationType() {
            return this.applicationType;
        }

        public GetDynamicRouteResponseBodyDynamicRoute setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetDynamicRouteResponseBodyDynamicRoute setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetDynamicRouteResponseBodyDynamicRoute setDynamicRouteId(String dynamicRouteId) {
            this.dynamicRouteId = dynamicRouteId;
            return this;
        }
        public String getDynamicRouteId() {
            return this.dynamicRouteId;
        }

        public GetDynamicRouteResponseBodyDynamicRoute setDynamicRouteType(String dynamicRouteType) {
            this.dynamicRouteType = dynamicRouteType;
            return this;
        }
        public String getDynamicRouteType() {
            return this.dynamicRouteType;
        }

        public GetDynamicRouteResponseBodyDynamicRoute setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDynamicRouteResponseBodyDynamicRoute setNextHop(String nextHop) {
            this.nextHop = nextHop;
            return this;
        }
        public String getNextHop() {
            return this.nextHop;
        }

        public GetDynamicRouteResponseBodyDynamicRoute setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public GetDynamicRouteResponseBodyDynamicRoute setRegionIds(java.util.List<String> regionIds) {
            this.regionIds = regionIds;
            return this;
        }
        public java.util.List<String> getRegionIds() {
            return this.regionIds;
        }

        public GetDynamicRouteResponseBodyDynamicRoute setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetDynamicRouteResponseBodyDynamicRoute setTagIds(java.util.List<String> tagIds) {
            this.tagIds = tagIds;
            return this;
        }
        public java.util.List<String> getTagIds() {
            return this.tagIds;
        }

    }

}
