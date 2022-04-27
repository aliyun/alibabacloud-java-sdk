// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class QueryGameHangResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Duration")
    public Long duration;

    @NameInMap("GameSession")
    public String gameSession;

    @NameInMap("Hanging")
    public Boolean hanging;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StartHangTimestamp")
    public Long startHangTimestamp;

    @NameInMap("Success")
    public Boolean success;

    public static QueryGameHangResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryGameHangResponseBody self = new QueryGameHangResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryGameHangResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryGameHangResponseBody setDuration(Long duration) {
        this.duration = duration;
        return this;
    }
    public Long getDuration() {
        return this.duration;
    }

    public QueryGameHangResponseBody setGameSession(String gameSession) {
        this.gameSession = gameSession;
        return this;
    }
    public String getGameSession() {
        return this.gameSession;
    }

    public QueryGameHangResponseBody setHanging(Boolean hanging) {
        this.hanging = hanging;
        return this;
    }
    public Boolean getHanging() {
        return this.hanging;
    }

    public QueryGameHangResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryGameHangResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryGameHangResponseBody setStartHangTimestamp(Long startHangTimestamp) {
        this.startHangTimestamp = startHangTimestamp;
        return this;
    }
    public Long getStartHangTimestamp() {
        return this.startHangTimestamp;
    }

    public QueryGameHangResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
