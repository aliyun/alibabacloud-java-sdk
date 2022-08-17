// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class QuerySessionStatusResponseBody extends TeaModel {
    @NameInMap("AccountId")
    public String accountId;

    @NameInMap("Code")
    public String code;

    @NameInMap("DispatchTime")
    public Long dispatchTime;

    @NameInMap("GameId")
    public String gameId;

    @NameInMap("GameSession")
    public String gameSession;

    @NameInMap("Message")
    public String message;

    @NameInMap("PlayTime")
    public Long playTime;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    @NameInMap("StopTime")
    public Long stopTime;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TenantId")
    public Long tenantId;

    @NameInMap("UserLevel")
    public Integer userLevel;

    public static QuerySessionStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySessionStatusResponseBody self = new QuerySessionStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySessionStatusResponseBody setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public QuerySessionStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySessionStatusResponseBody setDispatchTime(Long dispatchTime) {
        this.dispatchTime = dispatchTime;
        return this;
    }
    public Long getDispatchTime() {
        return this.dispatchTime;
    }

    public QuerySessionStatusResponseBody setGameId(String gameId) {
        this.gameId = gameId;
        return this;
    }
    public String getGameId() {
        return this.gameId;
    }

    public QuerySessionStatusResponseBody setGameSession(String gameSession) {
        this.gameSession = gameSession;
        return this;
    }
    public String getGameSession() {
        return this.gameSession;
    }

    public QuerySessionStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySessionStatusResponseBody setPlayTime(Long playTime) {
        this.playTime = playTime;
        return this;
    }
    public Long getPlayTime() {
        return this.playTime;
    }

    public QuerySessionStatusResponseBody setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public QuerySessionStatusResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public QuerySessionStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySessionStatusResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QuerySessionStatusResponseBody setStopTime(Long stopTime) {
        this.stopTime = stopTime;
        return this;
    }
    public Long getStopTime() {
        return this.stopTime;
    }

    public QuerySessionStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QuerySessionStatusResponseBody setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public QuerySessionStatusResponseBody setUserLevel(Integer userLevel) {
        this.userLevel = userLevel;
        return this;
    }
    public Integer getUserLevel() {
        return this.userLevel;
    }

}
