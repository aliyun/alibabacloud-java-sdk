// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class DeleteBackupDataRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteBackupDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteBackupDataRequest self = new DeleteBackupDataRequest();
        return TeaModel.build(map, self);
    }

    public DeleteBackupDataRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
