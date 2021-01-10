// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class JoinBoardResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Token")
    public String token;

    @NameInMap("BoardId")
    public String boardId;

    @NameInMap("TopicId")
    public String topicId;

    @NameInMap("KeepaliveTopic")
    public String keepaliveTopic;

    @NameInMap("KeepaliveInterval")
    public Integer keepaliveInterval;

    public static JoinBoardResponseBody build(java.util.Map<String, ?> map) throws Exception {
        JoinBoardResponseBody self = new JoinBoardResponseBody();
        return TeaModel.build(map, self);
    }

    public JoinBoardResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public JoinBoardResponseBody setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public JoinBoardResponseBody setBoardId(String boardId) {
        this.boardId = boardId;
        return this;
    }
    public String getBoardId() {
        return this.boardId;
    }

    public JoinBoardResponseBody setTopicId(String topicId) {
        this.topicId = topicId;
        return this;
    }
    public String getTopicId() {
        return this.topicId;
    }

    public JoinBoardResponseBody setKeepaliveTopic(String keepaliveTopic) {
        this.keepaliveTopic = keepaliveTopic;
        return this;
    }
    public String getKeepaliveTopic() {
        return this.keepaliveTopic;
    }

    public JoinBoardResponseBody setKeepaliveInterval(Integer keepaliveInterval) {
        this.keepaliveInterval = keepaliveInterval;
        return this;
    }
    public Integer getKeepaliveInterval() {
        return this.keepaliveInterval;
    }

}
