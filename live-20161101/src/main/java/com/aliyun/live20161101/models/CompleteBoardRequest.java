// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CompleteBoardRequest extends TeaModel {
    @NameInMap("AppId")
    @Validation(required = true)
    public String appId;

    @NameInMap("BoardId")
    @Validation(required = true)
    public String boardId;

    public static CompleteBoardRequest build(java.util.Map<String, ?> map) throws Exception {
        CompleteBoardRequest self = new CompleteBoardRequest();
        return TeaModel.build(map, self);
    }

    public CompleteBoardRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CompleteBoardRequest setBoardId(String boardId) {
        this.boardId = boardId;
        return this;
    }
    public String getBoardId() {
        return this.boardId;
    }

}
