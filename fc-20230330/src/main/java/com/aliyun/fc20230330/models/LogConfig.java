// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class LogConfig extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enableInstanceMetrics")
    public Boolean enableInstanceMetrics;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enableRequestMetrics")
    public Boolean enableRequestMetrics;

    /**
     * <strong>example:</strong>
     * <p>DefaultRegex</p>
     */
    @NameInMap("logBeginRule")
    public String logBeginRule;

    /**
     * <strong>example:</strong>
     * <p>test-logstore</p>
     */
    @NameInMap("logstore")
    public String logstore;

    /**
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
