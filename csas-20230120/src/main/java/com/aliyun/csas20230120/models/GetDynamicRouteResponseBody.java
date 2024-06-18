// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetDynamicRouteResponseBody extends TeaModel {
    @NameInMap("DynamicRoute")
    public GetDynamicRouteResponseBodyDynamicRoute dynamicRoute;

    /**
     * <strong>example:</strong>
     * <p>58D6B23E-E5DA-5418-8F61-51A3B5A30049</p>
     */
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

        /**
         * <strong>example:</strong>
         * <p>Application</p>
         */
        @NameInMap("ApplicationType")
        public String applicationType;

        /**
         * <strong>example:</strong>
         * <p>2023-02-09 10:31:47</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>dr-16ff07c8207d****</p>
         */
        @NameInMap("DynamicRouteId")
        public String dynamicRouteId;

        /**
         * <strong>example:</strong>
         * <p>connector</p>
         */
        @NameInMap("DynamicRouteType")
        public String dynamicRouteType;

        /**
         * <strong>example:</strong>
         * <p>dynamic_route_name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>connector-8ccb13b6f52c****</p>
         */
        @NameInMap("NextHop")
        public String nextHop;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("RegionIds")
        public java.util.List<String> regionIds;

        /**
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
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
