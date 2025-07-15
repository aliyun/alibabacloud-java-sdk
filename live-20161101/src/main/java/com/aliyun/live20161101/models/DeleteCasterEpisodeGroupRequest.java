// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteCasterEpisodeGroupRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the episode list. If the episode list was added by calling the <a href="https://help.aliyun.com/document_detail/2848071.html">AddCasterEpisodeGroup</a> operation, check the value of the response parameter ProgramId to obtain the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a2b8e671-2fe5-4642-a2ec-bf932738****</p>
     */
    @NameInMap("ProgramId")
    public String programId;

    @NameInMap("RegionId")
    public String regionId;

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

    public DeleteCasterEpisodeGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
