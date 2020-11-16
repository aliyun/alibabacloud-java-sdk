// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class JoinBoardRequest extends TeaModel {
    @NameInMap("AppId")
    @Validation(required = true)
    public String appId;

    @NameInMap("AppUid")
    @Validation(required = true)
    public String appUid;

    @NameInMap("BoardId")
    @Validation(required = true)
    public String boardId;

    public static JoinBoardRequest build(java.util.Map<String, ?> map) throws Exception {
        JoinBoardRequest self = new JoinBoardRequest();
        return TeaModel.build(map, self);
    }

    public JoinBoardRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public JoinBoardRequest setAppUid(String appUid) {
        this.appUid = appUid;
        return this;
    }
    public String getAppUid() {
        return this.appUid;
    }

    public JoinBoardRequest setBoardId(String boardId) {
        this.boardId = boardId;
        return this;
    }
    public String getBoardId() {
        return this.boardId;
    }

}
