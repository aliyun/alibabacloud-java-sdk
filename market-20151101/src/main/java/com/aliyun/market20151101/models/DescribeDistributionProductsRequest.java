// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeDistributionProductsRequest extends TeaModel {
    @NameInMap("Filter")
    public java.util.List<DescribeDistributionProductsRequestFilter> filter;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    public static DescribeDistributionProductsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDistributionProductsRequest self = new DescribeDistributionProductsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDistributionProductsRequest setFilter(java.util.List<DescribeDistributionProductsRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<DescribeDistributionProductsRequestFilter> getFilter() {
        return this.filter;
    }

    public DescribeDistributionProductsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDistributionProductsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public static class DescribeDistributionProductsRequestFilter extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>supplierName</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cmj0000000</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeDistributionProductsRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            DescribeDistributionProductsRequestFilter self = new DescribeDistributionProductsRequestFilter();
            return TeaModel.build(map, self);
        }

        public DescribeDistributionProductsRequestFilter setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDistributionProductsRequestFilter setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
