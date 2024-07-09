// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteEduRoomRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EduRoomId")
    public String eduRoomId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteEduRoomRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEduRoomRequest self = new DeleteEduRoomRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEduRoomRequest setEduRoomId(String eduRoomId) {
        this.eduRoomId = eduRoomId;
        return this;
    }
    public String getEduRoomId() {
        return this.eduRoomId;
    }

    public DeleteEduRoomRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
