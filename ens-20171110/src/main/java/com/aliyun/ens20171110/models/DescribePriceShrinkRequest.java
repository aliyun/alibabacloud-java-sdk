// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribePriceShrinkRequest extends TeaModel {
    @NameInMap("DataDisk")
    public java.util.List<DescribePriceShrinkRequestDataDisk> dataDisk;

    @NameInMap("SystemDisk")
    public DescribePriceShrinkRequestSystemDisk systemDisk;

    /**
     * <p>If you leave DataDisk.1.Size empty, the value that you specified for this parameter is used.</p>
     */
    @NameInMap("DataDisks")
    public String dataDisksShrink;

    /**
     * <p>The ID of the ENS node.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EnsRegionId")
    public String ensRegionId;

    /**
     * <p>The specifications of instances.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The bandwidth metering method of the instance. Valid values:</p>
     * <br>
     * <p>*   BandwidthByDay: Pay by daily peak bandwidth</p>
     * <p>*   95BandwidthByMonth: Pay by monthly 95th percentile bandwidth</p>
     * <p>*   PayByBandwidth4thMonth: Pay by monthly fourth peak bandwidth</p>
     * <p>*   PayByBandwidth: Pay by fixed bandwidth</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <p>The subscription duration of the instance.</p>
     * <br>
     * <p>*   If you leave the PeriodUnit parameter empty, the instance is purchased on a monthly basis. Valid values: Day and Month.</p>
     * <p>*   If you set PeriodUnit to Day, you can set Period only to 3.</p>
     * <p>*   If you set PeriodUnit to Month, you can set Period to a number from 1 to 9, or set Period to 12.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The billing cycle of the ENS instance. Valid values:</p>
     * <br>
     * <p>*   Month (default):</p>
     * <p>*   Day</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The number of instances.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
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
        /**
         * <p>The size of the data disk. Unit: GB. If you specify this parameter, this parameter takes precedence over the Size property in DataDisks.</p>
         */
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
        /**
         * <p>The size of the system disk. Unit: GB.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
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
