// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CreateProblemTimelineRequest extends TeaModel {
    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("content")
    public String content;

    @NameInMap("keyNode")
    public String keyNode;

    @NameInMap("problemId")
    public Long problemId;

    @NameInMap("time")
    public String time;

    public static CreateProblemTimelineRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProblemTimelineRequest self = new CreateProblemTimelineRequest();
        return TeaModel.build(map, self);
    }

    public CreateProblemTimelineRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateProblemTimelineRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateProblemTimelineRequest setKeyNode(String keyNode) {
        this.keyNode = keyNode;
        return this;
    }
    public String getKeyNode() {
        return this.keyNode;
    }

    public CreateProblemTimelineRequest setProblemId(Long problemId) {
        this.problemId = problemId;
        return this;
    }
    public Long getProblemId() {
        return this.problemId;
    }

    public CreateProblemTimelineRequest setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

}
