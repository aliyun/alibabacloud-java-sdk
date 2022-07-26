// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribePriceShrinkRequest extends TeaModel {
    @NameInMap("DataDisk")
    public java.util.List<DescribePriceShrinkRequestDataDisk> dataDisk;

    @NameInMap("SystemDisk")
    public DescribePriceShrinkRequestSystemDisk systemDisk;

    @NameInMap("DataDisks")
    public String dataDisksShrink;

    @NameInMap("EnsRegionId")
    public String ensRegionId;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("InternetChargeType")
    public String internetChargeType;

    @NameInMap("Period")
    public Integer period;

    @NameInMap("PeriodUnit")
    public String periodUnit;

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
