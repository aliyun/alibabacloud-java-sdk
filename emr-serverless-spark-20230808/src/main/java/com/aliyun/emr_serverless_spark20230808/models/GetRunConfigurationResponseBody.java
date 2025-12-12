// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class GetRunConfigurationResponseBody extends TeaModel {
    /**
     * <p>请求ID。</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("runConfiguration")
    public GetRunConfigurationResponseBodyRunConfiguration runConfiguration;

    public static GetRunConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRunConfigurationResponseBody self = new GetRunConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRunConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRunConfigurationResponseBody setRunConfiguration(GetRunConfigurationResponseBodyRunConfiguration runConfiguration) {
        this.runConfiguration = runConfiguration;
        return this;
    }
    public GetRunConfigurationResponseBodyRunConfiguration getRunConfiguration() {
        return this.runConfiguration;
    }

    public static class GetRunConfigurationResponseBodyRunConfigurationApplicationConfigs extends TeaModel {
        /**
         * <p>应用配置文件名。 应用配置文件名。 <code>spark-defaults.conf</code></p>
         * 
         * <strong>example:</strong>
         * <p>spark-defaults.conf</p>
         */
        @NameInMap("configFileName")
        public String configFileName;

        /**
         * <p>配置项键。 配置项键。 <code>dfs.namenode.checkpoint.period</code></p>
         * 
         * <strong>example:</strong>
         * <p>spark.driver.cores</p>
         */
        @NameInMap("configItemKey")
        public String configItemKey;

        /**
         * <p>配置项值。 配置项值。 <code>3600s</code></p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("configItemValue")
        public String configItemValue;

        public static GetRunConfigurationResponseBodyRunConfigurationApplicationConfigs build(java.util.Map<String, ?> map) throws Exception {
            GetRunConfigurationResponseBodyRunConfigurationApplicationConfigs self = new GetRunConfigurationResponseBodyRunConfigurationApplicationConfigs();
            return TeaModel.build(map, self);
        }

        public GetRunConfigurationResponseBodyRunConfigurationApplicationConfigs setConfigFileName(String configFileName) {
            this.configFileName = configFileName;
            return this;
        }
        public String getConfigFileName() {
            return this.configFileName;
        }

        public GetRunConfigurationResponseBodyRunConfigurationApplicationConfigs setConfigItemKey(String configItemKey) {
            this.configItemKey = configItemKey;
            return this;
        }
        public String getConfigItemKey() {
            return this.configItemKey;
        }

        public GetRunConfigurationResponseBodyRunConfigurationApplicationConfigs setConfigItemValue(String configItemValue) {
            this.configItemValue = configItemValue;
            return this;
        }
        public String getConfigItemValue() {
            return this.configItemValue;
        }

    }

    public static class GetRunConfigurationResponseBodyRunConfigurationLogConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>INFO</p>
         */
        @NameInMap("LogLevel")
        public String logLevel;

        /**
         * <strong>example:</strong>
         * <p>oss://test</p>
         */
        @NameInMap("LogPath")
        public String logPath;

        public static GetRunConfigurationResponseBodyRunConfigurationLogConfig build(java.util.Map<String, ?> map) throws Exception {
            GetRunConfigurationResponseBodyRunConfigurationLogConfig self = new GetRunConfigurationResponseBodyRunConfigurationLogConfig();
            return TeaModel.build(map, self);
        }

        public GetRunConfigurationResponseBodyRunConfigurationLogConfig setLogLevel(String logLevel) {
            this.logLevel = logLevel;
            return this;
        }
        public String getLogLevel() {
            return this.logLevel;
        }

        public GetRunConfigurationResponseBodyRunConfigurationLogConfig setLogPath(String logPath) {
            this.logPath = logPath;
            return this;
        }
        public String getLogPath() {
            return this.logPath;
        }

    }

    public static class GetRunConfigurationResponseBodyRunConfiguration extends TeaModel {
        /**
         * <p>应用配置项</p>
         */
        @NameInMap("applicationConfigs")
        public java.util.List<GetRunConfigurationResponseBodyRunConfigurationApplicationConfigs> applicationConfigs;

        @NameInMap("logConfig")
        public GetRunConfigurationResponseBodyRunConfigurationLogConfig logConfig;

        /**
         * <p>运行配置。</p>
         */
        @NameInMap("runtimeConfigs")
        public java.util.List<Tag> runtimeConfigs;

        public static GetRunConfigurationResponseBodyRunConfiguration build(java.util.Map<String, ?> map) throws Exception {
            GetRunConfigurationResponseBodyRunConfiguration self = new GetRunConfigurationResponseBodyRunConfiguration();
            return TeaModel.build(map, self);
        }

        public GetRunConfigurationResponseBodyRunConfiguration setApplicationConfigs(java.util.List<GetRunConfigurationResponseBodyRunConfigurationApplicationConfigs> applicationConfigs) {
            this.applicationConfigs = applicationConfigs;
            return this;
        }
        public java.util.List<GetRunConfigurationResponseBodyRunConfigurationApplicationConfigs> getApplicationConfigs() {
            return this.applicationConfigs;
        }

        public GetRunConfigurationResponseBodyRunConfiguration setLogConfig(GetRunConfigurationResponseBodyRunConfigurationLogConfig logConfig) {
            this.logConfig = logConfig;
            return this;
        }
        public GetRunConfigurationResponseBodyRunConfigurationLogConfig getLogConfig() {
            return this.logConfig;
        }

        public GetRunConfigurationResponseBodyRunConfiguration setRuntimeConfigs(java.util.List<Tag> runtimeConfigs) {
            this.runtimeConfigs = runtimeConfigs;
            return this;
        }
        public java.util.List<Tag> getRuntimeConfigs() {
            return this.runtimeConfigs;
        }

    }

}
