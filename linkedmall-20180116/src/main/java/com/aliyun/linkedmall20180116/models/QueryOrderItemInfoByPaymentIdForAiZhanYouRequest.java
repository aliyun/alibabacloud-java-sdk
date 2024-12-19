// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryOrderItemInfoByPaymentIdForAiZhanYouRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LMALL20******001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>22******85759</p>
     */
    @NameInMap("BizUid")
    public String bizUid;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>P51M******15</p>
     */
    @NameInMap("PaymentId")
    public String paymentId;

    public static QueryOrderItemInfoByPaymentIdForAiZhanYouRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOrderItemInfoByPaymentIdForAiZhanYouRequest self = new QueryOrderItemInfoByPaymentIdForAiZhanYouRequest();
        return TeaModel.build(map, self);
    }

    public QueryOrderItemInfoByPaymentIdForAiZhanYouRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryOrderItemInfoByPaymentIdForAiZhanYouRequest setBizUid(String bizUid) {
        this.bizUid = bizUid;
        return this;
    }
    public String getBizUid() {
        return this.bizUid;
    }

    public QueryOrderItemInfoByPaymentIdForAiZhanYouRequest setPaymentId(String paymentId) {
        this.paymentId = paymentId;
        return this;
    }
    public String getPaymentId() {
        return this.paymentId;
    }

}
