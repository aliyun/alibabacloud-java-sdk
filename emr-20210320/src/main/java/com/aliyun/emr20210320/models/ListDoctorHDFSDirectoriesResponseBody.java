// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListDoctorHDFSDirectoriesResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<Data> data;

    /**
     * <p>本次请求所返回的最大记录条数。</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>返回读取到的数据位置，空代表数据已经读取完毕。</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C89568980</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>请求ID。</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>本次请求条件下的数据总量。</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListDoctorHDFSDirectoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDoctorHDFSDirectoriesResponseBody self = new ListDoctorHDFSDirectoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDoctorHDFSDirectoriesResponseBody setData(java.util.List<Data> data) {
        this.data = data;
        return this;
    }
    public java.util.List<Data> getData() {
        return this.data;
    }

    public ListDoctorHDFSDirectoriesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDoctorHDFSDirectoriesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDoctorHDFSDirectoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDoctorHDFSDirectoriesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ColdDataDayGrowthSize extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Day growth size of cold data</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>coldDataDayGrowthSize</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>MB</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <strong>example:</strong>
         * <p>-182636577752</p>
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

    public static class ColdDataSize extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Size of the cold data size</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>coldDataSize</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>MB</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <strong>example:</strong>
         * <p>5570958082267</p>
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
         * <strong>example:</strong>
         * <p>Day growth ratio of cold data size</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>coldDataSizeDayGrowthRatio</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>”“</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <strong>example:</strong>
         * <p>-0.03</p>
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

    public static class EmptyFileCount extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Number of empty files</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>emptyFileCount</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>”“</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <strong>example:</strong>
         * <p>15595897</p>
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
         * <strong>example:</strong>
         * <p>Day growth ratio of empty files</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>emptyFileCountDayGrowthRatio</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>”“</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <strong>example:</strong>
         * <p>0.005</p>
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
         * <strong>example:</strong>
         * <p>Day growth count of empty files</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>emptyFileDayGrowthCount</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>”“</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <strong>example:</strong>
         * <p>114</p>
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

    public static class FreezeDataDayGrowthSize extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Day growth size of freeze data</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>freezeDataDayGrowthSize</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>MB</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <strong>example:</strong>
         * <p>-167683929450</p>
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

    public static class FreezeDataSize extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Size of the freeze data size</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>freezeDataSize</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>MB</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <strong>example:</strong>
         * <p>1231312431</p>
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
         * <strong>example:</strong>
         * <p>Day growth ratio of freeze data size</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>freezeDataSizeDayGrowthRatio</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>”“</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <strong>example:</strong>
         * <p>-0.09</p>
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
         * <strong>example:</strong>
         * <p>Day growth size of hot data</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>hotDataDayGrowthSize</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>MB</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <strong>example:</strong>
         * <p>123154</p>
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

    public static class HotDataSize extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Size of the hot data size</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>hotDataSize</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>MB</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <strong>example:</strong>
         * <p>6701531944206</p>
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
         * <strong>example:</strong>
         * <p>Day growth ratio of hot data size</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>hotDataSizeDayGrowthRatio</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>”“</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <strong>example:</strong>
         * <p>0.1114</p>
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
         * <strong>example:</strong>
         * <p>Number of large files</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>largeFileCount</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>”“</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <strong>example:</strong>
         * <p>123</p>
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
         * <strong>example:</strong>
         * <p>Day growth ratio of large files</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>largeFileCountDayGrowthRatio</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>”“</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <strong>example:</strong>
         * <p>0.39</p>
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
         * <strong>example:</strong>
         * <p>Day growth count of large files</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>largeFileDayGrowthCount</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>”“</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <strong>example:</strong>
         * <p>2</p>
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

    public static class MediumFileCount extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Number of medium files</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>mediumFileCount</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>”“</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <strong>example:</strong>
         * <p>323</p>
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
         * <strong>example:</strong>
         * <p>Day growth ratio of medium files</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>mediumFileCountDayGrowthRatio</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>”“</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <strong>example:</strong>
         * <p>0.19</p>
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
         * <strong>example:</strong>
         * <p>Day growth count of medium files</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>mediumFileDayGrowthCount</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>”“</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <strong>example:</strong>
         * <p>176</p>
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

    public static class SmallFileCount extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Number of small files</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>smallFileCount</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>”“</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <strong>example:</strong>
         * <p>12345</p>
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
         * <strong>example:</strong>
         * <p>Day growth ratio of small files</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>smallFileCountDayGrowthRatio</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>”“</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <strong>example:</strong>
         * <p>0.02</p>
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
         * <strong>example:</strong>
         * <p>Day growth count of small files</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>smallFileDayGrowthCount</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>”“</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <strong>example:</strong>
         * <p>12345</p>
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

    public static class TinyFileCount extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Number of tiny files</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>tinyFileCount</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <strong>example:</strong>
         * <p>232131</p>
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
         * <strong>example:</strong>
         * <p>Day growth ratio of tiny files</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>tinyFileCountDayGrowthRatio</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>”“</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <strong>example:</strong>
         * <p>0.003</p>
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
         * <strong>example:</strong>
         * <p>Day growth count of tiny files</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>tinyFileDayGrowthCount</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>”“</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <strong>example:</strong>
         * <p>-123</p>
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

    public static class TotalDataDayGrowthSize extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Day growth size of total data</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>totalDataDayGrowthSize</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>MB</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <strong>example:</strong>
         * <p>256482228248</p>
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
         * <strong>example:</strong>
         * <p>Total data size in megabytes (MB)</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>totalDataSize</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>MB</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <strong>example:</strong>
         * <p>62086342083623</p>
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
         * <strong>example:</strong>
         * <p>Day growth ratio of total data size</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>totalDataSizeDayGrowthRatio</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>”“</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <strong>example:</strong>
         * <p>0.14</p>
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
         * <strong>example:</strong>
         * <p>Number of total files</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>totalFileCount</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>”“</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <strong>example:</strong>
         * <p>51683279</p>
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
         * <strong>example:</strong>
         * <p>Day growth ratio of total files</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>totalFileCountDayGrowthRatio</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>”“</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <strong>example:</strong>
         * <p>0.02</p>
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
         * <strong>example:</strong>
         * <p>Day growth count of total files</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>totalFileDayGrowthCount</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>”“</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <strong>example:</strong>
         * <p>27809</p>
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
         * <strong>example:</strong>
         * <p>Day growth size of warm data</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>warmDataDayGrowthSize</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>MB</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <strong>example:</strong>
         * <p>-64806998319</p>
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

    public static class WarmDataSize extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Size of the warm data size</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>warmDataSize</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>MB</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <strong>example:</strong>
         * <p>4062349775577</p>
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
         * <strong>example:</strong>
         * <p>Day growth ratio of warm data size</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>warmDataSizeDayGrowthRatio</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>”“</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <strong>example:</strong>
         * <p>-0.015</p>
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
        @NameInMap("ColdDataDayGrowthSize")
        public ColdDataDayGrowthSize coldDataDayGrowthSize;

        @NameInMap("ColdDataSize")
        public ColdDataSize coldDataSize;

        @NameInMap("ColdDataSizeDayGrowthRatio")
        public ColdDataSizeDayGrowthRatio coldDataSizeDayGrowthRatio;

        @NameInMap("EmptyFileCount")
        public EmptyFileCount emptyFileCount;

        @NameInMap("EmptyFileCountDayGrowthRatio")
        public EmptyFileCountDayGrowthRatio emptyFileCountDayGrowthRatio;

        @NameInMap("EmptyFileDayGrowthCount")
        public EmptyFileDayGrowthCount emptyFileDayGrowthCount;

        @NameInMap("FreezeDataDayGrowthSize")
        public FreezeDataDayGrowthSize freezeDataDayGrowthSize;

        @NameInMap("FreezeDataSize")
        public FreezeDataSize freezeDataSize;

        @NameInMap("FreezeDataSizeDayGrowthRatio")
        public FreezeDataSizeDayGrowthRatio freezeDataSizeDayGrowthRatio;

        @NameInMap("HotDataDayGrowthSize")
        public HotDataDayGrowthSize hotDataDayGrowthSize;

        @NameInMap("HotDataSize")
        public HotDataSize hotDataSize;

        @NameInMap("HotDataSizeDayGrowthRatio")
        public HotDataSizeDayGrowthRatio hotDataSizeDayGrowthRatio;

        @NameInMap("LargeFileCount")
        public LargeFileCount largeFileCount;

        @NameInMap("LargeFileCountDayGrowthRatio")
        public LargeFileCountDayGrowthRatio largeFileCountDayGrowthRatio;

        @NameInMap("LargeFileDayGrowthCount")
        public LargeFileDayGrowthCount largeFileDayGrowthCount;

        @NameInMap("MediumFileCount")
        public MediumFileCount mediumFileCount;

        @NameInMap("MediumFileCountDayGrowthRatio")
        public MediumFileCountDayGrowthRatio mediumFileCountDayGrowthRatio;

        @NameInMap("MediumFileDayGrowthCount")
        public MediumFileDayGrowthCount mediumFileDayGrowthCount;

        @NameInMap("SmallFileCount")
        public SmallFileCount smallFileCount;

        @NameInMap("SmallFileCountDayGrowthRatio")
        public SmallFileCountDayGrowthRatio smallFileCountDayGrowthRatio;

        @NameInMap("SmallFileDayGrowthCount")
        public SmallFileDayGrowthCount smallFileDayGrowthCount;

        @NameInMap("TinyFileCount")
        public TinyFileCount tinyFileCount;

        @NameInMap("TinyFileCountDayGrowthRatio")
        public TinyFileCountDayGrowthRatio tinyFileCountDayGrowthRatio;

        @NameInMap("TinyFileDayGrowthCount")
        public TinyFileDayGrowthCount tinyFileDayGrowthCount;

        @NameInMap("TotalDataDayGrowthSize")
        public TotalDataDayGrowthSize totalDataDayGrowthSize;

        @NameInMap("TotalDataSize")
        public TotalDataSize totalDataSize;

        @NameInMap("TotalDataSizeDayGrowthRatio")
        public TotalDataSizeDayGrowthRatio totalDataSizeDayGrowthRatio;

        @NameInMap("TotalFileCount")
        public TotalFileCount totalFileCount;

        @NameInMap("TotalFileCountDayGrowthRatio")
        public TotalFileCountDayGrowthRatio totalFileCountDayGrowthRatio;

        @NameInMap("TotalFileDayGrowthCount")
        public TotalFileDayGrowthCount totalFileDayGrowthCount;

        @NameInMap("WarmDataDayGrowthSize")
        public WarmDataDayGrowthSize warmDataDayGrowthSize;

        @NameInMap("WarmDataSize")
        public WarmDataSize warmDataSize;

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

        public Metrics setFreezeDataDayGrowthSize(FreezeDataDayGrowthSize freezeDataDayGrowthSize) {
            this.freezeDataDayGrowthSize = freezeDataDayGrowthSize;
            return this;
        }
        public FreezeDataDayGrowthSize getFreezeDataDayGrowthSize() {
            return this.freezeDataDayGrowthSize;
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
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Depth")
        public Integer depth;

        /**
         * <strong>example:</strong>
         * <p>/tmp/test</p>
         */
        @NameInMap("DirPath")
        public String dirPath;

        /**
         * <strong>example:</strong>
         * <p>DW</p>
         */
        @NameInMap("Group")
        public String group;

        @NameInMap("Metrics")
        public Metrics metrics;

        /**
         * <strong>example:</strong>
         * <p>DW</p>
         */
        @NameInMap("User")
        public String user;

        public static Data build(java.util.Map<String, ?> map) throws Exception {
            Data self = new Data();
            return TeaModel.build(map, self);
        }

        public Data setDepth(Integer depth) {
            this.depth = depth;
            return this;
        }
        public Integer getDepth() {
            return this.depth;
        }

        public Data setDirPath(String dirPath) {
            this.dirPath = dirPath;
            return this;
        }
        public String getDirPath() {
            return this.dirPath;
        }

        public Data setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

        public Data setMetrics(Metrics metrics) {
            this.metrics = metrics;
            return this;
        }
        public Metrics getMetrics() {
            return this.metrics;
        }

        public Data setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

}
