// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListPlaylistItemsRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ProgramId")
    public String programId;

    @NameInMap("ProgramItemIds")
    public String programItemIds;

    public static ListPlaylistItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPlaylistItemsRequest self = new ListPlaylistItemsRequest();
        return TeaModel.build(map, self);
    }

    public ListPlaylistItemsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListPlaylistItemsRequest setProgramId(String programId) {
        this.programId = programId;
        return this;
    }
    public String getProgramId() {
        return this.programId;
    }

    public ListPlaylistItemsRequest setProgramItemIds(String programItemIds) {
        this.programItemIds = programItemIds;
        return this;
    }
    public String getProgramItemIds() {
        return this.programItemIds;
    }

}
