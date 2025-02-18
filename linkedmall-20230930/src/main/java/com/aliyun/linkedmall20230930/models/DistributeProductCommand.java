// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class DistributeProductCommand extends TeaModel {
    @NameInMap("lmShopId")
    public String lmShopId;

    @NameInMap("products")
    public java.util.List<DistributionProduct> products;

    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>2024-12-01 10:01:00</p>
     */
    @NameInMap("requestTime")
    public String requestTime;

    @NameInMap("requestUser")
    public String requestUser;

    public static DistributeProductCommand build(java.util.Map<String, ?> map) throws Exception {
        DistributeProductCommand self = new DistributeProductCommand();
        return TeaModel.build(map, self);
    }

    public DistributeProductCommand setLmShopId(String lmShopId) {
        this.lmShopId = lmShopId;
        return this;
    }
    public String getLmShopId() {
        return this.lmShopId;
    }

    public DistributeProductCommand setProducts(java.util.List<DistributionProduct> products) {
        this.products = products;
        return this;
    }
    public java.util.List<DistributionProduct> getProducts() {
        return this.products;
    }

    public DistributeProductCommand setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DistributeProductCommand setRequestTime(String requestTime) {
        this.requestTime = requestTime;
        return this;
    }
    public String getRequestTime() {
        return this.requestTime;
    }

    public DistributeProductCommand setRequestUser(String requestUser) {
        this.requestUser = requestUser;
        return this;
    }
    public String getRequestUser() {
        return this.requestUser;
    }

}
