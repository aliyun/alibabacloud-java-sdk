// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ExecuteCameraShootingCommandRequest extends TeaModel {
    // 项目ID
    @NameInMap("ProjectId")
    public String projectId;

    // 终端设备id
    @NameInMap("EdgeDeviceId")
    public String edgeDeviceId;

    // 拍摄类型，0-图片，1-视频
    @NameInMap("ShootingType")
    public Long shootingType;

    // 拍摄数量
    @NameInMap("Number")
    public Long number;

    // 拍照间隔/视频时长，单位为s
    @NameInMap("Time")
    public Long time;

    public static ExecuteCameraShootingCommandRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteCameraShootingCommandRequest self = new ExecuteCameraShootingCommandRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteCameraShootingCommandRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ExecuteCameraShootingCommandRequest setEdgeDeviceId(String edgeDeviceId) {
        this.edgeDeviceId = edgeDeviceId;
        return this;
    }
    public String getEdgeDeviceId() {
        return this.edgeDeviceId;
    }

    public ExecuteCameraShootingCommandRequest setShootingType(Long shootingType) {
        this.shootingType = shootingType;
        return this;
    }
    public Long getShootingType() {
        return this.shootingType;
    }

    public ExecuteCameraShootingCommandRequest setNumber(Long number) {
        this.number = number;
        return this;
    }
    public Long getNumber() {
        return this.number;
    }

    public ExecuteCameraShootingCommandRequest setTime(Long time) {
        this.time = time;
        return this;
    }
    public Long getTime() {
        return this.time;
    }

}
