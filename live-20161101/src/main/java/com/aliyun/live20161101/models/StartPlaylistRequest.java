// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class StartPlaylistRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ProgramId")
    public String programId;

    @NameInMap("ResumeMode")
    public String resumeMode;

    @NameInMap("StartItemId")
    public String startItemId;

    @NameInMap("Offset")
    public Integer offset;

    public static StartPlaylistRequest build(java.util.Map<String, ?> map) throws Exception {
        StartPlaylistRequest self = new StartPlaylistRequest();
        return TeaModel.build(map, self);
    }

    public StartPlaylistRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public StartPlaylistRequest setProgramId(String programId) {
        this.programId = programId;
        return this;
    }
    public String getProgramId() {
        return this.programId;
    }

    public StartPlaylistRequest setResumeMode(String resumeMode) {
        this.resumeMode = resumeMode;
        return this;
    }
    public String getResumeMode() {
        return this.resumeMode;
    }

    public StartPlaylistRequest setStartItemId(String startItemId) {
        this.startItemId = startItemId;
        return this;
    }
    public String getStartItemId() {
        return this.startItemId;
    }

    public StartPlaylistRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

}
