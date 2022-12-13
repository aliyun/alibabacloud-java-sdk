// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class UpdateProblemTimelineRequest extends TeaModel {
    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("content")
    public String content;

    @NameInMap("keyNode")
    public String keyNode;

    @NameInMap("problemId")
    public Long problemId;

    @NameInMap("problemTimelineId")
    public Long problemTimelineId;

    @NameInMap("time")
    public String time;

    public static UpdateProblemTimelineRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProblemTimelineRequest self = new UpdateProblemTimelineRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProblemTimelineRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateProblemTimelineRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UpdateProblemTimelineRequest setKeyNode(String keyNode) {
        this.keyNode = keyNode;
        return this;
    }
    public String getKeyNode() {
        return this.keyNode;
    }

    public UpdateProblemTimelineRequest setProblemId(Long problemId) {
        this.problemId = problemId;
        return this;
    }
    public Long getProblemId() {
        return this.problemId;
    }

    public UpdateProblemTimelineRequest setProblemTimelineId(Long problemTimelineId) {
        this.problemTimelineId = problemTimelineId;
        return this;
    }
    public Long getProblemTimelineId() {
        return this.problemTimelineId;
    }

    public UpdateProblemTimelineRequest setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

}
