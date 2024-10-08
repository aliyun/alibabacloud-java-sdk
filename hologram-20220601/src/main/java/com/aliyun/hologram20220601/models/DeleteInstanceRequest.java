// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class DeleteInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the region in which the Hologres instance resides.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstanceRequest self = new DeleteInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
