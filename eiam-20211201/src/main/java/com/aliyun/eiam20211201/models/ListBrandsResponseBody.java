// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListBrandsResponseBody extends TeaModel {
    @NameInMap("Brands")
    public java.util.List<ListBrandsResponseBodyBrands> brands;

    /**
     * <p>分页查询时每页行数。</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>本次调用返回的查询凭证（Token）值，用于下一次翻页查询。</p>
     * 
     * <strong>example:</strong>
     * <p>NTxxxexample</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>本次调用返回的查询凭证（Token）值，用于上一次翻页查询。</p>
     * 
     * <strong>example:</strong>
     * <p>PTxxxexample</p>
     */
    @NameInMap("PreviousToken")
    public String previousToken;

    /**
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListBrandsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBrandsResponseBody self = new ListBrandsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBrandsResponseBody setBrands(java.util.List<ListBrandsResponseBodyBrands> brands) {
        this.brands = brands;
        return this;
    }
    public java.util.List<ListBrandsResponseBodyBrands> getBrands() {
        return this.brands;
    }

    public ListBrandsResponseBody setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListBrandsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListBrandsResponseBody setPreviousToken(String previousToken) {
        this.previousToken = previousToken;
        return this;
    }
    public String getPreviousToken() {
        return this.previousToken;
    }

    public ListBrandsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListBrandsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListBrandsResponseBodyBrands extends TeaModel {
        /**
         * <p>品牌ID</p>
         * 
         * <strong>example:</strong>
         * <p>brand_xxxx</p>
         */
        @NameInMap("BrandId")
        public String brandId;

        /**
         * <p>品牌名称</p>
         * 
         * <strong>example:</strong>
         * <p>Custom Brand</p>
         */
        @NameInMap("BrandName")
        public String brandName;

        /**
         * <p>品牌类型</p>
         * 
         * <strong>example:</strong>
         * <p>user_custom</p>
         */
        @NameInMap("BrandType")
        public String brandType;

        /**
         * <p>实例ID。</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>品牌状态</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListBrandsResponseBodyBrands build(java.util.Map<String, ?> map) throws Exception {
            ListBrandsResponseBodyBrands self = new ListBrandsResponseBodyBrands();
            return TeaModel.build(map, self);
        }

        public ListBrandsResponseBodyBrands setBrandId(String brandId) {
            this.brandId = brandId;
            return this;
        }
        public String getBrandId() {
            return this.brandId;
        }

        public ListBrandsResponseBodyBrands setBrandName(String brandName) {
            this.brandName = brandName;
            return this;
        }
        public String getBrandName() {
            return this.brandName;
        }

        public ListBrandsResponseBodyBrands setBrandType(String brandType) {
            this.brandType = brandType;
            return this;
        }
        public String getBrandType() {
            return this.brandType;
        }

        public ListBrandsResponseBodyBrands setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListBrandsResponseBodyBrands setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
