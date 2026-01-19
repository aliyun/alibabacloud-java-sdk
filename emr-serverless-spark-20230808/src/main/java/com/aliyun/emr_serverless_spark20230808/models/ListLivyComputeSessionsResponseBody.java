// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ListLivyComputeSessionsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>8FAA8EEC-3026-5D15-8733-4E2A3DD970A1</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("sessions")
    public java.util.List<ListLivyComputeSessionsResponseBodySessions> sessions;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListLivyComputeSessionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLivyComputeSessionsResponseBody self = new ListLivyComputeSessionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLivyComputeSessionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLivyComputeSessionsResponseBody setSessions(java.util.List<ListLivyComputeSessionsResponseBodySessions> sessions) {
        this.sessions = sessions;
        return this;
    }
    public java.util.List<ListLivyComputeSessionsResponseBodySessions> getSessions() {
        return this.sessions;
    }

    public ListLivyComputeSessionsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListLivyComputeSessionsResponseBodySessions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>lc-xxxxxx</p>
         */
        @NameInMap("computeId")
        public String computeId;

        /**
         * <strong>example:</strong>
         * <p>1768213240000</p>
         */
        @NameInMap("createTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>322.5</p>
         */
        @NameInMap("cuHours")
        public Double cuHours;

        /**
         * <strong>example:</strong>
         * <p>1768213240000</p>
         */
        @NameInMap("endTime")
        public Long endTime;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("info")
        public String info;

        /**
         * <strong>example:</strong>
         * <p>1098888</p>
         */
        @NameInMap("mbSeconds")
        public Long mbSeconds;

        /**
         * <strong>example:</strong>
         * <p>test_session</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>root_queue</p>
         */
        @NameInMap("queue")
        public String queue;

        /**
         * <strong>example:</strong>
         * <p>livy-xxxxxx</p>
         */
        @NameInMap("sessionId")
        public String sessionId;

        /**
         * <strong>example:</strong>
         * <p>{
         *     &quot;proxyUser&quot;: &quot;test&quot;,
         *     &quot;conf&quot;: {
         *         &quot;spark.driver.cores&quot;: 1
         *     }
         * }</p>
         */
        @NameInMap("sparkConf")
        public String sparkConf;

        /**
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("state")
        public String state;

        /**
         * <strong>example:</strong>
         * <p>343</p>
         */
        @NameInMap("vcoreSeconds")
        public Long vcoreSeconds;

        /**
         * <strong>example:</strong>
         * <p><a href="http://emr-spark-ui-cn-hangzhou.data.aliyun.com">http://emr-spark-ui-cn-hangzhou.data.aliyun.com</a></p>
         */
        @NameInMap("webUI")
        public String webUI;

        public static ListLivyComputeSessionsResponseBodySessions build(java.util.Map<String, ?> map) throws Exception {
            ListLivyComputeSessionsResponseBodySessions self = new ListLivyComputeSessionsResponseBodySessions();
            return TeaModel.build(map, self);
        }

        public ListLivyComputeSessionsResponseBodySessions setComputeId(String computeId) {
            this.computeId = computeId;
            return this;
        }
        public String getComputeId() {
            return this.computeId;
        }

        public ListLivyComputeSessionsResponseBodySessions setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListLivyComputeSessionsResponseBodySessions setCuHours(Double cuHours) {
            this.cuHours = cuHours;
            return this;
        }
        public Double getCuHours() {
            return this.cuHours;
        }

        public ListLivyComputeSessionsResponseBodySessions setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListLivyComputeSessionsResponseBodySessions setInfo(String info) {
            this.info = info;
            return this;
        }
        public String getInfo() {
            return this.info;
        }

        public ListLivyComputeSessionsResponseBodySessions setMbSeconds(Long mbSeconds) {
            this.mbSeconds = mbSeconds;
            return this;
        }
        public Long getMbSeconds() {
            return this.mbSeconds;
        }

        public ListLivyComputeSessionsResponseBodySessions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListLivyComputeSessionsResponseBodySessions setQueue(String queue) {
            this.queue = queue;
            return this;
        }
        public String getQueue() {
            return this.queue;
        }

        public ListLivyComputeSessionsResponseBodySessions setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public ListLivyComputeSessionsResponseBodySessions setSparkConf(String sparkConf) {
            this.sparkConf = sparkConf;
            return this;
        }
        public String getSparkConf() {
            return this.sparkConf;
        }

        public ListLivyComputeSessionsResponseBodySessions setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListLivyComputeSessionsResponseBodySessions setVcoreSeconds(Long vcoreSeconds) {
            this.vcoreSeconds = vcoreSeconds;
            return this;
        }
        public Long getVcoreSeconds() {
            return this.vcoreSeconds;
        }

        public ListLivyComputeSessionsResponseBodySessions setWebUI(String webUI) {
            this.webUI = webUI;
            return this;
        }
        public String getWebUI() {
            return this.webUI;
        }

    }

}
