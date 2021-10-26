// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class LogConfig extends TeaModel {
    // 开启实例级别指标
    @NameInMap("enableInstanceMetrics")
    public Boolean enableInstanceMetrics;

    // 开启请求级别指标
    @NameInMap("enableRequestMetrics")
    public Boolean enableRequestMetrics;

    // 日志切分规则
    @NameInMap("logBeginRule")
    public String logBeginRule;

    // 日志库
    @NameInMap("logstore")
    public String logstore;

    // 日志项目
    @NameInMap("project")
    public String project;

    public static LogConfig build(java.util.Map<String, ?> map) throws Exception {
        LogConfig self = new LogConfig();
        return TeaModel.build(map, self);
    }

    public LogConfig setEnableInstanceMetrics(Boolean enableInstanceMetrics) {
        this.enableInstanceMetrics = enableInstanceMetrics;
        return this;
    }
    public Boolean getEnableInstanceMetrics() {
        return this.enableInstanceMetrics;
    }

    public LogConfig setEnableRequestMetrics(Boolean enableRequestMetrics) {
        this.enableRequestMetrics = enableRequestMetrics;
        return this;
    }
    public Boolean getEnableRequestMetrics() {
        return this.enableRequestMetrics;
    }

    public LogConfig setLogBeginRule(String logBeginRule) {
        this.logBeginRule = logBeginRule;
        return this;
    }
    public String getLogBeginRule() {
        return this.logBeginRule;
    }

    public LogConfig setLogstore(String logstore) {
        this.logstore = logstore;
        return this;
    }
    public String getLogstore() {
        return this.logstore;
    }

    public LogConfig setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

}
