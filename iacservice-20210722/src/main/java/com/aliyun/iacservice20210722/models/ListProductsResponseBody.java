// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210722.models;

import com.aliyun.tea.*;

public class ListProductsResponseBody extends TeaModel {
    @NameInMap("maxResults")
    public Long maxResults;

    // 表示当前调用返回读取到的位置，空代表数据已经读取完毕
    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("products")
    public java.util.List<ListProductsResponseBodyProducts> products;

    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    // TotalCount本次请求条件下的数据总量，此参数为可选参数，默认可不返回
    @NameInMap("totalCount")
    public Long totalCount;

    public static ListProductsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProductsResponseBody self = new ListProductsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProductsResponseBody setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
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

    public ListProductsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListProductsResponseBodyProductsProductName extends TeaModel {
        @NameInMap("zh_CN")
        public String zhCN;

        @NameInMap("en_US")
        public String enUS;

        public static ListProductsResponseBodyProductsProductName build(java.util.Map<String, ?> map) throws Exception {
            ListProductsResponseBodyProductsProductName self = new ListProductsResponseBodyProductsProductName();
            return TeaModel.build(map, self);
        }

        public ListProductsResponseBodyProductsProductName setZhCN(String zhCN) {
            this.zhCN = zhCN;
            return this;
        }
        public String getZhCN() {
            return this.zhCN;
        }

        public ListProductsResponseBodyProductsProductName setEnUS(String enUS) {
            this.enUS = enUS;
            return this;
        }
        public String getEnUS() {
            return this.enUS;
        }

    }

    public static class ListProductsResponseBodyProducts extends TeaModel {
        @NameInMap("productCode")
        public String productCode;

        @NameInMap("productName")
        public ListProductsResponseBodyProductsProductName productName;

        public static ListProductsResponseBodyProducts build(java.util.Map<String, ?> map) throws Exception {
            ListProductsResponseBodyProducts self = new ListProductsResponseBodyProducts();
            return TeaModel.build(map, self);
        }

        public ListProductsResponseBodyProducts setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public ListProductsResponseBodyProducts setProductName(ListProductsResponseBodyProductsProductName productName) {
            this.productName = productName;
            return this;
        }
        public ListProductsResponseBodyProductsProductName getProductName() {
            return this.productName;
        }

    }

}
