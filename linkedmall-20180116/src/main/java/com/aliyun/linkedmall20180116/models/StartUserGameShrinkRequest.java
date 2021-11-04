// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class StartUserGameShrinkRequest extends TeaModel {
    @NameInMap("AccountType")
    public String accountType;

    // 活动ID
    @NameInMap("ActivityId")
    public String activityId;

    // 业务ID
    @NameInMap("BizId")
    public String bizId;

    // 扩展信息
    @NameInMap("ExtInfo")
    public String extInfoShrink;

    // 玩法ID
    @NameInMap("GameId")
    public String gameId;

    // 路线ID
    @NameInMap("RouteId")
    public String routeId;

    // 业务方用户ID
    @NameInMap("ThirdPartyUserId")
    public String thirdPartyUserId;

    // 用户APP
    @NameInMap("UserApp")
    public String userApp;

    public static StartUserGameShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        StartUserGameShrinkRequest self = new StartUserGameShrinkRequest();
        return TeaModel.build(map, self);
    }

    public StartUserGameShrinkRequest setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public StartUserGameShrinkRequest setActivityId(String activityId) {
        this.activityId = activityId;
        return this;
    }
    public String getActivityId() {
        return this.activityId;
    }

    public StartUserGameShrinkRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public StartUserGameShrinkRequest setExtInfoShrink(String extInfoShrink) {
        this.extInfoShrink = extInfoShrink;
        return this;
    }
    public String getExtInfoShrink() {
        return this.extInfoShrink;
    }

    public StartUserGameShrinkRequest setGameId(String gameId) {
        this.gameId = gameId;
        return this;
    }
    public String getGameId() {
        return this.gameId;
    }

    public StartUserGameShrinkRequest setRouteId(String routeId) {
        this.routeId = routeId;
        return this;
    }
    public String getRouteId() {
        return this.routeId;
    }

    public StartUserGameShrinkRequest setThirdPartyUserId(String thirdPartyUserId) {
        this.thirdPartyUserId = thirdPartyUserId;
        return this;
    }
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

    public StartUserGameShrinkRequest setUserApp(String userApp) {
        this.userApp = userApp;
        return this;
    }
    public String getUserApp() {
        return this.userApp;
    }

}
