// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeBoardsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Boards")
    @Validation(required = true)
    public java.util.List<DescribeBoardsResponseBoards> boards;

    public static DescribeBoardsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBoardsResponse self = new DescribeBoardsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBoardsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBoardsResponse setBoards(java.util.List<DescribeBoardsResponseBoards> boards) {
        this.boards = boards;
        return this;
    }
    public java.util.List<DescribeBoardsResponseBoards> getBoards() {
        return this.boards;
    }

    public static class DescribeBoardsResponseBoards extends TeaModel {
        @NameInMap("BoardId")
        @Validation(required = true)
        public String boardId;

        @NameInMap("Topic")
        @Validation(required = true)
        public String topic;

        @NameInMap("State")
        @Validation(required = true)
        public Integer state;

        @NameInMap("UserId")
        @Validation(required = true)
        public String userId;

        public static DescribeBoardsResponseBoards build(java.util.Map<String, ?> map) throws Exception {
            DescribeBoardsResponseBoards self = new DescribeBoardsResponseBoards();
            return TeaModel.build(map, self);
        }

        public DescribeBoardsResponseBoards setBoardId(String boardId) {
            this.boardId = boardId;
            return this;
        }
        public String getBoardId() {
            return this.boardId;
        }

        public DescribeBoardsResponseBoards setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public DescribeBoardsResponseBoards setState(Integer state) {
            this.state = state;
            return this;
        }
        public Integer getState() {
            return this.state;
        }

        public DescribeBoardsResponseBoards setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
