// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveAIStudioRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the template. You can obtain the ID from the response to the CreateLiveAIStudio operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>369ced1f-c33a-49e5-91da-bdaae3d6c1c2</p>
     */
    @NameInMap("StudioId")
    public String studioId;

    public static DeleteLiveAIStudioRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveAIStudioRequest self = new DeleteLiveAIStudioRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLiveAIStudioRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteLiveAIStudioRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteLiveAIStudioRequest setStudioId(String studioId) {
        this.studioId = studioId;
        return this;
    }
    public String getStudioId() {
        return this.studioId;
    }

}
