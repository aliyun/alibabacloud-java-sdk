// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateBoardRequest extends TeaModel {
    @NameInMap("AppId")
    @Validation(required = true)
    public String appId;

    @NameInMap("BoardData")
    @Validation(required = true)
    public String boardData;

    public static UpdateBoardRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBoardRequest self = new UpdateBoardRequest();
        return TeaModel.build(map, self);
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
