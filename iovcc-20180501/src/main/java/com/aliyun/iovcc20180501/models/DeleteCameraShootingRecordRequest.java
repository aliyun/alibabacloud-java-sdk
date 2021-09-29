// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DeleteCameraShootingRecordRequest extends TeaModel {
    // 项目ID
    @NameInMap("ProjectId")
    public String projectId;

    // 终端设备id
    @NameInMap("EdgeDeviceId")
    public String edgeDeviceId;

    // 拍摄记录ID
    @NameInMap("ShootingRecordId")
    public Long shootingRecordId;

    public static DeleteCameraShootingRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCameraShootingRecordRequest self = new DeleteCameraShootingRecordRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCameraShootingRecordRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DeleteCameraShootingRecordRequest setEdgeDeviceId(String edgeDeviceId) {
        this.edgeDeviceId = edgeDeviceId;
        return this;
    }
    public String getEdgeDeviceId() {
        return this.edgeDeviceId;
    }

    public DeleteCameraShootingRecordRequest setShootingRecordId(Long shootingRecordId) {
        this.shootingRecordId = shootingRecordId;
        return this;
    }
    public Long getShootingRecordId() {
        return this.shootingRecordId;
    }

}
