// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ListUserGameProcessRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("ThirdPartyUserId")
    public String thirdPartyUserId;

    @NameInMap("AccountType")
    public String accountType;

    @NameInMap("ActivityId")
    public String activityId;

    @NameInMap("GameId")
    public String gameId;

    @NameInMap("Status")
    public String status;

    @NameInMap("Type")
    public String type;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    public static ListUserGameProcessRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserGameProcessRequest self = new ListUserGameProcessRequest();
        return TeaModel.build(map, self);
    }

    public ListUserGameProcessRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ListUserGameProcessRequest setThirdPartyUserId(String thirdPartyUserId) {
        this.thirdPartyUserId = thirdPartyUserId;
        return this;
    }
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

    public ListUserGameProcessRequest setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public ListUserGameProcessRequest setActivityId(String activityId) {
        this.activityId = activityId;
        return this;
    }
    public String getActivityId() {
        return this.activityId;
    }

    public ListUserGameProcessRequest setGameId(String gameId) {
        this.gameId = gameId;
        return this;
    }
    public String getGameId() {
        return this.gameId;
    }

    public ListUserGameProcessRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListUserGameProcessRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ListUserGameProcessRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListUserGameProcessRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

}
