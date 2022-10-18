// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class QuerySessionStatusResponse extends TeaModel {
    @NameInMap("AccountId")
    @Validation(required = true)
    public String accountId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("DispatchTime")
    @Validation(required = true)
    public Long dispatchTime;

    @NameInMap("GameId")
    @Validation(required = true)
    public String gameId;

    @NameInMap("GameSession")
    @Validation(required = true)
    public String gameSession;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("PlayTime")
    @Validation(required = true)
    public Long playTime;

    @NameInMap("ProjectId")
    @Validation(required = true)
    public String projectId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Status")
    @Validation(required = true)
    public String status;

    @NameInMap("StopTime")
    @Validation(required = true)
    public Long stopTime;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("TenantId")
    @Validation(required = true)
    public Long tenantId;

    @NameInMap("UserLevel")
    @Validation(required = true)
    public Integer userLevel;

    public static QuerySessionStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySessionStatusResponse self = new QuerySessionStatusResponse();
        return TeaModel.build(map, self);
    }

    public QuerySessionStatusResponse setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public QuerySessionStatusResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySessionStatusResponse setDispatchTime(Long dispatchTime) {
        this.dispatchTime = dispatchTime;
        return this;
    }
    public Long getDispatchTime() {
        return this.dispatchTime;
    }

    public QuerySessionStatusResponse setGameId(String gameId) {
        this.gameId = gameId;
        return this;
    }
    public String getGameId() {
        return this.gameId;
    }

    public QuerySessionStatusResponse setGameSession(String gameSession) {
        this.gameSession = gameSession;
        return this;
    }
    public String getGameSession() {
        return this.gameSession;
    }

    public QuerySessionStatusResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySessionStatusResponse setPlayTime(Long playTime) {
        this.playTime = playTime;
        return this;
    }
    public Long getPlayTime() {
        return this.playTime;
    }

    public QuerySessionStatusResponse setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public QuerySessionStatusResponse setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public QuerySessionStatusResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySessionStatusResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QuerySessionStatusResponse setStopTime(Long stopTime) {
        this.stopTime = stopTime;
        return this;
    }
    public Long getStopTime() {
        return this.stopTime;
    }

    public QuerySessionStatusResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QuerySessionStatusResponse setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public QuerySessionStatusResponse setUserLevel(Integer userLevel) {
        this.userLevel = userLevel;
        return this;
    }
    public Integer getUserLevel() {
        return this.userLevel;
    }

}
