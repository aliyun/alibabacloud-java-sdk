// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class GetGameCcuRequest extends TeaModel {
    @NameInMap("AccessKey")
    @Validation(required = true)
    public String accessKey;

    @NameInMap("GameId")
    @Validation(required = true)
    public String gameId;

    @NameInMap("RegionName")
    public String regionName;

    public static GetGameCcuRequest build(java.util.Map<String, ?> map) throws Exception {
        GetGameCcuRequest self = new GetGameCcuRequest();
        return TeaModel.build(map, self);
    }

    public GetGameCcuRequest setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }
    public String getAccessKey() {
        return this.accessKey;
    }

    public GetGameCcuRequest setGameId(String gameId) {
        this.gameId = gameId;
        return this;
    }
    public String getGameId() {
        return this.gameId;
    }

    public GetGameCcuRequest setRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }
    public String getRegionName() {
        return this.regionName;
    }

}
