// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class GetDoctorHBaseClusterResponseBody extends TeaModel {
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

    public static GetDoctorHBaseClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDoctorHBaseClusterResponseBody self = new GetDoctorHBaseClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDoctorHBaseClusterResponseBody setData(Data data) {
        this.data = data;
        return this;
    }
    public Data getData() {
        return this.data;
    }

    public GetDoctorHBaseClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class Analysis extends TeaModel {
        /**
         * <p>The overall score of the HBase cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>85</p>
         */
        @NameInMap("HbaseScore")
        public Integer hbaseScore;

        public static Analysis build(java.util.Map<String, ?> map) throws Exception {
            Analysis self = new Analysis();
            return TeaModel.build(map, self);
        }

        public Analysis setHbaseScore(Integer hbaseScore) {
            this.hbaseScore = hbaseScore;
            return this;
        }
        public Integer getHbaseScore() {
            return this.hbaseScore;
        }

    }

    public static class AvgLoad extends TeaModel {
        /**
         * <p>The description of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>The average load under normal working conditions</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>avgLoad</p>
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
         * <p>36.0</p>
         */
        @NameInMap("Value")
        public Float value;

        public static AvgLoad build(java.util.Map<String, ?> map) throws Exception {
            AvgLoad self = new AvgLoad();
            return TeaModel.build(map, self);
        }

        public AvgLoad setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public AvgLoad setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AvgLoad setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public AvgLoad setValue(Float value) {
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
         * <p>430</p>
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
         * <p>128</p>
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

    public static class MemHeap extends TeaModel {
        /**
         * <p>The description of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>Memory heap usage in megabytes (MB)</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>memHeap</p>
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
         * <p>The value of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>240</p>
         */
        @NameInMap("Value")
        public Long value;

        public static MemHeap build(java.util.Map<String, ?> map) throws Exception {
            MemHeap self = new MemHeap();
            return TeaModel.build(map, self);
        }

        public MemHeap setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public MemHeap setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public MemHeap setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public MemHeap setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

    public static class NormalAvgLoad extends TeaModel {
        /**
         * <p>The description of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>The average load under normal working conditions</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>normalAvgLoad</p>
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
         * <p>526.4</p>
         */
        @NameInMap("Value")
        public Float value;

        public static NormalAvgLoad build(java.util.Map<String, ?> map) throws Exception {
            NormalAvgLoad self = new NormalAvgLoad();
            return TeaModel.build(map, self);
        }

        public NormalAvgLoad setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public NormalAvgLoad setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public NormalAvgLoad setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public NormalAvgLoad setValue(Float value) {
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
         * 
         * <strong>example:</strong>
         * <p>The ability to evenly distribute Regions on different RegionServer nodes</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the metric.</p>
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
         * <p>The value of the metric.</p>
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
         * <p>161</p>
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

    public static class RegionServerCount extends TeaModel {
        /**
         * <p>The description of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>Number of region servers count</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>regionServerCount</p>
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
         * <p>6</p>
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

    public static class StoreFileCount extends TeaModel {
        /**
         * <p>The description of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>Number of store files</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>storeFileCount</p>
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
         * <p>298</p>
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

    public static class TableCount extends TeaModel {
        /**
         * <p>The description of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>Number of tables</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>tableCount</p>
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
         * <p>10</p>
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

    public static class TotalDataSize extends TeaModel {
        /**
         * <p>The description of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>Total data size in megabytes (MB)</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>totalDataSize</p>
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
         * <p>The value of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>256</p>
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
         * <p>430</p>
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
         * <p>576</p>
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
         * <p>520</p>
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
         * <p>The average load.</p>
         */
        @NameInMap("AvgLoad")
        public AvgLoad avgLoad;

        /**
         * <p>The number of read requests in a day.</p>
         */
        @NameInMap("DailyReadRequest")
        public DailyReadRequest dailyReadRequest;

        /**
         * <p>The number of write requests in a day.</p>
         */
        @NameInMap("DailyWriteRequest")
        public DailyWriteRequest dailyWriteRequest;

        /**
         * <p>The memory size.</p>
         */
        @NameInMap("MemHeap")
        public MemHeap memHeap;

        /**
         * <p>The normal average load.</p>
         */
        @NameInMap("NormalAvgLoad")
        public NormalAvgLoad normalAvgLoad;

        /**
         * <p>The region balance degree.</p>
         */
        @NameInMap("RegionBalance")
        public RegionBalance regionBalance;

        /**
         * <p>The number of regions.</p>
         */
        @NameInMap("RegionCount")
        public RegionCount regionCount;

        /**
         * <p>The number of region servers.</p>
         */
        @NameInMap("RegionServerCount")
        public RegionServerCount regionServerCount;

        /**
         * <p>The number of StoreFiles.</p>
         */
        @NameInMap("StoreFileCount")
        public StoreFileCount storeFileCount;

        /**
         * <p>The number of tables.</p>
         */
        @NameInMap("TableCount")
        public TableCount tableCount;

        /**
         * <p>The size of the cluster.</p>
         */
        @NameInMap("TotalDataSize")
        public TotalDataSize totalDataSize;

        /**
         * <p>The total number of read requests.</p>
         */
        @NameInMap("TotalReadRequest")
        public TotalReadRequest totalReadRequest;

        /**
         * <p>The total number of requests in the cluster.</p>
         */
        @NameInMap("TotalRequest")
        public TotalRequest totalRequest;

        /**
         * <p>The total number of write requests.</p>
         */
        @NameInMap("TotalWriteRequest")
        public TotalWriteRequest totalWriteRequest;

        public static Metrics build(java.util.Map<String, ?> map) throws Exception {
            Metrics self = new Metrics();
            return TeaModel.build(map, self);
        }

        public Metrics setAvgLoad(AvgLoad avgLoad) {
            this.avgLoad = avgLoad;
            return this;
        }
        public AvgLoad getAvgLoad() {
            return this.avgLoad;
        }

        public Metrics setDailyReadRequest(DailyReadRequest dailyReadRequest) {
            this.dailyReadRequest = dailyReadRequest;
            return this;
        }
        public DailyReadRequest getDailyReadRequest() {
            return this.dailyReadRequest;
        }

        public Metrics setDailyWriteRequest(DailyWriteRequest dailyWriteRequest) {
            this.dailyWriteRequest = dailyWriteRequest;
            return this;
        }
        public DailyWriteRequest getDailyWriteRequest() {
            return this.dailyWriteRequest;
        }

        public Metrics setMemHeap(MemHeap memHeap) {
            this.memHeap = memHeap;
            return this;
        }
        public MemHeap getMemHeap() {
            return this.memHeap;
        }

        public Metrics setNormalAvgLoad(NormalAvgLoad normalAvgLoad) {
            this.normalAvgLoad = normalAvgLoad;
            return this;
        }
        public NormalAvgLoad getNormalAvgLoad() {
            return this.normalAvgLoad;
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

        public Metrics setRegionServerCount(RegionServerCount regionServerCount) {
            this.regionServerCount = regionServerCount;
            return this;
        }
        public RegionServerCount getRegionServerCount() {
            return this.regionServerCount;
        }

        public Metrics setStoreFileCount(StoreFileCount storeFileCount) {
            this.storeFileCount = storeFileCount;
            return this;
        }
        public StoreFileCount getStoreFileCount() {
            return this.storeFileCount;
        }

        public Metrics setTableCount(TableCount tableCount) {
            this.tableCount = tableCount;
            return this;
        }
        public TableCount getTableCount() {
            return this.tableCount;
        }

        public Metrics setTotalDataSize(TotalDataSize totalDataSize) {
            this.totalDataSize = totalDataSize;
            return this;
        }
        public TotalDataSize getTotalDataSize() {
            return this.totalDataSize;
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
         * <p>The analysis result.</p>
         */
        @NameInMap("Analysis")
        public Analysis analysis;

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

        public Data setMetrics(Metrics metrics) {
            this.metrics = metrics;
            return this;
        }
        public Metrics getMetrics() {
            return this.metrics;
        }

    }

}
