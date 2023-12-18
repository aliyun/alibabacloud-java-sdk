// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribePriceRequest extends TeaModel {
    @NameInMap("DataDisk")
    public java.util.List<DescribePriceRequestDataDisk> dataDisk;

    @NameInMap("SystemDisk")
    public DescribePriceRequestSystemDisk systemDisk;

    /**
     * <p>If you leave DataDisk.1.Size empty, the value that you specified for this parameter is used.</p>
     */
    @NameInMap("DataDisks")
    public java.util.List<DescribePriceRequestDataDisks> dataDisks;

    /**
     * <p>The ID of the ENS node.</p>
     */
    @NameInMap("EnsRegionId")
    public String ensRegionId;

    /**
     * <p>The type of the instance.</p>
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
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <p>The subscription duration of the instance.</p>
     * <br>
     * <p>*   If you leave the PeriodUnit parameter empty, the instance is purchased on a monthly basis. Valid values: Day and Month.</p>
     * <p>*   If you set PeriodUnit to Day, you can set Period only to 3.</p>
     * <p>*   If you set PeriodUnit to Month, you can set Period to a number from 1 to 9, or set Period to 12.</p>
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
     */
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
        /**
         * <p>The size of the data disk. Unit: GB. If you specify this parameter, this parameter takes precedence over the Size property in DataDisks.</p>
         */
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
        /**
         * <p>The size of the system disk. Unit: GB.</p>
         */
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
        /**
         * <p>The category of the disk.</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The size of the data disk. Unit: GB.</p>
         */
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
