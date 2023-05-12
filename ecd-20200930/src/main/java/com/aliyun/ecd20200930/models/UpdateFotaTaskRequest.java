// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class UpdateFotaTaskRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TaskUid")
    public String taskUid;

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
