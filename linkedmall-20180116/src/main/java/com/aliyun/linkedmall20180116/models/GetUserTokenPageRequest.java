// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class GetUserTokenPageRequest extends TeaModel {
    @NameInMap("BizId")
    @Validation(required = true)
    public String bizId;

    @NameInMap("ExpireSeconds")
    @Validation(required = true)
    public Long expireSeconds;

    @NameInMap("ExtJson")
    public String extJson;

    @NameInMap("ThirdPartyUserId")
    @Validation(required = true)
    public String thirdPartyUserId;

    @NameInMap("UserNick")
    public String userNick;

    public static GetUserTokenPageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserTokenPageRequest self = new GetUserTokenPageRequest();
        return TeaModel.build(map, self);
    }

    public GetUserTokenPageRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public GetUserTokenPageRequest setExpireSeconds(Long expireSeconds) {
        this.expireSeconds = expireSeconds;
        return this;
    }
    public Long getExpireSeconds() {
        return this.expireSeconds;
    }

    public GetUserTokenPageRequest setExtJson(String extJson) {
        this.extJson = extJson;
        return this;
    }
    public String getExtJson() {
        return this.extJson;
    }

    public GetUserTokenPageRequest setThirdPartyUserId(String thirdPartyUserId) {
        this.thirdPartyUserId = thirdPartyUserId;
        return this;
    }
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

    public GetUserTokenPageRequest setUserNick(String userNick) {
        this.userNick = userNick;
        return this;
    }
    public String getUserNick() {
        return this.userNick;
    }

}
