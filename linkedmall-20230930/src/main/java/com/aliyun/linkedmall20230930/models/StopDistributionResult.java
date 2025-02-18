// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class StopDistributionResult extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("products")
    public java.util.List<DistributionProduct> products;

    @NameInMap("requestId")
    public String requestId;

    public static StopDistributionResult build(java.util.Map<String, ?> map) throws Exception {
        StopDistributionResult self = new StopDistributionResult();
        return TeaModel.build(map, self);
    }

    public StopDistributionResult setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public StopDistributionResult setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public StopDistributionResult setProducts(java.util.List<DistributionProduct> products) {
        this.products = products;
        return this;
    }
    public java.util.List<DistributionProduct> getProducts() {
        return this.products;
    }

    public StopDistributionResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
