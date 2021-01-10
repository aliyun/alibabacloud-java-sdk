// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeBoardsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Boards")
    public java.util.List<DescribeBoardsResponseBodyBoards> boards;

    public static DescribeBoardsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBoardsResponseBody self = new DescribeBoardsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBoardsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBoardsResponseBody setBoards(java.util.List<DescribeBoardsResponseBodyBoards> boards) {
        this.boards = boards;
        return this;
    }
    public java.util.List<DescribeBoardsResponseBodyBoards> getBoards() {
        return this.boards;
    }

    public static class DescribeBoardsResponseBodyBoards extends TeaModel {
        @NameInMap("BoardId")
        public String boardId;

        @NameInMap("Topic")
        public String topic;

        @NameInMap("State")
        public Integer state;

        @NameInMap("UserId")
        public String userId;

        public static DescribeBoardsResponseBodyBoards build(java.util.Map<String, ?> map) throws Exception {
            DescribeBoardsResponseBodyBoards self = new DescribeBoardsResponseBodyBoards();
            return TeaModel.build(map, self);
        }

        public DescribeBoardsResponseBodyBoards setBoardId(String boardId) {
            this.boardId = boardId;
            return this;
        }
        public String getBoardId() {
            return this.boardId;
        }

        public DescribeBoardsResponseBodyBoards setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public DescribeBoardsResponseBodyBoards setState(Integer state) {
            this.state = state;
            return this;
        }
        public Integer getState() {
            return this.state;
        }

        public DescribeBoardsResponseBodyBoards setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
