// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CompleteBoardRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("BoardId")
    public String boardId;

    public static CompleteBoardRequest build(java.util.Map<String, ?> map) throws Exception {
        CompleteBoardRequest self = new CompleteBoardRequest();
        return TeaModel.build(map, self);
    }

    public CompleteBoardRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
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
