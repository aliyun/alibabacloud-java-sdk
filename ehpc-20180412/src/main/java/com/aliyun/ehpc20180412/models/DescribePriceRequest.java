// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DescribePriceRequest extends TeaModel {
    /**
     * <p>The billing method of the ECS instances. Valid values:</p>
     * <br>
     * <p>*   PostPaid: pay-as-you-go</p>
     * <p>*   PrePaid: subscription</p>
     * <br>
     * <p>Default value: PostPaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>Product List</p>
     */
    @NameInMap("Commodities")
    public java.util.List<DescribePriceRequestCommodities> commodities;

    /**
     * <p>The type of the order. The order can be set only as a purchase order. Valid value: INSTANCE-BUY.</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    /**
     * <p>The billing cycle of the Elastic Compute Service (ECS) instances. This parameter takes effect only when the ChargeType parameter is set to PrePaid. Valid values:</p>
     * <br>
     * <p>*   Month: pay-by-month</p>
     * <p>*   Year: pay-by-year</p>
     * <p>*   Hour: pay-by-hour</p>
     * <br>
     * <p>Default value: Hour</p>
     */
    @NameInMap("PriceUnit")
    public String priceUnit;

    public static DescribePriceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePriceRequest self = new DescribePriceRequest();
        return TeaModel.build(map, self);
    }

    public DescribePriceRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public DescribePriceRequest setCommodities(java.util.List<DescribePriceRequestCommodities> commodities) {
        this.commodities = commodities;
        return this;
    }
    public java.util.List<DescribePriceRequestCommodities> getCommodities() {
        return this.commodities;
    }

    public DescribePriceRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public DescribePriceRequest setPriceUnit(String priceUnit) {
        this.priceUnit = priceUnit;
        return this;
    }
    public String getPriceUnit() {
        return this.priceUnit;
    }

    public static class DescribePriceRequestCommoditiesDataDisks extends TeaModel {
        /**
         * <p>The type of the data disk. Valid values:</p>
         * <br>
         * <p>*   cloud_efficiency: ultra disk</p>
         * <p>*   cloud_ssd: SSD</p>
         * <p>*   cloud_essd: ESSD</p>
         * <p>*   cloud: basic disk</p>
         * <br>
         * <p>Default value: cloud_efficiency</p>
         * <br>
         * <p>Valid values of N: 0 to 4</p>
         */
        @NameInMap("category")
        public String category;

        /**
         * <p>Specifies whether the data disk is released when the node is released. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         * <br>
         * <p>Default value: true</p>
         * <br>
         * <p>Valid values of N: 0 to 4</p>
         */
        @NameInMap("deleteWithInstance")
        public Boolean deleteWithInstance;

        /**
         * <p>Specifies whether to encrypt the data disk. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         * <br>
         * <p>Default value: false</p>
         * <br>
         * <p>Valid values of N: 0 to 4</p>
         */
        @NameInMap("encrypted")
        public Boolean encrypted;

        /**
         * <p>The performance level of the ESSD used as the data disk. This parameter takes effect only when the Commodities.N.DataDisks.N.category parameter is set to cloud_essd. Default value: PL1. Valid values:</p>
         * <br>
         * <p>*   PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.</p>
         * <p>*   PL1: A single ESSD can deliver up to 50,000 random read/write IOPS.</p>
         * <p>*   PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.</p>
         * <p>*   PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.</p>
         * <br>
         * <p>Default value: PL1</p>
         * <br>
         * <p>Valid values of N: 0 to 4</p>
         */
        @NameInMap("performanceLevel")
        public String performanceLevel;

        /**
         * <p>The size of the data disk. Unit: GB.</p>
         * <br>
         * <p>Valid values: 40 to 500</p>
         * <br>
         * <p>Default value: 40</p>
         * <br>
         * <p>Valid values of N: 0 to 4</p>
         */
        @NameInMap("size")
        public Integer size;

        public static DescribePriceRequestCommoditiesDataDisks build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceRequestCommoditiesDataDisks self = new DescribePriceRequestCommoditiesDataDisks();
            return TeaModel.build(map, self);
        }

        public DescribePriceRequestCommoditiesDataDisks setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribePriceRequestCommoditiesDataDisks setDeleteWithInstance(Boolean deleteWithInstance) {
            this.deleteWithInstance = deleteWithInstance;
            return this;
        }
        public Boolean getDeleteWithInstance() {
            return this.deleteWithInstance;
        }

        public DescribePriceRequestCommoditiesDataDisks setEncrypted(Boolean encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public Boolean getEncrypted() {
            return this.encrypted;
        }

        public DescribePriceRequestCommoditiesDataDisks setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public DescribePriceRequestCommoditiesDataDisks setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

    }

    public static class DescribePriceRequestCommodities extends TeaModel {
        /**
         * <p>The node quantity of the type. Valid values: 1 to 1000.</p>
         * <br>
         * <p>Default value: 1</p>
         * <br>
         * <p>Valid values of N: 1 to 10</p>
         */
        @NameInMap("Amount")
        public Integer amount;

        /**
         * <p>The list of data disks created with the node.</p>
         */
        @NameInMap("DataDisks")
        public java.util.List<DescribePriceRequestCommoditiesDataDisks> dataDisks;

        /**
         * <p>The instance type of the node.</p>
         * <br>
         * <p>Valid values of N: 1 to 10</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The EIP billing method of the node. Valid values:</p>
         * <br>
         * <p>*   PayByBandwidth: pay-by-bandwidth</p>
         * <p>*   PayByTraffic: pay-by-traffic</p>
         * <br>
         * <p>Valid values of N: 1 to 10</p>
         */
        @NameInMap("InternetChargeType")
        public String internetChargeType;

        /**
         * <p>The maximum outbound public bandwidth of the node. Unit: Mbit/s.</p>
         * <br>
         * <p>Valid values: 0 to 100</p>
         * <br>
         * <p>Default value: 0</p>
         * <br>
         * <p>Valid values of N: 1 to 10</p>
         */
        @NameInMap("InternetMaxBandWidthOut")
        public Integer internetMaxBandWidthOut;

        /**
         * <p>The network type of the node. Valid value: VPC.</p>
         * <br>
         * <p>Valid values of N: 1 to 10</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <p>The type of the node. Valid values:</p>
         * <br>
         * <p>*   Compute: compute node</p>
         * <p>*   Manager: management node</p>
         * <p>*   Login: logon node</p>
         * <br>
         * <p>Valid values of N: 1 to 10</p>
         */
        @NameInMap("NodeType")
        public String nodeType;

        /**
         * <p>The subscription duration of the node. Valid values:</p>
         * <br>
         * <p>*   If PriceUnit is set to Year, the valid values of the Period parameter are 1, 2, and 3.</p>
         * <p>*   If PriceUnit is set to Month, the valid values of the Period parameter are 1, 2, 3, 4, 5, 6, 7, 8, and 9.</p>
         * <p>*   If PriceUnit is set to Hour, the valid value of the Period parameter is 1.</p>
         * <br>
         * <p>Default value: 1</p>
         * <br>
         * <p>Valid values of N: 1 to 10</p>
         */
        @NameInMap("Period")
        public Integer period;

        /**
         * <p>The system disk type of the node. Valid values:</p>
         * <br>
         * <p>*   cloud_efficiency: ultra disk</p>
         * <p>*   cloud_ssd: SSD</p>
         * <p>*   cloud_essd: ESSD</p>
         * <p>*   cloud: basic disk</p>
         * <br>
         * <p>Default value: cloud_efficiency</p>
         * <br>
         * <p>Valid values of N: 1 to 10</p>
         */
        @NameInMap("SystemDiskCategory")
        public String systemDiskCategory;

        /**
         * <p>The performance level of the ESSD used as the system disk. This parameter takes effect only when the Commodities.N.SystemDiskCategory parameter is set to cloud_essd. Default value: PL1. Valid values:</p>
         * <br>
         * <p>*   PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.</p>
         * <p>*   PL1: A single ESSD can deliver up to 50,000 random read/write IOPS.</p>
         * <p>*   PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.</p>
         * <p>*   PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.</p>
         * <br>
         * <p>Default value: PL1</p>
         * <br>
         * <p>Valid values of N: 1 to 10</p>
         */
        @NameInMap("SystemDiskPerformanceLevel")
        public String systemDiskPerformanceLevel;

        /**
         * <p>The system disk size of the node. Unit: GB.</p>
         * <br>
         * <p>Valid values: 40 to 500</p>
         * <br>
         * <p>Default value: 40</p>
         * <br>
         * <p>Valid values of N: 1 to 10</p>
         */
        @NameInMap("SystemDiskSize")
        public Integer systemDiskSize;

        public static DescribePriceRequestCommodities build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceRequestCommodities self = new DescribePriceRequestCommodities();
            return TeaModel.build(map, self);
        }

        public DescribePriceRequestCommodities setAmount(Integer amount) {
            this.amount = amount;
            return this;
        }
        public Integer getAmount() {
            return this.amount;
        }

        public DescribePriceRequestCommodities setDataDisks(java.util.List<DescribePriceRequestCommoditiesDataDisks> dataDisks) {
            this.dataDisks = dataDisks;
            return this;
        }
        public java.util.List<DescribePriceRequestCommoditiesDataDisks> getDataDisks() {
            return this.dataDisks;
        }

        public DescribePriceRequestCommodities setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribePriceRequestCommodities setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public DescribePriceRequestCommodities setInternetMaxBandWidthOut(Integer internetMaxBandWidthOut) {
            this.internetMaxBandWidthOut = internetMaxBandWidthOut;
            return this;
        }
        public Integer getInternetMaxBandWidthOut() {
            return this.internetMaxBandWidthOut;
        }

        public DescribePriceRequestCommodities setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribePriceRequestCommodities setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public DescribePriceRequestCommodities setPeriod(Integer period) {
            this.period = period;
            return this;
        }
        public Integer getPeriod() {
            return this.period;
        }

        public DescribePriceRequestCommodities setSystemDiskCategory(String systemDiskCategory) {
            this.systemDiskCategory = systemDiskCategory;
            return this;
        }
        public String getSystemDiskCategory() {
            return this.systemDiskCategory;
        }

        public DescribePriceRequestCommodities setSystemDiskPerformanceLevel(String systemDiskPerformanceLevel) {
            this.systemDiskPerformanceLevel = systemDiskPerformanceLevel;
            return this;
        }
        public String getSystemDiskPerformanceLevel() {
            return this.systemDiskPerformanceLevel;
        }

        public DescribePriceRequestCommodities setSystemDiskSize(Integer systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public Integer getSystemDiskSize() {
            return this.systemDiskSize;
        }

    }

}
