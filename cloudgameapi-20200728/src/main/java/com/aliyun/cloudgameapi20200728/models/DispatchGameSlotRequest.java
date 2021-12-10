// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class DispatchGameSlotRequest extends TeaModel {
    @NameInMap("AccessKey")
    public String accessKey;

    @NameInMap("BizParam")
    public String bizParam;

    @NameInMap("Cancel")
    public Boolean cancel;

    @NameInMap("ClientIp")
    public String clientIp;

    @NameInMap("GameCommand")
    public String gameCommand;

    @NameInMap("GameId")
    public String gameId;

    @NameInMap("GameSession")
    public String gameSession;

    @NameInMap("GameStartParam")
    public String gameStartParam;

    @NameInMap("Reconnect")
    public Boolean reconnect;

    @NameInMap("RegionName")
    public String regionName;

    @NameInMap("SystemInfo")
    public String systemInfo;

    @NameInMap("Tags")
    public String tags;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("UserLevel")
    public Integer userLevel;

    public static DispatchGameSlotRequest build(java.util.Map<String, ?> map) throws Exception {
        DispatchGameSlotRequest self = new DispatchGameSlotRequest();
        return TeaModel.build(map, self);
    }

    public DispatchGameSlotRequest setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }
    public String getAccessKey() {
        return this.accessKey;
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

    public DispatchGameSlotRequest setClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }
    public String getClientIp() {
        return this.clientIp;
    }

    public DispatchGameSlotRequest setGameCommand(String gameCommand) {
        this.gameCommand = gameCommand;
        return this;
    }
    public String getGameCommand() {
        return this.gameCommand;
    }

    public DispatchGameSlotRequest setGameId(String gameId) {
        this.gameId = gameId;
        return this;
    }
    public String getGameId() {
        return this.gameId;
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

    public DispatchGameSlotRequest setReconnect(Boolean reconnect) {
        this.reconnect = reconnect;
        return this;
    }
    public Boolean getReconnect() {
        return this.reconnect;
    }

    public DispatchGameSlotRequest setRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }
    public String getRegionName() {
        return this.regionName;
    }

    public DispatchGameSlotRequest setSystemInfo(String systemInfo) {
        this.systemInfo = systemInfo;
        return this;
    }
    public String getSystemInfo() {
        return this.systemInfo;
    }

    public DispatchGameSlotRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public DispatchGameSlotRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public DispatchGameSlotRequest setUserLevel(Integer userLevel) {
        this.userLevel = userLevel;
        return this;
    }
    public Integer getUserLevel() {
        return this.userLevel;
    }

}
