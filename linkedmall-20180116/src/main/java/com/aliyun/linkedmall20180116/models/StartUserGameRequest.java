// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class StartUserGameRequest extends TeaModel {
    @NameInMap("AccountType")
    public String accountType;

    // 活动ID
    @NameInMap("ActivityId")
    public String activityId;

    // 业务ID
    @NameInMap("BizId")
    public String bizId;

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

    public static StartUserGameRequest build(java.util.Map<String, ?> map) throws Exception {
        StartUserGameRequest self = new StartUserGameRequest();
        return TeaModel.build(map, self);
    }

    public StartUserGameRequest setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public StartUserGameRequest setActivityId(String activityId) {
        this.activityId = activityId;
        return this;
    }
    public String getActivityId() {
        return this.activityId;
    }

    public StartUserGameRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public StartUserGameRequest setGameId(String gameId) {
        this.gameId = gameId;
        return this;
    }
    public String getGameId() {
        return this.gameId;
    }

    public StartUserGameRequest setRouteId(String routeId) {
        this.routeId = routeId;
        return this;
    }
    public String getRouteId() {
        return this.routeId;
    }

    public StartUserGameRequest setThirdPartyUserId(String thirdPartyUserId) {
        this.thirdPartyUserId = thirdPartyUserId;
        return this;
    }
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

    public StartUserGameRequest setUserApp(String userApp) {
        this.userApp = userApp;
        return this;
    }
    public String getUserApp() {
        return this.userApp;
    }

}
