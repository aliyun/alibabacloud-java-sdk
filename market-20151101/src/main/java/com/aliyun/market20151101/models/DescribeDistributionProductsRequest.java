// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeDistributionProductsRequest extends TeaModel {
    /**
     * <p>The list of filter conditions.</p>
     */
    @NameInMap("Filter")
    public java.util.List<DescribeDistributionProductsRequestFilter> filter;

    /**
     * <p>The current page number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of promotional products per page.</p>
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
         * <p>The search label category. Valid values:</p>
         * <ul>
         * <li>code: the commodity code of the promotional product</li>
         * <li>name: the name of the promotional product</li>
         * <li>supplierName: the name of the promotion service provider.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>supplierName</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The search tag value:</p>
         * <ul>
         * <li>code: the product code to search for</li>
         * <li>name: the product name to search for</li>
         * <li>supplierName: the supplier name to search for.</li>
         * </ul>
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
