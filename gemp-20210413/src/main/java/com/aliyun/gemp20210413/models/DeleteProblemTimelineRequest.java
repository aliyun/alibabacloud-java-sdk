// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class DeleteProblemTimelineRequest extends TeaModel {
    // clientToken
    @NameInMap("clientToken")
    public String clientToken;

    // 故障id
    @NameInMap("problemId")
    public Long problemId;

    // ID
    @NameInMap("problemTimelineId")
    public Long problemTimelineId;

    public static DeleteProblemTimelineRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteProblemTimelineRequest self = new DeleteProblemTimelineRequest();
        return TeaModel.build(map, self);
    }

    public DeleteProblemTimelineRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteProblemTimelineRequest setProblemId(Long problemId) {
        this.problemId = problemId;
        return this;
    }
    public Long getProblemId() {
        return this.problemId;
    }

    public DeleteProblemTimelineRequest setProblemTimelineId(Long problemTimelineId) {
        this.problemTimelineId = problemTimelineId;
        return this;
    }
    public Long getProblemTimelineId() {
        return this.problemTimelineId;
    }

}
