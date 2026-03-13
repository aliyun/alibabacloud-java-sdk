// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class SLSTriggerConfig extends TeaModel {
    /**
     * <p>Specifies whether to enable the trigger.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enable")
    public Boolean enable;

    /**
     * <p>The invocation configurations. Simple Log Service passes the configurations into the function as part of the event. The configuration content must be a JSON string.</p>
     */
    @NameInMap("functionParameter")
    public java.util.Map<String, String> functionParameter;

    /**
     * <p>The interval at which the trigger reads logs, and the retry configuration upon errors.</p>
     */
    @NameInMap("jobConfig")
    public JobConfig jobConfig;

    /**
     * <p>The log configurations of the trigger.</p>
     */
    @NameInMap("logConfig")
    public SLSTriggerLogConfig logConfig;

    /**
     * <p>The configurations of the trigger source.</p>
     */
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
