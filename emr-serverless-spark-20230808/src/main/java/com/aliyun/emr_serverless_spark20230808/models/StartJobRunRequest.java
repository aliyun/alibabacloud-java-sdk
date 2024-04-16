// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class StartJobRunRequest extends TeaModel {
    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("codeType")
    public String codeType;

    @NameInMap("configurationOverrides")
    public StartJobRunRequestConfigurationOverrides configurationOverrides;

    @NameInMap("executionTimeoutSeconds")
    public Integer executionTimeoutSeconds;

    @NameInMap("jobDriver")
    public JobDriver jobDriver;

    @NameInMap("jobId")
    public String jobId;

    @NameInMap("name")
    public String name;

    @NameInMap("releaseVersion")
    public String releaseVersion;

    @NameInMap("resourceQueueId")
    public String resourceQueueId;

    @NameInMap("tags")
    public java.util.List<Tag> tags;

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
        @NameInMap("configFileName")
        public String configFileName;

        @NameInMap("configItemKey")
        public String configItemKey;

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
