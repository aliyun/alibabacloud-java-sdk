// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ListKyuubiServicesResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public ListKyuubiServicesResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListKyuubiServicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListKyuubiServicesResponseBody self = new ListKyuubiServicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListKyuubiServicesResponseBody setData(ListKyuubiServicesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListKyuubiServicesResponseBodyData getData() {
        return this.data;
    }

    public ListKyuubiServicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListKyuubiServicesResponseBodyDataKyuubiServices extends TeaModel {
        /**
         * <p>The instance type of the Kyuubi server.</p>
         * 
         * <strong>example:</strong>
         * <p>4C16G</p>
         */
        @NameInMap("computeInstance")
        public String computeInstance;

        /**
         * <p>The time when the server was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-03-11T08:21:58Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The UID of the user who created the server.</p>
         * 
         * <strong>example:</strong>
         * <p>103*******</p>
         */
        @NameInMap("creator")
        public String creator;

        /**
         * <p>The internal endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>kyuubi-cn-hangzhou-internal.spark.emr.aliyuncs.com</p>
         */
        @NameInMap("innerEndpoint")
        public String innerEndpoint;

        /**
         * <p>The Kyuubi server configurations.</p>
         * 
         * <strong>example:</strong>
         * <p>kyuubi.conf.key=value1
         * kyuubi.conf.key1=value2</p>
         */
        @NameInMap("kyuubiConfigs")
        public String kyuubiConfigs;

        /**
         * <p>The version of the Kyuubi server.</p>
         * 
         * <strong>example:</strong>
         * <p>1.9.2-0.0.1</p>
         */
        @NameInMap("kyuubiReleaseVersion")
        public String kyuubiReleaseVersion;

        /**
         * <p>The Kyuubi server ID.</p>
         * 
         * <strong>example:</strong>
         * <p>kb-070104e7631242448d12a1377c309f30</p>
         */
        @NameInMap("kyuubiServiceId")
        public String kyuubiServiceId;

        /**
         * <p>The name of the Kyuubi server.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The public endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>emr-spark-kyuubi-gateway-cn-hangzhou.aliyuncs.com</p>
         */
        @NameInMap("publicEndpoint")
        public String publicEndpoint;

        /**
         * <p>The queue name.</p>
         * 
         * <strong>example:</strong>
         * <p>dev_queue</p>
         */
        @NameInMap("queue")
        public String queue;

        /**
         * <p>The version number of the Spark engine.</p>
         * 
         * <strong>example:</strong>
         * <p>esr-4.2.0 (Spark 3.5.2, Scala 2.12)</p>
         */
        @NameInMap("releaseVersion")
        public String releaseVersion;

        /**
         * <p>The number of replicas for the Kyuubi server.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("replica")
        public Integer replica;

        /**
         * <p>The default configurations for Spark applications launched by the Kyuubi server.</p>
         * 
         * <strong>example:</strong>
         * <p>spark.conf.key=value1
         * spark.conf.key1=value2</p>
         */
        @NameInMap("sparkConfigs")
        public String sparkConfigs;

        /**
         * <p>The time when the Kyuubi server was last started.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-11-23 09:22:00</p>
         */
        @NameInMap("startTime")
        public String startTime;

        /**
         * <p>The status of the Kyuubi server.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("state")
        public String state;

        public static ListKyuubiServicesResponseBodyDataKyuubiServices build(java.util.Map<String, ?> map) throws Exception {
            ListKyuubiServicesResponseBodyDataKyuubiServices self = new ListKyuubiServicesResponseBodyDataKyuubiServices();
            return TeaModel.build(map, self);
        }

        public ListKyuubiServicesResponseBodyDataKyuubiServices setComputeInstance(String computeInstance) {
            this.computeInstance = computeInstance;
            return this;
        }
        public String getComputeInstance() {
            return this.computeInstance;
        }

        public ListKyuubiServicesResponseBodyDataKyuubiServices setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListKyuubiServicesResponseBodyDataKyuubiServices setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListKyuubiServicesResponseBodyDataKyuubiServices setInnerEndpoint(String innerEndpoint) {
            this.innerEndpoint = innerEndpoint;
            return this;
        }
        public String getInnerEndpoint() {
            return this.innerEndpoint;
        }

        public ListKyuubiServicesResponseBodyDataKyuubiServices setKyuubiConfigs(String kyuubiConfigs) {
            this.kyuubiConfigs = kyuubiConfigs;
            return this;
        }
        public String getKyuubiConfigs() {
            return this.kyuubiConfigs;
        }

        public ListKyuubiServicesResponseBodyDataKyuubiServices setKyuubiReleaseVersion(String kyuubiReleaseVersion) {
            this.kyuubiReleaseVersion = kyuubiReleaseVersion;
            return this;
        }
        public String getKyuubiReleaseVersion() {
            return this.kyuubiReleaseVersion;
        }

        public ListKyuubiServicesResponseBodyDataKyuubiServices setKyuubiServiceId(String kyuubiServiceId) {
            this.kyuubiServiceId = kyuubiServiceId;
            return this;
        }
        public String getKyuubiServiceId() {
            return this.kyuubiServiceId;
        }

        public ListKyuubiServicesResponseBodyDataKyuubiServices setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListKyuubiServicesResponseBodyDataKyuubiServices setPublicEndpoint(String publicEndpoint) {
            this.publicEndpoint = publicEndpoint;
            return this;
        }
        public String getPublicEndpoint() {
            return this.publicEndpoint;
        }

        public ListKyuubiServicesResponseBodyDataKyuubiServices setQueue(String queue) {
            this.queue = queue;
            return this;
        }
        public String getQueue() {
            return this.queue;
        }

        public ListKyuubiServicesResponseBodyDataKyuubiServices setReleaseVersion(String releaseVersion) {
            this.releaseVersion = releaseVersion;
            return this;
        }
        public String getReleaseVersion() {
            return this.releaseVersion;
        }

        public ListKyuubiServicesResponseBodyDataKyuubiServices setReplica(Integer replica) {
            this.replica = replica;
            return this;
        }
        public Integer getReplica() {
            return this.replica;
        }

        public ListKyuubiServicesResponseBodyDataKyuubiServices setSparkConfigs(String sparkConfigs) {
            this.sparkConfigs = sparkConfigs;
            return this;
        }
        public String getSparkConfigs() {
            return this.sparkConfigs;
        }

        public ListKyuubiServicesResponseBodyDataKyuubiServices setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListKyuubiServicesResponseBodyDataKyuubiServices setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class ListKyuubiServicesResponseBodyData extends TeaModel {
        /**
         * <p>A list of Kyuubi servers.</p>
         */
        @NameInMap("kyuubiServices")
        public java.util.List<ListKyuubiServicesResponseBodyDataKyuubiServices> kyuubiServices;

        public static ListKyuubiServicesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListKyuubiServicesResponseBodyData self = new ListKyuubiServicesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListKyuubiServicesResponseBodyData setKyuubiServices(java.util.List<ListKyuubiServicesResponseBodyDataKyuubiServices> kyuubiServices) {
            this.kyuubiServices = kyuubiServices;
            return this;
        }
        public java.util.List<ListKyuubiServicesResponseBodyDataKyuubiServices> getKyuubiServices() {
            return this.kyuubiServices;
        }

    }

}
