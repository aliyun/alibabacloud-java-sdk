// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class DispatchGameSlotRequest extends TeaModel {
    @NameInMap("GameId")
    @Validation(required = true)
    public String gameId;

    @NameInMap("AccessKey")
    @Validation(required = true)
    public String accessKey;

    @NameInMap("RegionName")
    public String regionName;

    @NameInMap("UserId")
    @Validation(required = true)
    public String userId;

    @NameInMap("BizParam")
    public String bizParam;

    @NameInMap("Cancel")
    public Boolean cancel;

    @NameInMap("GameSession")
    public String gameSession;

    @NameInMap("GameStartParam")
    public String gameStartParam;

    @NameInMap("GameCommand")
    public String gameCommand;

    @NameInMap("SystemInfo")
    public String systemInfo;

    @NameInMap("ClientIp")
    public String clientIp;

    public static DispatchGameSlotRequest build(java.util.Map<String, ?> map) throws Exception {
        DispatchGameSlotRequest self = new DispatchGameSlotRequest();
        return TeaModel.build(map, self);
    }

    public DispatchGameSlotRequest setGameId(String gameId) {
        this.gameId = gameId;
        return this;
    }
    public String getGameId() {
        return this.gameId;
    }

    public DispatchGameSlotRequest setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }
    public String getAccessKey() {
        return this.accessKey;
    }

    public DispatchGameSlotRequest setRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }
    public String getRegionName() {
        return this.regionName;
    }

    public DispatchGameSlotRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public DispatchGameSlotRequest setBizParam(String bizParam) {
        this.bizParam = bizParam;
        return this;
    }
    public String getBizParam() {
        return this.bizParam;
    }

    public DispatchGameSlotRequest setCancel(Boolean cancel) {
        this.cancel = cancel;
        return this;
    }
    public Boolean getCancel() {
        return this.cancel;
    }

    public DispatchGameSlotRequest setGameSession(String gameSession) {
        this.gameSession = gameSession;
        return this;
    }
    public String getGameSession() {
        return this.gameSession;
    }

    public DispatchGameSlotRequest setGameStartParam(String gameStartParam) {
        this.gameStartParam = gameStartParam;
        return this;
    }
    public String getGameStartParam() {
        return this.gameStartParam;
    }

    public DispatchGameSlotRequest setGameCommand(String gameCommand) {
        this.gameCommand = gameCommand;
        return this;
    }
    public String getGameCommand() {
        return this.gameCommand;
    }

    public DispatchGameSlotRequest setSystemInfo(String systemInfo) {
        this.systemInfo = systemInfo;
        return this;
    }
    public String getSystemInfo() {
        return this.systemInfo;
    }

    public DispatchGameSlotRequest setClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }
    public String getClientIp() {
        return this.clientIp;
    }

}
