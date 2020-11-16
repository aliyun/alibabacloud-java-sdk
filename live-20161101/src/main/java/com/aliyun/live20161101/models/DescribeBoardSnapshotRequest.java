// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeBoardSnapshotRequest extends TeaModel {
    @NameInMap("AppId")
    @Validation(required = true)
    public String appId;

    @NameInMap("BoardId")
    @Validation(required = true)
    public String boardId;

    public static DescribeBoardSnapshotRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBoardSnapshotRequest self = new DescribeBoardSnapshotRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBoardSnapshotRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeBoardSnapshotRequest setBoardId(String boardId) {
        this.boardId = boardId;
        return this;
    }
    public String getBoardId() {
        return this.boardId;
    }

}
