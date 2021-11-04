// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ListActivityAtmosphereRequest extends TeaModel {
    @NameInMap("AccountType")
    public String accountType;

    @NameInMap("ActivityId")
    public String activityId;

    @NameInMap("BizId")
    public String bizId;

    @NameInMap("GameId")
    public String gameId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Status")
    public String status;

    @NameInMap("ThirdPartyUserId")
    public String thirdPartyUserId;

    public static ListActivityAtmosphereRequest build(java.util.Map<String, ?> map) throws Exception {
        ListActivityAtmosphereRequest self = new ListActivityAtmosphereRequest();
        return TeaModel.build(map, self);
    }

    public ListActivityAtmosphereRequest setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public ListActivityAtmosphereRequest setActivityId(String activityId) {
        this.activityId = activityId;
        return this;
    }
    public String getActivityId() {
        return this.activityId;
    }

    public ListActivityAtmosphereRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ListActivityAtmosphereRequest setGameId(String gameId) {
        this.gameId = gameId;
        return this;
    }
    public String getGameId() {
        return this.gameId;
    }

    public ListActivityAtmosphereRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListActivityAtmosphereRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListActivityAtmosphereRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListActivityAtmosphereRequest setThirdPartyUserId(String thirdPartyUserId) {
        this.thirdPartyUserId = thirdPartyUserId;
        return this;
    }
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

}
