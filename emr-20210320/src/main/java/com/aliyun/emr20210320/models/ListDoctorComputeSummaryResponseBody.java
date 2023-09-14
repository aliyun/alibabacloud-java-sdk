// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListDoctorComputeSummaryResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<Data> data;

    /**
     * <p>本次请求所返回的最大记录条数。</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>返回读取到的数据位置，空代表数据已经读取完毕。</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>请求ID。</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>本次请求条件下的数据总量。</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListDoctorComputeSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDoctorComputeSummaryResponseBody self = new ListDoctorComputeSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDoctorComputeSummaryResponseBody setData(java.util.List<Data> data) {
        this.data = data;
        return this;
    }
    public java.util.List<Data> getData() {
        return this.data;
    }

    public ListDoctorComputeSummaryResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDoctorComputeSummaryResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDoctorComputeSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDoctorComputeSummaryResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class Analysis extends TeaModel {
        @NameInMap("HealthyJobCount")
        public Long healthyJobCount;

        @NameInMap("NeedAttentionJobCount")
        public Long needAttentionJobCount;

        @NameInMap("Score")
        public Integer score;

        @NameInMap("ScoreDayGrowthRatio")
        public Float scoreDayGrowthRatio;

        @NameInMap("SubHealthyJobCount")
        public Long subHealthyJobCount;

        @NameInMap("UnhealthyJobCount")
        public Long unhealthyJobCount;

        public static Analysis build(java.util.Map<String, ?> map) throws Exception {
            Analysis self = new Analysis();
            return TeaModel.build(map, self);
        }

        public Analysis setHealthyJobCount(Long healthyJobCount) {
            this.healthyJobCount = healthyJobCount;
            return this;
        }
        public Long getHealthyJobCount() {
            return this.healthyJobCount;
        }

        public Analysis setNeedAttentionJobCount(Long needAttentionJobCount) {
            this.needAttentionJobCount = needAttentionJobCount;
            return this;
        }
        public Long getNeedAttentionJobCount() {
            return this.needAttentionJobCount;
        }

        public Analysis setScore(Integer score) {
            this.score = score;
            return this;
        }
        public Integer getScore() {
            return this.score;
        }

        public Analysis setScoreDayGrowthRatio(Float scoreDayGrowthRatio) {
            this.scoreDayGrowthRatio = scoreDayGrowthRatio;
            return this;
        }
        public Float getScoreDayGrowthRatio() {
            return this.scoreDayGrowthRatio;
        }

        public Analysis setSubHealthyJobCount(Long subHealthyJobCount) {
            this.subHealthyJobCount = subHealthyJobCount;
            return this;
        }
        public Long getSubHealthyJobCount() {
            return this.subHealthyJobCount;
        }

        public Analysis setUnhealthyJobCount(Long unhealthyJobCount) {
            this.unhealthyJobCount = unhealthyJobCount;
            return this;
        }
        public Long getUnhealthyJobCount() {
            return this.unhealthyJobCount;
        }

    }

    public static class MemSeconds extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        @NameInMap("Unit")
        public String unit;

        @NameInMap("Value")
        public Long value;

        public static MemSeconds build(java.util.Map<String, ?> map) throws Exception {
            MemSeconds self = new MemSeconds();
            return TeaModel.build(map, self);
        }

        public MemSeconds setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public MemSeconds setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public MemSeconds setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public MemSeconds setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

    public static class MemSecondsDayGrowthRatio extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        @NameInMap("Unit")
        public String unit;

        @NameInMap("Value")
        public Float value;

        public static MemSecondsDayGrowthRatio build(java.util.Map<String, ?> map) throws Exception {
            MemSecondsDayGrowthRatio self = new MemSecondsDayGrowthRatio();
            return TeaModel.build(map, self);
        }

        public MemSecondsDayGrowthRatio setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public MemSecondsDayGrowthRatio setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public MemSecondsDayGrowthRatio setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public MemSecondsDayGrowthRatio setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

    public static class MemUtilization extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        @NameInMap("Unit")
        public String unit;

        @NameInMap("Value")
        public Float value;

        public static MemUtilization build(java.util.Map<String, ?> map) throws Exception {
            MemUtilization self = new MemUtilization();
            return TeaModel.build(map, self);
        }

        public MemUtilization setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public MemUtilization setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public MemUtilization setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public MemUtilization setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

    public static class ReadSize extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        @NameInMap("Unit")
        public String unit;

        @NameInMap("Value")
        public Long value;

        public static ReadSize build(java.util.Map<String, ?> map) throws Exception {
            ReadSize self = new ReadSize();
            return TeaModel.build(map, self);
        }

        public ReadSize setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ReadSize setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ReadSize setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public ReadSize setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

    public static class VcoreSeconds extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        @NameInMap("Unit")
        public String unit;

        @NameInMap("Value")
        public Long value;

        public static VcoreSeconds build(java.util.Map<String, ?> map) throws Exception {
            VcoreSeconds self = new VcoreSeconds();
            return TeaModel.build(map, self);
        }

        public VcoreSeconds setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public VcoreSeconds setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public VcoreSeconds setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public VcoreSeconds setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

    public static class VcoreSecondsDayGrowthRatio extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        @NameInMap("Unit")
        public String unit;

        @NameInMap("Value")
        public Float value;

        public static VcoreSecondsDayGrowthRatio build(java.util.Map<String, ?> map) throws Exception {
            VcoreSecondsDayGrowthRatio self = new VcoreSecondsDayGrowthRatio();
            return TeaModel.build(map, self);
        }

        public VcoreSecondsDayGrowthRatio setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public VcoreSecondsDayGrowthRatio setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public VcoreSecondsDayGrowthRatio setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public VcoreSecondsDayGrowthRatio setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

    public static class VcoreUtilization extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        @NameInMap("Unit")
        public String unit;

        @NameInMap("Value")
        public Float value;

        public static VcoreUtilization build(java.util.Map<String, ?> map) throws Exception {
            VcoreUtilization self = new VcoreUtilization();
            return TeaModel.build(map, self);
        }

        public VcoreUtilization setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public VcoreUtilization setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public VcoreUtilization setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public VcoreUtilization setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

    public static class WriteSize extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        @NameInMap("Unit")
        public String unit;

        @NameInMap("Value")
        public Long value;

        public static WriteSize build(java.util.Map<String, ?> map) throws Exception {
            WriteSize self = new WriteSize();
            return TeaModel.build(map, self);
        }

        public WriteSize setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public WriteSize setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public WriteSize setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public WriteSize setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

    public static class Metrics extends TeaModel {
        @NameInMap("MemSeconds")
        public MemSeconds memSeconds;

        @NameInMap("MemSecondsDayGrowthRatio")
        public MemSecondsDayGrowthRatio memSecondsDayGrowthRatio;

        @NameInMap("MemUtilization")
        public MemUtilization memUtilization;

        @NameInMap("ReadSize")
        public ReadSize readSize;

        @NameInMap("VcoreSeconds")
        public VcoreSeconds vcoreSeconds;

        @NameInMap("VcoreSecondsDayGrowthRatio")
        public VcoreSecondsDayGrowthRatio vcoreSecondsDayGrowthRatio;

        @NameInMap("VcoreUtilization")
        public VcoreUtilization vcoreUtilization;

        @NameInMap("WriteSize")
        public WriteSize writeSize;

        public static Metrics build(java.util.Map<String, ?> map) throws Exception {
            Metrics self = new Metrics();
            return TeaModel.build(map, self);
        }

        public Metrics setMemSeconds(MemSeconds memSeconds) {
            this.memSeconds = memSeconds;
            return this;
        }
        public MemSeconds getMemSeconds() {
            return this.memSeconds;
        }

        public Metrics setMemSecondsDayGrowthRatio(MemSecondsDayGrowthRatio memSecondsDayGrowthRatio) {
            this.memSecondsDayGrowthRatio = memSecondsDayGrowthRatio;
            return this;
        }
        public MemSecondsDayGrowthRatio getMemSecondsDayGrowthRatio() {
            return this.memSecondsDayGrowthRatio;
        }

        public Metrics setMemUtilization(MemUtilization memUtilization) {
            this.memUtilization = memUtilization;
            return this;
        }
        public MemUtilization getMemUtilization() {
            return this.memUtilization;
        }

        public Metrics setReadSize(ReadSize readSize) {
            this.readSize = readSize;
            return this;
        }
        public ReadSize getReadSize() {
            return this.readSize;
        }

        public Metrics setVcoreSeconds(VcoreSeconds vcoreSeconds) {
            this.vcoreSeconds = vcoreSeconds;
            return this;
        }
        public VcoreSeconds getVcoreSeconds() {
            return this.vcoreSeconds;
        }

        public Metrics setVcoreSecondsDayGrowthRatio(VcoreSecondsDayGrowthRatio vcoreSecondsDayGrowthRatio) {
            this.vcoreSecondsDayGrowthRatio = vcoreSecondsDayGrowthRatio;
            return this;
        }
        public VcoreSecondsDayGrowthRatio getVcoreSecondsDayGrowthRatio() {
            return this.vcoreSecondsDayGrowthRatio;
        }

        public Metrics setVcoreUtilization(VcoreUtilization vcoreUtilization) {
            this.vcoreUtilization = vcoreUtilization;
            return this;
        }
        public VcoreUtilization getVcoreUtilization() {
            return this.vcoreUtilization;
        }

        public Metrics setWriteSize(WriteSize writeSize) {
            this.writeSize = writeSize;
            return this;
        }
        public WriteSize getWriteSize() {
            return this.writeSize;
        }

    }

    public static class Data extends TeaModel {
        @NameInMap("Analysis")
        public Analysis analysis;

        @NameInMap("ComponentName")
        public String componentName;

        @NameInMap("Metrics")
        public Metrics metrics;

        public static Data build(java.util.Map<String, ?> map) throws Exception {
            Data self = new Data();
            return TeaModel.build(map, self);
        }

        public Data setAnalysis(Analysis analysis) {
            this.analysis = analysis;
            return this;
        }
        public Analysis getAnalysis() {
            return this.analysis;
        }

        public Data setComponentName(String componentName) {
            this.componentName = componentName;
            return this;
        }
        public String getComponentName() {
            return this.componentName;
        }

        public Data setMetrics(Metrics metrics) {
            this.metrics = metrics;
            return this;
        }
        public Metrics getMetrics() {
            return this.metrics;
        }

    }

}
