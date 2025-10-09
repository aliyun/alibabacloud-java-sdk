// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListSiteRoutesResponseBody extends TeaModel {
    /**
     * <p>The returned configurations.</p>
     */
    @NameInMap("Configs")
    public java.util.List<ListSiteRoutesResponseBodyConfigs> configs;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
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
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The total number of pages returned.</p>
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
         * <p>The bypass mode. Valid values:</p>
         * <ul>
         * <li>on</li>
         * <li>off</li>
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
         * <p>The configuration type to query. Valid values:</p>
         * <ul>
         * <li>global: global configurations.</li>
         * <li>rule: queries rule configurations.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>global</p>
         */
        @NameInMap("ConfigType")
        public String configType;

        @NameInMap("Fallback")
        public String fallback;

        /**
         * <p>The configuration mode. Specifies whether to check the image used by the instance supports hot migration. Valid values:</p>
         * <ul>
         * <li>simple: Simple Mode</li>
         * <li>custom: Custom Mode</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>simple</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>The route switch. Valid values:</p>
         * <ul>
         * <li>on</li>
         * <li>off</li>
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
         * <p>The function name.</p>
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
         * <p>The order in which the rule is executed.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sequence")
        public Integer sequence;

        /**
         * <p>The version number of the website.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SiteVersion")
        public Integer siteVersion;

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

    }

}
