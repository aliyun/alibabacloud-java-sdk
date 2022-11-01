// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ApproveOtaTaskRequest extends TeaModel {
    @NameInMap("AppInstanceGroupId")
    public String appInstanceGroupId;

    @NameInMap("BizRegionId")
    public String bizRegionId;

    @NameInMap("OtaType")
    public String otaType;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("TaskId")
    public String taskId;

    public static ApproveOtaTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ApproveOtaTaskRequest self = new ApproveOtaTaskRequest();
        return TeaModel.build(map, self);
    }

    public ApproveOtaTaskRequest setAppInstanceGroupId(String appInstanceGroupId) {
        this.appInstanceGroupId = appInstanceGroupId;
        return this;
    }
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    public ApproveOtaTaskRequest setBizRegionId(String bizRegionId) {
        this.bizRegionId = bizRegionId;
        return this;
    }
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    public ApproveOtaTaskRequest setOtaType(String otaType) {
        this.otaType = otaType;
        return this;
    }
    public String getOtaType() {
        return this.otaType;
    }

    public ApproveOtaTaskRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ApproveOtaTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
