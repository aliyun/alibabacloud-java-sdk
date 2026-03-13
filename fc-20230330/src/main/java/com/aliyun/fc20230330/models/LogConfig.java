// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class LogConfig extends TeaModel {
    /**
     * <p>Specifies whether to enable the collection of instance-level metrics. If you enable this feature, you can view core metrics, such as CPU utilization, memory usage, network conditions of instances, and the number of requests that an instance concurrently processes. Valid values: false: disables the collection of instance-level metrics. This is the default value. true: enables the collection of instance-level metrics.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enableInstanceMetrics")
    public Boolean enableInstanceMetrics;

    @NameInMap("enableLlmMetrics")
    public Boolean enableLlmMetrics;

    /**
     * <p>Specifies whether to enable request-level metrics. If you enable this feature, you can view the amount of time and memory consumed for a specific invocation of each function in the service. Valid values: false: disables request-level metrics. true: enables request-level metrics. This is the default value.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enableRequestMetrics")
    public Boolean enableRequestMetrics;

    /**
     * <p>The log segmentation rule.</p>
     * 
     * <strong>example:</strong>
     * <p>DefaultRegex</p>
     */
    @NameInMap("logBeginRule")
    public String logBeginRule;

    /**
     * <p>The name of the Logstore of Simple Log Service.</p>
     * 
     * <strong>example:</strong>
     * <p>test-logstore</p>
     */
    @NameInMap("logstore")
    public String logstore;

    /**
     * <p>The name of the project in Simple Log Service.</p>
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
