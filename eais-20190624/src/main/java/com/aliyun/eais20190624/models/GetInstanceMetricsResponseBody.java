// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eais20190624.models;

import com.aliyun.tea.*;

public class GetInstanceMetricsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>eais-bj8b53it29hfhj******</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PodMetrics")
    public java.util.List<GetInstanceMetricsResponseBodyPodMetrics> podMetrics;

    /**
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetInstanceMetricsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceMetricsResponseBody self = new GetInstanceMetricsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceMetricsResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetInstanceMetricsResponseBody setPodMetrics(java.util.List<GetInstanceMetricsResponseBodyPodMetrics> podMetrics) {
        this.podMetrics = podMetrics;
        return this;
    }
    public java.util.List<GetInstanceMetricsResponseBodyPodMetrics> getPodMetrics() {
        return this.podMetrics;
    }

    public GetInstanceMetricsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetInstanceMetricsResponseBodyPodMetricsMetrics extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1669107528450</p>
         */
        @NameInMap("Time")
        public String time;

        /**
         * <strong>example:</strong>
         * <p>4.536552540058814</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetInstanceMetricsResponseBodyPodMetricsMetrics build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceMetricsResponseBodyPodMetricsMetrics self = new GetInstanceMetricsResponseBodyPodMetricsMetrics();
            return TeaModel.build(map, self);
        }

        public GetInstanceMetricsResponseBodyPodMetricsMetrics setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public GetInstanceMetricsResponseBodyPodMetricsMetrics setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetInstanceMetricsResponseBodyPodMetrics extends TeaModel {
        @NameInMap("Metrics")
        public java.util.List<GetInstanceMetricsResponseBodyPodMetricsMetrics> metrics;

        /**
         * <p>Pod ID。</p>
         * 
         * <strong>example:</strong>
         * <p>eais-hznzre6ffmz9num4****-579b587ddf-9txr6</p>
         */
        @NameInMap("PodId")
        public String podId;

        public static GetInstanceMetricsResponseBodyPodMetrics build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceMetricsResponseBodyPodMetrics self = new GetInstanceMetricsResponseBodyPodMetrics();
            return TeaModel.build(map, self);
        }

        public GetInstanceMetricsResponseBodyPodMetrics setMetrics(java.util.List<GetInstanceMetricsResponseBodyPodMetricsMetrics> metrics) {
            this.metrics = metrics;
            return this;
        }
        public java.util.List<GetInstanceMetricsResponseBodyPodMetricsMetrics> getMetrics() {
            return this.metrics;
        }

        public GetInstanceMetricsResponseBodyPodMetrics setPodId(String podId) {
            this.podId = podId;
            return this;
        }
        public String getPodId() {
            return this.podId;
        }

    }

}
