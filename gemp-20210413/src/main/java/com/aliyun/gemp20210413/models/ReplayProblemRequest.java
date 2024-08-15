// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ReplayProblemRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>4361a0e1-6747-4834-96ce-0c4840fd3212</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("problemId")
    public Long problemId;

    /**
     * <strong>example:</strong>
     * <p>3123</p>
     */
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
