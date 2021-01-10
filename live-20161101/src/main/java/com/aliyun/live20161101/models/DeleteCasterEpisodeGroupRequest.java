// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteCasterEpisodeGroupRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ProgramId")
    public String programId;

    public static DeleteCasterEpisodeGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCasterEpisodeGroupRequest self = new DeleteCasterEpisodeGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCasterEpisodeGroupRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteCasterEpisodeGroupRequest setProgramId(String programId) {
        this.programId = programId;
        return this;
    }
    public String getProgramId() {
        return this.programId;
    }

}
