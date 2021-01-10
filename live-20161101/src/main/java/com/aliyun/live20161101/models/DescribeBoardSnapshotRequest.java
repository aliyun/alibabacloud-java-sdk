// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeBoardSnapshotRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("BoardId")
    public String boardId;

    public static DescribeBoardSnapshotRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBoardSnapshotRequest self = new DescribeBoardSnapshotRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBoardSnapshotRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
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
