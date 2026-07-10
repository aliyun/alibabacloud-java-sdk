// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeProductCodeResponseBody extends TeaModel {
    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The list of product code information.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeProductCodeResponseBodyItems> items;

    /**
     * <p>The number of products displayed per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>7FBBADA3-9A66-5759-8AF8-2F99F5BE13F7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TotalPage")
    public Integer totalPage;

    public static DescribeProductCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeProductCodeResponseBody self = new DescribeProductCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeProductCodeResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeProductCodeResponseBody setItems(java.util.List<DescribeProductCodeResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeProductCodeResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeProductCodeResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeProductCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeProductCodeResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeProductCodeResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class DescribeProductCodeResponseBodyItems extends TeaModel {
        /**
         * <p>The product code.</p>
         * 
         * <strong>example:</strong>
         * <p>ID_PRO</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p>The name corresponding to the product code.</p>
         * 
         * <strong>example:</strong>
         * <p>APP认证</p>
         */
        @NameInMap("ProductName")
        public String productName;

        public static DescribeProductCodeResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeProductCodeResponseBodyItems self = new DescribeProductCodeResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeProductCodeResponseBodyItems setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public DescribeProductCodeResponseBodyItems setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

    }

}
