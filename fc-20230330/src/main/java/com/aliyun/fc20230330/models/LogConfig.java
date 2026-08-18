// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class LogConfig extends TeaModel {
    /**
     * <p>Specifies whether to enable instance-level metrics. After you enable this feature, you can view core metrics such as CPU usage, memory usage, network status, and request count at the instance level. Valid values: false: disables instance-level metrics. This is the default value. true: enables instance-level metrics.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enableInstanceMetrics")
    public Boolean enableInstanceMetrics;

    /**
     * <p>Specifies whether to enable LLM metrics. After you enable this feature, you can view LLM metrics. We recommend that you enable this feature only for LLM inference services. Valid values: false: disables LLM metrics. This is the default value. true: enables LLM metrics.</p>
     */
    @NameInMap("enableLlmMetrics")
    public Boolean enableLlmMetrics;

    /**
     * <p>Specifies whether to enable request-level metrics. After you enable this feature, you can view the time and memory consumed by each invocation of all functions in the service. Valid values: false: disables request-level metrics. true: enables request-level metrics. This is the default value.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enableRequestMetrics")
    public Boolean enableRequestMetrics;

    /**
     * <p>The log line beginning matching rule.</p>
     * 
     * <strong>example:</strong>
     * <p>DefaultRegex</p>
     */
    @NameInMap("logBeginRule")
    public String logBeginRule;

    /**
     * <p>The Logstore name in Simple Log Service.</p>
     * 
     * <strong>example:</strong>
     * <p>test-logstore</p>
     */
    @NameInMap("logstore")
    public String logstore;

    /**
     * <p>The project name in Simple Log Service.</p>
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
     */
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

    public LogConfig setEnableLlmMetrics(Boolean enableLlmMetrics) {
        this.enableLlmMetrics = enableLlmMetrics;
        return this;
    }
    public Boolean getEnableLlmMetrics() {
        return this.enableLlmMetrics;
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
