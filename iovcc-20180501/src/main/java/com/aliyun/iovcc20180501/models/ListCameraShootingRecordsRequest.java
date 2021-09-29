// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListCameraShootingRecordsRequest extends TeaModel {
    // 项目ID
    @NameInMap("ProjectId")
    public String projectId;

    // 终端设备id
    @NameInMap("EdgeDeviceId")
    public String edgeDeviceId;

    // 拍摄类型，0-图片，1-视频
    @NameInMap("ShootingType")
    public Long shootingType;

    // 起始时间
    @NameInMap("StartTime")
    public Long startTime;

    // 截止时间
    @NameInMap("EndTime")
    public Long endTime;

    // 查询开始页号
    @NameInMap("PageIndex")
    public Long pageIndex;

    // 每页记录数
    @NameInMap("PageSize")
    public Long pageSize;

    public static ListCameraShootingRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCameraShootingRecordsRequest self = new ListCameraShootingRecordsRequest();
        return TeaModel.build(map, self);
    }

    public ListCameraShootingRecordsRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ListCameraShootingRecordsRequest setEdgeDeviceId(String edgeDeviceId) {
        this.edgeDeviceId = edgeDeviceId;
        return this;
    }
    public String getEdgeDeviceId() {
        return this.edgeDeviceId;
    }

    public ListCameraShootingRecordsRequest setShootingType(Long shootingType) {
        this.shootingType = shootingType;
        return this;
    }
    public Long getShootingType() {
        return this.shootingType;
    }

    public ListCameraShootingRecordsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListCameraShootingRecordsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListCameraShootingRecordsRequest setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public ListCameraShootingRecordsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
