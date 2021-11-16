// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CreateProblemTimelinesRequest extends TeaModel {
    // clientToken
    @NameInMap("clientToken")
    public String clientToken;

    // 故障id
    @NameInMap("problemId")
    public Long problemId;

    // 时间线节点
    @NameInMap("timelineNodes")
    public String timelineNodes;

    public static CreateProblemTimelinesRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProblemTimelinesRequest self = new CreateProblemTimelinesRequest();
        return TeaModel.build(map, self);
    }

    public CreateProblemTimelinesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateProblemTimelinesRequest setProblemId(Long problemId) {
        this.problemId = problemId;
        return this;
    }
    public Long getProblemId() {
        return this.problemId;
    }

    public CreateProblemTimelinesRequest setTimelineNodes(String timelineNodes) {
        this.timelineNodes = timelineNodes;
        return this;
    }
    public String getTimelineNodes() {
        return this.timelineNodes;
    }

}
