// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateBoardResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("BoardId")
    @Validation(required = true)
    public String boardId;

    public static CreateBoardResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBoardResponse self = new CreateBoardResponse();
        return TeaModel.build(map, self);
    }

    public CreateBoardResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateBoardResponse setBoardId(String boardId) {
        this.boardId = boardId;
        return this;
    }
    public String getBoardId() {
        return this.boardId;
    }

}
