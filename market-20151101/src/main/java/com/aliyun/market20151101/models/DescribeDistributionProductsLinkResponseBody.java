// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeDistributionProductsLinkResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>5BD09171-BF4D-18D8-890E-C70C067527BE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The promotion link information for the promoted products.</p>
     */
    @NameInMap("Result")
    public java.util.List<DescribeDistributionProductsLinkResponseBodyResult> result;

    /**
     * <p>The success status indicator.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of promoted products.</p>
     * 
     * <strong>example:</strong>
     * <p>51</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeDistributionProductsLinkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDistributionProductsLinkResponseBody self = new DescribeDistributionProductsLinkResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDistributionProductsLinkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDistributionProductsLinkResponseBody setResult(java.util.List<DescribeDistributionProductsLinkResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeDistributionProductsLinkResponseBodyResult> getResult() {
        return this.result;
    }

    public DescribeDistributionProductsLinkResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeDistributionProductsLinkResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDistributionProductsLinkResponseBodyResult extends TeaModel {
        /**
         * <p>The code of the promoted product.</p>
         * 
         * <strong>example:</strong>
         * <p>cmapi000****</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The name of the promoted product.</p>
         * 
         * <strong>example:</strong>
         * <p>测试商品</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The promotion link for the product. Note: The sample link is a test product link.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://market.aliyun.com/ad/adClick?param=QN%2BgAHA8mY%2BV1vSDtkNqyWG9G5uUX2Q8%2BJrC8wTzBo5YK7tTmm4Zdiz6nmmyLHMC5REAsq2viyeJYjBjVHno1HydPvHrVarNXQTMEzEmR8TRZaG2FsnzpszXKK2cMA69CUmF9qQpHqU%3D">https://market.aliyun.com/ad/adClick?param=QN%2BgAHA8mY%2BV1vSDtkNqyWG9G5uUX2Q8%2BJrC8wTzBo5YK7tTmm4Zdiz6nmmyLHMC5REAsq2viyeJYjBjVHno1HydPvHrVarNXQTMEzEmR8TRZaG2FsnzpszXKK2cMA69CUmF9qQpHqU%3D</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static DescribeDistributionProductsLinkResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeDistributionProductsLinkResponseBodyResult self = new DescribeDistributionProductsLinkResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeDistributionProductsLinkResponseBodyResult setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeDistributionProductsLinkResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDistributionProductsLinkResponseBodyResult setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
