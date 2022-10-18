// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class SetGameHangResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Duration")
    @Validation(required = true)
    public Long duration;

    @NameInMap("GameSession")
    @Validation(required = true)
    public String gameSession;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("StartHangTimestamp")
    @Validation(required = true)
    public Long startHangTimestamp;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    public static SetGameHangResponse build(java.util.Map<String, ?> map) throws Exception {
        SetGameHangResponse self = new SetGameHangResponse();
        return TeaModel.build(map, self);
    }

    public SetGameHangResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SetGameHangResponse setDuration(Long duration) {
        this.duration = duration;
        return this;
    }
    public Long getDuration() {
        return this.duration;
    }

    public SetGameHangResponse setGameSession(String gameSession) {
        this.gameSession = gameSession;
        return this;
    }
    public String getGameSession() {
        return this.gameSession;
    }

    public SetGameHangResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SetGameHangResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetGameHangResponse setStartHangTimestamp(Long startHangTimestamp) {
        this.startHangTimestamp = startHangTimestamp;
        return this;
    }
    public Long getStartHangTimestamp() {
        return this.startHangTimestamp;
    }

    public SetGameHangResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
