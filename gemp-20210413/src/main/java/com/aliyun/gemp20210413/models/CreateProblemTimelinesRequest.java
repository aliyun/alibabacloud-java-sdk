// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CreateProblemTimelinesRequest extends TeaModel {
    /**
     * <p>clientToken</p>
     * 
     * <strong>example:</strong>
     * <p>e0b6735e-1a04-4d6b-a625-d2350612492c</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>423</p>
     */
    @NameInMap("problemId")
    public Long problemId;

    /**
     * <strong>example:</strong>
     * <p>2018-01-01 18:01，谁做了什么事情\n2018-01-01 18:01，谁做了什么事情\n2018-01-01 18:01，谁做了什么事情</p>
     */
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
