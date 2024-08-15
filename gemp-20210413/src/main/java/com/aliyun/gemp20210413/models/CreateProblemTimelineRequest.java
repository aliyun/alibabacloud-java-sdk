// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CreateProblemTimelineRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>601FA6A2-AC5C-4B59-BE11-378FTOKENA11</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>test123</p>
     */
    @NameInMap("content")
    public String content;

    /**
     * <strong>example:</strong>
     * <p>NodeTest</p>
     */
    @NameInMap("keyNode")
    public String keyNode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>102</p>
     */
    @NameInMap("problemId")
    public Long problemId;

    /**
     * <strong>example:</strong>
     * <p>2021-06-06 12:11:22</p>
     */
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
