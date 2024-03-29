// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class LogInfo extends TeaModel {
    @NameInMap("BizTime")
    public String bizTime;

    @NameInMap("GmtCreate")
    public String gmtCreate;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("LogContent")
    public String logContent;

    @NameInMap("LogId")
    public String logId;

    @NameInMap("LogSummary")
    public String logSummary;

    @NameInMap("LogType")
    public String logType;

    public static LogInfo build(java.util.Map<String, ?> map) throws Exception {
        LogInfo self = new LogInfo();
        return TeaModel.build(map, self);
    }

    public LogInfo setBizTime(String bizTime) {
        this.bizTime = bizTime;
        return this;
    }
    public String getBizTime() {
        return this.bizTime;
    }

    public LogInfo setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public LogInfo setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public LogInfo setLogContent(String logContent) {
        this.logContent = logContent;
        return this;
    }
    public String getLogContent() {
        return this.logContent;
    }

    public LogInfo setLogId(String logId) {
        this.logId = logId;
        return this;
    }
    public String getLogId() {
        return this.logId;
    }

    public LogInfo setLogSummary(String logSummary) {
        this.logSummary = logSummary;
        return this;
    }
    public String getLogSummary() {
        return this.logSummary;
    }

    public LogInfo setLogType(String logType) {
        this.logType = logType;
        return this;
    }
    public String getLogType() {
        return this.logType;
    }

}
