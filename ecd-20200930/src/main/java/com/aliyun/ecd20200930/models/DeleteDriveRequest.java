// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteDriveRequest extends TeaModel {
    /**
     * <p>The ID of the user-level storage resource.</p>
     * 
     * <strong>example:</strong>
     * <p>dri-aaaa****</p>
     */
    @NameInMap("DriveId")
    public String driveId;

    /**
     * <p>The region ID.</p>
     * 
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
