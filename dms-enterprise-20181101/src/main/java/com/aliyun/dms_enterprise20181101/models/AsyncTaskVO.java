// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class AsyncTaskVO extends TeaModel {
    @NameInMap("DatasetId")
    public String datasetId;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("TaskName")
    public String taskName;

    @NameInMap("TaskStatus")
    public Integer taskStatus;

    @NameInMap("TaskType")
    public Integer taskType;

    @NameInMap("UserId")
    public Long userId;

    public static AsyncTaskVO build(java.util.Map<String, ?> map) throws Exception {
        AsyncTaskVO self = new AsyncTaskVO();
        return TeaModel.build(map, self);
    }

    public AsyncTaskVO setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public String getDatasetId() {
        return this.datasetId;
    }

    public AsyncTaskVO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public AsyncTaskVO setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public AsyncTaskVO setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public AsyncTaskVO setTaskStatus(Integer taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public Integer getTaskStatus() {
        return this.taskStatus;
    }

    public AsyncTaskVO setTaskType(Integer taskType) {
        this.taskType = taskType;
        return this;
    }
    public Integer getTaskType() {
        return this.taskType;
    }

    public AsyncTaskVO setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
