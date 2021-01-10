// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateBoardRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("BoardData")
    public String boardData;

    public static UpdateBoardRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBoardRequest self = new UpdateBoardRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBoardRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateBoardRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateBoardRequest setBoardData(String boardData) {
        this.boardData = boardData;
        return this;
    }
    public String getBoardData() {
        return this.boardData;
    }

}
