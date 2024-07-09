// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class StartJobRunRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>8e6aae2810c8f67229ca70bb31cd6028</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>The code type of the job. Valid values:</p>
     * <ul>
     * <li>SQL</li>
     * <li>JAR</li>
     * <li>PYTHON</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SQL</p>
     */
    @NameInMap("codeType")
    public String codeType;

    /**
     * <p>The advanced configurations of Spark.</p>
     */
    @NameInMap("configurationOverrides")
    public StartJobRunRequestConfigurationOverrides configurationOverrides;

    /**
     * <p>The timeout period of the job.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("executionTimeoutSeconds")
    public Integer executionTimeoutSeconds;

    /**
     * <p>The information about Spark Driver.</p>
     */
    @NameInMap("jobDriver")
    public JobDriver jobDriver;

    /**
     * <p>The job ID.</p>
     * 
     * <strong>example:</strong>
     * <p>jr-12345</p>
     */
    @NameInMap("jobId")
    public String jobId;

    /**
     * <p>The job name.</p>
     * 
     * <strong>example:</strong>
     * <p>spark_job_name</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The version number of Spark.</p>
     * 
     * <strong>example:</strong>
     * <p>esr-3.3.1</p>
     */
    @NameInMap("releaseVersion")
    public String releaseVersion;

    /**
     * <p>The name of the resource queue on which the Spark job runs.</p>
     * 
     * <strong>example:</strong>
     * <p>dev_queue</p>
     */
    @NameInMap("resourceQueueId")
    public String resourceQueueId;

    /**
     * <p>The tags of the job.</p>
     */
    @NameInMap("tags")
    public java.util.List<Tag> tags;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    public static StartJobRunRequest build(java.util.Map<String, ?> map) throws Exception {
        StartJobRunRequest self = new StartJobRunRequest();
        return TeaModel.build(map, self);
    }

    public StartJobRunRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public StartJobRunRequest setCodeType(String codeType) {
        this.codeType = codeType;
        return this;
    }
    public String getCodeType() {
        return this.codeType;
    }

    public StartJobRunRequest setConfigurationOverrides(StartJobRunRequestConfigurationOverrides configurationOverrides) {
        this.configurationOverrides = configurationOverrides;
        return this;
    }
    public StartJobRunRequestConfigurationOverrides getConfigurationOverrides() {
        return this.configurationOverrides;
    }

    public StartJobRunRequest setExecutionTimeoutSeconds(Integer executionTimeoutSeconds) {
        this.executionTimeoutSeconds = executionTimeoutSeconds;
        return this;
    }
    public Integer getExecutionTimeoutSeconds() {
        return this.executionTimeoutSeconds;
    }

    public StartJobRunRequest setJobDriver(JobDriver jobDriver) {
        this.jobDriver = jobDriver;
        return this;
    }
    public JobDriver getJobDriver() {
        return this.jobDriver;
    }

    public StartJobRunRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public StartJobRunRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public StartJobRunRequest setReleaseVersion(String releaseVersion) {
        this.releaseVersion = releaseVersion;
        return this;
    }
    public String getReleaseVersion() {
        return this.releaseVersion;
    }

    public StartJobRunRequest setResourceQueueId(String resourceQueueId) {
        this.resourceQueueId = resourceQueueId;
        return this;
    }
    public String getResourceQueueId() {
        return this.resourceQueueId;
    }

    public StartJobRunRequest setTags(java.util.List<Tag> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<Tag> getTags() {
        return this.tags;
    }

    public StartJobRunRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class StartJobRunRequestConfigurationOverridesConfigurations extends TeaModel {
        /**
         * <p>The configuration file of SparkConf.</p>
         * 
         * <strong>example:</strong>
         * <p>spark-default.conf</p>
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
         * <p>test_app</p>
         */
        @NameInMap("configItemValue")
        public String configItemValue;

        public static StartJobRunRequestConfigurationOverridesConfigurations build(java.util.Map<String, ?> map) throws Exception {
            StartJobRunRequestConfigurationOverridesConfigurations self = new StartJobRunRequestConfigurationOverridesConfigurations();
            return TeaModel.build(map, self);
        }

        public StartJobRunRequestConfigurationOverridesConfigurations setConfigFileName(String configFileName) {
            this.configFileName = configFileName;
            return this;
        }
        public String getConfigFileName() {
            return this.configFileName;
        }

        public StartJobRunRequestConfigurationOverridesConfigurations setConfigItemKey(String configItemKey) {
            this.configItemKey = configItemKey;
            return this;
        }
        public String getConfigItemKey() {
            return this.configItemKey;
        }

        public StartJobRunRequestConfigurationOverridesConfigurations setConfigItemValue(String configItemValue) {
            this.configItemValue = configItemValue;
            return this;
        }
        public String getConfigItemValue() {
            return this.configItemValue;
        }

    }

    public static class StartJobRunRequestConfigurationOverrides extends TeaModel {
        /**
         * <p>The SparkConf objects.</p>
         */
        @NameInMap("configurations")
        public java.util.List<StartJobRunRequestConfigurationOverridesConfigurations> configurations;

        public static StartJobRunRequestConfigurationOverrides build(java.util.Map<String, ?> map) throws Exception {
            StartJobRunRequestConfigurationOverrides self = new StartJobRunRequestConfigurationOverrides();
            return TeaModel.build(map, self);
        }

        public StartJobRunRequestConfigurationOverrides setConfigurations(java.util.List<StartJobRunRequestConfigurationOverridesConfigurations> configurations) {
            this.configurations = configurations;
            return this;
        }
        public java.util.List<StartJobRunRequestConfigurationOverridesConfigurations> getConfigurations() {
            return this.configurations;
        }

    }

}
