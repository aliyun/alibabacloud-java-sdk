// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class GetDoctorHiveClusterResponseBody extends TeaModel {
    /**
     * <p>The analysis results of the Hive cluster.</p>
     */
    @NameInMap("Data")
    public Data data;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetDoctorHiveClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDoctorHiveClusterResponseBody self = new GetDoctorHiveClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDoctorHiveClusterResponseBody setData(Data data) {
        this.data = data;
        return this;
    }
    public Data getData() {
        return this.data;
    }

    public GetDoctorHiveClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class Analysis extends TeaModel {
        /**
         * <p>The score for the distribution of files of different sizes stored in the Hive cluster.</p>
         */
        @NameInMap("HiveDistributionScore")
        public Integer hiveDistributionScore;

        /**
         * <p>The score for the distribution of files stored in different formats in the Hive cluster.</p>
         */
        @NameInMap("HiveFormatScore")
        public Integer hiveFormatScore;

        /**
         * <p>The score for the access frequency of the Hive cluster.</p>
         */
        @NameInMap("HiveFrequencyScore")
        public Integer hiveFrequencyScore;

        /**
         * <p>The overall score of the Hive cluster.</p>
         */
        @NameInMap("HiveScore")
        public Integer hiveScore;

        public static Analysis build(java.util.Map<String, ?> map) throws Exception {
            Analysis self = new Analysis();
            return TeaModel.build(map, self);
        }

        public Analysis setHiveDistributionScore(Integer hiveDistributionScore) {
            this.hiveDistributionScore = hiveDistributionScore;
            return this;
        }
        public Integer getHiveDistributionScore() {
            return this.hiveDistributionScore;
        }

        public Analysis setHiveFormatScore(Integer hiveFormatScore) {
            this.hiveFormatScore = hiveFormatScore;
            return this;
        }
        public Integer getHiveFormatScore() {
            return this.hiveFormatScore;
        }

        public Analysis setHiveFrequencyScore(Integer hiveFrequencyScore) {
            this.hiveFrequencyScore = hiveFrequencyScore;
            return this;
        }
        public Integer getHiveFrequencyScore() {
            return this.hiveFrequencyScore;
        }

        public Analysis setHiveScore(Integer hiveScore) {
            this.hiveScore = hiveScore;
            return this;
        }
        public Integer getHiveScore() {
            return this.hiveScore;
        }

    }

    public static class Formats extends TeaModel {
        /**
         * <p>The name of the storage format.</p>
         */
        @NameInMap("FormatName")
        public String formatName;

        /**
         * <p>The proportion of data in a specific storage format.</p>
         */
        @NameInMap("FormatRatio")
        public Float formatRatio;

        /**
         * <p>The size of storage format-specific data.</p>
         */
        @NameInMap("FormatSize")
        public Long formatSize;

        /**
         * <p>The unit of the data size.</p>
         */
        @NameInMap("FormatSizeUnit")
        public String formatSizeUnit;

        public static Formats build(java.util.Map<String, ?> map) throws Exception {
            Formats self = new Formats();
            return TeaModel.build(map, self);
        }

        public Formats setFormatName(String formatName) {
            this.formatName = formatName;
            return this;
        }
        public String getFormatName() {
            return this.formatName;
        }

        public Formats setFormatRatio(Float formatRatio) {
            this.formatRatio = formatRatio;
            return this;
        }
        public Float getFormatRatio() {
            return this.formatRatio;
        }

        public Formats setFormatSize(Long formatSize) {
            this.formatSize = formatSize;
            return this;
        }
        public Long getFormatSize() {
            return this.formatSize;
        }

        public Formats setFormatSizeUnit(String formatSizeUnit) {
            this.formatSizeUnit = formatSizeUnit;
            return this;
        }
        public String getFormatSizeUnit() {
            return this.formatSizeUnit;
        }

    }

    public static class ColdDataDayGrowthSize extends TeaModel {
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

        public static ColdDataDayGrowthSize build(java.util.Map<String, ?> map) throws Exception {
            ColdDataDayGrowthSize self = new ColdDataDayGrowthSize();
            return TeaModel.build(map, self);
        }

        public ColdDataDayGrowthSize setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ColdDataDayGrowthSize setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ColdDataDayGrowthSize setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public ColdDataDayGrowthSize setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

    public static class ColdDataRatio extends TeaModel {
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

        public static ColdDataRatio build(java.util.Map<String, ?> map) throws Exception {
            ColdDataRatio self = new ColdDataRatio();
            return TeaModel.build(map, self);
        }

        public ColdDataRatio setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ColdDataRatio setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ColdDataRatio setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public ColdDataRatio setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
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

    public static class ColdDataSizeDayGrowthRatio extends TeaModel {
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

        public static ColdDataSizeDayGrowthRatio build(java.util.Map<String, ?> map) throws Exception {
            ColdDataSizeDayGrowthRatio self = new ColdDataSizeDayGrowthRatio();
            return TeaModel.build(map, self);
        }

        public ColdDataSizeDayGrowthRatio setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ColdDataSizeDayGrowthRatio setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ColdDataSizeDayGrowthRatio setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public ColdDataSizeDayGrowthRatio setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

    public static class DatabaseCount extends TeaModel {
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

        public static DatabaseCount build(java.util.Map<String, ?> map) throws Exception {
            DatabaseCount self = new DatabaseCount();
            return TeaModel.build(map, self);
        }

        public DatabaseCount setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DatabaseCount setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DatabaseCount setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public DatabaseCount setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

    public static class EmptyFileCount extends TeaModel {
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

        public static EmptyFileCount build(java.util.Map<String, ?> map) throws Exception {
            EmptyFileCount self = new EmptyFileCount();
            return TeaModel.build(map, self);
        }

        public EmptyFileCount setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public EmptyFileCount setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public EmptyFileCount setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public EmptyFileCount setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

    public static class EmptyFileCountDayGrowthRatio extends TeaModel {
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

        public static EmptyFileCountDayGrowthRatio build(java.util.Map<String, ?> map) throws Exception {
            EmptyFileCountDayGrowthRatio self = new EmptyFileCountDayGrowthRatio();
            return TeaModel.build(map, self);
        }

        public EmptyFileCountDayGrowthRatio setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public EmptyFileCountDayGrowthRatio setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public EmptyFileCountDayGrowthRatio setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public EmptyFileCountDayGrowthRatio setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

    public static class EmptyFileDayGrowthCount extends TeaModel {
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

        public static EmptyFileDayGrowthCount build(java.util.Map<String, ?> map) throws Exception {
            EmptyFileDayGrowthCount self = new EmptyFileDayGrowthCount();
            return TeaModel.build(map, self);
        }

        public EmptyFileDayGrowthCount setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public EmptyFileDayGrowthCount setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public EmptyFileDayGrowthCount setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public EmptyFileDayGrowthCount setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

    public static class EmptyFileRatio extends TeaModel {
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

        public static EmptyFileRatio build(java.util.Map<String, ?> map) throws Exception {
            EmptyFileRatio self = new EmptyFileRatio();
            return TeaModel.build(map, self);
        }

        public EmptyFileRatio setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public EmptyFileRatio setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public EmptyFileRatio setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public EmptyFileRatio setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

    public static class FreezeDataDayGrowthSize extends TeaModel {
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

        public static FreezeDataDayGrowthSize build(java.util.Map<String, ?> map) throws Exception {
            FreezeDataDayGrowthSize self = new FreezeDataDayGrowthSize();
            return TeaModel.build(map, self);
        }

        public FreezeDataDayGrowthSize setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public FreezeDataDayGrowthSize setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public FreezeDataDayGrowthSize setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public FreezeDataDayGrowthSize setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

    public static class FreezeDataRatio extends TeaModel {
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

        public static FreezeDataRatio build(java.util.Map<String, ?> map) throws Exception {
            FreezeDataRatio self = new FreezeDataRatio();
            return TeaModel.build(map, self);
        }

        public FreezeDataRatio setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public FreezeDataRatio setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public FreezeDataRatio setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public FreezeDataRatio setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
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

    public static class FreezeDataSizeDayGrowthRatio extends TeaModel {
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

        public static FreezeDataSizeDayGrowthRatio build(java.util.Map<String, ?> map) throws Exception {
            FreezeDataSizeDayGrowthRatio self = new FreezeDataSizeDayGrowthRatio();
            return TeaModel.build(map, self);
        }

        public FreezeDataSizeDayGrowthRatio setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public FreezeDataSizeDayGrowthRatio setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public FreezeDataSizeDayGrowthRatio setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public FreezeDataSizeDayGrowthRatio setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

    public static class HotDataDayGrowthSize extends TeaModel {
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

        public static HotDataDayGrowthSize build(java.util.Map<String, ?> map) throws Exception {
            HotDataDayGrowthSize self = new HotDataDayGrowthSize();
            return TeaModel.build(map, self);
        }

        public HotDataDayGrowthSize setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public HotDataDayGrowthSize setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public HotDataDayGrowthSize setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public HotDataDayGrowthSize setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

    public static class HotDataRatio extends TeaModel {
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

        public static HotDataRatio build(java.util.Map<String, ?> map) throws Exception {
            HotDataRatio self = new HotDataRatio();
            return TeaModel.build(map, self);
        }

        public HotDataRatio setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public HotDataRatio setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public HotDataRatio setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public HotDataRatio setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
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

    public static class HotDataSizeDayGrowthRatio extends TeaModel {
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

        public static HotDataSizeDayGrowthRatio build(java.util.Map<String, ?> map) throws Exception {
            HotDataSizeDayGrowthRatio self = new HotDataSizeDayGrowthRatio();
            return TeaModel.build(map, self);
        }

        public HotDataSizeDayGrowthRatio setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public HotDataSizeDayGrowthRatio setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public HotDataSizeDayGrowthRatio setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public HotDataSizeDayGrowthRatio setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

    public static class LargeFileCount extends TeaModel {
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

        public static LargeFileCount build(java.util.Map<String, ?> map) throws Exception {
            LargeFileCount self = new LargeFileCount();
            return TeaModel.build(map, self);
        }

        public LargeFileCount setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public LargeFileCount setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public LargeFileCount setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public LargeFileCount setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

    public static class LargeFileCountDayGrowthRatio extends TeaModel {
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

        public static LargeFileCountDayGrowthRatio build(java.util.Map<String, ?> map) throws Exception {
            LargeFileCountDayGrowthRatio self = new LargeFileCountDayGrowthRatio();
            return TeaModel.build(map, self);
        }

        public LargeFileCountDayGrowthRatio setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public LargeFileCountDayGrowthRatio setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public LargeFileCountDayGrowthRatio setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public LargeFileCountDayGrowthRatio setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

    public static class LargeFileDayGrowthCount extends TeaModel {
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

        public static LargeFileDayGrowthCount build(java.util.Map<String, ?> map) throws Exception {
            LargeFileDayGrowthCount self = new LargeFileDayGrowthCount();
            return TeaModel.build(map, self);
        }

        public LargeFileDayGrowthCount setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public LargeFileDayGrowthCount setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public LargeFileDayGrowthCount setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public LargeFileDayGrowthCount setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

    public static class LargeFileRatio extends TeaModel {
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

        public static LargeFileRatio build(java.util.Map<String, ?> map) throws Exception {
            LargeFileRatio self = new LargeFileRatio();
            return TeaModel.build(map, self);
        }

        public LargeFileRatio setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public LargeFileRatio setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public LargeFileRatio setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public LargeFileRatio setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

    public static class MediumFileCount extends TeaModel {
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

        public static MediumFileCount build(java.util.Map<String, ?> map) throws Exception {
            MediumFileCount self = new MediumFileCount();
            return TeaModel.build(map, self);
        }

        public MediumFileCount setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public MediumFileCount setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public MediumFileCount setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public MediumFileCount setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

    public static class MediumFileCountDayGrowthRatio extends TeaModel {
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

        public static MediumFileCountDayGrowthRatio build(java.util.Map<String, ?> map) throws Exception {
            MediumFileCountDayGrowthRatio self = new MediumFileCountDayGrowthRatio();
            return TeaModel.build(map, self);
        }

        public MediumFileCountDayGrowthRatio setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public MediumFileCountDayGrowthRatio setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public MediumFileCountDayGrowthRatio setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public MediumFileCountDayGrowthRatio setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

    public static class MediumFileDayGrowthCount extends TeaModel {
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

        public static MediumFileDayGrowthCount build(java.util.Map<String, ?> map) throws Exception {
            MediumFileDayGrowthCount self = new MediumFileDayGrowthCount();
            return TeaModel.build(map, self);
        }

        public MediumFileDayGrowthCount setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public MediumFileDayGrowthCount setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public MediumFileDayGrowthCount setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public MediumFileDayGrowthCount setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

    public static class MediumFileRatio extends TeaModel {
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

        public static MediumFileRatio build(java.util.Map<String, ?> map) throws Exception {
            MediumFileRatio self = new MediumFileRatio();
            return TeaModel.build(map, self);
        }

        public MediumFileRatio setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public MediumFileRatio setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public MediumFileRatio setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public MediumFileRatio setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

    public static class PartitionNum extends TeaModel {
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

        public static PartitionNum build(java.util.Map<String, ?> map) throws Exception {
            PartitionNum self = new PartitionNum();
            return TeaModel.build(map, self);
        }

        public PartitionNum setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public PartitionNum setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PartitionNum setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public PartitionNum setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

    public static class SmallFileCount extends TeaModel {
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

        public static SmallFileCount build(java.util.Map<String, ?> map) throws Exception {
            SmallFileCount self = new SmallFileCount();
            return TeaModel.build(map, self);
        }

        public SmallFileCount setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public SmallFileCount setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SmallFileCount setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public SmallFileCount setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

    public static class SmallFileCountDayGrowthRatio extends TeaModel {
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

        public static SmallFileCountDayGrowthRatio build(java.util.Map<String, ?> map) throws Exception {
            SmallFileCountDayGrowthRatio self = new SmallFileCountDayGrowthRatio();
            return TeaModel.build(map, self);
        }

        public SmallFileCountDayGrowthRatio setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public SmallFileCountDayGrowthRatio setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SmallFileCountDayGrowthRatio setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public SmallFileCountDayGrowthRatio setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

    public static class SmallFileDayGrowthCount extends TeaModel {
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

        public static SmallFileDayGrowthCount build(java.util.Map<String, ?> map) throws Exception {
            SmallFileDayGrowthCount self = new SmallFileDayGrowthCount();
            return TeaModel.build(map, self);
        }

        public SmallFileDayGrowthCount setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public SmallFileDayGrowthCount setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SmallFileDayGrowthCount setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public SmallFileDayGrowthCount setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

    public static class SmallFileRatio extends TeaModel {
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

        public static SmallFileRatio build(java.util.Map<String, ?> map) throws Exception {
            SmallFileRatio self = new SmallFileRatio();
            return TeaModel.build(map, self);
        }

        public SmallFileRatio setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public SmallFileRatio setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SmallFileRatio setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public SmallFileRatio setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

    public static class TableCount extends TeaModel {
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

        public static TableCount build(java.util.Map<String, ?> map) throws Exception {
            TableCount self = new TableCount();
            return TeaModel.build(map, self);
        }

        public TableCount setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public TableCount setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public TableCount setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public TableCount setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

    public static class TinyFileCount extends TeaModel {
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

        public static TinyFileCount build(java.util.Map<String, ?> map) throws Exception {
            TinyFileCount self = new TinyFileCount();
            return TeaModel.build(map, self);
        }

        public TinyFileCount setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public TinyFileCount setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public TinyFileCount setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public TinyFileCount setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

    public static class TinyFileCountDayGrowthRatio extends TeaModel {
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

        public static TinyFileCountDayGrowthRatio build(java.util.Map<String, ?> map) throws Exception {
            TinyFileCountDayGrowthRatio self = new TinyFileCountDayGrowthRatio();
            return TeaModel.build(map, self);
        }

        public TinyFileCountDayGrowthRatio setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public TinyFileCountDayGrowthRatio setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public TinyFileCountDayGrowthRatio setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public TinyFileCountDayGrowthRatio setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

    public static class TinyFileDayGrowthCount extends TeaModel {
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

        public static TinyFileDayGrowthCount build(java.util.Map<String, ?> map) throws Exception {
            TinyFileDayGrowthCount self = new TinyFileDayGrowthCount();
            return TeaModel.build(map, self);
        }

        public TinyFileDayGrowthCount setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public TinyFileDayGrowthCount setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public TinyFileDayGrowthCount setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public TinyFileDayGrowthCount setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

    public static class TinyFileRatio extends TeaModel {
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

        public static TinyFileRatio build(java.util.Map<String, ?> map) throws Exception {
            TinyFileRatio self = new TinyFileRatio();
            return TeaModel.build(map, self);
        }

        public TinyFileRatio setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public TinyFileRatio setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public TinyFileRatio setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public TinyFileRatio setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

    public static class TotalDataDayGrowthSize extends TeaModel {
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

        public static TotalDataDayGrowthSize build(java.util.Map<String, ?> map) throws Exception {
            TotalDataDayGrowthSize self = new TotalDataDayGrowthSize();
            return TeaModel.build(map, self);
        }

        public TotalDataDayGrowthSize setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public TotalDataDayGrowthSize setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public TotalDataDayGrowthSize setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public TotalDataDayGrowthSize setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

    public static class TotalDataSize extends TeaModel {
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

        public static TotalDataSize build(java.util.Map<String, ?> map) throws Exception {
            TotalDataSize self = new TotalDataSize();
            return TeaModel.build(map, self);
        }

        public TotalDataSize setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public TotalDataSize setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public TotalDataSize setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public TotalDataSize setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

    public static class TotalDataSizeDayGrowthRatio extends TeaModel {
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

        public static TotalDataSizeDayGrowthRatio build(java.util.Map<String, ?> map) throws Exception {
            TotalDataSizeDayGrowthRatio self = new TotalDataSizeDayGrowthRatio();
            return TeaModel.build(map, self);
        }

        public TotalDataSizeDayGrowthRatio setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public TotalDataSizeDayGrowthRatio setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public TotalDataSizeDayGrowthRatio setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public TotalDataSizeDayGrowthRatio setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

    public static class TotalFileCount extends TeaModel {
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

        public static TotalFileCount build(java.util.Map<String, ?> map) throws Exception {
            TotalFileCount self = new TotalFileCount();
            return TeaModel.build(map, self);
        }

        public TotalFileCount setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public TotalFileCount setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public TotalFileCount setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public TotalFileCount setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

    public static class TotalFileCountDayGrowthRatio extends TeaModel {
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

        public static TotalFileCountDayGrowthRatio build(java.util.Map<String, ?> map) throws Exception {
            TotalFileCountDayGrowthRatio self = new TotalFileCountDayGrowthRatio();
            return TeaModel.build(map, self);
        }

        public TotalFileCountDayGrowthRatio setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public TotalFileCountDayGrowthRatio setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public TotalFileCountDayGrowthRatio setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public TotalFileCountDayGrowthRatio setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

    public static class TotalFileDayGrowthCount extends TeaModel {
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

        public static TotalFileDayGrowthCount build(java.util.Map<String, ?> map) throws Exception {
            TotalFileDayGrowthCount self = new TotalFileDayGrowthCount();
            return TeaModel.build(map, self);
        }

        public TotalFileDayGrowthCount setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public TotalFileDayGrowthCount setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public TotalFileDayGrowthCount setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public TotalFileDayGrowthCount setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

    public static class WarmDataDayGrowthSize extends TeaModel {
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

        public static WarmDataDayGrowthSize build(java.util.Map<String, ?> map) throws Exception {
            WarmDataDayGrowthSize self = new WarmDataDayGrowthSize();
            return TeaModel.build(map, self);
        }

        public WarmDataDayGrowthSize setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public WarmDataDayGrowthSize setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public WarmDataDayGrowthSize setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public WarmDataDayGrowthSize setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

    public static class WarmDataRatio extends TeaModel {
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

        public static WarmDataRatio build(java.util.Map<String, ?> map) throws Exception {
            WarmDataRatio self = new WarmDataRatio();
            return TeaModel.build(map, self);
        }

        public WarmDataRatio setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public WarmDataRatio setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public WarmDataRatio setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public WarmDataRatio setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
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

    public static class WarmDataSizeDayGrowthRatio extends TeaModel {
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

        public static WarmDataSizeDayGrowthRatio build(java.util.Map<String, ?> map) throws Exception {
            WarmDataSizeDayGrowthRatio self = new WarmDataSizeDayGrowthRatio();
            return TeaModel.build(map, self);
        }

        public WarmDataSizeDayGrowthRatio setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public WarmDataSizeDayGrowthRatio setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public WarmDataSizeDayGrowthRatio setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public WarmDataSizeDayGrowthRatio setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

    public static class Metrics extends TeaModel {
        /**
         * <p>The daily increment of the amount of cold data. Cold data refers to data that is not accessed for more than 30 days but is accessed in 90 days.</p>
         */
        @NameInMap("ColdDataDayGrowthSize")
        public ColdDataDayGrowthSize coldDataDayGrowthSize;

        /**
         * <p>The proportion of cold data. Cold data refers to data that is not accessed for more than 30 days but is accessed in 90 days.</p>
         */
        @NameInMap("ColdDataRatio")
        public ColdDataRatio coldDataRatio;

        /**
         * <p>The amount of cold data. Cold data refers to data that is not accessed for more than 30 days but is accessed in 90 days.</p>
         */
        @NameInMap("ColdDataSize")
        public ColdDataSize coldDataSize;

        /**
         * <p>The day-to-day growth rate of the amount of cold data. Cold data refers to data that is not accessed for more than 30 days but is accessed in 90 days.</p>
         */
        @NameInMap("ColdDataSizeDayGrowthRatio")
        public ColdDataSizeDayGrowthRatio coldDataSizeDayGrowthRatio;

        /**
         * <p>The number of databases.</p>
         */
        @NameInMap("DatabaseCount")
        public DatabaseCount databaseCount;

        /**
         * <p>The number of empty files. Empty files are those with a size of 0 MB.</p>
         */
        @NameInMap("EmptyFileCount")
        public EmptyFileCount emptyFileCount;

        /**
         * <p>The day-to-day growth rate of the number of empty files. Empty files are those with a size of 0 MB.</p>
         */
        @NameInMap("EmptyFileCountDayGrowthRatio")
        public EmptyFileCountDayGrowthRatio emptyFileCountDayGrowthRatio;

        /**
         * <p>The daily increment of the number of empty files. Empty files are those with a size of 0 MB.</p>
         */
        @NameInMap("EmptyFileDayGrowthCount")
        public EmptyFileDayGrowthCount emptyFileDayGrowthCount;

        /**
         * <p>The proportion of empty files. Empty files are those with a size of 0 MB.</p>
         */
        @NameInMap("EmptyFileRatio")
        public EmptyFileRatio emptyFileRatio;

        /**
         * <p>The daily increment of the amount of very cold data. Very cold data refers to data that is not accessed for more than 90 days.</p>
         */
        @NameInMap("FreezeDataDayGrowthSize")
        public FreezeDataDayGrowthSize freezeDataDayGrowthSize;

        /**
         * <p>The proportion of very cold data. Very cold data refers to data that is not accessed for more than 90 days.</p>
         */
        @NameInMap("FreezeDataRatio")
        public FreezeDataRatio freezeDataRatio;

        /**
         * <p>The amount of very cold data. Very cold data refers to data that is not accessed for more than 90 days.</p>
         */
        @NameInMap("FreezeDataSize")
        public FreezeDataSize freezeDataSize;

        /**
         * <p>The day-to-day growth rate of the amount of very cold data. Very cold data refers to data that is not accessed for more than 90 days.</p>
         */
        @NameInMap("FreezeDataSizeDayGrowthRatio")
        public FreezeDataSizeDayGrowthRatio freezeDataSizeDayGrowthRatio;

        /**
         * <p>The daily increment of the amount of hot data. Hot data refers to data that is accessed in recent seven days.</p>
         */
        @NameInMap("HotDataDayGrowthSize")
        public HotDataDayGrowthSize hotDataDayGrowthSize;

        /**
         * <p>The proportion of hot data. Hot data refers to data that is accessed in recent seven days.</p>
         */
        @NameInMap("HotDataRatio")
        public HotDataRatio hotDataRatio;

        /**
         * <p>The amount of hot data. Hot data refers to data that is accessed in recent seven days.</p>
         */
        @NameInMap("HotDataSize")
        public HotDataSize hotDataSize;

        /**
         * <p>The day-to-day growth rate of the amount of hot data. Hot data refers to data that is accessed in recent seven days.</p>
         */
        @NameInMap("HotDataSizeDayGrowthRatio")
        public HotDataSizeDayGrowthRatio hotDataSizeDayGrowthRatio;

        /**
         * <p>The number of large files. Large files are those with a size greater than 1 GB.</p>
         */
        @NameInMap("LargeFileCount")
        public LargeFileCount largeFileCount;

        /**
         * <p>The day-to-day growth rate of the number of large files. Large files are those with a size greater than 1 GB.</p>
         */
        @NameInMap("LargeFileCountDayGrowthRatio")
        public LargeFileCountDayGrowthRatio largeFileCountDayGrowthRatio;

        /**
         * <p>The daily increment of the number of large files. Large files are those with a size greater than 1 GB.</p>
         */
        @NameInMap("LargeFileDayGrowthCount")
        public LargeFileDayGrowthCount largeFileDayGrowthCount;

        /**
         * <p>The proportion of large files. Large files are those with a size greater than 1 GB.</p>
         */
        @NameInMap("LargeFileRatio")
        public LargeFileRatio largeFileRatio;

        /**
         * <p>The number of medium files. Medium files are those with a size greater than or equal to 128 MB and less than or equal to 1 GB.</p>
         */
        @NameInMap("MediumFileCount")
        public MediumFileCount mediumFileCount;

        /**
         * <p>The day-to-day growth rate of the number of medium files. Medium files are those with a size greater than or equal to 128 MB and less than or equal to 1 GB.</p>
         */
        @NameInMap("MediumFileCountDayGrowthRatio")
        public MediumFileCountDayGrowthRatio mediumFileCountDayGrowthRatio;

        /**
         * <p>The daily increment of the number of medium files. Medium files are those with a size greater than or equal to 128 MB and less than or equal to 1 GB.</p>
         */
        @NameInMap("MediumFileDayGrowthCount")
        public MediumFileDayGrowthCount mediumFileDayGrowthCount;

        /**
         * <p>The proportion of medium files. Medium files are those with a size greater than or equal to 128 MB and less than or equal to 1 GB.</p>
         */
        @NameInMap("MediumFileRatio")
        public MediumFileRatio mediumFileRatio;

        /**
         * <p>The number of partitions.</p>
         */
        @NameInMap("PartitionNum")
        public PartitionNum partitionNum;

        /**
         * <p>The number of small files. Small files are those with a size greater than or equal to 10 MB and less than 128 MB.</p>
         */
        @NameInMap("SmallFileCount")
        public SmallFileCount smallFileCount;

        /**
         * <p>The day-to-day growth rate of the number of small files. Small files are those with a size greater than or equal to 10 MB and less than 128 MB.</p>
         */
        @NameInMap("SmallFileCountDayGrowthRatio")
        public SmallFileCountDayGrowthRatio smallFileCountDayGrowthRatio;

        /**
         * <p>The daily increment of the number of small files. Small files are those with a size greater than or equal to 10 MB and less than 128 MB.</p>
         */
        @NameInMap("SmallFileDayGrowthCount")
        public SmallFileDayGrowthCount smallFileDayGrowthCount;

        /**
         * <p>The proportion of small files. Small files are those with a size greater than or equal to 10 MB and less than 128 MB.</p>
         */
        @NameInMap("SmallFileRatio")
        public SmallFileRatio smallFileRatio;

        /**
         * <p>The number of tables.</p>
         */
        @NameInMap("TableCount")
        public TableCount tableCount;

        /**
         * <p>The number of very small files. Very small files are those with a size greater than 0 MB and less than 10 MB.</p>
         */
        @NameInMap("TinyFileCount")
        public TinyFileCount tinyFileCount;

        /**
         * <p>The day-to-day growth rate of the number of very small files. Very small files are those with a size greater than 0 MB and less than 10 MB.</p>
         */
        @NameInMap("TinyFileCountDayGrowthRatio")
        public TinyFileCountDayGrowthRatio tinyFileCountDayGrowthRatio;

        /**
         * <p>The daily increment of the number of very small files. Very small files are those with a size greater than 0 MB and less than 10 MB.</p>
         */
        @NameInMap("TinyFileDayGrowthCount")
        public TinyFileDayGrowthCount tinyFileDayGrowthCount;

        /**
         * <p>The proportion of very small files. Very small files are those with a size greater than 0 MB and less than 10 MB.</p>
         */
        @NameInMap("TinyFileRatio")
        public TinyFileRatio tinyFileRatio;

        /**
         * <p>The daily incremental of the total data volume.</p>
         */
        @NameInMap("TotalDataDayGrowthSize")
        public TotalDataDayGrowthSize totalDataDayGrowthSize;

        /**
         * <p>The total amount of data.</p>
         */
        @NameInMap("TotalDataSize")
        public TotalDataSize totalDataSize;

        /**
         * <p>The day-to-day growth rate of the total data volume.</p>
         */
        @NameInMap("TotalDataSizeDayGrowthRatio")
        public TotalDataSizeDayGrowthRatio totalDataSizeDayGrowthRatio;

        /**
         * <p>The total number of files.</p>
         */
        @NameInMap("TotalFileCount")
        public TotalFileCount totalFileCount;

        /**
         * <p>The day-to-day growth rate of the total number of files.</p>
         */
        @NameInMap("TotalFileCountDayGrowthRatio")
        public TotalFileCountDayGrowthRatio totalFileCountDayGrowthRatio;

        /**
         * <p>The daily increment of the total number of files.</p>
         */
        @NameInMap("TotalFileDayGrowthCount")
        public TotalFileDayGrowthCount totalFileDayGrowthCount;

        /**
         * <p>The daily increment of the amount of warm data. Warm data refers to data that is not accessed for more than 7 days but is accessed in 30 days.</p>
         */
        @NameInMap("WarmDataDayGrowthSize")
        public WarmDataDayGrowthSize warmDataDayGrowthSize;

        /**
         * <p>The proportion of warm data. Warm data refers to data that is not accessed for more than 7 days but is accessed in 30 days.</p>
         */
        @NameInMap("WarmDataRatio")
        public WarmDataRatio warmDataRatio;

        /**
         * <p>The amount of warm data. Warm data refers to data that is not accessed for more than 7 days but is accessed in 30 days.</p>
         */
        @NameInMap("WarmDataSize")
        public WarmDataSize warmDataSize;

        /**
         * <p>The day-to-day growth rate of the amount of warm data. Warm data refers to data that is not accessed for more than 7 days but is accessed in 30 days.</p>
         */
        @NameInMap("WarmDataSizeDayGrowthRatio")
        public WarmDataSizeDayGrowthRatio warmDataSizeDayGrowthRatio;

        public static Metrics build(java.util.Map<String, ?> map) throws Exception {
            Metrics self = new Metrics();
            return TeaModel.build(map, self);
        }

        public Metrics setColdDataDayGrowthSize(ColdDataDayGrowthSize coldDataDayGrowthSize) {
            this.coldDataDayGrowthSize = coldDataDayGrowthSize;
            return this;
        }
        public ColdDataDayGrowthSize getColdDataDayGrowthSize() {
            return this.coldDataDayGrowthSize;
        }

        public Metrics setColdDataRatio(ColdDataRatio coldDataRatio) {
            this.coldDataRatio = coldDataRatio;
            return this;
        }
        public ColdDataRatio getColdDataRatio() {
            return this.coldDataRatio;
        }

        public Metrics setColdDataSize(ColdDataSize coldDataSize) {
            this.coldDataSize = coldDataSize;
            return this;
        }
        public ColdDataSize getColdDataSize() {
            return this.coldDataSize;
        }

        public Metrics setColdDataSizeDayGrowthRatio(ColdDataSizeDayGrowthRatio coldDataSizeDayGrowthRatio) {
            this.coldDataSizeDayGrowthRatio = coldDataSizeDayGrowthRatio;
            return this;
        }
        public ColdDataSizeDayGrowthRatio getColdDataSizeDayGrowthRatio() {
            return this.coldDataSizeDayGrowthRatio;
        }

        public Metrics setDatabaseCount(DatabaseCount databaseCount) {
            this.databaseCount = databaseCount;
            return this;
        }
        public DatabaseCount getDatabaseCount() {
            return this.databaseCount;
        }

        public Metrics setEmptyFileCount(EmptyFileCount emptyFileCount) {
            this.emptyFileCount = emptyFileCount;
            return this;
        }
        public EmptyFileCount getEmptyFileCount() {
            return this.emptyFileCount;
        }

        public Metrics setEmptyFileCountDayGrowthRatio(EmptyFileCountDayGrowthRatio emptyFileCountDayGrowthRatio) {
            this.emptyFileCountDayGrowthRatio = emptyFileCountDayGrowthRatio;
            return this;
        }
        public EmptyFileCountDayGrowthRatio getEmptyFileCountDayGrowthRatio() {
            return this.emptyFileCountDayGrowthRatio;
        }

        public Metrics setEmptyFileDayGrowthCount(EmptyFileDayGrowthCount emptyFileDayGrowthCount) {
            this.emptyFileDayGrowthCount = emptyFileDayGrowthCount;
            return this;
        }
        public EmptyFileDayGrowthCount getEmptyFileDayGrowthCount() {
            return this.emptyFileDayGrowthCount;
        }

        public Metrics setEmptyFileRatio(EmptyFileRatio emptyFileRatio) {
            this.emptyFileRatio = emptyFileRatio;
            return this;
        }
        public EmptyFileRatio getEmptyFileRatio() {
            return this.emptyFileRatio;
        }

        public Metrics setFreezeDataDayGrowthSize(FreezeDataDayGrowthSize freezeDataDayGrowthSize) {
            this.freezeDataDayGrowthSize = freezeDataDayGrowthSize;
            return this;
        }
        public FreezeDataDayGrowthSize getFreezeDataDayGrowthSize() {
            return this.freezeDataDayGrowthSize;
        }

        public Metrics setFreezeDataRatio(FreezeDataRatio freezeDataRatio) {
            this.freezeDataRatio = freezeDataRatio;
            return this;
        }
        public FreezeDataRatio getFreezeDataRatio() {
            return this.freezeDataRatio;
        }

        public Metrics setFreezeDataSize(FreezeDataSize freezeDataSize) {
            this.freezeDataSize = freezeDataSize;
            return this;
        }
        public FreezeDataSize getFreezeDataSize() {
            return this.freezeDataSize;
        }

        public Metrics setFreezeDataSizeDayGrowthRatio(FreezeDataSizeDayGrowthRatio freezeDataSizeDayGrowthRatio) {
            this.freezeDataSizeDayGrowthRatio = freezeDataSizeDayGrowthRatio;
            return this;
        }
        public FreezeDataSizeDayGrowthRatio getFreezeDataSizeDayGrowthRatio() {
            return this.freezeDataSizeDayGrowthRatio;
        }

        public Metrics setHotDataDayGrowthSize(HotDataDayGrowthSize hotDataDayGrowthSize) {
            this.hotDataDayGrowthSize = hotDataDayGrowthSize;
            return this;
        }
        public HotDataDayGrowthSize getHotDataDayGrowthSize() {
            return this.hotDataDayGrowthSize;
        }

        public Metrics setHotDataRatio(HotDataRatio hotDataRatio) {
            this.hotDataRatio = hotDataRatio;
            return this;
        }
        public HotDataRatio getHotDataRatio() {
            return this.hotDataRatio;
        }

        public Metrics setHotDataSize(HotDataSize hotDataSize) {
            this.hotDataSize = hotDataSize;
            return this;
        }
        public HotDataSize getHotDataSize() {
            return this.hotDataSize;
        }

        public Metrics setHotDataSizeDayGrowthRatio(HotDataSizeDayGrowthRatio hotDataSizeDayGrowthRatio) {
            this.hotDataSizeDayGrowthRatio = hotDataSizeDayGrowthRatio;
            return this;
        }
        public HotDataSizeDayGrowthRatio getHotDataSizeDayGrowthRatio() {
            return this.hotDataSizeDayGrowthRatio;
        }

        public Metrics setLargeFileCount(LargeFileCount largeFileCount) {
            this.largeFileCount = largeFileCount;
            return this;
        }
        public LargeFileCount getLargeFileCount() {
            return this.largeFileCount;
        }

        public Metrics setLargeFileCountDayGrowthRatio(LargeFileCountDayGrowthRatio largeFileCountDayGrowthRatio) {
            this.largeFileCountDayGrowthRatio = largeFileCountDayGrowthRatio;
            return this;
        }
        public LargeFileCountDayGrowthRatio getLargeFileCountDayGrowthRatio() {
            return this.largeFileCountDayGrowthRatio;
        }

        public Metrics setLargeFileDayGrowthCount(LargeFileDayGrowthCount largeFileDayGrowthCount) {
            this.largeFileDayGrowthCount = largeFileDayGrowthCount;
            return this;
        }
        public LargeFileDayGrowthCount getLargeFileDayGrowthCount() {
            return this.largeFileDayGrowthCount;
        }

        public Metrics setLargeFileRatio(LargeFileRatio largeFileRatio) {
            this.largeFileRatio = largeFileRatio;
            return this;
        }
        public LargeFileRatio getLargeFileRatio() {
            return this.largeFileRatio;
        }

        public Metrics setMediumFileCount(MediumFileCount mediumFileCount) {
            this.mediumFileCount = mediumFileCount;
            return this;
        }
        public MediumFileCount getMediumFileCount() {
            return this.mediumFileCount;
        }

        public Metrics setMediumFileCountDayGrowthRatio(MediumFileCountDayGrowthRatio mediumFileCountDayGrowthRatio) {
            this.mediumFileCountDayGrowthRatio = mediumFileCountDayGrowthRatio;
            return this;
        }
        public MediumFileCountDayGrowthRatio getMediumFileCountDayGrowthRatio() {
            return this.mediumFileCountDayGrowthRatio;
        }

        public Metrics setMediumFileDayGrowthCount(MediumFileDayGrowthCount mediumFileDayGrowthCount) {
            this.mediumFileDayGrowthCount = mediumFileDayGrowthCount;
            return this;
        }
        public MediumFileDayGrowthCount getMediumFileDayGrowthCount() {
            return this.mediumFileDayGrowthCount;
        }

        public Metrics setMediumFileRatio(MediumFileRatio mediumFileRatio) {
            this.mediumFileRatio = mediumFileRatio;
            return this;
        }
        public MediumFileRatio getMediumFileRatio() {
            return this.mediumFileRatio;
        }

        public Metrics setPartitionNum(PartitionNum partitionNum) {
            this.partitionNum = partitionNum;
            return this;
        }
        public PartitionNum getPartitionNum() {
            return this.partitionNum;
        }

        public Metrics setSmallFileCount(SmallFileCount smallFileCount) {
            this.smallFileCount = smallFileCount;
            return this;
        }
        public SmallFileCount getSmallFileCount() {
            return this.smallFileCount;
        }

        public Metrics setSmallFileCountDayGrowthRatio(SmallFileCountDayGrowthRatio smallFileCountDayGrowthRatio) {
            this.smallFileCountDayGrowthRatio = smallFileCountDayGrowthRatio;
            return this;
        }
        public SmallFileCountDayGrowthRatio getSmallFileCountDayGrowthRatio() {
            return this.smallFileCountDayGrowthRatio;
        }

        public Metrics setSmallFileDayGrowthCount(SmallFileDayGrowthCount smallFileDayGrowthCount) {
            this.smallFileDayGrowthCount = smallFileDayGrowthCount;
            return this;
        }
        public SmallFileDayGrowthCount getSmallFileDayGrowthCount() {
            return this.smallFileDayGrowthCount;
        }

        public Metrics setSmallFileRatio(SmallFileRatio smallFileRatio) {
            this.smallFileRatio = smallFileRatio;
            return this;
        }
        public SmallFileRatio getSmallFileRatio() {
            return this.smallFileRatio;
        }

        public Metrics setTableCount(TableCount tableCount) {
            this.tableCount = tableCount;
            return this;
        }
        public TableCount getTableCount() {
            return this.tableCount;
        }

        public Metrics setTinyFileCount(TinyFileCount tinyFileCount) {
            this.tinyFileCount = tinyFileCount;
            return this;
        }
        public TinyFileCount getTinyFileCount() {
            return this.tinyFileCount;
        }

        public Metrics setTinyFileCountDayGrowthRatio(TinyFileCountDayGrowthRatio tinyFileCountDayGrowthRatio) {
            this.tinyFileCountDayGrowthRatio = tinyFileCountDayGrowthRatio;
            return this;
        }
        public TinyFileCountDayGrowthRatio getTinyFileCountDayGrowthRatio() {
            return this.tinyFileCountDayGrowthRatio;
        }

        public Metrics setTinyFileDayGrowthCount(TinyFileDayGrowthCount tinyFileDayGrowthCount) {
            this.tinyFileDayGrowthCount = tinyFileDayGrowthCount;
            return this;
        }
        public TinyFileDayGrowthCount getTinyFileDayGrowthCount() {
            return this.tinyFileDayGrowthCount;
        }

        public Metrics setTinyFileRatio(TinyFileRatio tinyFileRatio) {
            this.tinyFileRatio = tinyFileRatio;
            return this;
        }
        public TinyFileRatio getTinyFileRatio() {
            return this.tinyFileRatio;
        }

        public Metrics setTotalDataDayGrowthSize(TotalDataDayGrowthSize totalDataDayGrowthSize) {
            this.totalDataDayGrowthSize = totalDataDayGrowthSize;
            return this;
        }
        public TotalDataDayGrowthSize getTotalDataDayGrowthSize() {
            return this.totalDataDayGrowthSize;
        }

        public Metrics setTotalDataSize(TotalDataSize totalDataSize) {
            this.totalDataSize = totalDataSize;
            return this;
        }
        public TotalDataSize getTotalDataSize() {
            return this.totalDataSize;
        }

        public Metrics setTotalDataSizeDayGrowthRatio(TotalDataSizeDayGrowthRatio totalDataSizeDayGrowthRatio) {
            this.totalDataSizeDayGrowthRatio = totalDataSizeDayGrowthRatio;
            return this;
        }
        public TotalDataSizeDayGrowthRatio getTotalDataSizeDayGrowthRatio() {
            return this.totalDataSizeDayGrowthRatio;
        }

        public Metrics setTotalFileCount(TotalFileCount totalFileCount) {
            this.totalFileCount = totalFileCount;
            return this;
        }
        public TotalFileCount getTotalFileCount() {
            return this.totalFileCount;
        }

        public Metrics setTotalFileCountDayGrowthRatio(TotalFileCountDayGrowthRatio totalFileCountDayGrowthRatio) {
            this.totalFileCountDayGrowthRatio = totalFileCountDayGrowthRatio;
            return this;
        }
        public TotalFileCountDayGrowthRatio getTotalFileCountDayGrowthRatio() {
            return this.totalFileCountDayGrowthRatio;
        }

        public Metrics setTotalFileDayGrowthCount(TotalFileDayGrowthCount totalFileDayGrowthCount) {
            this.totalFileDayGrowthCount = totalFileDayGrowthCount;
            return this;
        }
        public TotalFileDayGrowthCount getTotalFileDayGrowthCount() {
            return this.totalFileDayGrowthCount;
        }

        public Metrics setWarmDataDayGrowthSize(WarmDataDayGrowthSize warmDataDayGrowthSize) {
            this.warmDataDayGrowthSize = warmDataDayGrowthSize;
            return this;
        }
        public WarmDataDayGrowthSize getWarmDataDayGrowthSize() {
            return this.warmDataDayGrowthSize;
        }

        public Metrics setWarmDataRatio(WarmDataRatio warmDataRatio) {
            this.warmDataRatio = warmDataRatio;
            return this;
        }
        public WarmDataRatio getWarmDataRatio() {
            return this.warmDataRatio;
        }

        public Metrics setWarmDataSize(WarmDataSize warmDataSize) {
            this.warmDataSize = warmDataSize;
            return this;
        }
        public WarmDataSize getWarmDataSize() {
            return this.warmDataSize;
        }

        public Metrics setWarmDataSizeDayGrowthRatio(WarmDataSizeDayGrowthRatio warmDataSizeDayGrowthRatio) {
            this.warmDataSizeDayGrowthRatio = warmDataSizeDayGrowthRatio;
            return this;
        }
        public WarmDataSizeDayGrowthRatio getWarmDataSizeDayGrowthRatio() {
            return this.warmDataSizeDayGrowthRatio;
        }

    }

    public static class Data extends TeaModel {
        /**
         * <p>The analysis results.</p>
         */
        @NameInMap("Analysis")
        public Analysis analysis;

        /**
         * <p>The information from the perspective of storage formats.</p>
         */
        @NameInMap("Formats")
        public java.util.List<Formats> formats;

        /**
         * <p>The metric information.</p>
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

        public Data setFormats(java.util.List<Formats> formats) {
            this.formats = formats;
            return this;
        }
        public java.util.List<Formats> getFormats() {
            return this.formats;
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
