// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class GrantPromotionToUserRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LMALL20211118****</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <strong>example:</strong>
     * <p>2554265</p>
     */
    @NameInMap("ExpireSeconds")
    public Long expireSeconds;

    /**
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("GrantMode")
    public String grantMode;

    /**
     * <strong>example:</strong>
     * <p>latour2</p>
     */
    @NameInMap("GrantWay")
    public String grantWay;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20211212211381431746-1202</p>
     */
    @NameInMap("IdempotentId")
    public String idempotentId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>66482394364783****</p>
     */
    @NameInMap("PromotionId")
    public String promotionId;

    /**
     * <strong>example:</strong>
     * <p>6aa6ea6af00b453eafc3128d41858bf6</p>
     */
    @NameInMap("SecurityCode")
    public String securityCode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ThirdPartyUserId")
    public String thirdPartyUserId;

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

    public GrantPromotionToUserRequest setExpireSeconds(Long expireSeconds) {
        this.expireSeconds = expireSeconds;
        return this;
    }
    public Long getExpireSeconds() {
        return this.expireSeconds;
    }

    public GrantPromotionToUserRequest setGrantMode(String grantMode) {
        this.grantMode = grantMode;
        return this;
    }
    public String getGrantMode() {
        return this.grantMode;
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

    public GrantPromotionToUserRequest setThirdPartyUserId(String thirdPartyUserId) {
        this.thirdPartyUserId = thirdPartyUserId;
        return this;
    }
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

    public GrantPromotionToUserRequest setBody(java.util.Map<String, ?> body) {
        this.body = body;
        return this;
    }
    public java.util.Map<String, ?> getBody() {
        return this.body;
    }

}
