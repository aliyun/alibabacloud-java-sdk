// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class TaskLog extends TeaModel {
    @NameInMap("FuncName")
    public String funcName;

    @NameInMap("GmtCreate")
    public String gmtCreate;

    @NameInMap("Level")
    public String level;

    @NameInMap("LineNo")
    public Integer lineNo;

    @NameInMap("LogId")
    public String logId;

    @NameInMap("Message")
    public String message;

    @NameInMap("TaskId")
    public String taskId;

    public static TaskLog build(java.util.Map<String, ?> map) throws Exception {
        TaskLog self = new TaskLog();
        return TeaModel.build(map, self);
    }

    public TaskLog setFuncName(String funcName) {
        this.funcName = funcName;
        return this;
    }
    public String getFuncName() {
        return this.funcName;
    }

    public TaskLog setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public TaskLog setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public TaskLog setLineNo(Integer lineNo) {
        this.lineNo = lineNo;
        return this;
    }
    public Integer getLineNo() {
        return this.lineNo;
    }

    public TaskLog setLogId(String logId) {
        this.logId = logId;
        return this;
    }
    public String getLogId() {
        return this.logId;
    }

    public TaskLog setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TaskLog setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
