// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class TaskLog extends TeaModel {
    // 函数名
    @NameInMap("FuncName")
    public String funcName;

    // 记录时间
    @NameInMap("GmtCreate")
    public String gmtCreate;

    // 日志等级
    @NameInMap("Level")
    public String level;

    // 行数
    @NameInMap("LineNo")
    public Integer lineNo;

    // 日志id
    @NameInMap("LogId")
    public String logId;

    // 日志信息
    @NameInMap("Message")
    public String message;

    // 任务id
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
