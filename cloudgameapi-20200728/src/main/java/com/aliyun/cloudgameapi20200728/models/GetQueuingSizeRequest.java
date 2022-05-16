// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class GetQueuingSizeRequest extends TeaModel {
    @NameInMap("GameId")
    public String gameId;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("UserLevel")
    public Integer userLevel;

    public static GetQueuingSizeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetQueuingSizeRequest self = new GetQueuingSizeRequest();
        return TeaModel.build(map, self);
    }

    public GetQueuingSizeRequest setGameId(String gameId) {
        this.gameId = gameId;
        return this;
    }
    public String getGameId() {
        return this.gameId;
    }

    public GetQueuingSizeRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public GetQueuingSizeRequest setUserLevel(Integer userLevel) {
        this.userLevel = userLevel;
        return this;
    }
    public Integer getUserLevel() {
        return this.userLevel;
    }

}
