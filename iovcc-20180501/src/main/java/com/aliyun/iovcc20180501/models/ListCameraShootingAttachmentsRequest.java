// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListCameraShootingAttachmentsRequest extends TeaModel {
    // 项目ID
    @NameInMap("ProjectId")
    public String projectId;

    // 终端设备id
    @NameInMap("EdgeDeviceId")
    public String edgeDeviceId;

    // 拍摄记录ID
    @NameInMap("ShootingRecordId")
    public Long shootingRecordId;

    public static ListCameraShootingAttachmentsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCameraShootingAttachmentsRequest self = new ListCameraShootingAttachmentsRequest();
        return TeaModel.build(map, self);
    }

    public ListCameraShootingAttachmentsRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ListCameraShootingAttachmentsRequest setEdgeDeviceId(String edgeDeviceId) {
        this.edgeDeviceId = edgeDeviceId;
        return this;
    }
    public String getEdgeDeviceId() {
        return this.edgeDeviceId;
    }

    public ListCameraShootingAttachmentsRequest setShootingRecordId(Long shootingRecordId) {
        this.shootingRecordId = shootingRecordId;
        return this;
    }
    public Long getShootingRecordId() {
        return this.shootingRecordId;
    }

}
