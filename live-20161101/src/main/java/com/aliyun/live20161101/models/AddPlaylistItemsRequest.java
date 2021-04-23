// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddPlaylistItemsRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("CasterId")
    public String casterId;

    @NameInMap("ProgramItems")
    public String programItems;

    @NameInMap("ProgramId")
    public String programId;

    @NameInMap("ProgramConfig")
    public String programConfig;

    public static AddPlaylistItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        AddPlaylistItemsRequest self = new AddPlaylistItemsRequest();
        return TeaModel.build(map, self);
    }

    public AddPlaylistItemsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddPlaylistItemsRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public AddPlaylistItemsRequest setProgramItems(String programItems) {
        this.programItems = programItems;
        return this;
    }
    public String getProgramItems() {
        return this.programItems;
    }

    public AddPlaylistItemsRequest setProgramId(String programId) {
        this.programId = programId;
        return this;
    }
    public String getProgramId() {
        return this.programId;
    }

    public AddPlaylistItemsRequest setProgramConfig(String programConfig) {
        this.programConfig = programConfig;
        return this;
    }
    public String getProgramConfig() {
        return this.programConfig;
    }

}
