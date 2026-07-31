// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CreatePerformanceViewRequest extends TeaModel {
    /**
     * <p>The type of the original monitoring dashboard from which the current monitoring dashboard is copied. Valid values:</p>
     * <ul>
     * <li><strong>Basic</strong>: basic dashboard.</li>
     * <li><strong>Advanced</strong>: advanced dashboard.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Basic</p>
     */
    @NameInMap("CreateFromViewType")
    public String createFromViewType;

    /**
     * <p>&lt;props=&quot;china&quot;&gt;The ID of the Enterprise Edition, Basic Edition, or Data Lakehouse Edition cluster.
     * &lt;props=&quot;intl&quot;&gt;The ID of the Data Lakehouse Edition cluster.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/612397.html">DescribeDBClusters</a> operation to query the cluster ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp1ub9grke1****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>Specifies whether to populate the keys from the original monitoring dashboard when viewing the monitoring dashboard. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("FillOriginViewKeys")
    public Boolean fillOriginViewKeys;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/143074.html">DescribeRegions</a> operation to query the supported regions and zones, including region IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The details of the monitoring dashboard.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ViewDetail")
    public CreatePerformanceViewRequestViewDetail viewDetail;

    /**
     * <p>The name of the monitoring dashboard.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Custom-All metrics-2 columns-Linked</p>
     */
    @NameInMap("ViewName")
    public String viewName;

    public static CreatePerformanceViewRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePerformanceViewRequest self = new CreatePerformanceViewRequest();
        return TeaModel.build(map, self);
    }

    public CreatePerformanceViewRequest setCreateFromViewType(String createFromViewType) {
        this.createFromViewType = createFromViewType;
        return this;
    }
    public String getCreateFromViewType() {
        return this.createFromViewType;
    }

    public CreatePerformanceViewRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreatePerformanceViewRequest setFillOriginViewKeys(Boolean fillOriginViewKeys) {
        this.fillOriginViewKeys = fillOriginViewKeys;
        return this;
    }
    public Boolean getFillOriginViewKeys() {
        return this.fillOriginViewKeys;
    }

    public CreatePerformanceViewRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreatePerformanceViewRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreatePerformanceViewRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreatePerformanceViewRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreatePerformanceViewRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreatePerformanceViewRequest setViewDetail(CreatePerformanceViewRequestViewDetail viewDetail) {
        this.viewDetail = viewDetail;
        return this;
    }
    public CreatePerformanceViewRequestViewDetail getViewDetail() {
        return this.viewDetail;
    }

    public CreatePerformanceViewRequest setViewName(String viewName) {
        this.viewName = viewName;
        return this;
    }
    public String getViewName() {
        return this.viewName;
    }

    public static class CreatePerformanceViewRequestViewDetailCategoriesKeys extends TeaModel {
        /**
         * <p>The key of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>AnalyticDB_CPU</p>
         */
        @NameInMap("KeyName")
        public String keyName;

        /**
         * <p>Specifies whether the metric is selected. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Selected")
        public Boolean selected;

        public static CreatePerformanceViewRequestViewDetailCategoriesKeys build(java.util.Map<String, ?> map) throws Exception {
            CreatePerformanceViewRequestViewDetailCategoriesKeys self = new CreatePerformanceViewRequestViewDetailCategoriesKeys();
            return TeaModel.build(map, self);
        }

        public CreatePerformanceViewRequestViewDetailCategoriesKeys setKeyName(String keyName) {
            this.keyName = keyName;
            return this;
        }
        public String getKeyName() {
            return this.keyName;
        }

        public CreatePerformanceViewRequestViewDetailCategoriesKeys setSelected(Boolean selected) {
            this.selected = selected;
            return this;
        }
        public Boolean getSelected() {
            return this.selected;
        }

    }

    public static class CreatePerformanceViewRequestViewDetailCategories extends TeaModel {
        /**
         * <p>The name of the metric category. Valid values:</p>
         * <ul>
         * <li><strong>Node</strong>: node resource metrics.</li>
         * <li><strong>DiskData</strong>: disk metrics.</li>
         * <li><strong>WorkLoad</strong>: workload metrics.</li>
         * <li><strong>ResourceGroup</strong>: resource group metrics.</li>
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
        public java.util.List<CreatePerformanceViewRequestViewDetailCategoriesKeys> keys;

        public static CreatePerformanceViewRequestViewDetailCategories build(java.util.Map<String, ?> map) throws Exception {
            CreatePerformanceViewRequestViewDetailCategories self = new CreatePerformanceViewRequestViewDetailCategories();
            return TeaModel.build(map, self);
        }

        public CreatePerformanceViewRequestViewDetailCategories setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public CreatePerformanceViewRequestViewDetailCategories setKeys(java.util.List<CreatePerformanceViewRequestViewDetailCategoriesKeys> keys) {
            this.keys = keys;
            return this;
        }
        public java.util.List<CreatePerformanceViewRequestViewDetailCategoriesKeys> getKeys() {
            return this.keys;
        }

    }

    public static class CreatePerformanceViewRequestViewDetail extends TeaModel {
        /**
         * <p>The list of metric categories.</p>
         */
        @NameInMap("Categories")
        public java.util.List<CreatePerformanceViewRequestViewDetailCategories> categories;

        /**
         * <p>Indicates whether the linkage chart is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ChartLinked")
        public Boolean chartLinked;

        /**
         * <p>The number of charts displayed per row.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ChartsPerLine")
        public Integer chartsPerLine;

        public static CreatePerformanceViewRequestViewDetail build(java.util.Map<String, ?> map) throws Exception {
            CreatePerformanceViewRequestViewDetail self = new CreatePerformanceViewRequestViewDetail();
            return TeaModel.build(map, self);
        }

        public CreatePerformanceViewRequestViewDetail setCategories(java.util.List<CreatePerformanceViewRequestViewDetailCategories> categories) {
            this.categories = categories;
            return this;
        }
        public java.util.List<CreatePerformanceViewRequestViewDetailCategories> getCategories() {
            return this.categories;
        }

        public CreatePerformanceViewRequestViewDetail setChartLinked(Boolean chartLinked) {
            this.chartLinked = chartLinked;
            return this;
        }
        public Boolean getChartLinked() {
            return this.chartLinked;
        }

        public CreatePerformanceViewRequestViewDetail setChartsPerLine(Integer chartsPerLine) {
            this.chartsPerLine = chartsPerLine;
            return this;
        }
        public Integer getChartsPerLine() {
            return this.chartsPerLine;
        }

    }

}
