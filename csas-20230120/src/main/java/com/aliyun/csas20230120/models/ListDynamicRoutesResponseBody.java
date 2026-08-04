// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListDynamicRoutesResponseBody extends TeaModel {
    /**
     * <p>The list of dynamic routes.</p>
     */
    @NameInMap("DynamicRoutes")
    public java.util.List<ListDynamicRoutesResponseBodyDynamicRoutes> dynamicRoutes;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>58D6B23E-E5DA-5418-8F61-51A3B5A30049</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of dynamic routes.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
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
        /**
         * <p>The IDs of the private access applications for the dynamic route. This field has a value when the application type is <strong>Application</strong>.</p>
         */
        @NameInMap("ApplicationIds")
        public java.util.List<String> applicationIds;

        /**
         * <p>The application type of the dynamic route. Valid values:</p>
         * <ul>
         * <li><p><strong>All</strong>: All applications.</p>
         * </li>
         * <li><p><strong>Application</strong>: A specific application.</p>
         * </li>
         * <li><p><strong>Tag</strong>: A specific tag.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Application</p>
         */
        @NameInMap("ApplicationType")
        public String applicationType;

        /**
         * <p>The time when the dynamic route was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-21 11:50:03</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the dynamic route.</p>
         * 
         * <strong>example:</strong>
         * <p>这是一条动态路由</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the dynamic route.</p>
         * 
         * <strong>example:</strong>
         * <p>dr-a0ca843f53cf****</p>
         */
        @NameInMap("DynamicRouteId")
        public String dynamicRouteId;

        /**
         * <p>The type of the dynamic route. Valid value: <strong>connector</strong>, which indicates a private leased line.</p>
         * 
         * <strong>example:</strong>
         * <p>connector</p>
         */
        @NameInMap("DynamicRouteType")
        public String dynamicRouteType;

        /**
         * <p>The name of the dynamic route.</p>
         * 
         * <strong>example:</strong>
         * <p>dynamic_route_name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the next hop instance for the dynamic route.</p>
         * 
         * <strong>example:</strong>
         * <p>connector-8ccb13b6f52c****</p>
         */
        @NameInMap("NextHop")
        public String nextHop;

        /**
         * <p>The priority of the dynamic route. A value of 1 indicates the highest priority. The priority is consistent with the order in the list query results.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The list of regions where the SASE POP cluster endpoint is supported.</p>
         */
        @NameInMap("RegionIds")
        public java.util.List<String> regionIds;

        /**
         * <p>The status of the dynamic route. Valid values:</p>
         * <ul>
         * <li><p><strong>Enabled</strong>: The dynamic route is enabled.</p>
         * </li>
         * <li><p><strong>Disabled</strong>: The dynamic route is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The IDs of the private access tags for the dynamic route. This field has a value when the application type is <strong>Tag</strong>.</p>
         */
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
