// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class GetActivityGameInfoShrinkRequest extends TeaModel {
    @NameInMap("AccountType")
    public String accountType;

    @NameInMap("ActivityId")
    public String activityId;

    @NameInMap("BizId")
    public String bizId;

    @NameInMap("ExtInfo")
    public String extInfoShrink;

    @NameInMap("GameId")
    public String gameId;

    @NameInMap("ThirdPartyUserId")
    public String thirdPartyUserId;

    public static GetActivityGameInfoShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetActivityGameInfoShrinkRequest self = new GetActivityGameInfoShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetActivityGameInfoShrinkRequest setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public GetActivityGameInfoShrinkRequest setActivityId(String activityId) {
        this.activityId = activityId;
        return this;
    }
    public String getActivityId() {
        return this.activityId;
    }

    public GetActivityGameInfoShrinkRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public GetActivityGameInfoShrinkRequest setExtInfoShrink(String extInfoShrink) {
        this.extInfoShrink = extInfoShrink;
        return this;
    }
    public String getExtInfoShrink() {
        return this.extInfoShrink;
    }

    public GetActivityGameInfoShrinkRequest setGameId(String gameId) {
        this.gameId = gameId;
        return this;
    }
    public String getGameId() {
        return this.gameId;
    }

    public GetActivityGameInfoShrinkRequest setThirdPartyUserId(String thirdPartyUserId) {
        this.thirdPartyUserId = thirdPartyUserId;
        return this;
    }
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

}
