// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class StopDistributionResult extends TeaModel {
    /**
     * <p>The return code.</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The return message.</p>
     * 
     * <strong>example:</strong>
     * <p>操作成功</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The product information.</p>
     */
    @NameInMap("products")
    public java.util.List<DistributionProduct> products;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>48A34399-A72C-1E23-8388-7E63A1B2E927</p>
     */
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
