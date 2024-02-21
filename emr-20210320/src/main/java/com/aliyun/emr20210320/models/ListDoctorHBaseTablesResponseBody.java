// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListDoctorHBaseTablesResponseBody extends TeaModel {
    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("Data")
    public java.util.List<Data> data;

    /**
     * <p>The maximum number of entries returned.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The page number of the next page returned.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListDoctorHBaseTablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDoctorHBaseTablesResponseBody self = new ListDoctorHBaseTablesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDoctorHBaseTablesResponseBody setData(java.util.List<Data> data) {
        this.data = data;
        return this;
    }
    public java.util.List<Data> getData() {
        return this.data;
    }

    public ListDoctorHBaseTablesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDoctorHBaseTablesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDoctorHBaseTablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDoctorHBaseTablesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class Analysis extends TeaModel {
        /**
         * <p>The regions that have read hotspot issues.</p>
         */
        @NameInMap("ReadRequestHotspotRegionList")
        public java.util.List<String> readRequestHotspotRegionList;

        /**
         * <p>The description of read imbalance.</p>
         */
        @NameInMap("ReadRequestUnbalanceSuggestion")
        public String readRequestUnbalanceSuggestion;

        /**
         * <p>The regions that have read/write hotspot issues.</p>
         */
        @NameInMap("RequestHotspotRegionList")
        public java.util.List<String> requestHotspotRegionList;

        /**
         * <p>The description of read/write imbalance.</p>
         */
        @NameInMap("RequestUnbalanceSuggestion")
        public String requestUnbalanceSuggestion;

        /**
         * <p>The score of the table.</p>
         */
        @NameInMap("TableScore")
        public Integer tableScore;

        /**
         * <p>The regions that have write hotspot issues.</p>
         */
        @NameInMap("WriteRequestHotspotRegionList")
        public java.util.List<String> writeRequestHotspotRegionList;

        /**
         * <p>The description of write imbalance.</p>
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
         * <p>The description of the metric.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the metric.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The unit of the metric.</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <p>The value of the metric.</p>
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
         * <p>The description of the metric.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the metric.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The unit of the metric.</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <p>The value of the metric.</p>
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
         * <p>The description of the metric.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the metric.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The unit of the metric.</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <p>The value of the metric.</p>
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
         * <p>The description of the metric.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the metric.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The unit of the metric.</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <p>The value of the metric.</p>
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
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the metric.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The unit of the metric.</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <p>The value of the metric.</p>
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
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the metric.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The unit of the metric.</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <p>The value of the metric.</p>
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
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the metric.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The unit of the metric.</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <p>The value of the metric.</p>
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
         * <p>The description of the metric.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the metric.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The unit of the metric.</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <p>The value of the metric.</p>
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
         * <p>The description of the metric.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the metric.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The unit of the metric.</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <p>The value of the metric.</p>
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
         * <p>The description of the metric.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the metric.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The unit of the metric.</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <p>The value of the metric.</p>
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
         * <p>The description of the metric.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the metric.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The unit of the metric.</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <p>The value of the metric.</p>
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
         * <p>The description of the metric.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the metric.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The unit of the metric.</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <p>The value of the metric.</p>
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
         * <p>The description of the metric.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the metric.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The unit of the metric.</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <p>The value of the metric.</p>
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
         * <p>The description of the metric.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the metric.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The unit of the metric.</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <p>The value of the metric.</p>
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
         * <p>The description of the metric.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the metric.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The unit of the metric.</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <p>The value of the metric.</p>
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
         * <p>The description of the metric.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the metric.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The unit of the metric.</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <p>The value of the metric.</p>
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
         * <p>The description of the metric.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the metric.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The unit of the metric.</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <p>The value of the metric.</p>
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
         * <p>The description of the metric.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the metric.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The unit of the metric.</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <p>The value of the metric.</p>
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
         * <p>The description of the metric.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the metric.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The unit of the metric.</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <p>The value of the metric.</p>
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
         * <p>The description of the metric.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the metric.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The unit of the metric.</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <p>The value of the metric.</p>
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
         * <p>The description of the metric.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the metric.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The unit of the metric.</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <p>The value of the metric.</p>
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
         * <p>The description of the metric.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the metric.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The unit of the metric.</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <p>The value of the metric.</p>
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
         * <p>The description of the metric.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the metric.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The unit of the metric.</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <p>The value of the metric.</p>
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
         * <p>The description of the metric.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the metric.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The unit of the metric.</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <p>The value of the metric.</p>
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
         * <p>The number of days during which the table was not accessed.</p>
         */
        @NameInMap("ColdAccessDay")
        public ColdAccessDay coldAccessDay;

        /**
         * <p>The number of consecutive days without access to data before the data is considered as very cold data.</p>
         */
        @NameInMap("ColdConfigDay")
        public ColdConfigDay coldConfigDay;

        /**
         * <p>The size of cold data.</p>
         */
        @NameInMap("ColdDataSize")
        public ColdDataSize coldDataSize;

        /**
         * <p>The total number of read requests for the table in a day.</p>
         */
        @NameInMap("DailyReadRequest")
        public DailyReadRequest dailyReadRequest;

        /**
         * <p>The daily increment ratio of the number of read requests in a day.</p>
         */
        @NameInMap("DailyReadRequestDayGrowthRatio")
        public DailyReadRequestDayGrowthRatio dailyReadRequestDayGrowthRatio;

        /**
         * <p>The total number of write requests for the table in a day.</p>
         */
        @NameInMap("DailyWriteRequest")
        public DailyWriteRequest dailyWriteRequest;

        /**
         * <p>The daily increment ratio of the number of write requests in a day.</p>
         */
        @NameInMap("DailyWriteRequestDayGrowthRatio")
        public DailyWriteRequestDayGrowthRatio dailyWriteRequestDayGrowthRatio;

        /**
         * <p>The number of consecutive days without access to data before the data was considered as very cold data.</p>
         */
        @NameInMap("FreezeConfigDay")
        public FreezeConfigDay freezeConfigDay;

        /**
         * <p>The size of very cold data.</p>
         */
        @NameInMap("FreezeDataSize")
        public FreezeDataSize freezeDataSize;

        /**
         * <p>The size of hot data.</p>
         */
        @NameInMap("HotDataSize")
        public HotDataSize hotDataSize;

        /**
         * <p>The localization rate.</p>
         */
        @NameInMap("Locality")
        public Locality locality;

        /**
         * <p>The read balancing degree.</p>
         */
        @NameInMap("ReadRequestBalance")
        public ReadRequestBalance readRequestBalance;

        /**
         * <p>The balancing degree.</p>
         */
        @NameInMap("RegionBalance")
        public RegionBalance regionBalance;

        /**
         * <p>The number of regions that host the table.</p>
         */
        @NameInMap("RegionCount")
        public RegionCount regionCount;

        /**
         * <p>The daily increment ratio of the number of regions.</p>
         */
        @NameInMap("RegionCountDayGrowthRatio")
        public RegionCountDayGrowthRatio regionCountDayGrowthRatio;

        /**
         * <p>The number of region servers that host the table.</p>
         */
        @NameInMap("RegionServerCount")
        public RegionServerCount regionServerCount;

        /**
         * <p>The request balancing degree.</p>
         */
        @NameInMap("RequestBalance")
        public RequestBalance requestBalance;

        /**
         * <p>The number of StoreFiles.</p>
         */
        @NameInMap("StoreFileCount")
        public StoreFileCount storeFileCount;

        /**
         * <p>The daily increment ratio of the number of StoreFiles.</p>
         */
        @NameInMap("StoreFileCountDayGrowthRatio")
        public StoreFileCountDayGrowthRatio storeFileCountDayGrowthRatio;

        /**
         * <p>The size of the table.</p>
         */
        @NameInMap("TableSize")
        public TableSize tableSize;

        /**
         * <p>The daily increment ratio of the table size.</p>
         */
        @NameInMap("TableSizeDayGrowthRatio")
        public TableSizeDayGrowthRatio tableSizeDayGrowthRatio;

        /**
         * <p>The number of consecutive days without access to data before the data is considered as cold data.</p>
         */
        @NameInMap("WarmConfigDay")
        public WarmConfigDay warmConfigDay;

        /**
         * <p>The size of warm data.</p>
         */
        @NameInMap("WarmDataSize")
        public WarmDataSize warmDataSize;

        /**
         * <p>The write balancing degree.</p>
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
         * <p>The diagnosis result.</p>
         */
        @NameInMap("Analysis")
        public Analysis analysis;

        /**
         * <p>The metric information.</p>
         */
        @NameInMap("Metrics")
        public Metrics metrics;

        /**
         * <p>The name of the table.</p>
         */
        @NameInMap("TableName")
        public String tableName;

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

        public Data setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

}
