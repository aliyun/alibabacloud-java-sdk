// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CreateProblemTimelineRequest extends TeaModel {
    // 故障id
    @NameInMap("problemId")
    public Long problemId;

    // 关键节点 码表:PROBLEM_KEY_NODE (逗号分隔)
    @NameInMap("keyNode")
    public String keyNode;

    // 节点内容
    @NameInMap("content")
    public String content;

    // 发生时间
    @NameInMap("time")
    public String time;

    // clientToken
    @NameInMap("clientToken")
    public String clientToken;

    public static CreateProblemTimelineRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProblemTimelineRequest self = new CreateProblemTimelineRequest();
        return TeaModel.build(map, self);
    }

    public CreateProblemTimelineRequest setProblemId(Long problemId) {
        this.problemId = problemId;
        return this;
    }
    public Long getProblemId() {
        return this.problemId;
    }

    public CreateProblemTimelineRequest setKeyNode(String keyNode) {
        this.keyNode = keyNode;
        return this;
    }
    public String getKeyNode() {
        return this.keyNode;
    }

    public CreateProblemTimelineRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateProblemTimelineRequest setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

    public CreateProblemTimelineRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
