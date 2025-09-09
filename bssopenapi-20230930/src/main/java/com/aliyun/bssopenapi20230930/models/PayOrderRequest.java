// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class PayOrderRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1178418164369806</p>
     */
    @NameInMap("BuyerId")
    public Long buyerId;

    @NameInMap("EcIdAccountIds")
    public java.util.List<PayOrderRequestEcIdAccountIds> ecIdAccountIds;

    /**
     * <strong>example:</strong>
     * <p>26888345</p>
     */
    @NameInMap("Nbid")
    public String nbid;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>260591304500425</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>201437655683478597</p>
     */
    @NameInMap("PaySubmitUid")
    public Long paySubmitUid;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>201437655683478597</p>
     */
    @NameInMap("PayerId")
    public Long payerId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJwYWdlTnVtIjoyLCJwYWdlU2l6ZSI6MTB9</p>
     */
    @NameInMap("Token")
    public String token;

    public static PayOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        PayOrderRequest self = new PayOrderRequest();
        return TeaModel.build(map, self);
    }

    public PayOrderRequest setBuyerId(Long buyerId) {
        this.buyerId = buyerId;
        return this;
    }
    public Long getBuyerId() {
        return this.buyerId;
    }

    public PayOrderRequest setEcIdAccountIds(java.util.List<PayOrderRequestEcIdAccountIds> ecIdAccountIds) {
        this.ecIdAccountIds = ecIdAccountIds;
        return this;
    }
    public java.util.List<PayOrderRequestEcIdAccountIds> getEcIdAccountIds() {
        return this.ecIdAccountIds;
    }

    public PayOrderRequest setNbid(String nbid) {
        this.nbid = nbid;
        return this;
    }
    public String getNbid() {
        return this.nbid;
    }

    public PayOrderRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public PayOrderRequest setPaySubmitUid(Long paySubmitUid) {
        this.paySubmitUid = paySubmitUid;
        return this;
    }
    public Long getPaySubmitUid() {
        return this.paySubmitUid;
    }

    public PayOrderRequest setPayerId(Long payerId) {
        this.payerId = payerId;
        return this;
    }
    public Long getPayerId() {
        return this.payerId;
    }

    public PayOrderRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public static class PayOrderRequestEcIdAccountIds extends TeaModel {
        @NameInMap("AccountIds")
        public java.util.List<Long> accountIds;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("EcId")
        public String ecId;

        public static PayOrderRequestEcIdAccountIds build(java.util.Map<String, ?> map) throws Exception {
            PayOrderRequestEcIdAccountIds self = new PayOrderRequestEcIdAccountIds();
            return TeaModel.build(map, self);
        }

        public PayOrderRequestEcIdAccountIds setAccountIds(java.util.List<Long> accountIds) {
            this.accountIds = accountIds;
            return this;
        }
        public java.util.List<Long> getAccountIds() {
            return this.accountIds;
        }

        public PayOrderRequestEcIdAccountIds setEcId(String ecId) {
            this.ecId = ecId;
            return this;
        }
        public String getEcId() {
            return this.ecId;
        }

    }

}
