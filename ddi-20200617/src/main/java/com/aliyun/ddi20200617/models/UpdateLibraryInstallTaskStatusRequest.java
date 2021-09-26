// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class UpdateLibraryInstallTaskStatusRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TaskBizId")
    public String taskBizId;

    @NameInMap("Status")
    public String status;

    public static UpdateLibraryInstallTaskStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLibraryInstallTaskStatusRequest self = new UpdateLibraryInstallTaskStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLibraryInstallTaskStatusRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpdateLibraryInstallTaskStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateLibraryInstallTaskStatusRequest setTaskBizId(String taskBizId) {
        this.taskBizId = taskBizId;
        return this;
    }
    public String getTaskBizId() {
        return this.taskBizId;
    }

    public UpdateLibraryInstallTaskStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
