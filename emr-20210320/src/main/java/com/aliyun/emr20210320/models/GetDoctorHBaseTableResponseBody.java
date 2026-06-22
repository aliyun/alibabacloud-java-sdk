// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class GetDoctorHBaseTableResponseBody extends TeaModel {
    /**
     * <p>Returned data.</p>
     */
    @NameInMap("Data")
    public Data data;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetDoctorHBaseTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDoctorHBaseTableResponseBody self = new GetDoctorHBaseTableResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDoctorHBaseTableResponseBody setData(Data data) {
        this.data = data;
        return this;
    }
    public Data getData() {
        return this.data;
    }

    public GetDoctorHBaseTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class Analysis extends TeaModel {
        /**
         * <p>List of read hotspot regions.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("ReadRequestHotspotRegionList")
        public java.util.List<String> readRequestHotspotRegionList;

        /**
         * <p>Description of read imbalance.</p>
         * 
         * <strong>example:</strong>
         * <p>read request unbalance is &lt;p class=\&quot;report-detail-topic\&quot;&gt;表分区总数量为14，分区平均读请求数量为5032486，以下分区存在读请求热点访问：</p>&lt;ul class=\&quot;report-detail-ul\&quot;&gt;&lt;li class=\&quot;.report-detail-li\&quot;&gt;RegionServer： emr-worker-4 Region Id： 4ac818a3ab3fd727490a5b4d4dac7667 读请求数量： 15485664</li>&lt;li class=\&quot;.report-detail-li\&quot;&gt;RegionServer： emr-worker-2 Region Id： 021b387ae92959def65041e25eade3aa 读请求数量： 7731980</li>&lt;li class=\&quot;.report-detail-li\&quot;&gt;RegionServer： emr-worker-2 Region Id： d58f33abfe857e5fd0045eaa31c93df8 读请求数量： 7705237</li>&lt;li class=\&quot;.report-detail-li\&quot;&gt;RegionServer： emr-worker-2 Region Id： 4ca84757a7d0948b8552cfeebefa25a9 读请求数量： 7703492</li>&lt;li class=\&quot;.report-detail-li\&quot;&gt;RegionServer： emr-worker-4 Region Id： 1018192dae42995fc75c6d5b5981a9b7 读请求数量： 7695284</li></ul>&lt;p style=\&quot;line-height： 16px; font-size： 16px; margin： 0 auto\&quot;&gt;&nbsp;</p></p>
         */
        @NameInMap("ReadRequestUnbalanceSuggestion")
        public String readRequestUnbalanceSuggestion;

        /**
         * <p>List of read/write hotspot regions.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("RequestHotspotRegionList")
        public java.util.List<String> requestHotspotRegionList;

        /**
         * <p>Description of read/write imbalance.</p>
         * 
         * <strong>example:</strong>
         * <p>read request unbalance is &lt;p class=\&quot;report-detail-topic\&quot;&gt;表分区总数量为14，分区平均读请求数量为5032486，以下分区存在读请求热点访问：</p>&lt;ul class=\&quot;report-detail-ul\&quot;&gt;&lt;li class=\&quot;.report-detail-li\&quot;&gt;RegionServer： emr-worker-4 Region Id： 4ac818a3ab3fd727490a5b4d4dac7667 读请求数量： 15485664</li>&lt;li class=\&quot;.report-detail-li\&quot;&gt;RegionServer： emr-worker-2 Region Id： 021b387ae92959def65041e25eade3aa 读请求数量： 7731980</li>&lt;li class=\&quot;.report-detail-li\&quot;&gt;RegionServer： emr-worker-2 Region Id： d58f33abfe857e5fd0045eaa31c93df8 读请求数量： 7705237</li>&lt;li class=\&quot;.report-detail-li\&quot;&gt;RegionServer： emr-worker-2 Region Id： 4ca84757a7d0948b8552cfeebefa25a9 读请求数量： 7703492</li>&lt;li class=\&quot;.report-detail-li\&quot;&gt;RegionServer： emr-worker-4 Region Id： 1018192dae42995fc75c6d5b5981a9b7 读请求数量： 7695284</li></ul>&lt;p style=\&quot;line-height： 16px; font-size： 16px; margin： 0 auto\&quot;&gt;&nbsp;</p></p>
         */
        @NameInMap("RequestUnbalanceSuggestion")
        public String requestUnbalanceSuggestion;

        /**
         * <p>Table score.</p>
         * 
         * <strong>example:</strong>
         * <p>85</p>
         */
        @NameInMap("TableScore")
        public Integer tableScore;

        /**
         * <p>List of write hotspot regions.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("WriteRequestHotspotRegionList")
        public java.util.List<String> writeRequestHotspotRegionList;

        /**
         * <p>Description of write imbalance.</p>
         * 
         * <strong>example:</strong>
         * <p>write request unbalance is &lt;p class=\&quot;report-detail-topic\&quot;&gt;表分区总数量为15，分区平均写请求数量为769954，以下分区存在写请求热点访问：</p>&lt;ul class=\&quot;report-detail-ul\&quot;&gt;&lt;li class=\&quot;.report-detail-li\&quot;&gt;RegionServer： emr-worker-2 Region Id： 4a938c08750869c47b7a92edeeec2ccc 写请求数量： 2115051</li>&lt;li class=\&quot;.report-detail-li\&quot;&gt;RegionServer： emr-worker-2 Region Id： b4d21974df92bdf3589e63e4da1fc923 写请求数量： 1592509</li>&lt;li class=\&quot;.report-detail-li\&quot;&gt;RegionServer： emr-worker-2 Region Id： 25eb6717470f4ddbabe9187ff0fc0cb3 写请求数量： 1585420</li></ul>&lt;p style=\&quot;line-height： 16px; font-size： 16px; margin： 0 auto\&quot;&gt;&nbsp;</p></p>
         */
        @NameInMap("WriteRequestUnbalanceSuggestion")
        public String writeRequestUnbalanceSuggestion;

        public static Analysis build(java.util.Map<String, ?> map) throws Exception {
            Analysis self = new Analysis();
            return TeaModel.build(map, self);
        }

        public Analysis setReadRequestHotspotRegionList(java.util.List<String> readRequestHotspotRegionList) {
            this.readRequestHotspotRegionList = readRequestHotspotRegionList;
            return this;
        }
        public java.util.List<String> getReadRequestHotspotRegionList() {
            return this.readRequestHotspotRegionList;
        }

        public Analysis setReadRequestUnbalanceSuggestion(String readRequestUnbalanceSuggestion) {
            this.readRequestUnbalanceSuggestion = readRequestUnbalanceSuggestion;
            return this;
        }
        public String getReadRequestUnbalanceSuggestion() {
            return this.readRequestUnbalanceSuggestion;
        }

        public Analysis setRequestHotspotRegionList(java.util.List<String> requestHotspotRegionList) {
            this.requestHotspotRegionList = requestHotspotRegionList;
            return this;
        }
        public java.util.List<String> getRequestHotspotRegionList() {
            return this.requestHotspotRegionList;
        }

        public Analysis setRequestUnbalanceSuggestion(String requestUnbalanceSuggestion) {
            this.requestUnbalanceSuggestion = requestUnbalanceSuggestion;
            return this;
        }
        public String getRequestUnbalanceSuggestion() {
            return this.requestUnbalanceSuggestion;
        }

        public Analysis setTableScore(Integer tableScore) {
            this.tableScore = tableScore;
            return this;
        }
        public Integer getTableScore() {
            return this.tableScore;
        }

        public Analysis setWriteRequestHotspotRegionList(java.util.List<String> writeRequestHotspotRegionList) {
            this.writeRequestHotspotRegionList = writeRequestHotspotRegionList;
            return this;
        }
        public java.util.List<String> getWriteRequestHotspotRegionList() {
            return this.writeRequestHotspotRegionList;
        }

        public Analysis setWriteRequestUnbalanceSuggestion(String writeRequestUnbalanceSuggestion) {
            this.writeRequestUnbalanceSuggestion = writeRequestUnbalanceSuggestion;
            return this;
        }
        public String getWriteRequestUnbalanceSuggestion() {
            return this.writeRequestUnbalanceSuggestion;
        }

    }

    public static class ColdAccessDay extends TeaModel {
        /**
         * <p>Description of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>Cold access day</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Name of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>coldAccessDay</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Unit of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>day</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <p>Value of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Value")
        public Long value;

        public static ColdAccessDay build(java.util.Map<String, ?> map) throws Exception {
            ColdAccessDay self = new ColdAccessDay();
            return TeaModel.build(map, self);
        }

        public ColdAccessDay setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ColdAccessDay setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ColdAccessDay setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public ColdAccessDay setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

    public static class ColdConfigDay extends TeaModel {
        /**
         * <p>Description of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>Cold config day</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Metric name.</p>
         * 
         * <strong>example:</strong>
         * <p>coldConfigDay</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Unit of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>day</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <p>Metric value.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Value")
        public Long value;

        public static ColdConfigDay build(java.util.Map<String, ?> map) throws Exception {
            ColdConfigDay self = new ColdConfigDay();
            return TeaModel.build(map, self);
        }

        public ColdConfigDay setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ColdConfigDay setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ColdConfigDay setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public ColdConfigDay setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

    public static class ColdDataSize extends TeaModel {
        /**
         * <p>Metric description.</p>
         * 
         * <strong>example:</strong>
         * <p>Size of the cold data size</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Metric name.</p>
         * 
         * <strong>example:</strong>
         * <p>coldDataSize</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Metric unit.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <p>Metric value.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Value")
        public Long value;

        public static ColdDataSize build(java.util.Map<String, ?> map) throws Exception {
            ColdDataSize self = new ColdDataSize();
            return TeaModel.build(map, self);
        }

        public ColdDataSize setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ColdDataSize setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ColdDataSize setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public ColdDataSize setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

    public static class DailyReadRequest extends TeaModel {
        /**
         * <p>Description of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>test-update</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Name of the item.</p>
         * 
         * <strong>example:</strong>
         * <p>dailyReadRequest</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Unit of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <p>Value of the metric.</p>
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
         * <p>Description of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>Day growth ratio of table size</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Metric name.</p>
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
         * <p>1.5</p>
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
         * <p>Description of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>Number of write requests per day</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Name of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>dailyWriteRequest</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Unit of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <p>Value of the metric.</p>
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
         * <p>Description of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>The balance of distributing requests</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Name of the metric.</p>
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
         * <p>0.5</p>
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

    public static class FreezeConfigDay extends TeaModel {
        /**
         * <p>Description of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>Freeze config day</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Name of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>freezeConfigDay</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Unit of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>day</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <p>Value of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Value")
        public Long value;

        public static FreezeConfigDay build(java.util.Map<String, ?> map) throws Exception {
            FreezeConfigDay self = new FreezeConfigDay();
            return TeaModel.build(map, self);
        }

        public FreezeConfigDay setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public FreezeConfigDay setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public FreezeConfigDay setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public FreezeConfigDay setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

    public static class FreezeDataSize extends TeaModel {
        /**
         * <p>Metric description.</p>
         * 
         * <strong>example:</strong>
         * <p>Size of the freeze data size</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Metric name.</p>
         * 
         * <strong>example:</strong>
         * <p>freezeDataSize</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Metric unit.</p>
         * 
         * <strong>example:</strong>
         * <p>MB</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <p>Metric value.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Value")
        public Long value;

        public static FreezeDataSize build(java.util.Map<String, ?> map) throws Exception {
            FreezeDataSize self = new FreezeDataSize();
            return TeaModel.build(map, self);
        }

        public FreezeDataSize setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public FreezeDataSize setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public FreezeDataSize setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public FreezeDataSize setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

    public static class HotDataSize extends TeaModel {
        /**
         * <p>Description of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>Size of the hot data size</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Name of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>hotDataSize</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The unit of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>MB</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <p>The metric value.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Value")
        public Long value;

        public static HotDataSize build(java.util.Map<String, ?> map) throws Exception {
            HotDataSize self = new HotDataSize();
            return TeaModel.build(map, self);
        }

        public HotDataSize setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public HotDataSize setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public HotDataSize setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public HotDataSize setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

    public static class Locality extends TeaModel {
        /**
         * <p>Description of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>The locality of data</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Name of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>locality</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Unit of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <p>Value of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("Value")
        public Float value;

        public static Locality build(java.util.Map<String, ?> map) throws Exception {
            Locality self = new Locality();
            return TeaModel.build(map, self);
        }

        public Locality setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public Locality setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public Locality setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public Locality setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

    public static class ReadRequestBalance extends TeaModel {
        /**
         * <p>Description of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>The balance of distributing read requests</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Name of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>readRequestBalance</p>
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
         * <p>0.5</p>
         */
        @NameInMap("Value")
        public Float value;

        public static ReadRequestBalance build(java.util.Map<String, ?> map) throws Exception {
            ReadRequestBalance self = new ReadRequestBalance();
            return TeaModel.build(map, self);
        }

        public ReadRequestBalance setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ReadRequestBalance setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ReadRequestBalance setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public ReadRequestBalance setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

    public static class RegionBalance extends TeaModel {
        /**
         * <p>Description of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>The ability to evenly distribute Regions on different RegionServer nodes</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Metric name.</p>
         * 
         * <strong>example:</strong>
         * <p>regionBalance</p>
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
         * <p>The metric value.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("Value")
        public Float value;

        public static RegionBalance build(java.util.Map<String, ?> map) throws Exception {
            RegionBalance self = new RegionBalance();
            return TeaModel.build(map, self);
        }

        public RegionBalance setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public RegionBalance setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public RegionBalance setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public RegionBalance setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

    public static class RegionCount extends TeaModel {
        /**
         * <p>Metric description.</p>
         * 
         * <strong>example:</strong>
         * <p>Number of regions count</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Metric name.</p>
         * 
         * <strong>example:</strong>
         * <p>regionCount</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Metric unit.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <p>Metric value.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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

    public static class RegionCountDayGrowthRatio extends TeaModel {
        /**
         * <p>Metric description.</p>
         * 
         * <strong>example:</strong>
         * <p>Day growth ratio of region count</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Metric name.</p>
         * 
         * <strong>example:</strong>
         * <p>regionCountDayGrowthRatio</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Metric unit.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <p>Metric value.</p>
         * 
         * <strong>example:</strong>
         * <p>0.8</p>
         */
        @NameInMap("Value")
        public Float value;

        public static RegionCountDayGrowthRatio build(java.util.Map<String, ?> map) throws Exception {
            RegionCountDayGrowthRatio self = new RegionCountDayGrowthRatio();
            return TeaModel.build(map, self);
        }

        public RegionCountDayGrowthRatio setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public RegionCountDayGrowthRatio setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public RegionCountDayGrowthRatio setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public RegionCountDayGrowthRatio setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

    public static class RegionServerCount extends TeaModel {
        /**
         * <p>Metric description.</p>
         * 
         * <strong>example:</strong>
         * <p>Number of region servers count</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Metric name.</p>
         * 
         * <strong>example:</strong>
         * <p>regionServerCount</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Metric unit.</p>
         * 
         * <strong>example:</strong>
         * <p>“”</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <p>Usage.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Value")
        public Long value;

        public static RegionServerCount build(java.util.Map<String, ?> map) throws Exception {
            RegionServerCount self = new RegionServerCount();
            return TeaModel.build(map, self);
        }

        public RegionServerCount setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public RegionServerCount setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public RegionServerCount setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public RegionServerCount setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

    public static class RequestBalance extends TeaModel {
        /**
         * <p>Description of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>The balance of distributing requests</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Name of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>requestBalance</p>
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
         * <p>The metric value.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("Value")
        public Float value;

        public static RequestBalance build(java.util.Map<String, ?> map) throws Exception {
            RequestBalance self = new RequestBalance();
            return TeaModel.build(map, self);
        }

        public RequestBalance setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public RequestBalance setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public RequestBalance setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public RequestBalance setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

    public static class StoreFileCount extends TeaModel {
        /**
         * <p>Description of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>Number of store files</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Name of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>storeFileCount</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Unit of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <p>Value of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Value")
        public Long value;

        public static StoreFileCount build(java.util.Map<String, ?> map) throws Exception {
            StoreFileCount self = new StoreFileCount();
            return TeaModel.build(map, self);
        }

        public StoreFileCount setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public StoreFileCount setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public StoreFileCount setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public StoreFileCount setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

    public static class StoreFileCountDayGrowthRatio extends TeaModel {
        /**
         * <p>Metric description.</p>
         * 
         * <strong>example:</strong>
         * <p>Day growth ratio of store file count</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Metric name.</p>
         * 
         * <strong>example:</strong>
         * <p>storeFileCountDayGrowthRatio</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Metric unit.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <p>Metric value.</p>
         * 
         * <strong>example:</strong>
         * <p>1.5</p>
         */
        @NameInMap("Value")
        public Float value;

        public static StoreFileCountDayGrowthRatio build(java.util.Map<String, ?> map) throws Exception {
            StoreFileCountDayGrowthRatio self = new StoreFileCountDayGrowthRatio();
            return TeaModel.build(map, self);
        }

        public StoreFileCountDayGrowthRatio setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public StoreFileCountDayGrowthRatio setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public StoreFileCountDayGrowthRatio setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public StoreFileCountDayGrowthRatio setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

    public static class TableSize extends TeaModel {
        /**
         * <p>Description of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>Size of the table</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Metric name.</p>
         * 
         * <strong>example:</strong>
         * <p>tableSize</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Unit of the metric</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <p>Metric value.</p>
         * 
         * <strong>example:</strong>
         * <p>tb_item</p>
         */
        @NameInMap("Value")
        public Long value;

        public static TableSize build(java.util.Map<String, ?> map) throws Exception {
            TableSize self = new TableSize();
            return TeaModel.build(map, self);
        }

        public TableSize setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public TableSize setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public TableSize setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public TableSize setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

    public static class TableSizeDayGrowthRatio extends TeaModel {
        /**
         * <p>Metric description.</p>
         * 
         * <strong>example:</strong>
         * <p>Day growth ratio of table size</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Metric name.</p>
         * 
         * <strong>example:</strong>
         * <p>tableSizeDayGrowthRatio</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Metric unit.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <p>Metric value.</p>
         * 
         * <strong>example:</strong>
         * <p>1.5</p>
         */
        @NameInMap("Value")
        public Float value;

        public static TableSizeDayGrowthRatio build(java.util.Map<String, ?> map) throws Exception {
            TableSizeDayGrowthRatio self = new TableSizeDayGrowthRatio();
            return TeaModel.build(map, self);
        }

        public TableSizeDayGrowthRatio setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public TableSizeDayGrowthRatio setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public TableSizeDayGrowthRatio setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public TableSizeDayGrowthRatio setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

    public static class WarmConfigDay extends TeaModel {
        /**
         * <p>Metric description.</p>
         * 
         * <strong>example:</strong>
         * <p>Size of the warm data size</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Metric name.</p>
         * 
         * <strong>example:</strong>
         * <p>warmConfigDay</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Metric unit.</p>
         * 
         * <strong>example:</strong>
         * <p>MB</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <p>Metric value.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Value")
        public Long value;

        public static WarmConfigDay build(java.util.Map<String, ?> map) throws Exception {
            WarmConfigDay self = new WarmConfigDay();
            return TeaModel.build(map, self);
        }

        public WarmConfigDay setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public WarmConfigDay setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public WarmConfigDay setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public WarmConfigDay setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

    public static class WarmDataSize extends TeaModel {
        /**
         * <p>Description of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>Size of the warm data size</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Name of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>warmDataSize</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The unit of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>MB</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <p>Usage rate.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Value")
        public Long value;

        public static WarmDataSize build(java.util.Map<String, ?> map) throws Exception {
            WarmDataSize self = new WarmDataSize();
            return TeaModel.build(map, self);
        }

        public WarmDataSize setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public WarmDataSize setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public WarmDataSize setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public WarmDataSize setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

    public static class WriteRequestBalance extends TeaModel {
        /**
         * <p>Description of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>The balance of distributing write requests</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Name of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>writeRequestBalance</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Unit of the metric.</p>
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
         * <p>0.5</p>
         */
        @NameInMap("Value")
        public Float value;

        public static WriteRequestBalance build(java.util.Map<String, ?> map) throws Exception {
            WriteRequestBalance self = new WriteRequestBalance();
            return TeaModel.build(map, self);
        }

        public WriteRequestBalance setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public WriteRequestBalance setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public WriteRequestBalance setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public WriteRequestBalance setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

    public static class Metrics extends TeaModel {
        /**
         * <p>Number of days the table has not been accessed.</p>
         */
        @NameInMap("ColdAccessDay")
        public ColdAccessDay coldAccessDay;

        /**
         * <p>Cold data access days configuration.</p>
         */
        @NameInMap("ColdConfigDay")
        public ColdConfigDay coldConfigDay;

        /**
         * <p>Cold data size.</p>
         */
        @NameInMap("ColdDataSize")
        public ColdDataSize coldDataSize;

        /**
         * <p>Number of read requests per day.</p>
         */
        @NameInMap("DailyReadRequest")
        public DailyReadRequest dailyReadRequest;

        /**
         * <p>Daily growth ratio of daily read requests.</p>
         */
        @NameInMap("DailyReadRequestDayGrowthRatio")
        public DailyReadRequestDayGrowthRatio dailyReadRequestDayGrowthRatio;

        /**
         * <p>Number of write requests per day.</p>
         */
        @NameInMap("DailyWriteRequest")
        public DailyWriteRequest dailyWriteRequest;

        /**
         * <p>Daily write request growth ratio.</p>
         */
        @NameInMap("DailyWriteRequestDayGrowthRatio")
        public DailyWriteRequestDayGrowthRatio dailyWriteRequestDayGrowthRatio;

        /**
         * <p>Configuration for the number of days cold data is accessed.</p>
         */
        @NameInMap("FreezeConfigDay")
        public FreezeConfigDay freezeConfigDay;

        /**
         * <p>Frozen data size.</p>
         */
        @NameInMap("FreezeDataSize")
        public FreezeDataSize freezeDataSize;

        /**
         * <p>Hot data size.</p>
         */
        @NameInMap("HotDataSize")
        public HotDataSize hotDataSize;

        /**
         * <p>Locality rate.</p>
         */
        @NameInMap("Locality")
        public Locality locality;

        /**
         * <p>Read request balance.</p>
         */
        @NameInMap("ReadRequestBalance")
        public ReadRequestBalance readRequestBalance;

        /**
         * <p>Region balance.</p>
         */
        @NameInMap("RegionBalance")
        public RegionBalance regionBalance;

        /**
         * <p>Number of regions.</p>
         */
        @NameInMap("RegionCount")
        public RegionCount regionCount;

        /**
         * <p>Daily incremental ratio of regions</p>
         */
        @NameInMap("RegionCountDayGrowthRatio")
        public RegionCountDayGrowthRatio regionCountDayGrowthRatio;

        /**
         * <p>Number of RegionServers.</p>
         */
        @NameInMap("RegionServerCount")
        public RegionServerCount regionServerCount;

        /**
         * <p>Request balance.</p>
         */
        @NameInMap("RequestBalance")
        public RequestBalance requestBalance;

        /**
         * <p>Number of store files.</p>
         */
        @NameInMap("StoreFileCount")
        public StoreFileCount storeFileCount;

        /**
         * <p>Daily growth ratio of store file count.</p>
         */
        @NameInMap("StoreFileCountDayGrowthRatio")
        public StoreFileCountDayGrowthRatio storeFileCountDayGrowthRatio;

        /**
         * <p>Table size.</p>
         */
        @NameInMap("TableSize")
        public TableSize tableSize;

        /**
         * <p>Daily growth ratio of table size.</p>
         */
        @NameInMap("TableSizeDayGrowthRatio")
        public TableSizeDayGrowthRatio tableSizeDayGrowthRatio;

        /**
         * <p>Warm data access days configuration.</p>
         */
        @NameInMap("WarmConfigDay")
        public WarmConfigDay warmConfigDay;

        /**
         * <p>Warm data size.</p>
         */
        @NameInMap("WarmDataSize")
        public WarmDataSize warmDataSize;

        /**
         * <p>Write request balance.</p>
         */
        @NameInMap("WriteRequestBalance")
        public WriteRequestBalance writeRequestBalance;

        public static Metrics build(java.util.Map<String, ?> map) throws Exception {
            Metrics self = new Metrics();
            return TeaModel.build(map, self);
        }

        public Metrics setColdAccessDay(ColdAccessDay coldAccessDay) {
            this.coldAccessDay = coldAccessDay;
            return this;
        }
        public ColdAccessDay getColdAccessDay() {
            return this.coldAccessDay;
        }

        public Metrics setColdConfigDay(ColdConfigDay coldConfigDay) {
            this.coldConfigDay = coldConfigDay;
            return this;
        }
        public ColdConfigDay getColdConfigDay() {
            return this.coldConfigDay;
        }

        public Metrics setColdDataSize(ColdDataSize coldDataSize) {
            this.coldDataSize = coldDataSize;
            return this;
        }
        public ColdDataSize getColdDataSize() {
            return this.coldDataSize;
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

        public Metrics setFreezeConfigDay(FreezeConfigDay freezeConfigDay) {
            this.freezeConfigDay = freezeConfigDay;
            return this;
        }
        public FreezeConfigDay getFreezeConfigDay() {
            return this.freezeConfigDay;
        }

        public Metrics setFreezeDataSize(FreezeDataSize freezeDataSize) {
            this.freezeDataSize = freezeDataSize;
            return this;
        }
        public FreezeDataSize getFreezeDataSize() {
            return this.freezeDataSize;
        }

        public Metrics setHotDataSize(HotDataSize hotDataSize) {
            this.hotDataSize = hotDataSize;
            return this;
        }
        public HotDataSize getHotDataSize() {
            return this.hotDataSize;
        }

        public Metrics setLocality(Locality locality) {
            this.locality = locality;
            return this;
        }
        public Locality getLocality() {
            return this.locality;
        }

        public Metrics setReadRequestBalance(ReadRequestBalance readRequestBalance) {
            this.readRequestBalance = readRequestBalance;
            return this;
        }
        public ReadRequestBalance getReadRequestBalance() {
            return this.readRequestBalance;
        }

        public Metrics setRegionBalance(RegionBalance regionBalance) {
            this.regionBalance = regionBalance;
            return this;
        }
        public RegionBalance getRegionBalance() {
            return this.regionBalance;
        }

        public Metrics setRegionCount(RegionCount regionCount) {
            this.regionCount = regionCount;
            return this;
        }
        public RegionCount getRegionCount() {
            return this.regionCount;
        }

        public Metrics setRegionCountDayGrowthRatio(RegionCountDayGrowthRatio regionCountDayGrowthRatio) {
            this.regionCountDayGrowthRatio = regionCountDayGrowthRatio;
            return this;
        }
        public RegionCountDayGrowthRatio getRegionCountDayGrowthRatio() {
            return this.regionCountDayGrowthRatio;
        }

        public Metrics setRegionServerCount(RegionServerCount regionServerCount) {
            this.regionServerCount = regionServerCount;
            return this;
        }
        public RegionServerCount getRegionServerCount() {
            return this.regionServerCount;
        }

        public Metrics setRequestBalance(RequestBalance requestBalance) {
            this.requestBalance = requestBalance;
            return this;
        }
        public RequestBalance getRequestBalance() {
            return this.requestBalance;
        }

        public Metrics setStoreFileCount(StoreFileCount storeFileCount) {
            this.storeFileCount = storeFileCount;
            return this;
        }
        public StoreFileCount getStoreFileCount() {
            return this.storeFileCount;
        }

        public Metrics setStoreFileCountDayGrowthRatio(StoreFileCountDayGrowthRatio storeFileCountDayGrowthRatio) {
            this.storeFileCountDayGrowthRatio = storeFileCountDayGrowthRatio;
            return this;
        }
        public StoreFileCountDayGrowthRatio getStoreFileCountDayGrowthRatio() {
            return this.storeFileCountDayGrowthRatio;
        }

        public Metrics setTableSize(TableSize tableSize) {
            this.tableSize = tableSize;
            return this;
        }
        public TableSize getTableSize() {
            return this.tableSize;
        }

        public Metrics setTableSizeDayGrowthRatio(TableSizeDayGrowthRatio tableSizeDayGrowthRatio) {
            this.tableSizeDayGrowthRatio = tableSizeDayGrowthRatio;
            return this;
        }
        public TableSizeDayGrowthRatio getTableSizeDayGrowthRatio() {
            return this.tableSizeDayGrowthRatio;
        }

        public Metrics setWarmConfigDay(WarmConfigDay warmConfigDay) {
            this.warmConfigDay = warmConfigDay;
            return this;
        }
        public WarmConfigDay getWarmConfigDay() {
            return this.warmConfigDay;
        }

        public Metrics setWarmDataSize(WarmDataSize warmDataSize) {
            this.warmDataSize = warmDataSize;
            return this;
        }
        public WarmDataSize getWarmDataSize() {
            return this.warmDataSize;
        }

        public Metrics setWriteRequestBalance(WriteRequestBalance writeRequestBalance) {
            this.writeRequestBalance = writeRequestBalance;
            return this;
        }
        public WriteRequestBalance getWriteRequestBalance() {
            return this.writeRequestBalance;
        }

    }

    public static class Data extends TeaModel {
        /**
         * <p>Diagnostic results.</p>
         */
        @NameInMap("Analysis")
        public Analysis analysis;

        /**
         * <p>Metrics information.</p>
         */
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

        public Data setMetrics(Metrics metrics) {
            this.metrics = metrics;
            return this;
        }
        public Metrics getMetrics() {
            return this.metrics;
        }

    }

}
