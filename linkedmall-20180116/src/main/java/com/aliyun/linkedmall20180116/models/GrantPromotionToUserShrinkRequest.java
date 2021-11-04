// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class GrantPromotionToUserShrinkRequest extends TeaModel {
    // 业务ID
    @NameInMap("BizId")
    public String bizId;

    // 过期时间
    @NameInMap("ExpireSeconds")
    public Long expireSeconds;

    // 发放模式
    @NameInMap("GrantMode")
    public String grantMode;

    // 发放方式
    @NameInMap("GrantWay")
    public String grantWay;

    // 幂等ID
    @NameInMap("IdempotentId")
    public String idempotentId;

    // 优惠元数据ID
    @NameInMap("PromotionId")
    public String promotionId;

    // 安全码
    @NameInMap("SecurityCode")
    public String securityCode;

    // 用户ID
    @NameInMap("ThirdPartyUserId")
    public String thirdPartyUserId;

    // 扩展信息
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
