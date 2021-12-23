// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DescribePriceRequest extends TeaModel {
    @NameInMap("ChargeType")
    public String chargeType;

    @NameInMap("Commodities")
    public java.util.List<DescribePriceRequestCommodities> commodities;

    @NameInMap("OrderType")
    public String orderType;

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
        @NameInMap("category")
        public String category;

        @NameInMap("deleteWithInstance")
        public Boolean deleteWithInstance;

        @NameInMap("encrypted")
        public Boolean encrypted;

        @NameInMap("performanceLevel")
        public String performanceLevel;

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
        @NameInMap("Amount")
        public Integer amount;

        @NameInMap("DataDisks")
        public java.util.List<DescribePriceRequestCommoditiesDataDisks> dataDisks;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("InternetChargeType")
        public String internetChargeType;

        @NameInMap("InternetMaxBandWidthOut")
        public Integer internetMaxBandWidthOut;

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("NodeType")
        public String nodeType;

        @NameInMap("Period")
        public Integer period;

        @NameInMap("SystemDiskCategory")
        public String systemDiskCategory;

        @NameInMap("SystemDiskPerformanceLevel")
        public String systemDiskPerformanceLevel;

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
