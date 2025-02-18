// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class GetDistributionProductResult extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("products")
    public java.util.List<DistributionProduct> products;

    @NameInMap("requestId")
    public String requestId;

    public static GetDistributionProductResult build(java.util.Map<String, ?> map) throws Exception {
        GetDistributionProductResult self = new GetDistributionProductResult();
        return TeaModel.build(map, self);
    }

    public GetDistributionProductResult setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDistributionProductResult setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDistributionProductResult setProducts(java.util.List<DistributionProduct> products) {
        this.products = products;
        return this;
    }
    public java.util.List<DistributionProduct> getProducts() {
        return this.products;
    }

    public GetDistributionProductResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
