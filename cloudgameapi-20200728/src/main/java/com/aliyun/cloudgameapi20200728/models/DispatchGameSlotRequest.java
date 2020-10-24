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

    @NameInMap("SystemInfo")
    @Validation(required = true)
    public String systemInfo;

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

    public DispatchGameSlotRequest setSystemInfo(String systemInfo) {
        this.systemInfo = systemInfo;
        return this;
    }
    public String getSystemInfo() {
        return this.systemInfo;
    }

}
