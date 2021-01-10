// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateBoardResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("BoardId")
    public String boardId;

    public static CreateBoardResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateBoardResponseBody self = new CreateBoardResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateBoardResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateBoardResponseBody setBoardId(String boardId) {
        this.boardId = boardId;
        return this;
    }
    public String getBoardId() {
        return this.boardId;
    }

}
