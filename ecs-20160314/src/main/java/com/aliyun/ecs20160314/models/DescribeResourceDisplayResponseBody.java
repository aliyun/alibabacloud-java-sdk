// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeResourceDisplayResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceDisplay")
    public ResourceDisplay resourceDisplay;

    public static DescribeResourceDisplayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceDisplayResponseBody self = new DescribeResourceDisplayResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeResourceDisplayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeResourceDisplayResponseBody setResourceDisplay(ResourceDisplay resourceDisplay) {
        this.resourceDisplay = resourceDisplay;
        return this;
    }
    public ResourceDisplay getResourceDisplay() {
        return this.resourceDisplay;
    }

    public static class Tags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<String> tag;

        public static Tags build(java.util.Map<String, ?> map) throws Exception {
            Tags self = new Tags();
            return TeaModel.build(map, self);
        }

        public Tags setTag(java.util.List<String> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<String> getTag() {
            return this.tag;
        }

    }

    public static class InstanceTypeFamily extends TeaModel {
        @NameInMap("InstanceTypeFamilyId")
        public String instanceTypeFamilyId;

        @NameInMap("Tags")
        public Tags tags;

        public static InstanceTypeFamily build(java.util.Map<String, ?> map) throws Exception {
            InstanceTypeFamily self = new InstanceTypeFamily();
            return TeaModel.build(map, self);
        }

        public InstanceTypeFamily setInstanceTypeFamilyId(String instanceTypeFamilyId) {
            this.instanceTypeFamilyId = instanceTypeFamilyId;
            return this;
        }
        public String getInstanceTypeFamilyId() {
            return this.instanceTypeFamilyId;
        }

        public InstanceTypeFamily setTags(Tags tags) {
            this.tags = tags;
            return this;
        }
        public Tags getTags() {
            return this.tags;
        }

    }

    public static class InstanceTypeFamilies extends TeaModel {
        @NameInMap("InstanceTypeFamily")
        public java.util.List<InstanceTypeFamily> instanceTypeFamily;

        public static InstanceTypeFamilies build(java.util.Map<String, ?> map) throws Exception {
            InstanceTypeFamilies self = new InstanceTypeFamilies();
            return TeaModel.build(map, self);
        }

        public InstanceTypeFamilies setInstanceTypeFamily(java.util.List<InstanceTypeFamily> instanceTypeFamily) {
            this.instanceTypeFamily = instanceTypeFamily;
            return this;
        }
        public java.util.List<InstanceTypeFamily> getInstanceTypeFamily() {
            return this.instanceTypeFamily;
        }

    }

    public static class InstanceSecondCategory extends TeaModel {
        @NameInMap("InstanceTypeFamilies")
        public InstanceTypeFamilies instanceTypeFamilies;

        @NameInMap("SecondCategoryLevel")
        public String secondCategoryLevel;

        public static InstanceSecondCategory build(java.util.Map<String, ?> map) throws Exception {
            InstanceSecondCategory self = new InstanceSecondCategory();
            return TeaModel.build(map, self);
        }

        public InstanceSecondCategory setInstanceTypeFamilies(InstanceTypeFamilies instanceTypeFamilies) {
            this.instanceTypeFamilies = instanceTypeFamilies;
            return this;
        }
        public InstanceTypeFamilies getInstanceTypeFamilies() {
            return this.instanceTypeFamilies;
        }

        public InstanceSecondCategory setSecondCategoryLevel(String secondCategoryLevel) {
            this.secondCategoryLevel = secondCategoryLevel;
            return this;
        }
        public String getSecondCategoryLevel() {
            return this.secondCategoryLevel;
        }

    }

    public static class InstanceSecondCategories extends TeaModel {
        @NameInMap("InstanceSecondCategory")
        public java.util.List<InstanceSecondCategory> instanceSecondCategory;

        public static InstanceSecondCategories build(java.util.Map<String, ?> map) throws Exception {
            InstanceSecondCategories self = new InstanceSecondCategories();
            return TeaModel.build(map, self);
        }

        public InstanceSecondCategories setInstanceSecondCategory(java.util.List<InstanceSecondCategory> instanceSecondCategory) {
            this.instanceSecondCategory = instanceSecondCategory;
            return this;
        }
        public java.util.List<InstanceSecondCategory> getInstanceSecondCategory() {
            return this.instanceSecondCategory;
        }

    }

    public static class InstanceTopCategory extends TeaModel {
        @NameInMap("InstanceSecondCategories")
        public InstanceSecondCategories instanceSecondCategories;

        @NameInMap("TopCategoryLevel")
        public String topCategoryLevel;

        public static InstanceTopCategory build(java.util.Map<String, ?> map) throws Exception {
            InstanceTopCategory self = new InstanceTopCategory();
            return TeaModel.build(map, self);
        }

        public InstanceTopCategory setInstanceSecondCategories(InstanceSecondCategories instanceSecondCategories) {
            this.instanceSecondCategories = instanceSecondCategories;
            return this;
        }
        public InstanceSecondCategories getInstanceSecondCategories() {
            return this.instanceSecondCategories;
        }

        public InstanceTopCategory setTopCategoryLevel(String topCategoryLevel) {
            this.topCategoryLevel = topCategoryLevel;
            return this;
        }
        public String getTopCategoryLevel() {
            return this.topCategoryLevel;
        }

    }

    public static class InstanceTopCategories extends TeaModel {
        @NameInMap("InstanceTopCategory")
        public java.util.List<InstanceTopCategory> instanceTopCategory;

        public static InstanceTopCategories build(java.util.Map<String, ?> map) throws Exception {
            InstanceTopCategories self = new InstanceTopCategories();
            return TeaModel.build(map, self);
        }

        public InstanceTopCategories setInstanceTopCategory(java.util.List<InstanceTopCategory> instanceTopCategory) {
            this.instanceTopCategory = instanceTopCategory;
            return this;
        }
        public java.util.List<InstanceTopCategory> getInstanceTopCategory() {
            return this.instanceTopCategory;
        }

    }

    public static class ZoneIds extends TeaModel {
        @NameInMap("ZoneId")
        public java.util.List<String> zoneId;

        public static ZoneIds build(java.util.Map<String, ?> map) throws Exception {
            ZoneIds self = new ZoneIds();
            return TeaModel.build(map, self);
        }

        public ZoneIds setZoneId(java.util.List<String> zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public java.util.List<String> getZoneId() {
            return this.zoneId;
        }

    }

    public static class InstanceCategory extends TeaModel {
        @NameInMap("CategoryType")
        public String categoryType;

        @NameInMap("InstanceTopCategories")
        public InstanceTopCategories instanceTopCategories;

        @NameInMap("ZoneIds")
        public ZoneIds zoneIds;

        public static InstanceCategory build(java.util.Map<String, ?> map) throws Exception {
            InstanceCategory self = new InstanceCategory();
            return TeaModel.build(map, self);
        }

        public InstanceCategory setCategoryType(String categoryType) {
            this.categoryType = categoryType;
            return this;
        }
        public String getCategoryType() {
            return this.categoryType;
        }

        public InstanceCategory setInstanceTopCategories(InstanceTopCategories instanceTopCategories) {
            this.instanceTopCategories = instanceTopCategories;
            return this;
        }
        public InstanceTopCategories getInstanceTopCategories() {
            return this.instanceTopCategories;
        }

        public InstanceCategory setZoneIds(ZoneIds zoneIds) {
            this.zoneIds = zoneIds;
            return this;
        }
        public ZoneIds getZoneIds() {
            return this.zoneIds;
        }

    }

    public static class InstanceCategories extends TeaModel {
        @NameInMap("InstanceCategory")
        public java.util.List<InstanceCategory> instanceCategory;

        public static InstanceCategories build(java.util.Map<String, ?> map) throws Exception {
            InstanceCategories self = new InstanceCategories();
            return TeaModel.build(map, self);
        }

        public InstanceCategories setInstanceCategory(java.util.List<InstanceCategory> instanceCategory) {
            this.instanceCategory = instanceCategory;
            return this;
        }
        public java.util.List<InstanceCategory> getInstanceCategory() {
            return this.instanceCategory;
        }

    }

    public static class InstanceChargeTypeTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<String> tag;

        public static InstanceChargeTypeTags build(java.util.Map<String, ?> map) throws Exception {
            InstanceChargeTypeTags self = new InstanceChargeTypeTags();
            return TeaModel.build(map, self);
        }

        public InstanceChargeTypeTags setTag(java.util.List<String> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<String> getTag() {
            return this.tag;
        }

    }

    public static class InstanceChargeType extends TeaModel {
        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("SpotStrategy")
        public String spotStrategy;

        @NameInMap("Tags")
        public InstanceChargeTypeTags tags;

        public static InstanceChargeType build(java.util.Map<String, ?> map) throws Exception {
            InstanceChargeType self = new InstanceChargeType();
            return TeaModel.build(map, self);
        }

        public InstanceChargeType setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public InstanceChargeType setSpotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        public InstanceChargeType setTags(InstanceChargeTypeTags tags) {
            this.tags = tags;
            return this;
        }
        public InstanceChargeTypeTags getTags() {
            return this.tags;
        }

    }

    public static class InstanceChargeTypes extends TeaModel {
        @NameInMap("InstanceChargeType")
        public java.util.List<InstanceChargeType> instanceChargeType;

        public static InstanceChargeTypes build(java.util.Map<String, ?> map) throws Exception {
            InstanceChargeTypes self = new InstanceChargeTypes();
            return TeaModel.build(map, self);
        }

        public InstanceChargeTypes setInstanceChargeType(java.util.List<InstanceChargeType> instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public java.util.List<InstanceChargeType> getInstanceChargeType() {
            return this.instanceChargeType;
        }

    }

    public static class InstanceTypeFamilyTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<String> tag;

        public static InstanceTypeFamilyTags build(java.util.Map<String, ?> map) throws Exception {
            InstanceTypeFamilyTags self = new InstanceTypeFamilyTags();
            return TeaModel.build(map, self);
        }

        public InstanceTypeFamilyTags setTag(java.util.List<String> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<String> getTag() {
            return this.tag;
        }

    }

    public static class InstanceTypeFamiliesInstanceTypeFamily extends TeaModel {
        @NameInMap("InstanceTypeFamilyId")
        public String instanceTypeFamilyId;

        @NameInMap("Tags")
        public InstanceTypeFamilyTags tags;

        public static InstanceTypeFamiliesInstanceTypeFamily build(java.util.Map<String, ?> map) throws Exception {
            InstanceTypeFamiliesInstanceTypeFamily self = new InstanceTypeFamiliesInstanceTypeFamily();
            return TeaModel.build(map, self);
        }

        public InstanceTypeFamiliesInstanceTypeFamily setInstanceTypeFamilyId(String instanceTypeFamilyId) {
            this.instanceTypeFamilyId = instanceTypeFamilyId;
            return this;
        }
        public String getInstanceTypeFamilyId() {
            return this.instanceTypeFamilyId;
        }

        public InstanceTypeFamiliesInstanceTypeFamily setTags(InstanceTypeFamilyTags tags) {
            this.tags = tags;
            return this;
        }
        public InstanceTypeFamilyTags getTags() {
            return this.tags;
        }

    }

    public static class InstanceFamilyGroupInstanceTypeFamilies extends TeaModel {
        @NameInMap("InstanceTypeFamily")
        public java.util.List<InstanceTypeFamiliesInstanceTypeFamily> instanceTypeFamily;

        public static InstanceFamilyGroupInstanceTypeFamilies build(java.util.Map<String, ?> map) throws Exception {
            InstanceFamilyGroupInstanceTypeFamilies self = new InstanceFamilyGroupInstanceTypeFamilies();
            return TeaModel.build(map, self);
        }

        public InstanceFamilyGroupInstanceTypeFamilies setInstanceTypeFamily(java.util.List<InstanceTypeFamiliesInstanceTypeFamily> instanceTypeFamily) {
            this.instanceTypeFamily = instanceTypeFamily;
            return this;
        }
        public java.util.List<InstanceTypeFamiliesInstanceTypeFamily> getInstanceTypeFamily() {
            return this.instanceTypeFamily;
        }

    }

    public static class InstanceFamilyGroup extends TeaModel {
        @NameInMap("InstanceFamilyGroupName")
        public String instanceFamilyGroupName;

        @NameInMap("InstanceTypeFamilies")
        public InstanceFamilyGroupInstanceTypeFamilies instanceTypeFamilies;

        public static InstanceFamilyGroup build(java.util.Map<String, ?> map) throws Exception {
            InstanceFamilyGroup self = new InstanceFamilyGroup();
            return TeaModel.build(map, self);
        }

        public InstanceFamilyGroup setInstanceFamilyGroupName(String instanceFamilyGroupName) {
            this.instanceFamilyGroupName = instanceFamilyGroupName;
            return this;
        }
        public String getInstanceFamilyGroupName() {
            return this.instanceFamilyGroupName;
        }

        public InstanceFamilyGroup setInstanceTypeFamilies(InstanceFamilyGroupInstanceTypeFamilies instanceTypeFamilies) {
            this.instanceTypeFamilies = instanceTypeFamilies;
            return this;
        }
        public InstanceFamilyGroupInstanceTypeFamilies getInstanceTypeFamilies() {
            return this.instanceTypeFamilies;
        }

    }

    public static class InstanceFamilyGroups extends TeaModel {
        @NameInMap("InstanceFamilyGroup")
        public java.util.List<InstanceFamilyGroup> instanceFamilyGroup;

        public static InstanceFamilyGroups build(java.util.Map<String, ?> map) throws Exception {
            InstanceFamilyGroups self = new InstanceFamilyGroups();
            return TeaModel.build(map, self);
        }

        public InstanceFamilyGroups setInstanceFamilyGroup(java.util.List<InstanceFamilyGroup> instanceFamilyGroup) {
            this.instanceFamilyGroup = instanceFamilyGroup;
            return this;
        }
        public java.util.List<InstanceFamilyGroup> getInstanceFamilyGroup() {
            return this.instanceFamilyGroup;
        }

    }

    public static class ProductCategory extends TeaModel {
        @NameInMap("InstanceFamilyGroups")
        public InstanceFamilyGroups instanceFamilyGroups;

        @NameInMap("ProductName")
        public String productName;

        public static ProductCategory build(java.util.Map<String, ?> map) throws Exception {
            ProductCategory self = new ProductCategory();
            return TeaModel.build(map, self);
        }

        public ProductCategory setInstanceFamilyGroups(InstanceFamilyGroups instanceFamilyGroups) {
            this.instanceFamilyGroups = instanceFamilyGroups;
            return this;
        }
        public InstanceFamilyGroups getInstanceFamilyGroups() {
            return this.instanceFamilyGroups;
        }

        public ProductCategory setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

    }

    public static class ProductCategories extends TeaModel {
        @NameInMap("ProductCategory")
        public java.util.List<ProductCategory> productCategory;

        public static ProductCategories build(java.util.Map<String, ?> map) throws Exception {
            ProductCategories self = new ProductCategories();
            return TeaModel.build(map, self);
        }

        public ProductCategories setProductCategory(java.util.List<ProductCategory> productCategory) {
            this.productCategory = productCategory;
            return this;
        }
        public java.util.List<ProductCategory> getProductCategory() {
            return this.productCategory;
        }

    }

    public static class ZoneTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<String> tag;

        public static ZoneTags build(java.util.Map<String, ?> map) throws Exception {
            ZoneTags self = new ZoneTags();
            return TeaModel.build(map, self);
        }

        public ZoneTags setTag(java.util.List<String> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<String> getTag() {
            return this.tag;
        }

    }

    public static class Zone extends TeaModel {
        @NameInMap("Tags")
        public ZoneTags tags;

        @NameInMap("ZoneId")
        public String zoneId;

        public static Zone build(java.util.Map<String, ?> map) throws Exception {
            Zone self = new Zone();
            return TeaModel.build(map, self);
        }

        public Zone setTags(ZoneTags tags) {
            this.tags = tags;
            return this;
        }
        public ZoneTags getTags() {
            return this.tags;
        }

        public Zone setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class Zones extends TeaModel {
        @NameInMap("Zone")
        public java.util.List<Zone> zone;

        public static Zones build(java.util.Map<String, ?> map) throws Exception {
            Zones self = new Zones();
            return TeaModel.build(map, self);
        }

        public Zones setZone(java.util.List<Zone> zone) {
            this.zone = zone;
            return this;
        }
        public java.util.List<Zone> getZone() {
            return this.zone;
        }

    }

    public static class ResourceDisplay extends TeaModel {
        @NameInMap("InstanceCategories")
        public InstanceCategories instanceCategories;

        @NameInMap("InstanceChargeTypes")
        public InstanceChargeTypes instanceChargeTypes;

        @NameInMap("ProductCategories")
        public ProductCategories productCategories;

        @NameInMap("Zones")
        public Zones zones;

        public static ResourceDisplay build(java.util.Map<String, ?> map) throws Exception {
            ResourceDisplay self = new ResourceDisplay();
            return TeaModel.build(map, self);
        }

        public ResourceDisplay setInstanceCategories(InstanceCategories instanceCategories) {
            this.instanceCategories = instanceCategories;
            return this;
        }
        public InstanceCategories getInstanceCategories() {
            return this.instanceCategories;
        }

        public ResourceDisplay setInstanceChargeTypes(InstanceChargeTypes instanceChargeTypes) {
            this.instanceChargeTypes = instanceChargeTypes;
            return this;
        }
        public InstanceChargeTypes getInstanceChargeTypes() {
            return this.instanceChargeTypes;
        }

        public ResourceDisplay setProductCategories(ProductCategories productCategories) {
            this.productCategories = productCategories;
            return this;
        }
        public ProductCategories getProductCategories() {
            return this.productCategories;
        }

        public ResourceDisplay setZones(Zones zones) {
            this.zones = zones;
            return this;
        }
        public Zones getZones() {
            return this.zones;
        }

    }

}
