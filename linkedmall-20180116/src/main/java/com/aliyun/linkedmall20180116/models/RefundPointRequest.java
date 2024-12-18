// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class RefundPointRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LMALL20191223****</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <strong>example:</strong>
     * <p>44453****</p>
     */
    @NameInMap("LmOrderId")
    public String lmOrderId;

    @NameInMap("Reason")
    public String reason;

    /**
     * <strong>example:</strong>
     * <p>10718491****</p>
     */
    @NameInMap("SellerId")
    public String sellerId;

    /**
     * <strong>example:</strong>
     * <p>susan*****</p>
     */
    @NameInMap("ThirdPartyUserId")
    public String thirdPartyUserId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("UseAnonymousTbAccount")
    public Boolean useAnonymousTbAccount;

    public static RefundPointRequest build(java.util.Map<String, ?> map) throws Exception {
        RefundPointRequest self = new RefundPointRequest();
        return TeaModel.build(map, self);
    }

    public RefundPointRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public RefundPointRequest setLmOrderId(String lmOrderId) {
        this.lmOrderId = lmOrderId;
        return this;
    }
    public String getLmOrderId() {
        return this.lmOrderId;
    }

    public RefundPointRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public RefundPointRequest setSellerId(String sellerId) {
        this.sellerId = sellerId;
        return this;
    }
    public String getSellerId() {
        return this.sellerId;
    }

    public RefundPointRequest setThirdPartyUserId(String thirdPartyUserId) {
        this.thirdPartyUserId = thirdPartyUserId;
        return this;
    }
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

    public RefundPointRequest setUseAnonymousTbAccount(Boolean useAnonymousTbAccount) {
        this.useAnonymousTbAccount = useAnonymousTbAccount;
        return this;
    }
    public Boolean getUseAnonymousTbAccount() {
        return this.useAnonymousTbAccount;
    }

}
