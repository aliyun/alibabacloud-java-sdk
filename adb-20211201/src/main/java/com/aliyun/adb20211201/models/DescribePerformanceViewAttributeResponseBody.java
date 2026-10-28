// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribePerformanceViewAttributeResponseBody extends TeaModel {
    /**
     * <p>The details of the access denial. This field is returned only when RAM authentication fails.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;PolicyType&quot;: &quot;AccountLevelIdentityBasedPolicy&quot;,
     *     &quot;AuthPrincipalOwnerId&quot;: &quot;1**<em><strong><strong><strong><strong><strong><strong><strong>7&quot;,
     *     &quot;EncodedDiagnosticMessage&quot;: &quot;AQIBIAAAAOPdwKY2QLOvgMEc7SkkoJfj1kvZwsaRqNYMh10Tv0wTe0fCzaCdrvgazfNb0EnJKETgXyhR+3BIQjx9WAqZryejBsp1Bl4qI5En/D9dEhcXAtKCxCmE2kZCiEzpy8BoEUt+bs0DmlaGWO5xkEpttypLIB4rUhDvZd+zwPg4EXk4KSSWSWsurxtqDkKEMshKlQFBTKvJcKwyhk62IeYly4hQ+5IpXjkh1GQXuDRCQ==&quot;,
     *     &quot;AuthPrincipalType&quot;: &quot;SubUser&quot;,
     *     &quot;AuthPrincipalDisplayName&quot;: &quot;2</strong></strong></strong></strong></strong></strong></strong></em>9&quot;,
     *     &quot;NoPermissionType&quot;: &quot;ImplicitDeny&quot;,
     *     &quot;AuthAction&quot;: &quot;adb:DescribeExcessivePrimaryKeys&quot;
     * }</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The type of the source for the original chart. Valid values:</p>
     * <ul>
     * <li><strong>Basic</strong>: basic view</li>
     * <li><strong>Advanced</strong>: advanced view</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Basic</p>
     */
    @NameInMap("CreateFromViewType")
    public String createFromViewType;

    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp198m028ih55xxxx</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>Indicates whether the keys completed in the original monitoring view are populated when you view the monitoring view. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("FillOriginViewKeys")
    public Boolean fillOriginViewKeys;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E031AABF-BD56-5966-A063-4283EF18DB45</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details of the monitoring view.</p>
     */
    @NameInMap("ViewDetail")
    public DescribePerformanceViewAttributeResponseBodyViewDetail viewDetail;

    /**
     * <p>The name of the monitoring view.</p>
     * 
     * <strong>example:</strong>
     * <p>Custom-All metrics-2 columns-Linked</p>
     */
    @NameInMap("ViewName")
    public String viewName;

    public static DescribePerformanceViewAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePerformanceViewAttributeResponseBody self = new DescribePerformanceViewAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePerformanceViewAttributeResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DescribePerformanceViewAttributeResponseBody setCreateFromViewType(String createFromViewType) {
        this.createFromViewType = createFromViewType;
        return this;
    }
    public String getCreateFromViewType() {
        return this.createFromViewType;
    }

    public DescribePerformanceViewAttributeResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribePerformanceViewAttributeResponseBody setFillOriginViewKeys(Boolean fillOriginViewKeys) {
        this.fillOriginViewKeys = fillOriginViewKeys;
        return this;
    }
    public Boolean getFillOriginViewKeys() {
        return this.fillOriginViewKeys;
    }

    public DescribePerformanceViewAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePerformanceViewAttributeResponseBody setViewDetail(DescribePerformanceViewAttributeResponseBodyViewDetail viewDetail) {
        this.viewDetail = viewDetail;
        return this;
    }
    public DescribePerformanceViewAttributeResponseBodyViewDetail getViewDetail() {
        return this.viewDetail;
    }

    public DescribePerformanceViewAttributeResponseBody setViewName(String viewName) {
        this.viewName = viewName;
        return this;
    }
    public String getViewName() {
        return this.viewName;
    }

    public static class DescribePerformanceViewAttributeResponseBodyViewDetailCategoriesKeys extends TeaModel {
        @NameInMap("EnableAutoMc")
        public Boolean enableAutoMc;

        /**
         * <p>The list of applicable cluster engines.</p>
         */
        @NameInMap("Engine")
        public java.util.List<String> engine;

        /**
         * <p>The list of applicable resource group types.</p>
         */
        @NameInMap("GroupType")
        public java.util.List<String> groupType;

        /**
         * <p>The key of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>AnalyticDB_CPU</p>
         */
        @NameInMap("KeyName")
        public String keyName;

        /**
         * <p>Indicates whether the metric is selected. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Selected")
        public Boolean selected;

        public static DescribePerformanceViewAttributeResponseBodyViewDetailCategoriesKeys build(java.util.Map<String, ?> map) throws Exception {
            DescribePerformanceViewAttributeResponseBodyViewDetailCategoriesKeys self = new DescribePerformanceViewAttributeResponseBodyViewDetailCategoriesKeys();
            return TeaModel.build(map, self);
        }

        public DescribePerformanceViewAttributeResponseBodyViewDetailCategoriesKeys setEnableAutoMc(Boolean enableAutoMc) {
            this.enableAutoMc = enableAutoMc;
            return this;
        }
        public Boolean getEnableAutoMc() {
            return this.enableAutoMc;
        }

        public DescribePerformanceViewAttributeResponseBodyViewDetailCategoriesKeys setEngine(java.util.List<String> engine) {
            this.engine = engine;
            return this;
        }
        public java.util.List<String> getEngine() {
            return this.engine;
        }

        public DescribePerformanceViewAttributeResponseBodyViewDetailCategoriesKeys setGroupType(java.util.List<String> groupType) {
            this.groupType = groupType;
            return this;
        }
        public java.util.List<String> getGroupType() {
            return this.groupType;
        }

        public DescribePerformanceViewAttributeResponseBodyViewDetailCategoriesKeys setKeyName(String keyName) {
            this.keyName = keyName;
            return this;
        }
        public String getKeyName() {
            return this.keyName;
        }

        public DescribePerformanceViewAttributeResponseBodyViewDetailCategoriesKeys setSelected(Boolean selected) {
            this.selected = selected;
            return this;
        }
        public Boolean getSelected() {
            return this.selected;
        }

    }

    public static class DescribePerformanceViewAttributeResponseBodyViewDetailCategories extends TeaModel {
        /**
         * <p>The name of the metric category. Valid values:</p>
         * <ul>
         * <li><strong>Node</strong>: node resource metrics</li>
         * <li><strong>DiskData</strong>: disk metrics</li>
         * <li><strong>WorkLoad</strong>: workload metrics</li>
         * <li><strong>ResourceGroup</strong>: resource group metrics</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Node</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The list of metrics.</p>
         */
        @NameInMap("Keys")
        public java.util.List<DescribePerformanceViewAttributeResponseBodyViewDetailCategoriesKeys> keys;

        public static DescribePerformanceViewAttributeResponseBodyViewDetailCategories build(java.util.Map<String, ?> map) throws Exception {
            DescribePerformanceViewAttributeResponseBodyViewDetailCategories self = new DescribePerformanceViewAttributeResponseBodyViewDetailCategories();
            return TeaModel.build(map, self);
        }

        public DescribePerformanceViewAttributeResponseBodyViewDetailCategories setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribePerformanceViewAttributeResponseBodyViewDetailCategories setKeys(java.util.List<DescribePerformanceViewAttributeResponseBodyViewDetailCategoriesKeys> keys) {
            this.keys = keys;
            return this;
        }
        public java.util.List<DescribePerformanceViewAttributeResponseBodyViewDetailCategoriesKeys> getKeys() {
            return this.keys;
        }

    }

    public static class DescribePerformanceViewAttributeResponseBodyViewDetail extends TeaModel {
        /**
         * <p>The list of metric categories.</p>
         */
        @NameInMap("Categories")
        public java.util.List<DescribePerformanceViewAttributeResponseBodyViewDetailCategories> categories;

        /**
         * <p>Indicates whether it is a linkage chart. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ChartLinked")
        public Boolean chartLinked;

        /**
         * <p>The number of charts displayed in each row.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ChartsPerLine")
        public Integer chartsPerLine;

        public static DescribePerformanceViewAttributeResponseBodyViewDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribePerformanceViewAttributeResponseBodyViewDetail self = new DescribePerformanceViewAttributeResponseBodyViewDetail();
            return TeaModel.build(map, self);
        }

        public DescribePerformanceViewAttributeResponseBodyViewDetail setCategories(java.util.List<DescribePerformanceViewAttributeResponseBodyViewDetailCategories> categories) {
            this.categories = categories;
            return this;
        }
        public java.util.List<DescribePerformanceViewAttributeResponseBodyViewDetailCategories> getCategories() {
            return this.categories;
        }

        public DescribePerformanceViewAttributeResponseBodyViewDetail setChartLinked(Boolean chartLinked) {
            this.chartLinked = chartLinked;
            return this;
        }
        public Boolean getChartLinked() {
            return this.chartLinked;
        }

        public DescribePerformanceViewAttributeResponseBodyViewDetail setChartsPerLine(Integer chartsPerLine) {
            this.chartsPerLine = chartsPerLine;
            return this;
        }
        public Integer getChartsPerLine() {
            return this.chartsPerLine;
        }

    }

}
