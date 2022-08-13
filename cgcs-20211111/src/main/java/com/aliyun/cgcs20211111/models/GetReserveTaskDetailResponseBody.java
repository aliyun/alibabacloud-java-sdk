// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class GetReserveTaskDetailResponseBody extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("AppVersion")
    public String appVersion;

    @NameInMap("CurrCompletedSessionCapacity")
    public Integer currCompletedSessionCapacity;

    @NameInMap("DistrictId")
    public String districtId;

    @NameInMap("ExpectResourceReadyTime")
    public String expectResourceReadyTime;

    @NameInMap("ExpectSessionCapacity")
    public Integer expectSessionCapacity;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("TaskStatus")
    public String taskStatus;

    public static GetReserveTaskDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetReserveTaskDetailResponseBody self = new GetReserveTaskDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetReserveTaskDetailResponseBody setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetReserveTaskDetailResponseBody setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public GetReserveTaskDetailResponseBody setCurrCompletedSessionCapacity(Integer currCompletedSessionCapacity) {
        this.currCompletedSessionCapacity = currCompletedSessionCapacity;
        return this;
    }
    public Integer getCurrCompletedSessionCapacity() {
        return this.currCompletedSessionCapacity;
    }

    public GetReserveTaskDetailResponseBody setDistrictId(String districtId) {
        this.districtId = districtId;
        return this;
    }
    public String getDistrictId() {
        return this.districtId;
    }

    public GetReserveTaskDetailResponseBody setExpectResourceReadyTime(String expectResourceReadyTime) {
        this.expectResourceReadyTime = expectResourceReadyTime;
        return this;
    }
    public String getExpectResourceReadyTime() {
        return this.expectResourceReadyTime;
    }

    public GetReserveTaskDetailResponseBody setExpectSessionCapacity(Integer expectSessionCapacity) {
        this.expectSessionCapacity = expectSessionCapacity;
        return this;
    }
    public Integer getExpectSessionCapacity() {
        return this.expectSessionCapacity;
    }

    public GetReserveTaskDetailResponseBody setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public GetReserveTaskDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetReserveTaskDetailResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetReserveTaskDetailResponseBody setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public String getTaskStatus() {
        return this.taskStatus;
    }

}
