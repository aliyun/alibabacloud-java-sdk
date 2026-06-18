// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListRoutineRoutesResponseBody extends TeaModel {
    /**
     * <p>The list of configurations.</p>
     */
    @NameInMap("Configs")
    public java.util.List<ListRoutineRoutesResponseBodyConfigs> configs;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries that match the query criteria.</p>
     * 
     * <strong>example:</strong>
     * <p>83</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The total number of pages returned.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalPage")
    public Integer totalPage;

    public static ListRoutineRoutesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRoutineRoutesResponseBody self = new ListRoutineRoutesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRoutineRoutesResponseBody setConfigs(java.util.List<ListRoutineRoutesResponseBodyConfigs> configs) {
        this.configs = configs;
        return this;
    }
    public java.util.List<ListRoutineRoutesResponseBodyConfigs> getConfigs() {
        return this.configs;
    }

    public ListRoutineRoutesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListRoutineRoutesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRoutineRoutesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRoutineRoutesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListRoutineRoutesResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class ListRoutineRoutesResponseBodyConfigs extends TeaModel {
        /**
         * <p>The bypass mode. Valid values:</p>
         * <ul>
         * <li><p><code>on</code>: Enabled.</p>
         * </li>
         * <li><p><code>off</code>: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Bypass")
        public String bypass;

        /**
         * <p>The configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>35281609698****</p>
         */
        @NameInMap("ConfigId")
        public Long configId;

        /**
         * <p>The type of configuration. You can query global configurations or rule-based configurations based on this parameter. Valid values:</p>
         * <ul>
         * <li><p><code>global</code>: A global configuration.</p>
         * </li>
         * <li><p><code>rule</code>: A rule-based configuration.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>global</p>
         */
        @NameInMap("ConfigType")
        public String configType;

        /**
         * <p>Indicates whether to enable fallback to origin. If this feature is enabled, the request is routed to the origin server when an exception occurs in the edge function, such as exceeding the CPU usage limit. Valid values:</p>
         * <ul>
         * <li><p><code>on</code>: Enabled.</p>
         * </li>
         * <li><p><code>off</code>: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Fallback")
        public String fallback;

        /**
         * <p>The configuration mode. Valid values:</p>
         * <ul>
         * <li><p><code>simple</code>: Simple mode.</p>
         * </li>
         * <li><p><code>custom</code>: Custom mode.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>simple</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>Indicates whether the route is enabled. Valid values:</p>
         * <ul>
         * <li><p><code>on</code>: Enabled.</p>
         * </li>
         * <li><p><code>off</code>: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("RouteEnable")
        public String routeEnable;

        /**
         * <p>The route name.</p>
         * 
         * <strong>example:</strong>
         * <p>test_route</p>
         */
        @NameInMap("RouteName")
        public String routeName;

        /**
         * <p>The edge function routine name.</p>
         * 
         * <strong>example:</strong>
         * <p>test-routine1</p>
         */
        @NameInMap("RoutineName")
        public String routineName;

        /**
         * <p>The rule content.</p>
         * 
         * <strong>example:</strong>
         * <p>(http.host eq \&quot;video.example.com\&quot;)</p>
         */
        @NameInMap("Rule")
        public String rule;

        /**
         * <p>The rule execution order.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sequence")
        public Integer sequence;

        /**
         * <p>The site ID.</p>
         * 
         * <strong>example:</strong>
         * <p>554889455535696</p>
         */
        @NameInMap("SiteId")
        public Long siteId;

        /**
         * <p>The site name.</p>
         * 
         * <strong>example:</strong>
         * <p>test.com</p>
         */
        @NameInMap("SiteName")
        public String siteName;

        /**
         * <p>The site configuration version.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SiteVersion")
        public Integer siteVersion;

        /**
         * <p>The timeout period. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Timeout")
        public String timeout;

        public static ListRoutineRoutesResponseBodyConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListRoutineRoutesResponseBodyConfigs self = new ListRoutineRoutesResponseBodyConfigs();
            return TeaModel.build(map, self);
        }

        public ListRoutineRoutesResponseBodyConfigs setBypass(String bypass) {
            this.bypass = bypass;
            return this;
        }
        public String getBypass() {
            return this.bypass;
        }

        public ListRoutineRoutesResponseBodyConfigs setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public ListRoutineRoutesResponseBodyConfigs setConfigType(String configType) {
            this.configType = configType;
            return this;
        }
        public String getConfigType() {
            return this.configType;
        }

        public ListRoutineRoutesResponseBodyConfigs setFallback(String fallback) {
            this.fallback = fallback;
            return this;
        }
        public String getFallback() {
            return this.fallback;
        }

        public ListRoutineRoutesResponseBodyConfigs setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public ListRoutineRoutesResponseBodyConfigs setRouteEnable(String routeEnable) {
            this.routeEnable = routeEnable;
            return this;
        }
        public String getRouteEnable() {
            return this.routeEnable;
        }

        public ListRoutineRoutesResponseBodyConfigs setRouteName(String routeName) {
            this.routeName = routeName;
            return this;
        }
        public String getRouteName() {
            return this.routeName;
        }

        public ListRoutineRoutesResponseBodyConfigs setRoutineName(String routineName) {
            this.routineName = routineName;
            return this;
        }
        public String getRoutineName() {
            return this.routineName;
        }

        public ListRoutineRoutesResponseBodyConfigs setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public ListRoutineRoutesResponseBodyConfigs setSequence(Integer sequence) {
            this.sequence = sequence;
            return this;
        }
        public Integer getSequence() {
            return this.sequence;
        }

        public ListRoutineRoutesResponseBodyConfigs setSiteId(Long siteId) {
            this.siteId = siteId;
            return this;
        }
        public Long getSiteId() {
            return this.siteId;
        }

        public ListRoutineRoutesResponseBodyConfigs setSiteName(String siteName) {
            this.siteName = siteName;
            return this;
        }
        public String getSiteName() {
            return this.siteName;
        }

        public ListRoutineRoutesResponseBodyConfigs setSiteVersion(Integer siteVersion) {
            this.siteVersion = siteVersion;
            return this;
        }
        public Integer getSiteVersion() {
            return this.siteVersion;
        }

        public ListRoutineRoutesResponseBodyConfigs setTimeout(String timeout) {
            this.timeout = timeout;
            return this;
        }
        public String getTimeout() {
            return this.timeout;
        }

    }

}
