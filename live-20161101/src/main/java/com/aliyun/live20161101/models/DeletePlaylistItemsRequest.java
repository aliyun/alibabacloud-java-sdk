// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeletePlaylistItemsRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ProgramId")
    public String programId;

    @NameInMap("ProgramItemIds")
    public String programItemIds;

    public static DeletePlaylistItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePlaylistItemsRequest self = new DeletePlaylistItemsRequest();
        return TeaModel.build(map, self);
    }

    public DeletePlaylistItemsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeletePlaylistItemsRequest setProgramId(String programId) {
        this.programId = programId;
        return this;
    }
    public String getProgramId() {
        return this.programId;
    }

    public DeletePlaylistItemsRequest setProgramItemIds(String programItemIds) {
        this.programItemIds = programItemIds;
        return this;
    }
    public String getProgramItemIds() {
        return this.programItemIds;
    }

}
