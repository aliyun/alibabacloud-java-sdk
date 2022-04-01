// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class LogTriggerConfig extends TeaModel {
    // enable
    @NameInMap("enable")
    public Boolean enable;

    // functionParameter
    @NameInMap("functionParameter")
    public java.util.Map<String, String> functionParameter;

    @NameInMap("jobConfig")
    public JobConfig jobConfig;

    @NameInMap("logConfig")
    public JobLogConfig logConfig;

    @NameInMap("sourceConfig")
    public SourceConfig sourceConfig;

    public static LogTriggerConfig build(java.util.Map<String, ?> map) throws Exception {
        LogTriggerConfig self = new LogTriggerConfig();
        return TeaModel.build(map, self);
    }

    public LogTriggerConfig setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public LogTriggerConfig setFunctionParameter(java.util.Map<String, String> functionParameter) {
        this.functionParameter = functionParameter;
        return this;
    }
    public java.util.Map<String, String> getFunctionParameter() {
        return this.functionParameter;
    }

    public LogTriggerConfig setJobConfig(JobConfig jobConfig) {
        this.jobConfig = jobConfig;
        return this;
    }
    public JobConfig getJobConfig() {
        return this.jobConfig;
    }

    public LogTriggerConfig setLogConfig(JobLogConfig logConfig) {
        this.logConfig = logConfig;
        return this;
    }
    public JobLogConfig getLogConfig() {
        return this.logConfig;
    }

    public LogTriggerConfig setSourceConfig(SourceConfig sourceConfig) {
        this.sourceConfig = sourceConfig;
        return this;
    }
    public SourceConfig getSourceConfig() {
        return this.sourceConfig;
    }

}
