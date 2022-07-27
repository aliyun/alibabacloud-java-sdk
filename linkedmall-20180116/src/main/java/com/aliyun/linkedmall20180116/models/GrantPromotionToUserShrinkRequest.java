// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class GrantPromotionToUserShrinkRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("ExpireSeconds")
    public Long expireSeconds;

    @NameInMap("GrantMode")
    public String grantMode;

    @NameInMap("GrantWay")
    public String grantWay;

    @NameInMap("IdempotentId")
    public String idempotentId;

    @NameInMap("PromotionId")
    public String promotionId;

    @NameInMap("SecurityCode")
    public String securityCode;

    @NameInMap("ThirdPartyUserId")
    public String thirdPartyUserId;

    @NameInMap("body")
    public String bodyShrink;

    public static GrantPromotionToUserShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GrantPromotionToUserShrinkRequest self = new GrantPromotionToUserShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GrantPromotionToUserShrinkRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public GrantPromotionToUserShrinkRequest setExpireSeconds(Long expireSeconds) {
        this.expireSeconds = expireSeconds;
        return this;
    }
    public Long getExpireSeconds() {
        return this.expireSeconds;
    }

    public GrantPromotionToUserShrinkRequest setGrantMode(String grantMode) {
        this.grantMode = grantMode;
        return this;
    }
    public String getGrantMode() {
        return this.grantMode;
    }

    public GrantPromotionToUserShrinkRequest setGrantWay(String grantWay) {
        this.grantWay = grantWay;
        return this;
    }
    public String getGrantWay() {
        return this.grantWay;
    }

    public GrantPromotionToUserShrinkRequest setIdempotentId(String idempotentId) {
        this.idempotentId = idempotentId;
        return this;
    }
    public String getIdempotentId() {
        return this.idempotentId;
    }

    public GrantPromotionToUserShrinkRequest setPromotionId(String promotionId) {
        this.promotionId = promotionId;
        return this;
    }
    public String getPromotionId() {
        return this.promotionId;
    }

    public GrantPromotionToUserShrinkRequest setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
        return this;
    }
    public String getSecurityCode() {
        return this.securityCode;
    }

    public GrantPromotionToUserShrinkRequest setThirdPartyUserId(String thirdPartyUserId) {
        this.thirdPartyUserId = thirdPartyUserId;
        return this;
    }
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

    public GrantPromotionToUserShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

}
