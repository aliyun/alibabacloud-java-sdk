// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class AddGameToProjectRequest extends TeaModel {
    @NameInMap("GameId")
    public String gameId;

    @NameInMap("ProjectId")
    public String projectId;

    public static AddGameToProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        AddGameToProjectRequest self = new AddGameToProjectRequest();
        return TeaModel.build(map, self);
    }

    public AddGameToProjectRequest setGameId(String gameId) {
        this.gameId = gameId;
        return this;
    }
    public String getGameId() {
        return this.gameId;
    }

    public AddGameToProjectRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
