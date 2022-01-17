// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeProductsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProductItems")
    public DescribeProductsResponseBodyProductItems productItems;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeProductsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeProductsResponseBody self = new DescribeProductsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeProductsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeProductsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeProductsResponseBody setProductItems(DescribeProductsResponseBodyProductItems productItems) {
        this.productItems = productItems;
        return this;
    }
    public DescribeProductsResponseBodyProductItems getProductItems() {
        return this.productItems;
    }

    public DescribeProductsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeProductsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeProductsResponseBodyProductItemsProductItem extends TeaModel {
        @NameInMap("CategoryId")
        public Long categoryId;

        @NameInMap("Code")
        public String code;

        @NameInMap("DeliveryDate")
        public String deliveryDate;

        @NameInMap("DeliveryWay")
        public String deliveryWay;

        @NameInMap("ImageUrl")
        public String imageUrl;

        @NameInMap("Name")
        public String name;

        @NameInMap("OperationSystem")
        public String operationSystem;

        @NameInMap("PriceInfo")
        public String priceInfo;

        @NameInMap("Score")
        public String score;

        @NameInMap("ShortDescription")
        public String shortDescription;

        @NameInMap("SuggestedPrice")
        public String suggestedPrice;

        @NameInMap("SupplierId")
        public Long supplierId;

        @NameInMap("SupplierName")
        public String supplierName;

        @NameInMap("Tags")
        public String tags;

        @NameInMap("TargetUrl")
        public String targetUrl;

        @NameInMap("WarrantyDate")
        public String warrantyDate;

        public static DescribeProductsResponseBodyProductItemsProductItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeProductsResponseBodyProductItemsProductItem self = new DescribeProductsResponseBodyProductItemsProductItem();
            return TeaModel.build(map, self);
        }

        public DescribeProductsResponseBodyProductItemsProductItem setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Long getCategoryId() {
            return this.categoryId;
        }

        public DescribeProductsResponseBodyProductItemsProductItem setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeProductsResponseBodyProductItemsProductItem setDeliveryDate(String deliveryDate) {
            this.deliveryDate = deliveryDate;
            return this;
        }
        public String getDeliveryDate() {
            return this.deliveryDate;
        }

        public DescribeProductsResponseBodyProductItemsProductItem setDeliveryWay(String deliveryWay) {
            this.deliveryWay = deliveryWay;
            return this;
        }
        public String getDeliveryWay() {
            return this.deliveryWay;
        }

        public DescribeProductsResponseBodyProductItemsProductItem setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public DescribeProductsResponseBodyProductItemsProductItem setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeProductsResponseBodyProductItemsProductItem setOperationSystem(String operationSystem) {
            this.operationSystem = operationSystem;
            return this;
        }
        public String getOperationSystem() {
            return this.operationSystem;
        }

        public DescribeProductsResponseBodyProductItemsProductItem setPriceInfo(String priceInfo) {
            this.priceInfo = priceInfo;
            return this;
        }
        public String getPriceInfo() {
            return this.priceInfo;
        }

        public DescribeProductsResponseBodyProductItemsProductItem setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public DescribeProductsResponseBodyProductItemsProductItem setShortDescription(String shortDescription) {
            this.shortDescription = shortDescription;
            return this;
        }
        public String getShortDescription() {
            return this.shortDescription;
        }

        public DescribeProductsResponseBodyProductItemsProductItem setSuggestedPrice(String suggestedPrice) {
            this.suggestedPrice = suggestedPrice;
            return this;
        }
        public String getSuggestedPrice() {
            return this.suggestedPrice;
        }

        public DescribeProductsResponseBodyProductItemsProductItem setSupplierId(Long supplierId) {
            this.supplierId = supplierId;
            return this;
        }
        public Long getSupplierId() {
            return this.supplierId;
        }

        public DescribeProductsResponseBodyProductItemsProductItem setSupplierName(String supplierName) {
            this.supplierName = supplierName;
            return this;
        }
        public String getSupplierName() {
            return this.supplierName;
        }

        public DescribeProductsResponseBodyProductItemsProductItem setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public DescribeProductsResponseBodyProductItemsProductItem setTargetUrl(String targetUrl) {
            this.targetUrl = targetUrl;
            return this;
        }
        public String getTargetUrl() {
            return this.targetUrl;
        }

        public DescribeProductsResponseBodyProductItemsProductItem setWarrantyDate(String warrantyDate) {
            this.warrantyDate = warrantyDate;
            return this;
        }
        public String getWarrantyDate() {
            return this.warrantyDate;
        }

    }

    public static class DescribeProductsResponseBodyProductItems extends TeaModel {
        @NameInMap("ProductItem")
        public java.util.List<DescribeProductsResponseBodyProductItemsProductItem> productItem;

        public static DescribeProductsResponseBodyProductItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeProductsResponseBodyProductItems self = new DescribeProductsResponseBodyProductItems();
            return TeaModel.build(map, self);
        }

        public DescribeProductsResponseBodyProductItems setProductItem(java.util.List<DescribeProductsResponseBodyProductItemsProductItem> productItem) {
            this.productItem = productItem;
            return this;
        }
        public java.util.List<DescribeProductsResponseBodyProductItemsProductItem> getProductItem() {
            return this.productItem;
        }

    }

}
