// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ChangeProductSpecsOrderRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("ProductId")
    public Long productId;

    @NameInMap("Order")
    public java.util.List<ChangeProductSpecsOrderRequestOrder> order;

    public static ChangeProductSpecsOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeProductSpecsOrderRequest self = new ChangeProductSpecsOrderRequest();
        return TeaModel.build(map, self);
    }

    public ChangeProductSpecsOrderRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ChangeProductSpecsOrderRequest setProductId(Long productId) {
        this.productId = productId;
        return this;
    }
    public Long getProductId() {
        return this.productId;
    }

    public ChangeProductSpecsOrderRequest setOrder(java.util.List<ChangeProductSpecsOrderRequestOrder> order) {
        this.order = order;
        return this;
    }
    public java.util.List<ChangeProductSpecsOrderRequestOrder> getOrder() {
        return this.order;
    }

    public static class ChangeProductSpecsOrderRequestOrder extends TeaModel {
        @NameInMap("ProductSpecsId")
        public Long productSpecsId;

        @NameInMap("ProductSpecsOrder")
        public Integer productSpecsOrder;

        public static ChangeProductSpecsOrderRequestOrder build(java.util.Map<String, ?> map) throws Exception {
            ChangeProductSpecsOrderRequestOrder self = new ChangeProductSpecsOrderRequestOrder();
            return TeaModel.build(map, self);
        }

        public ChangeProductSpecsOrderRequestOrder setProductSpecsId(Long productSpecsId) {
            this.productSpecsId = productSpecsId;
            return this;
        }
        public Long getProductSpecsId() {
            return this.productSpecsId;
        }

        public ChangeProductSpecsOrderRequestOrder setProductSpecsOrder(Integer productSpecsOrder) {
            this.productSpecsOrder = productSpecsOrder;
            return this;
        }
        public Integer getProductSpecsOrder() {
            return this.productSpecsOrder;
        }

    }

}
