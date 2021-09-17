// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class GrantPromotionToUserRequest extends TeaModel {
    // 业务ID
    @NameInMap("BizId")
    public String bizId;

    // 用户ID
    @NameInMap("ThirdPartyUserId")
    public String thirdPartyUserId;

    // 优惠元数据ID
    @NameInMap("PromotionId")
    public String promotionId;

    // 安全码
    @NameInMap("SecurityCode")
    public String securityCode;

    // 过期时间
    @NameInMap("ExpireSeconds")
    public Long expireSeconds;

    // 发放方式
    @NameInMap("GrantWay")
    public String grantWay;

    // 幂等ID
    @NameInMap("IdempotentId")
    public String idempotentId;

    // 发放模式
    @NameInMap("GrantMode")
    public String grantMode;

    // 扩展信息
    @NameInMap("body")
    public java.util.Map<String, ?> body;

    public static GrantPromotionToUserRequest build(java.util.Map<String, ?> map) throws Exception {
        GrantPromotionToUserRequest self = new GrantPromotionToUserRequest();
        return TeaModel.build(map, self);
    }

    public GrantPromotionToUserRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public GrantPromotionToUserRequest setThirdPartyUserId(String thirdPartyUserId) {
        this.thirdPartyUserId = thirdPartyUserId;
        return this;
    }
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

    public GrantPromotionToUserRequest setPromotionId(String promotionId) {
        this.promotionId = promotionId;
        return this;
    }
    public String getPromotionId() {
        return this.promotionId;
    }

    public GrantPromotionToUserRequest setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
        return this;
    }
    public String getSecurityCode() {
        return this.securityCode;
    }

    public GrantPromotionToUserRequest setExpireSeconds(Long expireSeconds) {
        this.expireSeconds = expireSeconds;
        return this;
    }
    public Long getExpireSeconds() {
        return this.expireSeconds;
    }

    public GrantPromotionToUserRequest setGrantWay(String grantWay) {
        this.grantWay = grantWay;
        return this;
    }
    public String getGrantWay() {
        return this.grantWay;
    }

    public GrantPromotionToUserRequest setIdempotentId(String idempotentId) {
        this.idempotentId = idempotentId;
        return this;
    }
    public String getIdempotentId() {
        return this.idempotentId;
    }

    public GrantPromotionToUserRequest setGrantMode(String grantMode) {
        this.grantMode = grantMode;
        return this;
    }
    public String getGrantMode() {
        return this.grantMode;
    }

    public GrantPromotionToUserRequest setBody(java.util.Map<String, ?> body) {
        this.body = body;
        return this;
    }
    public java.util.Map<String, ?> getBody() {
        return this.body;
    }

}
