// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DescribePriceRequest extends TeaModel {
    @NameInMap("PriceUnit")
    public String priceUnit;

    @NameInMap("ChargeType")
    public String chargeType;

    @NameInMap("OrderType")
    public String orderType;

    @NameInMap("Commodities")
    public java.util.List<DescribePriceRequestCommodities> commodities;

    public static DescribePriceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePriceRequest self = new DescribePriceRequest();
        return TeaModel.build(map, self);
    }

    public DescribePriceRequest setPriceUnit(String priceUnit) {
        this.priceUnit = priceUnit;
        return this;
    }
    public String getPriceUnit() {
        return this.priceUnit;
    }

    public DescribePriceRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public DescribePriceRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public DescribePriceRequest setCommodities(java.util.List<DescribePriceRequestCommodities> commodities) {
        this.commodities = commodities;
        return this;
    }
    public java.util.List<DescribePriceRequestCommodities> getCommodities() {
        return this.commodities;
    }

    public static class DescribePriceRequestCommodities extends TeaModel {
        @NameInMap("Amount")
        public Integer amount;

        @NameInMap("SystemDiskSize")
        public Integer systemDiskSize;

        @NameInMap("NodeType")
        public String nodeType;

        @NameInMap("SystemDiskCategory")
        public String systemDiskCategory;

        @NameInMap("InternetChargeType")
        public String internetChargeType;

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("Period")
        public Integer period;

        @NameInMap("InternetMaxBandWidthOut")
        public Integer internetMaxBandWidthOut;

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

        public DescribePriceRequestCommodities setSystemDiskSize(Integer systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public Integer getSystemDiskSize() {
            return this.systemDiskSize;
        }

        public DescribePriceRequestCommodities setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public DescribePriceRequestCommodities setSystemDiskCategory(String systemDiskCategory) {
            this.systemDiskCategory = systemDiskCategory;
            return this;
        }
        public String getSystemDiskCategory() {
            return this.systemDiskCategory;
        }

        public DescribePriceRequestCommodities setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public DescribePriceRequestCommodities setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribePriceRequestCommodities setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribePriceRequestCommodities setPeriod(Integer period) {
            this.period = period;
            return this;
        }
        public Integer getPeriod() {
            return this.period;
        }

        public DescribePriceRequestCommodities setInternetMaxBandWidthOut(Integer internetMaxBandWidthOut) {
            this.internetMaxBandWidthOut = internetMaxBandWidthOut;
            return this;
        }
        public Integer getInternetMaxBandWidthOut() {
            return this.internetMaxBandWidthOut;
        }

    }

}
