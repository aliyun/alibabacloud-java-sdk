// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class JoinBoardResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Token")
    @Validation(required = true)
    public String token;

    @NameInMap("BoardId")
    @Validation(required = true)
    public String boardId;

    @NameInMap("TopicId")
    @Validation(required = true)
    public String topicId;

    @NameInMap("KeepaliveTopic")
    @Validation(required = true)
    public String keepaliveTopic;

    @NameInMap("KeepaliveInterval")
    @Validation(required = true)
    public Integer keepaliveInterval;

    public static JoinBoardResponse build(java.util.Map<String, ?> map) throws Exception {
        JoinBoardResponse self = new JoinBoardResponse();
        return TeaModel.build(map, self);
    }

    public JoinBoardResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public JoinBoardResponse setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public JoinBoardResponse setBoardId(String boardId) {
        this.boardId = boardId;
        return this;
    }
    public String getBoardId() {
        return this.boardId;
    }

    public JoinBoardResponse setTopicId(String topicId) {
        this.topicId = topicId;
        return this;
    }
    public String getTopicId() {
        return this.topicId;
    }

    public JoinBoardResponse setKeepaliveTopic(String keepaliveTopic) {
        this.keepaliveTopic = keepaliveTopic;
        return this;
    }
    public String getKeepaliveTopic() {
        return this.keepaliveTopic;
    }

    public JoinBoardResponse setKeepaliveInterval(Integer keepaliveInterval) {
        this.keepaliveInterval = keepaliveInterval;
        return this;
    }
    public Integer getKeepaliveInterval() {
        return this.keepaliveInterval;
    }

}
