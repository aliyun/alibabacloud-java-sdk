// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribePriceRequest extends TeaModel {
    @NameInMap("DataDisk")
    public java.util.List<DescribePriceRequestDataDisk> dataDisk;

    @NameInMap("SystemDisk")
    public DescribePriceRequestSystemDisk systemDisk;

    // 如果DataDisk.1.Size为空且此字段不为空时的则以此字段为准
    @NameInMap("DataDisks")
    public java.util.List<DescribePriceRequestDataDisks> dataDisks;

    // 节点ID。
    @NameInMap("EnsRegionId")
    public String ensRegionId;

    // 实列规格。
    @NameInMap("InstanceType")
    public String instanceType;

    // 带宽计费方式
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    // 购买资源的时长，如果不指定PeriodUnit，则默认按月购买。目前只支持按Days和Month。如果PeriodUnit=Day时，Period仅可以3。如果PeriodUnit=Monthc时，则Period可以为1-9,12。
    @NameInMap("Period")
    public Integer period;

    // 查询云服务器ENS不同计费周期的价格。取值范围：
    // Month（默认）：按月计费的价格单位。
    // Day：按天计费的价格单位。
    @NameInMap("PeriodUnit")
    public String periodUnit;

    // 数量。
    @NameInMap("Quantity")
    public Integer quantity;

    public static DescribePriceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePriceRequest self = new DescribePriceRequest();
        return TeaModel.build(map, self);
    }

    public DescribePriceRequest setDataDisk(java.util.List<DescribePriceRequestDataDisk> dataDisk) {
        this.dataDisk = dataDisk;
        return this;
    }
    public java.util.List<DescribePriceRequestDataDisk> getDataDisk() {
        return this.dataDisk;
    }

    public DescribePriceRequest setSystemDisk(DescribePriceRequestSystemDisk systemDisk) {
        this.systemDisk = systemDisk;
        return this;
    }
    public DescribePriceRequestSystemDisk getSystemDisk() {
        return this.systemDisk;
    }

    public DescribePriceRequest setDataDisks(java.util.List<DescribePriceRequestDataDisks> dataDisks) {
        this.dataDisks = dataDisks;
        return this;
    }
    public java.util.List<DescribePriceRequestDataDisks> getDataDisks() {
        return this.dataDisks;
    }

    public DescribePriceRequest setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public DescribePriceRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribePriceRequest setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public DescribePriceRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public DescribePriceRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public DescribePriceRequest setQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }
    public Integer getQuantity() {
        return this.quantity;
    }

    public static class DescribePriceRequestDataDisk extends TeaModel {
        // 数据盘大小，单位GB。如果此字段不为空，则以此段为准。
        @NameInMap("Size")
        public Integer size;

        public static DescribePriceRequestDataDisk build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceRequestDataDisk self = new DescribePriceRequestDataDisk();
            return TeaModel.build(map, self);
        }

        public DescribePriceRequestDataDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

    }

    public static class DescribePriceRequestSystemDisk extends TeaModel {
        // 系统盘大小，单位：GB
        @NameInMap("Size")
        public Integer size;

        public static DescribePriceRequestSystemDisk build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceRequestSystemDisk self = new DescribePriceRequestSystemDisk();
            return TeaModel.build(map, self);
        }

        public DescribePriceRequestSystemDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

    }

    public static class DescribePriceRequestDataDisks extends TeaModel {
        // 磁盘类型
        @NameInMap("Category")
        public String category;

        @NameInMap("Size")
        public Long size;

        public static DescribePriceRequestDataDisks build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceRequestDataDisks self = new DescribePriceRequestDataDisks();
            return TeaModel.build(map, self);
        }

        public DescribePriceRequestDataDisks setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribePriceRequestDataDisks setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

    }

}
