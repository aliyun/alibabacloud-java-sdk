// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class QueryMarketImagesResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public QueryMarketImagesResponseBodyResult result;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static QueryMarketImagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMarketImagesResponseBody self = new QueryMarketImagesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMarketImagesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryMarketImagesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryMarketImagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMarketImagesResponseBody setResult(QueryMarketImagesResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public QueryMarketImagesResponseBodyResult getResult() {
        return this.result;
    }

    public QueryMarketImagesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class QueryMarketImagesResponseBodyResultImageProductImagesImageDiskDeviceMappingsDiskDeviceMapping extends TeaModel {
        @NameInMap("Device")
        public String device;

        @NameInMap("DiskType")
        public String diskType;

        @NameInMap("Format")
        public String format;

        @NameInMap("ImportOSSBucket")
        public String importOSSBucket;

        @NameInMap("ImportOSSObject")
        public String importOSSObject;

        @NameInMap("Size")
        public Integer size;

        @NameInMap("SnapshotId")
        public String snapshotId;

        public static QueryMarketImagesResponseBodyResultImageProductImagesImageDiskDeviceMappingsDiskDeviceMapping build(java.util.Map<String, ?> map) throws Exception {
            QueryMarketImagesResponseBodyResultImageProductImagesImageDiskDeviceMappingsDiskDeviceMapping self = new QueryMarketImagesResponseBodyResultImageProductImagesImageDiskDeviceMappingsDiskDeviceMapping();
            return TeaModel.build(map, self);
        }

        public QueryMarketImagesResponseBodyResultImageProductImagesImageDiskDeviceMappingsDiskDeviceMapping setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public QueryMarketImagesResponseBodyResultImageProductImagesImageDiskDeviceMappingsDiskDeviceMapping setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public QueryMarketImagesResponseBodyResultImageProductImagesImageDiskDeviceMappingsDiskDeviceMapping setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public QueryMarketImagesResponseBodyResultImageProductImagesImageDiskDeviceMappingsDiskDeviceMapping setImportOSSBucket(String importOSSBucket) {
            this.importOSSBucket = importOSSBucket;
            return this;
        }
        public String getImportOSSBucket() {
            return this.importOSSBucket;
        }

        public QueryMarketImagesResponseBodyResultImageProductImagesImageDiskDeviceMappingsDiskDeviceMapping setImportOSSObject(String importOSSObject) {
            this.importOSSObject = importOSSObject;
            return this;
        }
        public String getImportOSSObject() {
            return this.importOSSObject;
        }

        public QueryMarketImagesResponseBodyResultImageProductImagesImageDiskDeviceMappingsDiskDeviceMapping setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public QueryMarketImagesResponseBodyResultImageProductImagesImageDiskDeviceMappingsDiskDeviceMapping setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public String getSnapshotId() {
            return this.snapshotId;
        }

    }

    public static class QueryMarketImagesResponseBodyResultImageProductImagesImageDiskDeviceMappings extends TeaModel {
        @NameInMap("DiskDeviceMapping")
        public java.util.List<QueryMarketImagesResponseBodyResultImageProductImagesImageDiskDeviceMappingsDiskDeviceMapping> diskDeviceMapping;

        public static QueryMarketImagesResponseBodyResultImageProductImagesImageDiskDeviceMappings build(java.util.Map<String, ?> map) throws Exception {
            QueryMarketImagesResponseBodyResultImageProductImagesImageDiskDeviceMappings self = new QueryMarketImagesResponseBodyResultImageProductImagesImageDiskDeviceMappings();
            return TeaModel.build(map, self);
        }

        public QueryMarketImagesResponseBodyResultImageProductImagesImageDiskDeviceMappings setDiskDeviceMapping(java.util.List<QueryMarketImagesResponseBodyResultImageProductImagesImageDiskDeviceMappingsDiskDeviceMapping> diskDeviceMapping) {
            this.diskDeviceMapping = diskDeviceMapping;
            return this;
        }
        public java.util.List<QueryMarketImagesResponseBodyResultImageProductImagesImageDiskDeviceMappingsDiskDeviceMapping> getDiskDeviceMapping() {
            return this.diskDeviceMapping;
        }

    }

    public static class QueryMarketImagesResponseBodyResultImageProductImagesImage extends TeaModel {
        @NameInMap("DiskDeviceMappings")
        public QueryMarketImagesResponseBodyResultImageProductImagesImageDiskDeviceMappings diskDeviceMappings;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("ImageSize")
        public Integer imageSize;

        @NameInMap("IsDefault")
        public Boolean isDefault;

        @NameInMap("Region")
        public String region;

        @NameInMap("SupportIO")
        public Boolean supportIO;

        @NameInMap("Version")
        public String version;

        @NameInMap("VersionDescription")
        public String versionDescription;

        public static QueryMarketImagesResponseBodyResultImageProductImagesImage build(java.util.Map<String, ?> map) throws Exception {
            QueryMarketImagesResponseBodyResultImageProductImagesImage self = new QueryMarketImagesResponseBodyResultImageProductImagesImage();
            return TeaModel.build(map, self);
        }

        public QueryMarketImagesResponseBodyResultImageProductImagesImage setDiskDeviceMappings(QueryMarketImagesResponseBodyResultImageProductImagesImageDiskDeviceMappings diskDeviceMappings) {
            this.diskDeviceMappings = diskDeviceMappings;
            return this;
        }
        public QueryMarketImagesResponseBodyResultImageProductImagesImageDiskDeviceMappings getDiskDeviceMappings() {
            return this.diskDeviceMappings;
        }

        public QueryMarketImagesResponseBodyResultImageProductImagesImage setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public QueryMarketImagesResponseBodyResultImageProductImagesImage setImageSize(Integer imageSize) {
            this.imageSize = imageSize;
            return this;
        }
        public Integer getImageSize() {
            return this.imageSize;
        }

        public QueryMarketImagesResponseBodyResultImageProductImagesImage setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public QueryMarketImagesResponseBodyResultImageProductImagesImage setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public QueryMarketImagesResponseBodyResultImageProductImagesImage setSupportIO(Boolean supportIO) {
            this.supportIO = supportIO;
            return this;
        }
        public Boolean getSupportIO() {
            return this.supportIO;
        }

        public QueryMarketImagesResponseBodyResultImageProductImagesImage setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public QueryMarketImagesResponseBodyResultImageProductImagesImage setVersionDescription(String versionDescription) {
            this.versionDescription = versionDescription;
            return this;
        }
        public String getVersionDescription() {
            return this.versionDescription;
        }

    }

    public static class QueryMarketImagesResponseBodyResultImageProductImages extends TeaModel {
        @NameInMap("Image")
        public java.util.List<QueryMarketImagesResponseBodyResultImageProductImagesImage> image;

        public static QueryMarketImagesResponseBodyResultImageProductImages build(java.util.Map<String, ?> map) throws Exception {
            QueryMarketImagesResponseBodyResultImageProductImages self = new QueryMarketImagesResponseBodyResultImageProductImages();
            return TeaModel.build(map, self);
        }

        public QueryMarketImagesResponseBodyResultImageProductImages setImage(java.util.List<QueryMarketImagesResponseBodyResultImageProductImagesImage> image) {
            this.image = image;
            return this;
        }
        public java.util.List<QueryMarketImagesResponseBodyResultImageProductImagesImage> getImage() {
            return this.image;
        }

    }

    public static class QueryMarketImagesResponseBodyResultImageProductPriceInfoOrderRuleIdSet extends TeaModel {
        @NameInMap("RuleId")
        public java.util.List<String> ruleId;

        public static QueryMarketImagesResponseBodyResultImageProductPriceInfoOrderRuleIdSet build(java.util.Map<String, ?> map) throws Exception {
            QueryMarketImagesResponseBodyResultImageProductPriceInfoOrderRuleIdSet self = new QueryMarketImagesResponseBodyResultImageProductPriceInfoOrderRuleIdSet();
            return TeaModel.build(map, self);
        }

        public QueryMarketImagesResponseBodyResultImageProductPriceInfoOrderRuleIdSet setRuleId(java.util.List<String> ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public java.util.List<String> getRuleId() {
            return this.ruleId;
        }

    }

    public static class QueryMarketImagesResponseBodyResultImageProductPriceInfoOrder extends TeaModel {
        @NameInMap("Currency")
        public String currency;

        @NameInMap("DiscountPrice")
        public Float discountPrice;

        @NameInMap("OriginalPrice")
        public Float originalPrice;

        @NameInMap("Period")
        public Integer period;

        @NameInMap("PriceUnit")
        public String priceUnit;

        @NameInMap("RuleIdSet")
        public QueryMarketImagesResponseBodyResultImageProductPriceInfoOrderRuleIdSet ruleIdSet;

        @NameInMap("TradePrice")
        public Float tradePrice;

        public static QueryMarketImagesResponseBodyResultImageProductPriceInfoOrder build(java.util.Map<String, ?> map) throws Exception {
            QueryMarketImagesResponseBodyResultImageProductPriceInfoOrder self = new QueryMarketImagesResponseBodyResultImageProductPriceInfoOrder();
            return TeaModel.build(map, self);
        }

        public QueryMarketImagesResponseBodyResultImageProductPriceInfoOrder setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public QueryMarketImagesResponseBodyResultImageProductPriceInfoOrder setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public QueryMarketImagesResponseBodyResultImageProductPriceInfoOrder setOriginalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        public QueryMarketImagesResponseBodyResultImageProductPriceInfoOrder setPeriod(Integer period) {
            this.period = period;
            return this;
        }
        public Integer getPeriod() {
            return this.period;
        }

        public QueryMarketImagesResponseBodyResultImageProductPriceInfoOrder setPriceUnit(String priceUnit) {
            this.priceUnit = priceUnit;
            return this;
        }
        public String getPriceUnit() {
            return this.priceUnit;
        }

        public QueryMarketImagesResponseBodyResultImageProductPriceInfoOrder setRuleIdSet(QueryMarketImagesResponseBodyResultImageProductPriceInfoOrderRuleIdSet ruleIdSet) {
            this.ruleIdSet = ruleIdSet;
            return this;
        }
        public QueryMarketImagesResponseBodyResultImageProductPriceInfoOrderRuleIdSet getRuleIdSet() {
            return this.ruleIdSet;
        }

        public QueryMarketImagesResponseBodyResultImageProductPriceInfoOrder setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
        }

    }

    public static class QueryMarketImagesResponseBodyResultImageProductPriceInfoRulesRule extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("RuleId")
        public Long ruleId;

        @NameInMap("Title")
        public String title;

        public static QueryMarketImagesResponseBodyResultImageProductPriceInfoRulesRule build(java.util.Map<String, ?> map) throws Exception {
            QueryMarketImagesResponseBodyResultImageProductPriceInfoRulesRule self = new QueryMarketImagesResponseBodyResultImageProductPriceInfoRulesRule();
            return TeaModel.build(map, self);
        }

        public QueryMarketImagesResponseBodyResultImageProductPriceInfoRulesRule setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryMarketImagesResponseBodyResultImageProductPriceInfoRulesRule setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public QueryMarketImagesResponseBodyResultImageProductPriceInfoRulesRule setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class QueryMarketImagesResponseBodyResultImageProductPriceInfoRules extends TeaModel {
        @NameInMap("Rule")
        public java.util.List<QueryMarketImagesResponseBodyResultImageProductPriceInfoRulesRule> rule;

        public static QueryMarketImagesResponseBodyResultImageProductPriceInfoRules build(java.util.Map<String, ?> map) throws Exception {
            QueryMarketImagesResponseBodyResultImageProductPriceInfoRules self = new QueryMarketImagesResponseBodyResultImageProductPriceInfoRules();
            return TeaModel.build(map, self);
        }

        public QueryMarketImagesResponseBodyResultImageProductPriceInfoRules setRule(java.util.List<QueryMarketImagesResponseBodyResultImageProductPriceInfoRulesRule> rule) {
            this.rule = rule;
            return this;
        }
        public java.util.List<QueryMarketImagesResponseBodyResultImageProductPriceInfoRulesRule> getRule() {
            return this.rule;
        }

    }

    public static class QueryMarketImagesResponseBodyResultImageProductPriceInfo extends TeaModel {
        @NameInMap("Order")
        public QueryMarketImagesResponseBodyResultImageProductPriceInfoOrder order;

        @NameInMap("Rules")
        public QueryMarketImagesResponseBodyResultImageProductPriceInfoRules rules;

        public static QueryMarketImagesResponseBodyResultImageProductPriceInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryMarketImagesResponseBodyResultImageProductPriceInfo self = new QueryMarketImagesResponseBodyResultImageProductPriceInfo();
            return TeaModel.build(map, self);
        }

        public QueryMarketImagesResponseBodyResultImageProductPriceInfo setOrder(QueryMarketImagesResponseBodyResultImageProductPriceInfoOrder order) {
            this.order = order;
            return this;
        }
        public QueryMarketImagesResponseBodyResultImageProductPriceInfoOrder getOrder() {
            return this.order;
        }

        public QueryMarketImagesResponseBodyResultImageProductPriceInfo setRules(QueryMarketImagesResponseBodyResultImageProductPriceInfoRules rules) {
            this.rules = rules;
            return this;
        }
        public QueryMarketImagesResponseBodyResultImageProductPriceInfoRules getRules() {
            return this.rules;
        }

    }

    public static class QueryMarketImagesResponseBodyResultImageProductQuota extends TeaModel {
        @NameInMap("TotalQuota")
        public Long totalQuota;

        @NameInMap("UnusedQuota")
        public Long unusedQuota;

        @NameInMap("UsingQuota")
        public Long usingQuota;

        public static QueryMarketImagesResponseBodyResultImageProductQuota build(java.util.Map<String, ?> map) throws Exception {
            QueryMarketImagesResponseBodyResultImageProductQuota self = new QueryMarketImagesResponseBodyResultImageProductQuota();
            return TeaModel.build(map, self);
        }

        public QueryMarketImagesResponseBodyResultImageProductQuota setTotalQuota(Long totalQuota) {
            this.totalQuota = totalQuota;
            return this;
        }
        public Long getTotalQuota() {
            return this.totalQuota;
        }

        public QueryMarketImagesResponseBodyResultImageProductQuota setUnusedQuota(Long unusedQuota) {
            this.unusedQuota = unusedQuota;
            return this;
        }
        public Long getUnusedQuota() {
            return this.unusedQuota;
        }

        public QueryMarketImagesResponseBodyResultImageProductQuota setUsingQuota(Long usingQuota) {
            this.usingQuota = usingQuota;
            return this;
        }
        public Long getUsingQuota() {
            return this.usingQuota;
        }

    }

    public static class QueryMarketImagesResponseBodyResultImageProductSkuCodes extends TeaModel {
        @NameInMap("SkuCode")
        public java.util.List<String> skuCode;

        public static QueryMarketImagesResponseBodyResultImageProductSkuCodes build(java.util.Map<String, ?> map) throws Exception {
            QueryMarketImagesResponseBodyResultImageProductSkuCodes self = new QueryMarketImagesResponseBodyResultImageProductSkuCodes();
            return TeaModel.build(map, self);
        }

        public QueryMarketImagesResponseBodyResultImageProductSkuCodes setSkuCode(java.util.List<String> skuCode) {
            this.skuCode = skuCode;
            return this;
        }
        public java.util.List<String> getSkuCode() {
            return this.skuCode;
        }

    }

    public static class QueryMarketImagesResponseBodyResultImageProduct extends TeaModel {
        @NameInMap("AgreementUrl")
        public String agreementUrl;

        @NameInMap("BaseSystem")
        public String baseSystem;

        @NameInMap("BuyUrl")
        public String buyUrl;

        @NameInMap("CategoryName")
        public String categoryName;

        @NameInMap("CreatedOn")
        public Long createdOn;

        @NameInMap("DetailUrl")
        public String detailUrl;

        @NameInMap("ImageProductCode")
        public String imageProductCode;

        @NameInMap("Images")
        public QueryMarketImagesResponseBodyResultImageProductImages images;

        @NameInMap("OsBit")
        public Integer osBit;

        @NameInMap("OsKind")
        public String osKind;

        @NameInMap("PictureUrl")
        public String pictureUrl;

        @NameInMap("PriceInfo")
        public QueryMarketImagesResponseBodyResultImageProductPriceInfo priceInfo;

        @NameInMap("ProductName")
        public String productName;

        @NameInMap("Quota")
        public QueryMarketImagesResponseBodyResultImageProductQuota quota;

        @NameInMap("Score")
        public Float score;

        @NameInMap("ShortDescription")
        public String shortDescription;

        @NameInMap("SkuCodes")
        public QueryMarketImagesResponseBodyResultImageProductSkuCodes skuCodes;

        @NameInMap("SmallPicUrl")
        public String smallPicUrl;

        @NameInMap("StoreUrl")
        public String storeUrl;

        @NameInMap("SupplierName")
        public String supplierName;

        @NameInMap("SupportIO")
        public Boolean supportIO;

        @NameInMap("UserCount")
        public Long userCount;

        public static QueryMarketImagesResponseBodyResultImageProduct build(java.util.Map<String, ?> map) throws Exception {
            QueryMarketImagesResponseBodyResultImageProduct self = new QueryMarketImagesResponseBodyResultImageProduct();
            return TeaModel.build(map, self);
        }

        public QueryMarketImagesResponseBodyResultImageProduct setAgreementUrl(String agreementUrl) {
            this.agreementUrl = agreementUrl;
            return this;
        }
        public String getAgreementUrl() {
            return this.agreementUrl;
        }

        public QueryMarketImagesResponseBodyResultImageProduct setBaseSystem(String baseSystem) {
            this.baseSystem = baseSystem;
            return this;
        }
        public String getBaseSystem() {
            return this.baseSystem;
        }

        public QueryMarketImagesResponseBodyResultImageProduct setBuyUrl(String buyUrl) {
            this.buyUrl = buyUrl;
            return this;
        }
        public String getBuyUrl() {
            return this.buyUrl;
        }

        public QueryMarketImagesResponseBodyResultImageProduct setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public QueryMarketImagesResponseBodyResultImageProduct setCreatedOn(Long createdOn) {
            this.createdOn = createdOn;
            return this;
        }
        public Long getCreatedOn() {
            return this.createdOn;
        }

        public QueryMarketImagesResponseBodyResultImageProduct setDetailUrl(String detailUrl) {
            this.detailUrl = detailUrl;
            return this;
        }
        public String getDetailUrl() {
            return this.detailUrl;
        }

        public QueryMarketImagesResponseBodyResultImageProduct setImageProductCode(String imageProductCode) {
            this.imageProductCode = imageProductCode;
            return this;
        }
        public String getImageProductCode() {
            return this.imageProductCode;
        }

        public QueryMarketImagesResponseBodyResultImageProduct setImages(QueryMarketImagesResponseBodyResultImageProductImages images) {
            this.images = images;
            return this;
        }
        public QueryMarketImagesResponseBodyResultImageProductImages getImages() {
            return this.images;
        }

        public QueryMarketImagesResponseBodyResultImageProduct setOsBit(Integer osBit) {
            this.osBit = osBit;
            return this;
        }
        public Integer getOsBit() {
            return this.osBit;
        }

        public QueryMarketImagesResponseBodyResultImageProduct setOsKind(String osKind) {
            this.osKind = osKind;
            return this;
        }
        public String getOsKind() {
            return this.osKind;
        }

        public QueryMarketImagesResponseBodyResultImageProduct setPictureUrl(String pictureUrl) {
            this.pictureUrl = pictureUrl;
            return this;
        }
        public String getPictureUrl() {
            return this.pictureUrl;
        }

        public QueryMarketImagesResponseBodyResultImageProduct setPriceInfo(QueryMarketImagesResponseBodyResultImageProductPriceInfo priceInfo) {
            this.priceInfo = priceInfo;
            return this;
        }
        public QueryMarketImagesResponseBodyResultImageProductPriceInfo getPriceInfo() {
            return this.priceInfo;
        }

        public QueryMarketImagesResponseBodyResultImageProduct setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public QueryMarketImagesResponseBodyResultImageProduct setQuota(QueryMarketImagesResponseBodyResultImageProductQuota quota) {
            this.quota = quota;
            return this;
        }
        public QueryMarketImagesResponseBodyResultImageProductQuota getQuota() {
            return this.quota;
        }

        public QueryMarketImagesResponseBodyResultImageProduct setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public QueryMarketImagesResponseBodyResultImageProduct setShortDescription(String shortDescription) {
            this.shortDescription = shortDescription;
            return this;
        }
        public String getShortDescription() {
            return this.shortDescription;
        }

        public QueryMarketImagesResponseBodyResultImageProduct setSkuCodes(QueryMarketImagesResponseBodyResultImageProductSkuCodes skuCodes) {
            this.skuCodes = skuCodes;
            return this;
        }
        public QueryMarketImagesResponseBodyResultImageProductSkuCodes getSkuCodes() {
            return this.skuCodes;
        }

        public QueryMarketImagesResponseBodyResultImageProduct setSmallPicUrl(String smallPicUrl) {
            this.smallPicUrl = smallPicUrl;
            return this;
        }
        public String getSmallPicUrl() {
            return this.smallPicUrl;
        }

        public QueryMarketImagesResponseBodyResultImageProduct setStoreUrl(String storeUrl) {
            this.storeUrl = storeUrl;
            return this;
        }
        public String getStoreUrl() {
            return this.storeUrl;
        }

        public QueryMarketImagesResponseBodyResultImageProduct setSupplierName(String supplierName) {
            this.supplierName = supplierName;
            return this;
        }
        public String getSupplierName() {
            return this.supplierName;
        }

        public QueryMarketImagesResponseBodyResultImageProduct setSupportIO(Boolean supportIO) {
            this.supportIO = supportIO;
            return this;
        }
        public Boolean getSupportIO() {
            return this.supportIO;
        }

        public QueryMarketImagesResponseBodyResultImageProduct setUserCount(Long userCount) {
            this.userCount = userCount;
            return this;
        }
        public Long getUserCount() {
            return this.userCount;
        }

    }

    public static class QueryMarketImagesResponseBodyResult extends TeaModel {
        @NameInMap("ImageProduct")
        public java.util.List<QueryMarketImagesResponseBodyResultImageProduct> imageProduct;

        public static QueryMarketImagesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryMarketImagesResponseBodyResult self = new QueryMarketImagesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryMarketImagesResponseBodyResult setImageProduct(java.util.List<QueryMarketImagesResponseBodyResultImageProduct> imageProduct) {
            this.imageProduct = imageProduct;
            return this;
        }
        public java.util.List<QueryMarketImagesResponseBodyResultImageProduct> getImageProduct() {
            return this.imageProduct;
        }

    }

}
