// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class GetUserTokenPageRequest extends TeaModel {
    // 业务ID
    @NameInMap("BizId")
    public String bizId;

    // 业务方用户ID
    @NameInMap("ThirdPartyUserId")
    public String thirdPartyUserId;

    // 用户昵称
    @NameInMap("UserNick")
    public String userNick;

    // 过期时间
    @NameInMap("ExpireSeconds")
    public Long expireSeconds;

    // 扩展信息
    @NameInMap("ExtJson")
    public String extJson;

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

}
