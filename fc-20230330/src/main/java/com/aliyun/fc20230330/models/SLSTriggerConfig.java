// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class SLSTriggerConfig extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enable")
    public Boolean enable;

    @NameInMap("functionParameter")
    public java.util.Map<String, String> functionParameter;

    @NameInMap("jobConfig")
    public JobConfig jobConfig;

    @NameInMap("logConfig")
    public SLSTriggerLogConfig logConfig;

    @NameInMap("sourceConfig")
    public SourceConfig sourceConfig;

    public static SLSTriggerConfig build(java.util.Map<String, ?> map) throws Exception {
        SLSTriggerConfig self = new SLSTriggerConfig();
        return TeaModel.build(map, self);
    }

    public SLSTriggerConfig setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public SLSTriggerConfig setFunctionParameter(java.util.Map<String, String> functionParameter) {
        this.functionParameter = functionParameter;
        return this;
    }
    public java.util.Map<String, String> getFunctionParameter() {
        return this.functionParameter;
    }

    public SLSTriggerConfig setJobConfig(JobConfig jobConfig) {
        this.jobConfig = jobConfig;
        return this;
    }
    public JobConfig getJobConfig() {
        return this.jobConfig;
    }

    public SLSTriggerConfig setLogConfig(SLSTriggerLogConfig logConfig) {
        this.logConfig = logConfig;
        return this;
    }
    public SLSTriggerLogConfig getLogConfig() {
        return this.logConfig;
    }

    public SLSTriggerConfig setSourceConfig(SourceConfig sourceConfig) {
        this.sourceConfig = sourceConfig;
        return this;
    }
    public SourceConfig getSourceConfig() {
        return this.sourceConfig;
    }

}
