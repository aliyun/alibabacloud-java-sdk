// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class CapacityPlanRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("complexQueryAvailable")
    public Boolean complexQueryAvailable;

    @NameInMap("dataInfo")
    public java.util.List<CapacityPlanRequestDataInfo> dataInfo;

    @NameInMap("metric")
    public java.util.List<CapacityPlanRequestMetric> metric;

    /**
     * <strong>example:</strong>
     * <p>general</p>
     */
    @NameInMap("usageScenario")
    public String usageScenario;

    public static CapacityPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        CapacityPlanRequest self = new CapacityPlanRequest();
        return TeaModel.build(map, self);
    }

    public CapacityPlanRequest setComplexQueryAvailable(Boolean complexQueryAvailable) {
        this.complexQueryAvailable = complexQueryAvailable;
        return this;
    }
    public Boolean getComplexQueryAvailable() {
        return this.complexQueryAvailable;
    }

    public CapacityPlanRequest setDataInfo(java.util.List<CapacityPlanRequestDataInfo> dataInfo) {
        this.dataInfo = dataInfo;
        return this;
    }
    public java.util.List<CapacityPlanRequestDataInfo> getDataInfo() {
        return this.dataInfo;
    }

    public CapacityPlanRequest setMetric(java.util.List<CapacityPlanRequestMetric> metric) {
        this.metric = metric;
        return this;
    }
    public java.util.List<CapacityPlanRequestMetric> getMetric() {
        return this.metric;
    }

    public CapacityPlanRequest setUsageScenario(String usageScenario) {
        this.usageScenario = usageScenario;
        return this;
    }
    public String getUsageScenario() {
        return this.usageScenario;
    }

    public static class CapacityPlanRequestDataInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>totalRawData</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("size")
        public Long size;

        /**
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("totalCount")
        public Integer totalCount;

        /**
         * <strong>example:</strong>
         * <p>hot</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>MiB</p>
         */
        @NameInMap("unit")
        public String unit;

        public static CapacityPlanRequestDataInfo build(java.util.Map<String, ?> map) throws Exception {
            CapacityPlanRequestDataInfo self = new CapacityPlanRequestDataInfo();
            return TeaModel.build(map, self);
        }

        public CapacityPlanRequestDataInfo setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CapacityPlanRequestDataInfo setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public CapacityPlanRequestDataInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public CapacityPlanRequestDataInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CapacityPlanRequestDataInfo setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

    }

    public static class CapacityPlanRequestMetric extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("averageQps")
        public Integer averageQps;

        /**
         * <strong>example:</strong>
         * <p>write</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("concurrent")
        public Long concurrent;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("peakQps")
        public Integer peakQps;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("responseTime")
        public Integer responseTime;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("throughput")
        public Long throughput;

        /**
         * <strong>example:</strong>
         * <p>common</p>
         */
        @NameInMap("type")
        public String type;

        public static CapacityPlanRequestMetric build(java.util.Map<String, ?> map) throws Exception {
            CapacityPlanRequestMetric self = new CapacityPlanRequestMetric();
            return TeaModel.build(map, self);
        }

        public CapacityPlanRequestMetric setAverageQps(Integer averageQps) {
            this.averageQps = averageQps;
            return this;
        }
        public Integer getAverageQps() {
            return this.averageQps;
        }

        public CapacityPlanRequestMetric setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CapacityPlanRequestMetric setConcurrent(Long concurrent) {
            this.concurrent = concurrent;
            return this;
        }
        public Long getConcurrent() {
            return this.concurrent;
        }

        public CapacityPlanRequestMetric setPeakQps(Integer peakQps) {
            this.peakQps = peakQps;
            return this;
        }
        public Integer getPeakQps() {
            return this.peakQps;
        }

        public CapacityPlanRequestMetric setResponseTime(Integer responseTime) {
            this.responseTime = responseTime;
            return this;
        }
        public Integer getResponseTime() {
            return this.responseTime;
        }

        public CapacityPlanRequestMetric setThroughput(Long throughput) {
            this.throughput = throughput;
            return this;
        }
        public Long getThroughput() {
            return this.throughput;
        }

        public CapacityPlanRequestMetric setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
