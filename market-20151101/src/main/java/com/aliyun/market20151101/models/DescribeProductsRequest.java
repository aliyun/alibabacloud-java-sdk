// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeProductsRequest extends TeaModel {
    @NameInMap("Filter")
    public java.util.List<DescribeProductsRequestFilter> filter;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SearchTerm")
    public String searchTerm;

    public static DescribeProductsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeProductsRequest self = new DescribeProductsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeProductsRequest setFilter(java.util.List<DescribeProductsRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<DescribeProductsRequestFilter> getFilter() {
        return this.filter;
    }

    public DescribeProductsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeProductsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeProductsRequest setSearchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
        return this;
    }
    public String getSearchTerm() {
        return this.searchTerm;
    }

    public static class DescribeProductsRequestFilter extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeProductsRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            DescribeProductsRequestFilter self = new DescribeProductsRequestFilter();
            return TeaModel.build(map, self);
        }

        public DescribeProductsRequestFilter setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeProductsRequestFilter setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
