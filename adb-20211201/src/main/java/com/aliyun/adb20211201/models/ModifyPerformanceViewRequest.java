// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifyPerformanceViewRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp1ub9grke1****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ViewDetail")
    public ModifyPerformanceViewRequestViewDetail viewDetail;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ViewName")
    public String viewName;

    public static ModifyPerformanceViewRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPerformanceViewRequest self = new ModifyPerformanceViewRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPerformanceViewRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyPerformanceViewRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyPerformanceViewRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyPerformanceViewRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyPerformanceViewRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyPerformanceViewRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyPerformanceViewRequest setViewDetail(ModifyPerformanceViewRequestViewDetail viewDetail) {
        this.viewDetail = viewDetail;
        return this;
    }
    public ModifyPerformanceViewRequestViewDetail getViewDetail() {
        return this.viewDetail;
    }

    public ModifyPerformanceViewRequest setViewName(String viewName) {
        this.viewName = viewName;
        return this;
    }
    public String getViewName() {
        return this.viewName;
    }

    public static class ModifyPerformanceViewRequestViewDetailCategoriesKeys extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>AnalyticDB_CPU</p>
         */
        @NameInMap("KeyName")
        public String keyName;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Selected")
        public Boolean selected;

        public static ModifyPerformanceViewRequestViewDetailCategoriesKeys build(java.util.Map<String, ?> map) throws Exception {
            ModifyPerformanceViewRequestViewDetailCategoriesKeys self = new ModifyPerformanceViewRequestViewDetailCategoriesKeys();
            return TeaModel.build(map, self);
        }

        public ModifyPerformanceViewRequestViewDetailCategoriesKeys setKeyName(String keyName) {
            this.keyName = keyName;
            return this;
        }
        public String getKeyName() {
            return this.keyName;
        }

        public ModifyPerformanceViewRequestViewDetailCategoriesKeys setSelected(Boolean selected) {
            this.selected = selected;
            return this;
        }
        public Boolean getSelected() {
            return this.selected;
        }

    }

    public static class ModifyPerformanceViewRequestViewDetailCategories extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Node</p>
         */
        @NameInMap("Category")
        public String category;

        @NameInMap("Keys")
        public java.util.List<ModifyPerformanceViewRequestViewDetailCategoriesKeys> keys;

        public static ModifyPerformanceViewRequestViewDetailCategories build(java.util.Map<String, ?> map) throws Exception {
            ModifyPerformanceViewRequestViewDetailCategories self = new ModifyPerformanceViewRequestViewDetailCategories();
            return TeaModel.build(map, self);
        }

        public ModifyPerformanceViewRequestViewDetailCategories setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ModifyPerformanceViewRequestViewDetailCategories setKeys(java.util.List<ModifyPerformanceViewRequestViewDetailCategoriesKeys> keys) {
            this.keys = keys;
            return this;
        }
        public java.util.List<ModifyPerformanceViewRequestViewDetailCategoriesKeys> getKeys() {
            return this.keys;
        }

    }

    public static class ModifyPerformanceViewRequestViewDetail extends TeaModel {
        @NameInMap("Categories")
        public java.util.List<ModifyPerformanceViewRequestViewDetailCategories> categories;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ChartLinked")
        public Boolean chartLinked;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ChartsPerLine")
        public Integer chartsPerLine;

        public static ModifyPerformanceViewRequestViewDetail build(java.util.Map<String, ?> map) throws Exception {
            ModifyPerformanceViewRequestViewDetail self = new ModifyPerformanceViewRequestViewDetail();
            return TeaModel.build(map, self);
        }

        public ModifyPerformanceViewRequestViewDetail setCategories(java.util.List<ModifyPerformanceViewRequestViewDetailCategories> categories) {
            this.categories = categories;
            return this;
        }
        public java.util.List<ModifyPerformanceViewRequestViewDetailCategories> getCategories() {
            return this.categories;
        }

        public ModifyPerformanceViewRequestViewDetail setChartLinked(Boolean chartLinked) {
            this.chartLinked = chartLinked;
            return this;
        }
        public Boolean getChartLinked() {
            return this.chartLinked;
        }

        public ModifyPerformanceViewRequestViewDetail setChartsPerLine(Integer chartsPerLine) {
            this.chartsPerLine = chartsPerLine;
            return this;
        }
        public Integer getChartsPerLine() {
            return this.chartsPerLine;
        }

    }

}
