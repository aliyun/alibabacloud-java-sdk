// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeDistributionProductsLinkResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<DescribeDistributionProductsLinkResponseBodyResult> result;

    @NameInMap("Success")
    public Boolean success;

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
        @NameInMap("Code")
        public String code;

        @NameInMap("Name")
        public String name;

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
