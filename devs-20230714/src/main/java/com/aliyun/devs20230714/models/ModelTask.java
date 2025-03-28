// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class ModelTask extends TeaModel {
    @NameInMap("errMsg")
    public String errMsg;

    @NameInMap("fileSize")
    public Double fileSize;

    @NameInMap("finishTime")
    public Double finishTime;

    @NameInMap("finished")
    public Boolean finished;

    @NameInMap("startTime")
    public Double startTime;

    @NameInMap("status")
    public String status;

    @NameInMap("taskId")
    public String taskId;

    @NameInMap("total")
    public Float total;

    public static ModelTask build(java.util.Map<String, ?> map) throws Exception {
        ModelTask self = new ModelTask();
        return TeaModel.build(map, self);
    }

    public ModelTask setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public ModelTask setFileSize(Double fileSize) {
        this.fileSize = fileSize;
        return this;
    }
    public Double getFileSize() {
        return this.fileSize;
    }

    public ModelTask setFinishTime(Double finishTime) {
        this.finishTime = finishTime;
        return this;
    }
    public Double getFinishTime() {
        return this.finishTime;
    }

    public ModelTask setFinished(Boolean finished) {
        this.finished = finished;
        return this;
    }
    public Boolean getFinished() {
        return this.finished;
    }

    public ModelTask setStartTime(Double startTime) {
        this.startTime = startTime;
        return this;
    }
    public Double getStartTime() {
        return this.startTime;
    }

    public ModelTask setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ModelTask setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public ModelTask setTotal(Float total) {
        this.total = total;
        return this;
    }
    public Float getTotal() {
        return this.total;
    }

}
