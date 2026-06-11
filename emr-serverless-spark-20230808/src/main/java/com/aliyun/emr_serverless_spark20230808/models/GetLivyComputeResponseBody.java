// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class GetLivyComputeResponseBody extends TeaModel {
    /**
     * <p>The response code. A value of 1000000 indicates a successful request. Other values indicate a failed request. Check the message parameter for the error details.</p>
     * 
     * <strong>example:</strong>
     * <p>1000000</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public GetLivyComputeResponseBodyData data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
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
         * <p>Indicates whether to automatically start the gateway after it is created.</p>
         * <ul>
         * <li><p>true: Yes.</p>
         * </li>
         * <li><p>false: No.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>The number of minutes after which the Livy Gateway is automatically stopped if it is idle.</p>
         * 
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
         * <p>The authentication method.</p>
         * 
         * <strong>example:</strong>
         * <p>Token</p>
         */
        @NameInMap("authType")
        public String authType;

        /**
         * <p>The auto-stop configuration.</p>
         */
        @NameInMap("autoStopConfiguration")
        public GetLivyComputeResponseBodyDataAutoStopConfiguration autoStopConfiguration;

        /**
         * <p>The ID of the Livy Gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>lc-xxxxxxxxxxxxx</p>
         */
        @NameInMap("computeId")
        public String computeId;

        /**
         * <p>The number of CPU cores for the Livy server.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("cpuLimit")
        public String cpuLimit;

        /**
         * <p>The name of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        @NameInMap("createdBy")
        public String createdBy;

        /**
         * <p>The version number of the Spark engine.</p>
         * 
         * <strong>example:</strong>
         * <p>esr-4.3.0 (Spark 3.5.2, Scala 2.12)</p>
         */
        @NameInMap("displayReleaseVersion")
        public String displayReleaseVersion;

        /**
         * <p>The status of the public endpoint switch.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enablePublic")
        public Boolean enablePublic;

        /**
         * <p>The public endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>emr-spark-livy-gateway-cn-hangzhou.data.aliyun.com/api/v1/workspace/w-xxxxxxxxx/livycompute/lc-xxxxxxxxxxx</p>
         */
        @NameInMap("endpoint")
        public String endpoint;

        /**
         * <p>The internal endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>emr-spark-livy-gateway-cn-hangzhou-internal.aliyun.com/api/v1/workspace/w-xxxxxxxxx/livycompute/lc-xxxxxxxxxxx</p>
         */
        @NameInMap("endpointInner")
        public String endpointInner;

        /**
         * <p>The ID of the runtime environment.</p>
         * 
         * <strong>example:</strong>
         * <p>ev-cq31c7tlhtgm9nrrlj4g</p>
         */
        @NameInMap("environmentId")
        public String environmentId;

        /**
         * <p>Indicates whether the fusion switch is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("fusion")
        public Boolean fusion;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1749456094000</p>
         */
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        /**
         * <p>The Livy Gateway configuration in JSON format. The following files are supported:</p>
         * <ul>
         * <li><p>sparkDefaultsConf</p>
         * </li>
         * <li><p>sparkBlackListConf</p>
         * </li>
         * <li><p>livyConf</p>
         * </li>
         * <li><p>livyClientConf</p>
         * </li>
         * </ul>
         * 
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
         * <p>The Livy version.</p>
         * 
         * <strong>example:</strong>
         * <p>0.8.0</p>
         */
        @NameInMap("livyVersion")
        public String livyVersion;

        /**
         * <p>The memory size of the Livy server.</p>
         * 
         * <strong>example:</strong>
         * <p>4Gi</p>
         */
        @NameInMap("memoryLimit")
        public String memoryLimit;

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The name of the network connection.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("networkName")
        public String networkName;

        /**
         * <p>The queue name.</p>
         * 
         * <strong>example:</strong>
         * <p>root_queue</p>
         */
        @NameInMap("queueName")
        public String queueName;

        /**
         * <p>The ID of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>10000001</p>
         */
        @NameInMap("ramUserId")
        public String ramUserId;

        /**
         * <p>The version number of the Spark engine. This parameter is deprecated. Use displayReleaseVersion instead.</p>
         * 
         * <strong>example:</strong>
         * <p>esr-4.3.0 (Spark 3.5.2, Scala 2.12, Java Runtime)</p>
         */
        @NameInMap("releaseVersion")
        public String releaseVersion;

        /**
         * <p>The start time.</p>
         * 
         * <strong>example:</strong>
         * <p>1749456094000</p>
         */
        @NameInMap("startTime")
        public Long startTime;

        /**
         * <p>The running status.</p>
         * 
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
