// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class CreateGameRequest extends TeaModel {
    @NameInMap("ClientToken")
    @Validation(required = true)
    public String clientToken;

    @NameInMap("GameName")
    @Validation(required = true)
    public String gameName;

    @NameInMap("PlatformType")
    @Validation(required = true)
    public Long platformType;

    public static CreateGameRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGameRequest self = new CreateGameRequest();
        return TeaModel.build(map, self);
    }

    public CreateGameRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateGameRequest setGameName(String gameName) {
        this.gameName = gameName;
        return this;
    }
    public String getGameName() {
        return this.gameName;
    }

    public CreateGameRequest setPlatformType(Long platformType) {
        this.platformType = platformType;
        return this;
    }
    public Long getPlatformType() {
        return this.platformType;
    }

}
