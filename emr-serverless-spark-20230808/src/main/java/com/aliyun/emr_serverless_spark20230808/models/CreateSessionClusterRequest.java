// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class CreateSessionClusterRequest extends TeaModel {
    /**
     * <p>The Spark configurations.</p>
     */
    @NameInMap("applicationConfigs")
    public java.util.List<CreateSessionClusterRequestApplicationConfigs> applicationConfigs;

    /**
     * <p>The automatic startup configuration.</p>
     */
    @NameInMap("autoStartConfiguration")
    public CreateSessionClusterRequestAutoStartConfiguration autoStartConfiguration;

    /**
     * <p>The automatic termination configuration.</p>
     */
    @NameInMap("autoStopConfiguration")
    public CreateSessionClusterRequestAutoStopConfiguration autoStopConfiguration;

    /**
     * <p>The version of the Spark engine.</p>
     * 
     * <strong>example:</strong>
     * <p>esr-3.3.1</p>
     */
    @NameInMap("displayReleaseVersion")
    public String displayReleaseVersion;

    /**
     * <p>The ID of the Python environment. This parameter takes effect only for notebook sessions.</p>
     * 
     * <strong>example:</strong>
     * <p>env-cpv569tlhtgndjl86t40</p>
     */
    @NameInMap("envId")
    public String envId;

    /**
     * <p>Specifies whether to enable Fusion engine for acceleration.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("fusion")
    public Boolean fusion;

    /**
     * <p>The session type.</p>
     * <ul>
     * <li>SQL</li>
     * <li>NOTEBOOK</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SQL</p>
     */
    @NameInMap("kind")
    public String kind;

    /**
     * <p>The name of the job.</p>
     * 
     * <strong>example:</strong>
     * <p>spark_job_name</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The queue name.</p>
     * 
     * <strong>example:</strong>
     * <p>root_queue</p>
     */
    @NameInMap("queueName")
    public String queueName;

    /**
     * <p>The version number of Spark.</p>
     * 
     * <strong>example:</strong>
     * <p>esr-3.3.1</p>
     */
    @NameInMap("releaseVersion")
    public String releaseVersion;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    public static CreateSessionClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSessionClusterRequest self = new CreateSessionClusterRequest();
        return TeaModel.build(map, self);
    }

    public CreateSessionClusterRequest setApplicationConfigs(java.util.List<CreateSessionClusterRequestApplicationConfigs> applicationConfigs) {
        this.applicationConfigs = applicationConfigs;
        return this;
    }
    public java.util.List<CreateSessionClusterRequestApplicationConfigs> getApplicationConfigs() {
        return this.applicationConfigs;
    }

    public CreateSessionClusterRequest setAutoStartConfiguration(CreateSessionClusterRequestAutoStartConfiguration autoStartConfiguration) {
        this.autoStartConfiguration = autoStartConfiguration;
        return this;
    }
    public CreateSessionClusterRequestAutoStartConfiguration getAutoStartConfiguration() {
        return this.autoStartConfiguration;
    }

    public CreateSessionClusterRequest setAutoStopConfiguration(CreateSessionClusterRequestAutoStopConfiguration autoStopConfiguration) {
        this.autoStopConfiguration = autoStopConfiguration;
        return this;
    }
    public CreateSessionClusterRequestAutoStopConfiguration getAutoStopConfiguration() {
        return this.autoStopConfiguration;
    }

    public CreateSessionClusterRequest setDisplayReleaseVersion(String displayReleaseVersion) {
        this.displayReleaseVersion = displayReleaseVersion;
        return this;
    }
    public String getDisplayReleaseVersion() {
        return this.displayReleaseVersion;
    }

    public CreateSessionClusterRequest setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

    public CreateSessionClusterRequest setFusion(Boolean fusion) {
        this.fusion = fusion;
        return this;
    }
    public Boolean getFusion() {
        return this.fusion;
    }

    public CreateSessionClusterRequest setKind(String kind) {
        this.kind = kind;
        return this;
    }
    public String getKind() {
        return this.kind;
    }

    public CreateSessionClusterRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateSessionClusterRequest setQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }
    public String getQueueName() {
        return this.queueName;
    }

    public CreateSessionClusterRequest setReleaseVersion(String releaseVersion) {
        this.releaseVersion = releaseVersion;
        return this;
    }
    public String getReleaseVersion() {
        return this.releaseVersion;
    }

    public CreateSessionClusterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class CreateSessionClusterRequestApplicationConfigs extends TeaModel {
        /**
         * <p>The name of the configuration file.</p>
         * 
         * <strong>example:</strong>
         * <p>spark-defaults.conf</p>
         */
        @NameInMap("configFileName")
        public String configFileName;

        /**
         * <p>The key of SparkConf.</p>
         * 
         * <strong>example:</strong>
         * <p>spark.app.name</p>
         */
        @NameInMap("configItemKey")
        public String configItemKey;

        /**
         * <p>The value of SparkConf.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("configItemValue")
        public String configItemValue;

        public static CreateSessionClusterRequestApplicationConfigs build(java.util.Map<String, ?> map) throws Exception {
            CreateSessionClusterRequestApplicationConfigs self = new CreateSessionClusterRequestApplicationConfigs();
            return TeaModel.build(map, self);
        }

        public CreateSessionClusterRequestApplicationConfigs setConfigFileName(String configFileName) {
            this.configFileName = configFileName;
            return this;
        }
        public String getConfigFileName() {
            return this.configFileName;
        }

        public CreateSessionClusterRequestApplicationConfigs setConfigItemKey(String configItemKey) {
            this.configItemKey = configItemKey;
            return this;
        }
        public String getConfigItemKey() {
            return this.configItemKey;
        }

        public CreateSessionClusterRequestApplicationConfigs setConfigItemValue(String configItemValue) {
            this.configItemValue = configItemValue;
            return this;
        }
        public String getConfigItemValue() {
            return this.configItemValue;
        }

    }

    public static class CreateSessionClusterRequestAutoStartConfiguration extends TeaModel {
        /**
         * <p>Specifies whether to enable automatic startup.</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        public static CreateSessionClusterRequestAutoStartConfiguration build(java.util.Map<String, ?> map) throws Exception {
            CreateSessionClusterRequestAutoStartConfiguration self = new CreateSessionClusterRequestAutoStartConfiguration();
            return TeaModel.build(map, self);
        }

        public CreateSessionClusterRequestAutoStartConfiguration setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

    }

    public static class CreateSessionClusterRequestAutoStopConfiguration extends TeaModel {
        /**
         * <p>Specifies whether to enable automatic termination.</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>The idle timeout period. The session is automatically terminated when the idle timeout period is exceeded.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("idleTimeoutMinutes")
        public Integer idleTimeoutMinutes;

        public static CreateSessionClusterRequestAutoStopConfiguration build(java.util.Map<String, ?> map) throws Exception {
            CreateSessionClusterRequestAutoStopConfiguration self = new CreateSessionClusterRequestAutoStopConfiguration();
            return TeaModel.build(map, self);
        }

        public CreateSessionClusterRequestAutoStopConfiguration setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public CreateSessionClusterRequestAutoStopConfiguration setIdleTimeoutMinutes(Integer idleTimeoutMinutes) {
            this.idleTimeoutMinutes = idleTimeoutMinutes;
            return this;
        }
        public Integer getIdleTimeoutMinutes() {
            return this.idleTimeoutMinutes;
        }

    }

}
