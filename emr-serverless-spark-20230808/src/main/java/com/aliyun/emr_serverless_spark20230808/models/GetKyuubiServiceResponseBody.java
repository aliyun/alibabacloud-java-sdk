// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class GetKyuubiServiceResponseBody extends TeaModel {
    @NameInMap("data")
    public GetKyuubiServiceResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>8CE06D75-E6A2-505D-9B4B-31DEE3D98A04</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetKyuubiServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetKyuubiServiceResponseBody self = new GetKyuubiServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetKyuubiServiceResponseBody setData(GetKyuubiServiceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetKyuubiServiceResponseBodyData getData() {
        return this.data;
    }

    public GetKyuubiServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetKyuubiServiceResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2c8g</p>
         */
        @NameInMap("computeInstance")
        public String computeInstance;

        /**
         * <strong>example:</strong>
         * <p>1749456094000</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>150978934701****</p>
         */
        @NameInMap("creator")
        public String creator;

        /**
         * <strong>example:</strong>
         * <p>kyuubi-cn-beijing-internal.spark.emr.aliyuncs.com</p>
         */
        @NameInMap("innerEndpoint")
        public String innerEndpoint;

        /**
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("kyuubiConfigs")
        public String kyuubiConfigs;

        /**
         * <strong>example:</strong>
         * <p>1.9.2-0.0.2</p>
         */
        @NameInMap("kyuubiReleaseVersion")
        public String kyuubiReleaseVersion;

        /**
         * <p>Kyuubi Service ID。</p>
         * 
         * <strong>example:</strong>
         * <p>kb-4e209b04588***95f04ad3538ae4</p>
         */
        @NameInMap("kyuubiServiceId")
        public String kyuubiServiceId;

        /**
         * <strong>example:</strong>
         * <p>dev_serverless_spark</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>emr-spark-kyuubi-gateway-cn-beijing.aliyuncs.com</p>
         */
        @NameInMap("publicEndpoint")
        public String publicEndpoint;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("publicEndpointEnabled")
        public Boolean publicEndpointEnabled;

        /**
         * <strong>example:</strong>
         * <p>dev_queue</p>
         */
        @NameInMap("queue")
        public String queue;

        /**
         * <strong>example:</strong>
         * <p>esr-4.6.0 (Spark 3.5.2, Scala 2.12)</p>
         */
        @NameInMap("releaseVersion")
        public String releaseVersion;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("replica")
        public Integer replica;

        /**
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("sparkConfigs")
        public String sparkConfigs;

        /**
         * <strong>example:</strong>
         * <p>1749456094000</p>
         */
        @NameInMap("startTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("state")
        public String state;

        public static GetKyuubiServiceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetKyuubiServiceResponseBodyData self = new GetKyuubiServiceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetKyuubiServiceResponseBodyData setComputeInstance(String computeInstance) {
            this.computeInstance = computeInstance;
            return this;
        }
        public String getComputeInstance() {
            return this.computeInstance;
        }

        public GetKyuubiServiceResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetKyuubiServiceResponseBodyData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetKyuubiServiceResponseBodyData setInnerEndpoint(String innerEndpoint) {
            this.innerEndpoint = innerEndpoint;
            return this;
        }
        public String getInnerEndpoint() {
            return this.innerEndpoint;
        }

        public GetKyuubiServiceResponseBodyData setKyuubiConfigs(String kyuubiConfigs) {
            this.kyuubiConfigs = kyuubiConfigs;
            return this;
        }
        public String getKyuubiConfigs() {
            return this.kyuubiConfigs;
        }

        public GetKyuubiServiceResponseBodyData setKyuubiReleaseVersion(String kyuubiReleaseVersion) {
            this.kyuubiReleaseVersion = kyuubiReleaseVersion;
            return this;
        }
        public String getKyuubiReleaseVersion() {
            return this.kyuubiReleaseVersion;
        }

        public GetKyuubiServiceResponseBodyData setKyuubiServiceId(String kyuubiServiceId) {
            this.kyuubiServiceId = kyuubiServiceId;
            return this;
        }
        public String getKyuubiServiceId() {
            return this.kyuubiServiceId;
        }

        public GetKyuubiServiceResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetKyuubiServiceResponseBodyData setPublicEndpoint(String publicEndpoint) {
            this.publicEndpoint = publicEndpoint;
            return this;
        }
        public String getPublicEndpoint() {
            return this.publicEndpoint;
        }

        public GetKyuubiServiceResponseBodyData setPublicEndpointEnabled(Boolean publicEndpointEnabled) {
            this.publicEndpointEnabled = publicEndpointEnabled;
            return this;
        }
        public Boolean getPublicEndpointEnabled() {
            return this.publicEndpointEnabled;
        }

        public GetKyuubiServiceResponseBodyData setQueue(String queue) {
            this.queue = queue;
            return this;
        }
        public String getQueue() {
            return this.queue;
        }

        public GetKyuubiServiceResponseBodyData setReleaseVersion(String releaseVersion) {
            this.releaseVersion = releaseVersion;
            return this;
        }
        public String getReleaseVersion() {
            return this.releaseVersion;
        }

        public GetKyuubiServiceResponseBodyData setReplica(Integer replica) {
            this.replica = replica;
            return this;
        }
        public Integer getReplica() {
            return this.replica;
        }

        public GetKyuubiServiceResponseBodyData setSparkConfigs(String sparkConfigs) {
            this.sparkConfigs = sparkConfigs;
            return this;
        }
        public String getSparkConfigs() {
            return this.sparkConfigs;
        }

        public GetKyuubiServiceResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetKyuubiServiceResponseBodyData setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
