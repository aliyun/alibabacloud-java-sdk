// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class AddGameToProjectRequest extends TeaModel {
    // 项目ID
    @NameInMap("ProjectId")
    public String projectId;

    // 游戏iD
    @NameInMap("GameId")
    public String gameId;

    public static AddGameToProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        AddGameToProjectRequest self = new AddGameToProjectRequest();
        return TeaModel.build(map, self);
    }

    public AddGameToProjectRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public AddGameToProjectRequest setGameId(String gameId) {
        this.gameId = gameId;
        return this;
    }
    public String getGameId() {
        return this.gameId;
    }

}
