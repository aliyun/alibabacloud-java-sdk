// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class ModelAsyncTask extends TeaModel {
    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMsg")
    public String errMsg;

    @NameInMap("finished")
    public Boolean finished;

    @NameInMap("finishedTime")
    public Long finishedTime;

    @NameInMap("result")
    public Object result;

    @NameInMap("startTime")
    public Long startTime;

    @NameInMap("taskType")
    public String taskType;

    @NameInMap("updateTime")
    public Long updateTime;

    public static ModelAsyncTask build(java.util.Map<String, ?> map) throws Exception {
        ModelAsyncTask self = new ModelAsyncTask();
        return TeaModel.build(map, self);
    }

    public ModelAsyncTask setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ModelAsyncTask setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public ModelAsyncTask setFinished(Boolean finished) {
        this.finished = finished;
        return this;
    }
    public Boolean getFinished() {
        return this.finished;
    }

    public ModelAsyncTask setFinishedTime(Long finishedTime) {
        this.finishedTime = finishedTime;
        return this;
    }
    public Long getFinishedTime() {
        return this.finishedTime;
    }

    public ModelAsyncTask setResult(Object result) {
        this.result = result;
        return this;
    }
    public Object getResult() {
        return this.result;
    }

    public ModelAsyncTask setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ModelAsyncTask setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public ModelAsyncTask setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public Long getUpdateTime() {
        return this.updateTime;
    }

}
