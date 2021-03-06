// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class UpdateProblemTimelineRequest extends TeaModel {
    // 时间节点id
    @NameInMap("problemTimelineId")
    public Long problemTimelineId;

    // 关键节点 码表:PROBLEM_KEY_NODE (逗号分隔)
    @NameInMap("keyNode")
    public String keyNode;

    // 节点内容
    @NameInMap("content")
    public String content;

    // 发生时间
    @NameInMap("time")
    public String time;

    // 故障id
    @NameInMap("problemId")
    public Long problemId;

    // clientToken
    @NameInMap("clientToken")
    public String clientToken;

    public static UpdateProblemTimelineRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProblemTimelineRequest self = new UpdateProblemTimelineRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProblemTimelineRequest setProblemTimelineId(Long problemTimelineId) {
        this.problemTimelineId = problemTimelineId;
        return this;
    }
    public Long getProblemTimelineId() {
        return this.problemTimelineId;
    }

    public UpdateProblemTimelineRequest setKeyNode(String keyNode) {
        this.keyNode = keyNode;
        return this;
    }
    public String getKeyNode() {
        return this.keyNode;
    }

    public UpdateProblemTimelineRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UpdateProblemTimelineRequest setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

    public UpdateProblemTimelineRequest setProblemId(Long problemId) {
        this.problemId = problemId;
        return this;
    }
    public Long getProblemId() {
        return this.problemId;
    }

    public UpdateProblemTimelineRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
