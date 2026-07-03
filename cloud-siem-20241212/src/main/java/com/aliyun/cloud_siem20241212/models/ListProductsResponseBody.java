// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListProductsResponseBody extends TeaModel {
    /**
     * <p>The maximum number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used to retrieve the next page of results. If the value of this parameter is not empty, more results are available. You can use this token in the next request to retrieve the next page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAUqcj6VO4E3ECWIrFczs****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The list of products.</p>
     */
    @NameInMap("Products")
    public java.util.List<ListProductsResponseBodyProducts> products;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6276D891-*****-55B2-87B9-74D413F7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>57</p>
     */
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
        /**
         * <p>The number of abnormal data ingestion configurations.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("AbnormalDataIngestionCount")
        public Integer abnormalDataIngestionCount;

        /**
         * <p>The activation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1733269771123</p>
         */
        @NameInMap("ActiveTime")
        public Long activeTime;

        /**
         * <p>Indicates whether data collection configurations can be added.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AllowAddDataIngestion")
        public Boolean allowAddDataIngestion;

        /**
         * <p>The time when the product was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1733269771123</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The data ingestion status. Valid values:</p>
         * <ul>
         * <li><p>true: enabled.</p>
         * </li>
         * <li><p>false: disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("DataIngestionStatus")
        public Boolean dataIngestionStatus;

        /**
         * <p>The number of enabled data ingestion configurations.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("EnabledDataIngestionCount")
        public Integer enabledDataIngestionCount;

        /**
         * <p>The product alias.</p>
         * 
         * <strong>example:</strong>
         * <p>alibaba_cloud_sas</p>
         */
        @NameInMap("ProductAlias")
        public String productAlias;

        /**
         * <p>The product ID.</p>
         * 
         * <strong>example:</strong>
         * <p>alibaba_cloud_sas</p>
         */
        @NameInMap("ProductId")
        public String productId;

        /**
         * <p>This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>sas</p>
         */
        @NameInMap("ProductName")
        public String productName;

        /**
         * <p>The product type. Valid values:</p>
         * <ul>
         * <li><p>preset</p>
         * </li>
         * <li><p>custom</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>preset</p>
         */
        @NameInMap("ProductType")
        public String productType;

        /**
         * <p>The total number of data ingestion configurations.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalDataIngestionCount")
        public Integer totalDataIngestionCount;

        /**
         * <p>The time when the product was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1733269771123</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        /**
         * <p>The vendor ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vd-qlsw5eocx94w9</p>
         */
        @NameInMap("VendorId")
        public String vendorId;

        /**
         * <p>The vendor name.</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
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
