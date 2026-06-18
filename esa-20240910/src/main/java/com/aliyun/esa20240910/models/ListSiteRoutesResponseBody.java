// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListSiteRoutesResponseBody extends TeaModel {
    /**
     * <p>The list of returned configs.</p>
     */
    @NameInMap("Configs")
    public java.util.List<ListSiteRoutesResponseBodyConfigs> configs;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
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
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalPage")
    public Integer totalPage;

    public static ListSiteRoutesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSiteRoutesResponseBody self = new ListSiteRoutesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSiteRoutesResponseBody setConfigs(java.util.List<ListSiteRoutesResponseBodyConfigs> configs) {
        this.configs = configs;
        return this;
    }
    public java.util.List<ListSiteRoutesResponseBodyConfigs> getConfigs() {
        return this.configs;
    }

    public ListSiteRoutesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListSiteRoutesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSiteRoutesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSiteRoutesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListSiteRoutesResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class ListSiteRoutesResponseBodyConfigs extends TeaModel {
        /**
         * <p>Whether bypass mode is enabled. Valid values:</p>
         * <ul>
         * <li><p>on: Enabled.</p>
         * </li>
         * <li><p>off: Disabled.</p>
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
         * <p>The configuration type. Valid values:</p>
         * <ul>
         * <li><p>global: Global configuration.</p>
         * </li>
         * <li><p>rule: Rule-based configuration.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>global</p>
         */
        @NameInMap("ConfigType")
        public String configType;

        /**
         * <p>Whether CDN fallback is enabled. Valid values:</p>
         * <ul>
         * <li><p>on: Enabled.</p>
         * </li>
         * <li><p>off: Disabled.</p>
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
         * <li><p>simple: Simple mode.</p>
         * </li>
         * <li><p>custom: Custom mode.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>simple</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>Whether the route is enabled. Valid values:</p>
         * <ul>
         * <li><p>on: Enabled.</p>
         * </li>
         * <li><p>off: Disabled.</p>
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
         * <p>The routine name.</p>
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
         * <p>The rule execution sequence.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sequence")
        public Integer sequence;

        /**
         * <p>The site version.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SiteVersion")
        public Integer siteVersion;

        /**
         * <p>The ER timeout.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Timeout")
        public String timeout;

        public static ListSiteRoutesResponseBodyConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListSiteRoutesResponseBodyConfigs self = new ListSiteRoutesResponseBodyConfigs();
            return TeaModel.build(map, self);
        }

        public ListSiteRoutesResponseBodyConfigs setBypass(String bypass) {
            this.bypass = bypass;
            return this;
        }
        public String getBypass() {
            return this.bypass;
        }

        public ListSiteRoutesResponseBodyConfigs setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public ListSiteRoutesResponseBodyConfigs setConfigType(String configType) {
            this.configType = configType;
            return this;
        }
        public String getConfigType() {
            return this.configType;
        }

        public ListSiteRoutesResponseBodyConfigs setFallback(String fallback) {
            this.fallback = fallback;
            return this;
        }
        public String getFallback() {
            return this.fallback;
        }

        public ListSiteRoutesResponseBodyConfigs setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public ListSiteRoutesResponseBodyConfigs setRouteEnable(String routeEnable) {
            this.routeEnable = routeEnable;
            return this;
        }
        public String getRouteEnable() {
            return this.routeEnable;
        }

        public ListSiteRoutesResponseBodyConfigs setRouteName(String routeName) {
            this.routeName = routeName;
            return this;
        }
        public String getRouteName() {
            return this.routeName;
        }

        public ListSiteRoutesResponseBodyConfigs setRoutineName(String routineName) {
            this.routineName = routineName;
            return this;
        }
        public String getRoutineName() {
            return this.routineName;
        }

        public ListSiteRoutesResponseBodyConfigs setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public ListSiteRoutesResponseBodyConfigs setSequence(Integer sequence) {
            this.sequence = sequence;
            return this;
        }
        public Integer getSequence() {
            return this.sequence;
        }

        public ListSiteRoutesResponseBodyConfigs setSiteVersion(Integer siteVersion) {
            this.siteVersion = siteVersion;
            return this;
        }
        public Integer getSiteVersion() {
            return this.siteVersion;
        }

        public ListSiteRoutesResponseBodyConfigs setTimeout(String timeout) {
            this.timeout = timeout;
            return this;
        }
        public String getTimeout() {
            return this.timeout;
        }

    }

}
