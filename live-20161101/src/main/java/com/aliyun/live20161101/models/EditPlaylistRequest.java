// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class EditPlaylistRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ProgramConfig")
    public String programConfig;

    @NameInMap("ProgramId")
    public String programId;

    @NameInMap("ProgramItems")
    public String programItems;

    public static EditPlaylistRequest build(java.util.Map<String, ?> map) throws Exception {
        EditPlaylistRequest self = new EditPlaylistRequest();
        return TeaModel.build(map, self);
    }

    public EditPlaylistRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public EditPlaylistRequest setProgramConfig(String programConfig) {
        this.programConfig = programConfig;
        return this;
    }
    public String getProgramConfig() {
        return this.programConfig;
    }

    public EditPlaylistRequest setProgramId(String programId) {
        this.programId = programId;
        return this;
    }
    public String getProgramId() {
        return this.programId;
    }

    public EditPlaylistRequest setProgramItems(String programItems) {
        this.programItems = programItems;
        return this;
    }
    public String getProgramItems() {
        return this.programItems;
    }

}
