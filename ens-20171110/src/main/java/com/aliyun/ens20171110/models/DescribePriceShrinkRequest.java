// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribePriceShrinkRequest extends TeaModel {
    @NameInMap("DataDisk")
    public java.util.List<DescribePriceShrinkRequestDataDisk> dataDisk;

    @NameInMap("SystemDisk")
    public DescribePriceShrinkRequestSystemDisk systemDisk;

    // 如果DataDisk.1.Size为空且此字段不为空时的则以此字段为准
    @NameInMap("DataDisks")
    public String dataDisksShrink;

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

    public static DescribePriceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePriceShrinkRequest self = new DescribePriceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribePriceShrinkRequest setDataDisk(java.util.List<DescribePriceShrinkRequestDataDisk> dataDisk) {
        this.dataDisk = dataDisk;
        return this;
    }
    public java.util.List<DescribePriceShrinkRequestDataDisk> getDataDisk() {
        return this.dataDisk;
    }

    public DescribePriceShrinkRequest setSystemDisk(DescribePriceShrinkRequestSystemDisk systemDisk) {
        this.systemDisk = systemDisk;
        return this;
    }
    public DescribePriceShrinkRequestSystemDisk getSystemDisk() {
        return this.systemDisk;
    }

    public DescribePriceShrinkRequest setDataDisksShrink(String dataDisksShrink) {
        this.dataDisksShrink = dataDisksShrink;
        return this;
    }
    public String getDataDisksShrink() {
        return this.dataDisksShrink;
    }

    public DescribePriceShrinkRequest setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public DescribePriceShrinkRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribePriceShrinkRequest setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public DescribePriceShrinkRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public DescribePriceShrinkRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public DescribePriceShrinkRequest setQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }
    public Integer getQuantity() {
        return this.quantity;
    }

    public static class DescribePriceShrinkRequestDataDisk extends TeaModel {
        // 数据盘大小，单位GB。如果此字段不为空，则以此段为准。
        @NameInMap("Size")
        public Integer size;

        public static DescribePriceShrinkRequestDataDisk build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceShrinkRequestDataDisk self = new DescribePriceShrinkRequestDataDisk();
            return TeaModel.build(map, self);
        }

        public DescribePriceShrinkRequestDataDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

    }

    public static class DescribePriceShrinkRequestSystemDisk extends TeaModel {
        // 系统盘大小，单位：GB
        @NameInMap("Size")
        public Integer size;

        public static DescribePriceShrinkRequestSystemDisk build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceShrinkRequestSystemDisk self = new DescribePriceShrinkRequestSystemDisk();
            return TeaModel.build(map, self);
        }

        public DescribePriceShrinkRequestSystemDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

    }

}
