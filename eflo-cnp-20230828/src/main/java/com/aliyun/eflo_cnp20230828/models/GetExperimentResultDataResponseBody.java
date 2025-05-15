// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_cnp20230828.models;

import com.aliyun.tea.*;

public class GetExperimentResultDataResponseBody extends TeaModel {
    /**
     * <p>Access Denied Details</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>Data</p>
     */
    @NameInMap("Data")
    public java.util.List<GetExperimentResultDataResponseBodyData> data;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>C1D34EC2-AB13-56F4-8322-F15AE563EA04</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Total Count of Queries</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static GetExperimentResultDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetExperimentResultDataResponseBody self = new GetExperimentResultDataResponseBody();
        return TeaModel.build(map, self);
    }

    public GetExperimentResultDataResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetExperimentResultDataResponseBody setData(java.util.List<GetExperimentResultDataResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetExperimentResultDataResponseBodyData> getData() {
        return this.data;
    }

    public GetExperimentResultDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetExperimentResultDataResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class GetExperimentResultDataResponseBodyDataMetricsInfos extends TeaModel {
        /**
         * <p>GPU</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("Gpu_num")
        public String gpuNum;

        /**
         * <p>Iteration</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Iteration")
        public Long iteration;

        /**
         * <p>TFLOPS</p>
         * 
         * <strong>example:</strong>
         * <p>43</p>
         */
        @NameInMap("Tflops")
        public Double tflops;

        /**
         * <p>Operation Timestamp</p>
         * 
         * <strong>example:</strong>
         * <p>1715393860</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        /**
         * <p>Metric Value</p>
         * 
         * <strong>example:</strong>
         * <p>126</p>
         */
        @NameInMap("Value")
        public Double value;

        public static GetExperimentResultDataResponseBodyDataMetricsInfos build(java.util.Map<String, ?> map) throws Exception {
            GetExperimentResultDataResponseBodyDataMetricsInfos self = new GetExperimentResultDataResponseBodyDataMetricsInfos();
            return TeaModel.build(map, self);
        }

        public GetExperimentResultDataResponseBodyDataMetricsInfos setGpuNum(String gpuNum) {
            this.gpuNum = gpuNum;
            return this;
        }
        public String getGpuNum() {
            return this.gpuNum;
        }

        public GetExperimentResultDataResponseBodyDataMetricsInfos setIteration(Long iteration) {
            this.iteration = iteration;
            return this;
        }
        public Long getIteration() {
            return this.iteration;
        }

        public GetExperimentResultDataResponseBodyDataMetricsInfos setTflops(Double tflops) {
            this.tflops = tflops;
            return this;
        }
        public Double getTflops() {
            return this.tflops;
        }

        public GetExperimentResultDataResponseBodyDataMetricsInfos setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public GetExperimentResultDataResponseBodyDataMetricsInfos setValue(Double value) {
            this.value = value;
            return this;
        }
        public Double getValue() {
            return this.value;
        }

    }

    public static class GetExperimentResultDataResponseBodyData extends TeaModel {
        /**
         * <p>Number of GPUs</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("GpuNum")
        public String gpuNum;

        /**
         * <p>Host IP</p>
         * 
         * <strong>example:</strong>
         * <p>p-jt-waf-app1</p>
         */
        @NameInMap("Hostname")
        public String hostname;

        /**
         * <p>List of Metrics Information</p>
         */
        @NameInMap("MetricsInfos")
        public java.util.List<GetExperimentResultDataResponseBodyDataMetricsInfos> metricsInfos;

        /**
         * <p>Pod Name</p>
         * 
         * <strong>example:</strong>
         * <p>hzs-forge-sdxl-online-7ff4d86444-pc95h</p>
         */
        @NameInMap("PodName")
        public String podName;

        public static GetExperimentResultDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetExperimentResultDataResponseBodyData self = new GetExperimentResultDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetExperimentResultDataResponseBodyData setGpuNum(String gpuNum) {
            this.gpuNum = gpuNum;
            return this;
        }
        public String getGpuNum() {
            return this.gpuNum;
        }

        public GetExperimentResultDataResponseBodyData setHostname(String hostname) {
            this.hostname = hostname;
            return this;
        }
        public String getHostname() {
            return this.hostname;
        }

        public GetExperimentResultDataResponseBodyData setMetricsInfos(java.util.List<GetExperimentResultDataResponseBodyDataMetricsInfos> metricsInfos) {
            this.metricsInfos = metricsInfos;
            return this;
        }
        public java.util.List<GetExperimentResultDataResponseBodyDataMetricsInfos> getMetricsInfos() {
            return this.metricsInfos;
        }

        public GetExperimentResultDataResponseBodyData setPodName(String podName) {
            this.podName = podName;
            return this;
        }
        public String getPodName() {
            return this.podName;
        }

    }

}
