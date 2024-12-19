// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class StartUserGameShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ANONY</p>
     */
    @NameInMap("AccountType")
    public String accountType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>671091829240653825</p>
     */
    @NameInMap("ActivityId")
    public String activityId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LMALL20288*****003</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <strong>example:</strong>
     * <p>{\&quot;channelId\&quot;:\&quot;test\&quot;}</p>
     */
    @NameInMap("ExtInfo")
    public String extInfoShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>673474835708274689</p>
     */
    @NameInMap("GameId")
    public String gameId;

    /**
     * <strong>example:</strong>
     * <p>RouteId1</p>
     */
    @NameInMap("RouteId")
    public String routeId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("ThirdPartyUserId")
    public String thirdPartyUserId;

    /**
     * <strong>example:</strong>
     * <p>MAC</p>
     */
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
