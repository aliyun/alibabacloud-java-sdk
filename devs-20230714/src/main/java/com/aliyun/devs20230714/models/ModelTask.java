// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class ModelTask extends TeaModel {
    @NameInMap("currentBytes")
    public String currentBytes;

    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMsg")
    public String errMsg;

    @NameInMap("extra")
    public Object extra;

    @NameInMap("fileSize")
    @Deprecated
    public Double fileSize;

    @NameInMap("finishTime")
    @Deprecated
    public Double finishTime;

    @NameInMap("finished")
    public Boolean finished;

    @NameInMap("finishedTime")
    public Double finishedTime;

    @NameInMap("id")
    public String id;

    @NameInMap("params")
    public String params;

    @NameInMap("result")
    public Object result;

    @NameInMap("speed")
    public String speed;

    @NameInMap("startTime")
    public Double startTime;

    @NameInMap("status")
    public String status;

    @NameInMap("taskId")
    public String taskId;

    @NameInMap("taskType")
    public String taskType;

    @NameInMap("total")
    @Deprecated
    public Float total;

    @NameInMap("totalBytes")
    public String totalBytes;

    @NameInMap("updateTime")
    public Double updateTime;

    public static ModelTask build(java.util.Map<String, ?> map) throws Exception {
        ModelTask self = new ModelTask();
        return TeaModel.build(map, self);
    }

    public ModelTask setCurrentBytes(String currentBytes) {
        this.currentBytes = currentBytes;
        return this;
    }
    public String getCurrentBytes() {
        return this.currentBytes;
    }

    public ModelTask setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ModelTask setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public ModelTask setExtra(Object extra) {
        this.extra = extra;
        return this;
    }
    public Object getExtra() {
        return this.extra;
    }

    @Deprecated
    public ModelTask setFileSize(Double fileSize) {
        this.fileSize = fileSize;
        return this;
    }
    public Double getFileSize() {
        return this.fileSize;
    }

    @Deprecated
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

    public ModelTask setFinishedTime(Double finishedTime) {
        this.finishedTime = finishedTime;
        return this;
    }
    public Double getFinishedTime() {
        return this.finishedTime;
    }

    public ModelTask setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ModelTask setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public ModelTask setResult(Object result) {
        this.result = result;
        return this;
    }
    public Object getResult() {
        return this.result;
    }

    public ModelTask setSpeed(String speed) {
        this.speed = speed;
        return this;
    }
    public String getSpeed() {
        return this.speed;
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

    public ModelTask setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    @Deprecated
    public ModelTask setTotal(Float total) {
        this.total = total;
        return this;
    }
    public Float getTotal() {
        return this.total;
    }

    public ModelTask setTotalBytes(String totalBytes) {
        this.totalBytes = totalBytes;
        return this;
    }
    public String getTotalBytes() {
        return this.totalBytes;
    }

    public ModelTask setUpdateTime(Double updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public Double getUpdateTime() {
        return this.updateTime;
    }

}
