// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gts_dayu20210324.models;

import com.aliyun.tea.*;

public class ListProductsWithAttrValueResponseBody extends TeaModel {
    // message
    @NameInMap("Message")
    public String message;

    // data
    @NameInMap("Data")
    public ListProductsWithAttrValueResponseBodyData data;

    // code
    @NameInMap("Code")
    public String code;

    // success
    @NameInMap("Success")
    public Boolean success;

    // exception
    @NameInMap("Exception")
    public java.util.Map<String, ?> exception;

    @NameInMap("RequestId")
    public String requestId;

    public static ListProductsWithAttrValueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProductsWithAttrValueResponseBody self = new ListProductsWithAttrValueResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProductsWithAttrValueResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListProductsWithAttrValueResponseBody setData(ListProductsWithAttrValueResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListProductsWithAttrValueResponseBodyData getData() {
        return this.data;
    }

    public ListProductsWithAttrValueResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListProductsWithAttrValueResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListProductsWithAttrValueResponseBody setException(java.util.Map<String, ?> exception) {
        this.exception = exception;
        return this;
    }
    public java.util.Map<String, ?> getException() {
        return this.exception;
    }

    public ListProductsWithAttrValueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListProductsWithAttrValueResponseBodyDataItemAttrValueListAttrValueList extends TeaModel {
        @NameInMap("AttrValueId")
        public Long attrValueId;

        @NameInMap("AttrEnValue")
        public String attrEnValue;

        @NameInMap("AttrValue")
        public String attrValue;

        public static ListProductsWithAttrValueResponseBodyDataItemAttrValueListAttrValueList build(java.util.Map<String, ?> map) throws Exception {
            ListProductsWithAttrValueResponseBodyDataItemAttrValueListAttrValueList self = new ListProductsWithAttrValueResponseBodyDataItemAttrValueListAttrValueList();
            return TeaModel.build(map, self);
        }

        public ListProductsWithAttrValueResponseBodyDataItemAttrValueListAttrValueList setAttrValueId(Long attrValueId) {
            this.attrValueId = attrValueId;
            return this;
        }
        public Long getAttrValueId() {
            return this.attrValueId;
        }

        public ListProductsWithAttrValueResponseBodyDataItemAttrValueListAttrValueList setAttrEnValue(String attrEnValue) {
            this.attrEnValue = attrEnValue;
            return this;
        }
        public String getAttrEnValue() {
            return this.attrEnValue;
        }

        public ListProductsWithAttrValueResponseBodyDataItemAttrValueListAttrValueList setAttrValue(String attrValue) {
            this.attrValue = attrValue;
            return this;
        }
        public String getAttrValue() {
            return this.attrValue;
        }

    }

    public static class ListProductsWithAttrValueResponseBodyDataItemAttrValueList extends TeaModel {
        @NameInMap("AttrId")
        public Long attrId;

        @NameInMap("AttrEnName")
        public String attrEnName;

        @NameInMap("AttrName")
        public String attrName;

        @NameInMap("AttrValueList")
        public java.util.List<ListProductsWithAttrValueResponseBodyDataItemAttrValueListAttrValueList> attrValueList;

        @NameInMap("IsKey")
        public String isKey;

        public static ListProductsWithAttrValueResponseBodyDataItemAttrValueList build(java.util.Map<String, ?> map) throws Exception {
            ListProductsWithAttrValueResponseBodyDataItemAttrValueList self = new ListProductsWithAttrValueResponseBodyDataItemAttrValueList();
            return TeaModel.build(map, self);
        }

        public ListProductsWithAttrValueResponseBodyDataItemAttrValueList setAttrId(Long attrId) {
            this.attrId = attrId;
            return this;
        }
        public Long getAttrId() {
            return this.attrId;
        }

        public ListProductsWithAttrValueResponseBodyDataItemAttrValueList setAttrEnName(String attrEnName) {
            this.attrEnName = attrEnName;
            return this;
        }
        public String getAttrEnName() {
            return this.attrEnName;
        }

        public ListProductsWithAttrValueResponseBodyDataItemAttrValueList setAttrName(String attrName) {
            this.attrName = attrName;
            return this;
        }
        public String getAttrName() {
            return this.attrName;
        }

        public ListProductsWithAttrValueResponseBodyDataItemAttrValueList setAttrValueList(java.util.List<ListProductsWithAttrValueResponseBodyDataItemAttrValueListAttrValueList> attrValueList) {
            this.attrValueList = attrValueList;
            return this;
        }
        public java.util.List<ListProductsWithAttrValueResponseBodyDataItemAttrValueListAttrValueList> getAttrValueList() {
            return this.attrValueList;
        }

        public ListProductsWithAttrValueResponseBodyDataItemAttrValueList setIsKey(String isKey) {
            this.isKey = isKey;
            return this;
        }
        public String getIsKey() {
            return this.isKey;
        }

    }

    public static class ListProductsWithAttrValueResponseBodyData extends TeaModel {
        // 产品ID
        @NameInMap("Id")
        public Long id;

        // 数据来源
        @NameInMap("DataSource")
        public String dataSource;

        // 源系统产品唯一值
        @NameInMap("SourceValue")
        public String sourceValue;

        // 加密id
        @NameInMap("SecurityId")
        public String securityId;

        // 产品编码
        @NameInMap("ProductCode")
        public String productCode;

        // 数据来源子类型
        @NameInMap("SourceType")
        public String sourceType;

        // 租户ID
        @NameInMap("TenantId")
        public Long tenantId;

        // 产品名称
        @NameInMap("ProductName")
        public String productName;

        // 采购员
        @NameInMap("BuyerWorkNo")
        public String buyerWorkNo;

        @NameInMap("ImgUrlList")
        public java.util.List<String> imgUrlList;

        // 图片存储类型
        @NameInMap("ImgStorageType")
        public String imgStorageType;

        // 品类id
        @NameInMap("CatalogCategoryId")
        public Long catalogCategoryId;

        // 前台类目ID
        @NameInMap("FrontCategoryId")
        public Long frontCategoryId;

        // 采购类目ID
        @NameInMap("CategoryId")
        public Long categoryId;

        // 采购类目Code
        @NameInMap("CategoryCode")
        public String categoryCode;

        // 来源类别ID
        @NameInMap("SourceCategoryId")
        public Long sourceCategoryId;

        // 来源类别名称
        @NameInMap("SourceCategoryName")
        public String sourceCategoryName;

        // 产品说明
        @NameInMap("ProductDesc")
        public String productDesc;

        // 计价单位
        @NameInMap("Unit")
        public String unit;

        // 开单方式
        @NameInMap("OrderType")
        public String orderType;

        // 推荐描述
        @NameInMap("Recommendation")
        public String recommendation;

        // 采购通道
        @NameInMap("PurchaseChannel")
        public String purchaseChannel;

        // 采购用途ID
        @NameInMap("CategoryUseId")
        public Long categoryUseId;

        @NameInMap("SourceInfo")
        public String sourceInfo;

        @NameInMap("MallUrl")
        public String mallUrl;

        @NameInMap("BrandId")
        public Long brandId;

        @NameInMap("BrandName")
        public String brandName;

        @NameInMap("Status")
        public String status;

        @NameInMap("ItemAttrValueList")
        public java.util.List<ListProductsWithAttrValueResponseBodyDataItemAttrValueList> itemAttrValueList;

        @NameInMap("LeadingPurOrg")
        public java.util.List<String> leadingPurOrg;

        @NameInMap("SharePurOrg")
        public java.util.List<String> sharePurOrg;

        public static ListProductsWithAttrValueResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListProductsWithAttrValueResponseBodyData self = new ListProductsWithAttrValueResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListProductsWithAttrValueResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListProductsWithAttrValueResponseBodyData setDataSource(String dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public String getDataSource() {
            return this.dataSource;
        }

        public ListProductsWithAttrValueResponseBodyData setSourceValue(String sourceValue) {
            this.sourceValue = sourceValue;
            return this;
        }
        public String getSourceValue() {
            return this.sourceValue;
        }

        public ListProductsWithAttrValueResponseBodyData setSecurityId(String securityId) {
            this.securityId = securityId;
            return this;
        }
        public String getSecurityId() {
            return this.securityId;
        }

        public ListProductsWithAttrValueResponseBodyData setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public ListProductsWithAttrValueResponseBodyData setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public ListProductsWithAttrValueResponseBodyData setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public ListProductsWithAttrValueResponseBodyData setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public ListProductsWithAttrValueResponseBodyData setBuyerWorkNo(String buyerWorkNo) {
            this.buyerWorkNo = buyerWorkNo;
            return this;
        }
        public String getBuyerWorkNo() {
            return this.buyerWorkNo;
        }

        public ListProductsWithAttrValueResponseBodyData setImgUrlList(java.util.List<String> imgUrlList) {
            this.imgUrlList = imgUrlList;
            return this;
        }
        public java.util.List<String> getImgUrlList() {
            return this.imgUrlList;
        }

        public ListProductsWithAttrValueResponseBodyData setImgStorageType(String imgStorageType) {
            this.imgStorageType = imgStorageType;
            return this;
        }
        public String getImgStorageType() {
            return this.imgStorageType;
        }

        public ListProductsWithAttrValueResponseBodyData setCatalogCategoryId(Long catalogCategoryId) {
            this.catalogCategoryId = catalogCategoryId;
            return this;
        }
        public Long getCatalogCategoryId() {
            return this.catalogCategoryId;
        }

        public ListProductsWithAttrValueResponseBodyData setFrontCategoryId(Long frontCategoryId) {
            this.frontCategoryId = frontCategoryId;
            return this;
        }
        public Long getFrontCategoryId() {
            return this.frontCategoryId;
        }

        public ListProductsWithAttrValueResponseBodyData setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Long getCategoryId() {
            return this.categoryId;
        }

        public ListProductsWithAttrValueResponseBodyData setCategoryCode(String categoryCode) {
            this.categoryCode = categoryCode;
            return this;
        }
        public String getCategoryCode() {
            return this.categoryCode;
        }

        public ListProductsWithAttrValueResponseBodyData setSourceCategoryId(Long sourceCategoryId) {
            this.sourceCategoryId = sourceCategoryId;
            return this;
        }
        public Long getSourceCategoryId() {
            return this.sourceCategoryId;
        }

        public ListProductsWithAttrValueResponseBodyData setSourceCategoryName(String sourceCategoryName) {
            this.sourceCategoryName = sourceCategoryName;
            return this;
        }
        public String getSourceCategoryName() {
            return this.sourceCategoryName;
        }

        public ListProductsWithAttrValueResponseBodyData setProductDesc(String productDesc) {
            this.productDesc = productDesc;
            return this;
        }
        public String getProductDesc() {
            return this.productDesc;
        }

        public ListProductsWithAttrValueResponseBodyData setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public ListProductsWithAttrValueResponseBodyData setOrderType(String orderType) {
            this.orderType = orderType;
            return this;
        }
        public String getOrderType() {
            return this.orderType;
        }

        public ListProductsWithAttrValueResponseBodyData setRecommendation(String recommendation) {
            this.recommendation = recommendation;
            return this;
        }
        public String getRecommendation() {
            return this.recommendation;
        }

        public ListProductsWithAttrValueResponseBodyData setPurchaseChannel(String purchaseChannel) {
            this.purchaseChannel = purchaseChannel;
            return this;
        }
        public String getPurchaseChannel() {
            return this.purchaseChannel;
        }

        public ListProductsWithAttrValueResponseBodyData setCategoryUseId(Long categoryUseId) {
            this.categoryUseId = categoryUseId;
            return this;
        }
        public Long getCategoryUseId() {
            return this.categoryUseId;
        }

        public ListProductsWithAttrValueResponseBodyData setSourceInfo(String sourceInfo) {
            this.sourceInfo = sourceInfo;
            return this;
        }
        public String getSourceInfo() {
            return this.sourceInfo;
        }

        public ListProductsWithAttrValueResponseBodyData setMallUrl(String mallUrl) {
            this.mallUrl = mallUrl;
            return this;
        }
        public String getMallUrl() {
            return this.mallUrl;
        }

        public ListProductsWithAttrValueResponseBodyData setBrandId(Long brandId) {
            this.brandId = brandId;
            return this;
        }
        public Long getBrandId() {
            return this.brandId;
        }

        public ListProductsWithAttrValueResponseBodyData setBrandName(String brandName) {
            this.brandName = brandName;
            return this;
        }
        public String getBrandName() {
            return this.brandName;
        }

        public ListProductsWithAttrValueResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListProductsWithAttrValueResponseBodyData setItemAttrValueList(java.util.List<ListProductsWithAttrValueResponseBodyDataItemAttrValueList> itemAttrValueList) {
            this.itemAttrValueList = itemAttrValueList;
            return this;
        }
        public java.util.List<ListProductsWithAttrValueResponseBodyDataItemAttrValueList> getItemAttrValueList() {
            return this.itemAttrValueList;
        }

        public ListProductsWithAttrValueResponseBodyData setLeadingPurOrg(java.util.List<String> leadingPurOrg) {
            this.leadingPurOrg = leadingPurOrg;
            return this;
        }
        public java.util.List<String> getLeadingPurOrg() {
            return this.leadingPurOrg;
        }

        public ListProductsWithAttrValueResponseBodyData setSharePurOrg(java.util.List<String> sharePurOrg) {
            this.sharePurOrg = sharePurOrg;
            return this;
        }
        public java.util.List<String> getSharePurOrg() {
            return this.sharePurOrg;
        }

    }

}
