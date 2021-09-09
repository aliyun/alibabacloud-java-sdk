// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class SkipTrialPolicyRequest extends TeaModel {
    @NameInMap("GameSessionId")
    @Validation(required = true)
    public String gameSessionId;

    public static SkipTrialPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        SkipTrialPolicyRequest self = new SkipTrialPolicyRequest();
        return TeaModel.build(map, self);
    }

    public SkipTrialPolicyRequest setGameSessionId(String gameSessionId) {
        this.gameSessionId = gameSessionId;
        return this;
    }
    public String getGameSessionId() {
        return this.gameSessionId;
    }

}
