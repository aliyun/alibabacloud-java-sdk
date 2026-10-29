// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribePriceShrinkRequest extends TeaModel {
    @NameInMap("DataDisk")
    public java.util.List<DescribePriceShrinkRequestDataDisk> dataDisk;

    @NameInMap("SystemDisk")
    public DescribePriceShrinkRequestSystemDisk systemDisk;

    /**
     * <p>The data cloud disks. If DataDisk.1.Size is empty and this field is not empty, this field takes precedence.</p>
     */
    @NameInMap("DataDisks")
    public String dataDisksShrink;

    /**
     * <p>The edge zone ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai-unicom</p>
     */
    @NameInMap("EnsRegionId")
    public String ensRegionId;

    /**
     * <p>The instance type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ens.sn1.tiny</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The Billable methods for ENS bandwidth. Valid values:</p>
     * <ul>
     * <li>BandwidthByDay: daily peak bandwidth.</li>
     * <li>95BandwidthByMonth: monthly 95th percentile bandwidth.</li>
     * <li>PayByBandwidth4thMonth: monthly fourth peak bandwidth.</li>
     * <li>PayByBandwidth: bandwidth with defined specifications.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>95BandwidthByMonth</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <p>The subscription duration of the resource.</p>
     * <ul>
     * <li>If PeriodUnit is not specified, the default billing cycle is month. Only Day and Month are supported.</li>
     * <li>If PeriodUnit is set to Day, Period can only be set to 3.</li>
     * <li>If PeriodUnit is set to Month, Period can be set to 1 to 9 or 12.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The billing cycle for querying the prices of ENS resources. Valid values:</p>
     * <ul>
     * <li>Month (default): monthly billing cycle.</li>
     * <li>Day: daily billing cycle.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The quantity.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
         * <p>The size of the data cloud disk. Unit: GB. If this field is not empty, it takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
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
         * <p>The size of the system cloud disk. Unit: GB.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
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
