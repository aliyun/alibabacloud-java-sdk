// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class SetGameHangResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Duration")
    public Long duration;

    @NameInMap("GameSession")
    public String gameSession;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StartHangTimestamp")
    public Long startHangTimestamp;

    @NameInMap("Success")
    public Boolean success;

    public static SetGameHangResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetGameHangResponseBody self = new SetGameHangResponseBody();
        return TeaModel.build(map, self);
    }

    public SetGameHangResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SetGameHangResponseBody setDuration(Long duration) {
        this.duration = duration;
        return this;
    }
    public Long getDuration() {
        return this.duration;
    }

    public SetGameHangResponseBody setGameSession(String gameSession) {
        this.gameSession = gameSession;
        return this;
    }
    public String getGameSession() {
        return this.gameSession;
    }

    public SetGameHangResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SetGameHangResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetGameHangResponseBody setStartHangTimestamp(Long startHangTimestamp) {
        this.startHangTimestamp = startHangTimestamp;
        return this;
    }
    public Long getStartHangTimestamp() {
        return this.startHangTimestamp;
    }

    public SetGameHangResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
