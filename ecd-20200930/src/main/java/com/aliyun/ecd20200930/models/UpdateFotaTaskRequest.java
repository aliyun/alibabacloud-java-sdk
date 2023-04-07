// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class UpdateFotaTaskRequest extends TeaModel {
    /**
     * <p>The ID of the region. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the image update task. You can call the DescribeFotaTasks operation to obtain the value of this parameter.</p>
     */
    @NameInMap("TaskUid")
    public String taskUid;

    /**
     * <p>Specifies whether to automatically push the image update task.</p>
     */
    @NameInMap("UserStatus")
    public String userStatus;

    public static UpdateFotaTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFotaTaskRequest self = new UpdateFotaTaskRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFotaTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateFotaTaskRequest setTaskUid(String taskUid) {
        this.taskUid = taskUid;
        return this;
    }
    public String getTaskUid() {
        return this.taskUid;
    }

    public UpdateFotaTaskRequest setUserStatus(String userStatus) {
        this.userStatus = userStatus;
        return this;
    }
    public String getUserStatus() {
        return this.userStatus;
    }

}
