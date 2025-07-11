// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteDriveRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>dri-aaaa****</p>
     */
    @NameInMap("DriveId")
    public String driveId;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteDriveRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDriveRequest self = new DeleteDriveRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDriveRequest setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public DeleteDriveRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
