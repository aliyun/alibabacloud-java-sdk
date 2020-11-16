// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteBoardRequest extends TeaModel {
    @NameInMap("AppId")
    @Validation(required = true)
    public String appId;

    @NameInMap("BoardId")
    @Validation(required = true)
    public String boardId;

    public static DeleteBoardRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteBoardRequest self = new DeleteBoardRequest();
        return TeaModel.build(map, self);
    }

    public DeleteBoardRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteBoardRequest setBoardId(String boardId) {
        this.boardId = boardId;
        return this;
    }
    public String getBoardId() {
        return this.boardId;
    }

}
