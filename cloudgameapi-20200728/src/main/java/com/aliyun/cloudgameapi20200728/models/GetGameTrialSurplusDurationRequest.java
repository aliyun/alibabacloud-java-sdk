// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class GetGameTrialSurplusDurationRequest extends TeaModel {
    // 账号ID
    @NameInMap("AccountId")
    public String accountId;

    // 游戏ID
    @NameInMap("GameId")
    public String gameId;

    // 项目ID
    @NameInMap("ProjectId")
    public String projectId;

    public static GetGameTrialSurplusDurationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetGameTrialSurplusDurationRequest self = new GetGameTrialSurplusDurationRequest();
        return TeaModel.build(map, self);
    }

    public GetGameTrialSurplusDurationRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public GetGameTrialSurplusDurationRequest setGameId(String gameId) {
        this.gameId = gameId;
        return this;
    }
    public String getGameId() {
        return this.gameId;
    }

    public GetGameTrialSurplusDurationRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
