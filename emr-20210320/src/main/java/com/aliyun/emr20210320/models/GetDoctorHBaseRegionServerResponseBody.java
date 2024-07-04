// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class GetDoctorHBaseRegionServerResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public Data data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetDoctorHBaseRegionServerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDoctorHBaseRegionServerResponseBody self = new GetDoctorHBaseRegionServerResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDoctorHBaseRegionServerResponseBody setData(Data data) {
        this.data = data;
        return this;
    }
    public Data getData() {
        return this.data;
    }

    public GetDoctorHBaseRegionServerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AvgGc extends TeaModel {
        /**
         * <p>The description of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>The efficiency of garbage collection in the system</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>avgGc</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The unit of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <p>The value of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>42.3</p>
         */
        @NameInMap("Value")
        public Float value;

        public static AvgGc build(java.util.Map<String, ?> map) throws Exception {
            AvgGc self = new AvgGc();
            return TeaModel.build(map, self);
        }

        public AvgGc setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public AvgGc setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AvgGc setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public AvgGc setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

    public static class CacheRatio extends TeaModel {
        /**
         * <p>The description of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>Ratio of the BlockCache memory size</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>cacheRatio</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The unit of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <p>The value of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>95.3</p>
         */
        @NameInMap("Value")
        public Float value;

        public static CacheRatio build(java.util.Map<String, ?> map) throws Exception {
            CacheRatio self = new CacheRatio();
            return TeaModel.build(map, self);
        }

        public CacheRatio setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CacheRatio setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CacheRatio setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public CacheRatio setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

    public static class DailyReadRequest extends TeaModel {
        /**
         * <p>The description of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>Number of read requests per day</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>dailyReadRequest</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The unit of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <p>The value of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Value")
        public Long value;

        public static DailyReadRequest build(java.util.Map<String, ?> map) throws Exception {
            DailyReadRequest self = new DailyReadRequest();
            return TeaModel.build(map, self);
        }

        public DailyReadRequest setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DailyReadRequest setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DailyReadRequest setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public DailyReadRequest setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

    public static class DailyReadRequestDayGrowthRatio extends TeaModel {
        /**
         * <p>The description of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>The growth rate of daily read request quantity.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>dailyReadRequestDayGrowthRatio</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The unit of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <p>The value of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("Value")
        public Float value;

        public static DailyReadRequestDayGrowthRatio build(java.util.Map<String, ?> map) throws Exception {
            DailyReadRequestDayGrowthRatio self = new DailyReadRequestDayGrowthRatio();
            return TeaModel.build(map, self);
        }

        public DailyReadRequestDayGrowthRatio setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DailyReadRequestDayGrowthRatio setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DailyReadRequestDayGrowthRatio setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public DailyReadRequestDayGrowthRatio setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

    public static class DailyWriteRequest extends TeaModel {
        /**
         * <p>The description of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>Number of write requests per day</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>dailyWriteRequest</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The unit of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <p>The value of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Value")
        public Long value;

        public static DailyWriteRequest build(java.util.Map<String, ?> map) throws Exception {
            DailyWriteRequest self = new DailyWriteRequest();
            return TeaModel.build(map, self);
        }

        public DailyWriteRequest setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DailyWriteRequest setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DailyWriteRequest setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public DailyWriteRequest setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

    public static class DailyWriteRequestDayGrowthRatio extends TeaModel {
        /**
         * <p>The description of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>The growth rate of daily write request quantity.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>dailyWriteRequestDayGrowthRatio</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The unit of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <p>The value of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("Value")
        public Float value;

        public static DailyWriteRequestDayGrowthRatio build(java.util.Map<String, ?> map) throws Exception {
            DailyWriteRequestDayGrowthRatio self = new DailyWriteRequestDayGrowthRatio();
            return TeaModel.build(map, self);
        }

        public DailyWriteRequestDayGrowthRatio setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DailyWriteRequestDayGrowthRatio setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DailyWriteRequestDayGrowthRatio setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public DailyWriteRequestDayGrowthRatio setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

    public static class RegionCount extends TeaModel {
        /**
         * <p>The description of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>Number of regions count</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>regionCount</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The unit of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <p>The value of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("Value")
        public Long value;

        public static RegionCount build(java.util.Map<String, ?> map) throws Exception {
            RegionCount self = new RegionCount();
            return TeaModel.build(map, self);
        }

        public RegionCount setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public RegionCount setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public RegionCount setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public RegionCount setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

    public static class TotalReadRequest extends TeaModel {
        /**
         * <p>The description of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>Total number of read requests</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>totalReadRequest</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The unit of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <p>The value of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Value")
        public Long value;

        public static TotalReadRequest build(java.util.Map<String, ?> map) throws Exception {
            TotalReadRequest self = new TotalReadRequest();
            return TeaModel.build(map, self);
        }

        public TotalReadRequest setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public TotalReadRequest setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public TotalReadRequest setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public TotalReadRequest setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

    public static class TotalRequest extends TeaModel {
        /**
         * <p>The description of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>Total number of requests</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>totalRequest</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The unit of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <p>The value of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Value")
        public Long value;

        public static TotalRequest build(java.util.Map<String, ?> map) throws Exception {
            TotalRequest self = new TotalRequest();
            return TeaModel.build(map, self);
        }

        public TotalRequest setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public TotalRequest setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public TotalRequest setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public TotalRequest setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

    public static class TotalWriteRequest extends TeaModel {
        /**
         * <p>The description of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>Total number of write requests</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>totalWriteRequest</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The unit of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <p>The value of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Value")
        public Long value;

        public static TotalWriteRequest build(java.util.Map<String, ?> map) throws Exception {
            TotalWriteRequest self = new TotalWriteRequest();
            return TeaModel.build(map, self);
        }

        public TotalWriteRequest setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public TotalWriteRequest setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public TotalWriteRequest setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public TotalWriteRequest setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

    public static class Metrics extends TeaModel {
        /**
         * <p>The average garbage collection (GC) duration.</p>
         */
        @NameInMap("AvgGc")
        public AvgGc avgGc;

        /**
         * <p>The cache hit ratio.</p>
         */
        @NameInMap("CacheRatio")
        public CacheRatio cacheRatio;

        /**
         * <p>The number of daily read requests.</p>
         */
        @NameInMap("DailyReadRequest")
        public DailyReadRequest dailyReadRequest;

        /**
         * <p>The day-to-day increment rate of the number of daily read requests.</p>
         */
        @NameInMap("DailyReadRequestDayGrowthRatio")
        public DailyReadRequestDayGrowthRatio dailyReadRequestDayGrowthRatio;

        /**
         * <p>The number of daily write requests.</p>
         */
        @NameInMap("DailyWriteRequest")
        public DailyWriteRequest dailyWriteRequest;

        /**
         * <p>The day-to-day increment rate of the number of daily write requests.</p>
         */
        @NameInMap("DailyWriteRequestDayGrowthRatio")
        public DailyWriteRequestDayGrowthRatio dailyWriteRequestDayGrowthRatio;

        /**
         * <p>The number of regions.</p>
         */
        @NameInMap("RegionCount")
        public RegionCount regionCount;

        /**
         * <p>The cumulative number of read requests.</p>
         */
        @NameInMap("TotalReadRequest")
        public TotalReadRequest totalReadRequest;

        /**
         * <p>The cumulative number of total requests.</p>
         */
        @NameInMap("TotalRequest")
        public TotalRequest totalRequest;

        /**
         * <p>The cumulative number of write requests.</p>
         */
        @NameInMap("TotalWriteRequest")
        public TotalWriteRequest totalWriteRequest;

        public static Metrics build(java.util.Map<String, ?> map) throws Exception {
            Metrics self = new Metrics();
            return TeaModel.build(map, self);
        }

        public Metrics setAvgGc(AvgGc avgGc) {
            this.avgGc = avgGc;
            return this;
        }
        public AvgGc getAvgGc() {
            return this.avgGc;
        }

        public Metrics setCacheRatio(CacheRatio cacheRatio) {
            this.cacheRatio = cacheRatio;
            return this;
        }
        public CacheRatio getCacheRatio() {
            return this.cacheRatio;
        }

        public Metrics setDailyReadRequest(DailyReadRequest dailyReadRequest) {
            this.dailyReadRequest = dailyReadRequest;
            return this;
        }
        public DailyReadRequest getDailyReadRequest() {
            return this.dailyReadRequest;
        }

        public Metrics setDailyReadRequestDayGrowthRatio(DailyReadRequestDayGrowthRatio dailyReadRequestDayGrowthRatio) {
            this.dailyReadRequestDayGrowthRatio = dailyReadRequestDayGrowthRatio;
            return this;
        }
        public DailyReadRequestDayGrowthRatio getDailyReadRequestDayGrowthRatio() {
            return this.dailyReadRequestDayGrowthRatio;
        }

        public Metrics setDailyWriteRequest(DailyWriteRequest dailyWriteRequest) {
            this.dailyWriteRequest = dailyWriteRequest;
            return this;
        }
        public DailyWriteRequest getDailyWriteRequest() {
            return this.dailyWriteRequest;
        }

        public Metrics setDailyWriteRequestDayGrowthRatio(DailyWriteRequestDayGrowthRatio dailyWriteRequestDayGrowthRatio) {
            this.dailyWriteRequestDayGrowthRatio = dailyWriteRequestDayGrowthRatio;
            return this;
        }
        public DailyWriteRequestDayGrowthRatio getDailyWriteRequestDayGrowthRatio() {
            return this.dailyWriteRequestDayGrowthRatio;
        }

        public Metrics setRegionCount(RegionCount regionCount) {
            this.regionCount = regionCount;
            return this;
        }
        public RegionCount getRegionCount() {
            return this.regionCount;
        }

        public Metrics setTotalReadRequest(TotalReadRequest totalReadRequest) {
            this.totalReadRequest = totalReadRequest;
            return this;
        }
        public TotalReadRequest getTotalReadRequest() {
            return this.totalReadRequest;
        }

        public Metrics setTotalRequest(TotalRequest totalRequest) {
            this.totalRequest = totalRequest;
            return this;
        }
        public TotalRequest getTotalRequest() {
            return this.totalRequest;
        }

        public Metrics setTotalWriteRequest(TotalWriteRequest totalWriteRequest) {
            this.totalWriteRequest = totalWriteRequest;
            return this;
        }
        public TotalWriteRequest getTotalWriteRequest() {
            return this.totalWriteRequest;
        }

    }

    public static class Data extends TeaModel {
        /**
         * <p>The metric information.</p>
         */
        @NameInMap("Metrics")
        public Metrics metrics;

        public static Data build(java.util.Map<String, ?> map) throws Exception {
            Data self = new Data();
            return TeaModel.build(map, self);
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
