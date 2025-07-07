// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class UpdateLivyComputeRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Token</p>
     */
    @NameInMap("authType")
    public String authType;

    @NameInMap("autoStartConfiguration")
    public UpdateLivyComputeRequestAutoStartConfiguration autoStartConfiguration;

    @NameInMap("autoStopConfiguration")
    public UpdateLivyComputeRequestAutoStopConfiguration autoStopConfiguration;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("cpuLimit")
    public String cpuLimit;

    /**
     * <strong>example:</strong>
     * <p>esr-4.3.0 (Spark 3.5.2, Scala 2.12)</p>
     */
    @NameInMap("displayReleaseVersion")
    public String displayReleaseVersion;

    @NameInMap("enablePublic")
    public Boolean enablePublic;

    /**
     * <strong>example:</strong>
     * <p>ev-cq146allhtgkulp5smk0</p>
     */
    @NameInMap("environmentId")
    public String environmentId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("fusion")
    public Boolean fusion;

    /**
     * <strong>example:</strong>
     * <p>{
     *   &quot;sparkDefaultsConf&quot;: &quot;spark.driver.cores     1\nspark.driver.memory    4g\nspark.executor.cores   1\nspark.executor.memory  4g\n&quot;,
     *   &quot;sparkBlackListConf&quot;: &quot;spark.driver.cores\nspark.driver.memory&quot;,
     *   &quot;livyConf&quot;: &quot;livy.server.session.timeout  1h\n&quot;,
     *   &quot;livyClientConf&quot;: &quot;livy.rsc.sql.num-rows  1000\n&quot;
     * }</p>
     */
    @NameInMap("livyServerConf")
    public String livyServerConf;

    /**
     * <strong>example:</strong>
     * <p>0.8.0</p>
     */
    @NameInMap("livyVersion")
    public String livyVersion;

    /**
     * <strong>example:</strong>
     * <p>4Gi</p>
     */
    @NameInMap("memoryLimit")
    public String memoryLimit;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("networkName")
    public String networkName;

    /**
     * <strong>example:</strong>
     * <p>root_queue</p>
     */
    @NameInMap("queueName")
    public String queueName;

    /**
     * <strong>example:</strong>
     * <p>esr-4.3.0 (Spark 3.5.2, Scala 2.12, Java Runtime)</p>
     */
    @NameInMap("releaseVersion")
    public String releaseVersion;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    public static UpdateLivyComputeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLivyComputeRequest self = new UpdateLivyComputeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLivyComputeRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public UpdateLivyComputeRequest setAutoStartConfiguration(UpdateLivyComputeRequestAutoStartConfiguration autoStartConfiguration) {
        this.autoStartConfiguration = autoStartConfiguration;
        return this;
    }
    public UpdateLivyComputeRequestAutoStartConfiguration getAutoStartConfiguration() {
        return this.autoStartConfiguration;
    }

    public UpdateLivyComputeRequest setAutoStopConfiguration(UpdateLivyComputeRequestAutoStopConfiguration autoStopConfiguration) {
        this.autoStopConfiguration = autoStopConfiguration;
        return this;
    }
    public UpdateLivyComputeRequestAutoStopConfiguration getAutoStopConfiguration() {
        return this.autoStopConfiguration;
    }

    public UpdateLivyComputeRequest setCpuLimit(String cpuLimit) {
        this.cpuLimit = cpuLimit;
        return this;
    }
    public String getCpuLimit() {
        return this.cpuLimit;
    }

    public UpdateLivyComputeRequest setDisplayReleaseVersion(String displayReleaseVersion) {
        this.displayReleaseVersion = displayReleaseVersion;
        return this;
    }
    public String getDisplayReleaseVersion() {
        return this.displayReleaseVersion;
    }

    public UpdateLivyComputeRequest setEnablePublic(Boolean enablePublic) {
        this.enablePublic = enablePublic;
        return this;
    }
    public Boolean getEnablePublic() {
        return this.enablePublic;
    }

    public UpdateLivyComputeRequest setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }
    public String getEnvironmentId() {
        return this.environmentId;
    }

    public UpdateLivyComputeRequest setFusion(Boolean fusion) {
        this.fusion = fusion;
        return this;
    }
    public Boolean getFusion() {
        return this.fusion;
    }

    public UpdateLivyComputeRequest setLivyServerConf(String livyServerConf) {
        this.livyServerConf = livyServerConf;
        return this;
    }
    public String getLivyServerConf() {
        return this.livyServerConf;
    }

    public UpdateLivyComputeRequest setLivyVersion(String livyVersion) {
        this.livyVersion = livyVersion;
        return this;
    }
    public String getLivyVersion() {
        return this.livyVersion;
    }

    public UpdateLivyComputeRequest setMemoryLimit(String memoryLimit) {
        this.memoryLimit = memoryLimit;
        return this;
    }
    public String getMemoryLimit() {
        return this.memoryLimit;
    }

    public UpdateLivyComputeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateLivyComputeRequest setNetworkName(String networkName) {
        this.networkName = networkName;
        return this;
    }
    public String getNetworkName() {
        return this.networkName;
    }

    public UpdateLivyComputeRequest setQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }
    public String getQueueName() {
        return this.queueName;
    }

    public UpdateLivyComputeRequest setReleaseVersion(String releaseVersion) {
        this.releaseVersion = releaseVersion;
        return this;
    }
    public String getReleaseVersion() {
        return this.releaseVersion;
    }

    public UpdateLivyComputeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class UpdateLivyComputeRequestAutoStartConfiguration extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        public static UpdateLivyComputeRequestAutoStartConfiguration build(java.util.Map<String, ?> map) throws Exception {
            UpdateLivyComputeRequestAutoStartConfiguration self = new UpdateLivyComputeRequestAutoStartConfiguration();
            return TeaModel.build(map, self);
        }

        public UpdateLivyComputeRequestAutoStartConfiguration setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

    }

    public static class UpdateLivyComputeRequestAutoStopConfiguration extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("idleTimeoutMinutes")
        public Long idleTimeoutMinutes;

        public static UpdateLivyComputeRequestAutoStopConfiguration build(java.util.Map<String, ?> map) throws Exception {
            UpdateLivyComputeRequestAutoStopConfiguration self = new UpdateLivyComputeRequestAutoStopConfiguration();
            return TeaModel.build(map, self);
        }

        public UpdateLivyComputeRequestAutoStopConfiguration setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public UpdateLivyComputeRequestAutoStopConfiguration setIdleTimeoutMinutes(Long idleTimeoutMinutes) {
            this.idleTimeoutMinutes = idleTimeoutMinutes;
            return this;
        }
        public Long getIdleTimeoutMinutes() {
            return this.idleTimeoutMinutes;
        }

    }

}
