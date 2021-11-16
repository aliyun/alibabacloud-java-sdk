// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ReplayProblemRequest extends TeaModel {
    // 幂等校验token
    @NameInMap("clientToken")
    public String clientToken;

    // 故障ID
    @NameInMap("problemId")
    public Long problemId;

    // 复盘负责人ID
    @NameInMap("replayDutyUserId")
    public Long replayDutyUserId;

    public static ReplayProblemRequest build(java.util.Map<String, ?> map) throws Exception {
        ReplayProblemRequest self = new ReplayProblemRequest();
        return TeaModel.build(map, self);
    }

    public ReplayProblemRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ReplayProblemRequest setProblemId(Long problemId) {
        this.problemId = problemId;
        return this;
    }
    public Long getProblemId() {
        return this.problemId;
    }

    public ReplayProblemRequest setReplayDutyUserId(Long replayDutyUserId) {
        this.replayDutyUserId = replayDutyUserId;
        return this;
    }
    public Long getReplayDutyUserId() {
        return this.replayDutyUserId;
    }

}
