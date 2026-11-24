// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListProductsResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("Products")
    public java.util.List<ListProductsResponseBodyProducts> products;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListProductsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProductsResponseBody self = new ListProductsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProductsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListProductsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListProductsResponseBody setProducts(java.util.List<ListProductsResponseBodyProducts> products) {
        this.products = products;
        return this;
    }
    public java.util.List<ListProductsResponseBodyProducts> getProducts() {
        return this.products;
    }

    public ListProductsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProductsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListProductsResponseBodyProducts extends TeaModel {
        @NameInMap("AbnormalDataIngestionCount")
        public Integer abnormalDataIngestionCount;

        @NameInMap("ActiveTime")
        public Long activeTime;

        @NameInMap("AllowAddDataIngestion")
        public Boolean allowAddDataIngestion;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("DataIngestionStatus")
        public Boolean dataIngestionStatus;

        @NameInMap("EnabledDataIngestionCount")
        public Integer enabledDataIngestionCount;

        @NameInMap("ProductAlias")
        public String productAlias;

        @NameInMap("ProductId")
        public String productId;

        @NameInMap("ProductName")
        public String productName;

        @NameInMap("ProductType")
        public String productType;

        @NameInMap("TotalDataIngestionCount")
        public Integer totalDataIngestionCount;

        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("VendorId")
        public String vendorId;

        @NameInMap("VendorName")
        public String vendorName;

        public static ListProductsResponseBodyProducts build(java.util.Map<String, ?> map) throws Exception {
            ListProductsResponseBodyProducts self = new ListProductsResponseBodyProducts();
            return TeaModel.build(map, self);
        }

        public ListProductsResponseBodyProducts setAbnormalDataIngestionCount(Integer abnormalDataIngestionCount) {
            this.abnormalDataIngestionCount = abnormalDataIngestionCount;
            return this;
        }
        public Integer getAbnormalDataIngestionCount() {
            return this.abnormalDataIngestionCount;
        }

        public ListProductsResponseBodyProducts setActiveTime(Long activeTime) {
            this.activeTime = activeTime;
            return this;
        }
        public Long getActiveTime() {
            return this.activeTime;
        }

        public ListProductsResponseBodyProducts setAllowAddDataIngestion(Boolean allowAddDataIngestion) {
            this.allowAddDataIngestion = allowAddDataIngestion;
            return this;
        }
        public Boolean getAllowAddDataIngestion() {
            return this.allowAddDataIngestion;
        }

        public ListProductsResponseBodyProducts setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListProductsResponseBodyProducts setDataIngestionStatus(Boolean dataIngestionStatus) {
            this.dataIngestionStatus = dataIngestionStatus;
            return this;
        }
        public Boolean getDataIngestionStatus() {
            return this.dataIngestionStatus;
        }

        public ListProductsResponseBodyProducts setEnabledDataIngestionCount(Integer enabledDataIngestionCount) {
            this.enabledDataIngestionCount = enabledDataIngestionCount;
            return this;
        }
        public Integer getEnabledDataIngestionCount() {
            return this.enabledDataIngestionCount;
        }

        public ListProductsResponseBodyProducts setProductAlias(String productAlias) {
            this.productAlias = productAlias;
            return this;
        }
        public String getProductAlias() {
            return this.productAlias;
        }

        public ListProductsResponseBodyProducts setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public ListProductsResponseBodyProducts setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public ListProductsResponseBodyProducts setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public ListProductsResponseBodyProducts setTotalDataIngestionCount(Integer totalDataIngestionCount) {
            this.totalDataIngestionCount = totalDataIngestionCount;
            return this;
        }
        public Integer getTotalDataIngestionCount() {
            return this.totalDataIngestionCount;
        }

        public ListProductsResponseBodyProducts setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public ListProductsResponseBodyProducts setVendorId(String vendorId) {
            this.vendorId = vendorId;
            return this;
        }
        public String getVendorId() {
            return this.vendorId;
        }

        public ListProductsResponseBodyProducts setVendorName(String vendorName) {
            this.vendorName = vendorName;
            return this;
        }
        public String getVendorName() {
            return this.vendorName;
        }

    }

}
