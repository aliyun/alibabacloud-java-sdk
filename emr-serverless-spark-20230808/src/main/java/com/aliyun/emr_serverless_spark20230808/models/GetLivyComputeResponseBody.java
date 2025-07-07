// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class GetLivyComputeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1000000</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetLivyComputeResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetLivyComputeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLivyComputeResponseBody self = new GetLivyComputeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLivyComputeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetLivyComputeResponseBody setData(GetLivyComputeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetLivyComputeResponseBodyData getData() {
        return this.data;
    }

    public GetLivyComputeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLivyComputeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetLivyComputeResponseBodyDataAutoStopConfiguration extends TeaModel {
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

        public static GetLivyComputeResponseBodyDataAutoStopConfiguration build(java.util.Map<String, ?> map) throws Exception {
            GetLivyComputeResponseBodyDataAutoStopConfiguration self = new GetLivyComputeResponseBodyDataAutoStopConfiguration();
            return TeaModel.build(map, self);
        }

        public GetLivyComputeResponseBodyDataAutoStopConfiguration setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public GetLivyComputeResponseBodyDataAutoStopConfiguration setIdleTimeoutMinutes(Long idleTimeoutMinutes) {
            this.idleTimeoutMinutes = idleTimeoutMinutes;
            return this;
        }
        public Long getIdleTimeoutMinutes() {
            return this.idleTimeoutMinutes;
        }

    }

    public static class GetLivyComputeResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Token</p>
         */
        @NameInMap("authType")
        public String authType;

        @NameInMap("autoStopConfiguration")
        public GetLivyComputeResponseBodyDataAutoStopConfiguration autoStopConfiguration;

        /**
         * <strong>example:</strong>
         * <p>lc-xxxxxxxxxxxxx</p>
         */
        @NameInMap("computeId")
        public String computeId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("cpuLimit")
        public String cpuLimit;

        /**
         * <strong>example:</strong>
         * <p>alice</p>
         */
        @NameInMap("createdBy")
        public String createdBy;

        /**
         * <strong>example:</strong>
         * <p>esr-4.3.0 (Spark 3.5.2, Scala 2.12)</p>
         */
        @NameInMap("displayReleaseVersion")
        public String displayReleaseVersion;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enablePublic")
        public Boolean enablePublic;

        /**
         * <strong>example:</strong>
         * <p>emr-spark-livy-gateway-cn-hangzhou.data.aliyun.com/api/v1/workspace/w-xxxxxxxxx/livycompute/lc-xxxxxxxxxxx</p>
         */
        @NameInMap("endpoint")
        public String endpoint;

        /**
         * <strong>example:</strong>
         * <p>emr-spark-livy-gateway-cn-hangzhou-internal.aliyun.com/api/v1/workspace/w-xxxxxxxxx/livycompute/lc-xxxxxxxxxxx</p>
         */
        @NameInMap("endpointInner")
        public String endpointInner;

        /**
         * <strong>example:</strong>
         * <p>ev-cq31c7tlhtgm9nrrlj4g</p>
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
         * <p>1749456094000</p>
         */
        @NameInMap("gmtCreate")
        public Long gmtCreate;

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
         * <p>10000001</p>
         */
        @NameInMap("ramUserId")
        public String ramUserId;

        /**
         * <strong>example:</strong>
         * <p>esr-4.3.0 (Spark 3.5.2, Scala 2.12, Java Runtime)</p>
         */
        @NameInMap("releaseVersion")
        public String releaseVersion;

        /**
         * <strong>example:</strong>
         * <p>1749456094000</p>
         */
        @NameInMap("startTime")
        public Long startTime;

        /**
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("status")
        public String status;

        public static GetLivyComputeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetLivyComputeResponseBodyData self = new GetLivyComputeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetLivyComputeResponseBodyData setAuthType(String authType) {
            this.authType = authType;
            return this;
        }
        public String getAuthType() {
            return this.authType;
        }

        public GetLivyComputeResponseBodyData setAutoStopConfiguration(GetLivyComputeResponseBodyDataAutoStopConfiguration autoStopConfiguration) {
            this.autoStopConfiguration = autoStopConfiguration;
            return this;
        }
        public GetLivyComputeResponseBodyDataAutoStopConfiguration getAutoStopConfiguration() {
            return this.autoStopConfiguration;
        }

        public GetLivyComputeResponseBodyData setComputeId(String computeId) {
            this.computeId = computeId;
            return this;
        }
        public String getComputeId() {
            return this.computeId;
        }

        public GetLivyComputeResponseBodyData setCpuLimit(String cpuLimit) {
            this.cpuLimit = cpuLimit;
            return this;
        }
        public String getCpuLimit() {
            return this.cpuLimit;
        }

        public GetLivyComputeResponseBodyData setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }
        public String getCreatedBy() {
            return this.createdBy;
        }

        public GetLivyComputeResponseBodyData setDisplayReleaseVersion(String displayReleaseVersion) {
            this.displayReleaseVersion = displayReleaseVersion;
            return this;
        }
        public String getDisplayReleaseVersion() {
            return this.displayReleaseVersion;
        }

        public GetLivyComputeResponseBodyData setEnablePublic(Boolean enablePublic) {
            this.enablePublic = enablePublic;
            return this;
        }
        public Boolean getEnablePublic() {
            return this.enablePublic;
        }

        public GetLivyComputeResponseBodyData setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public GetLivyComputeResponseBodyData setEndpointInner(String endpointInner) {
            this.endpointInner = endpointInner;
            return this;
        }
        public String getEndpointInner() {
            return this.endpointInner;
        }

        public GetLivyComputeResponseBodyData setEnvironmentId(String environmentId) {
            this.environmentId = environmentId;
            return this;
        }
        public String getEnvironmentId() {
            return this.environmentId;
        }

        public GetLivyComputeResponseBodyData setFusion(Boolean fusion) {
            this.fusion = fusion;
            return this;
        }
        public Boolean getFusion() {
            return this.fusion;
        }

        public GetLivyComputeResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public GetLivyComputeResponseBodyData setLivyServerConf(String livyServerConf) {
            this.livyServerConf = livyServerConf;
            return this;
        }
        public String getLivyServerConf() {
            return this.livyServerConf;
        }

        public GetLivyComputeResponseBodyData setLivyVersion(String livyVersion) {
            this.livyVersion = livyVersion;
            return this;
        }
        public String getLivyVersion() {
            return this.livyVersion;
        }

        public GetLivyComputeResponseBodyData setMemoryLimit(String memoryLimit) {
            this.memoryLimit = memoryLimit;
            return this;
        }
        public String getMemoryLimit() {
            return this.memoryLimit;
        }

        public GetLivyComputeResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLivyComputeResponseBodyData setNetworkName(String networkName) {
            this.networkName = networkName;
            return this;
        }
        public String getNetworkName() {
            return this.networkName;
        }

        public GetLivyComputeResponseBodyData setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public GetLivyComputeResponseBodyData setRamUserId(String ramUserId) {
            this.ramUserId = ramUserId;
            return this;
        }
        public String getRamUserId() {
            return this.ramUserId;
        }

        public GetLivyComputeResponseBodyData setReleaseVersion(String releaseVersion) {
            this.releaseVersion = releaseVersion;
            return this;
        }
        public String getReleaseVersion() {
            return this.releaseVersion;
        }

        public GetLivyComputeResponseBodyData setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public GetLivyComputeResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
