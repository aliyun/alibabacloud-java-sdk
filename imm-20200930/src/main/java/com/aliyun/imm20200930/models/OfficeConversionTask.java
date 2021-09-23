// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class OfficeConversionTask extends TeaModel {
    // 任务 id
    @NameInMap("TaskId")
    public String taskId;

    // 任务状态
    @NameInMap("Status")
    public String status;

    // Status 解释
    @NameInMap("Reason")
    public String reason;

    // 用户自定义内容
    @NameInMap("UserData")
    public String userData;

    // 任务创建时间
    @NameInMap("CreateTime")
    public String createTime;

    // 任务开始时间
    @NameInMap("StartTime")
    public String startTime;

    // 任务解释时间
    @NameInMap("EndTime")
    public String endTime;

    // 转换页数
    @NameInMap("TotalPages")
    public Long totalPages;

    public static OfficeConversionTask build(java.util.Map<String, ?> map) throws Exception {
        OfficeConversionTask self = new OfficeConversionTask();
        return TeaModel.build(map, self);
    }

    public OfficeConversionTask setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public OfficeConversionTask setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public OfficeConversionTask setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public OfficeConversionTask setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public OfficeConversionTask setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public OfficeConversionTask setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public OfficeConversionTask setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public OfficeConversionTask setTotalPages(Long totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Long getTotalPages() {
        return this.totalPages;
    }

}
