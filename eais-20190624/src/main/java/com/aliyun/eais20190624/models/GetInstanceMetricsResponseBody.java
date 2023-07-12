// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eais20190624.models;

import com.aliyun.tea.*;

public class GetInstanceMetricsResponseBody extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PodMetrics")
    public java.util.List<GetInstanceMetricsResponseBodyPodMetrics> podMetrics;

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
        @NameInMap("Time")
        public String time;

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
