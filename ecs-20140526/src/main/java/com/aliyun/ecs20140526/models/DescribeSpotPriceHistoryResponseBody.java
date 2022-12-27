// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSpotPriceHistoryResponseBody extends TeaModel {
    // The currency unit of the price.
    // 
    // Alibaba Cloud China site (aliyun.com): CNY.
    // 
    // Alibaba Cloud International site (alibabacloud.com): USD.
    @NameInMap("Currency")
    public String currency;

    // The start row of the next page. It is the value of the `Offset` parameter.
    @NameInMap("NextOffset")
    public Integer nextOffset;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Details about the spot prices.
    @NameInMap("SpotPrices")
    public DescribeSpotPriceHistoryResponseBodySpotPrices spotPrices;

    public static DescribeSpotPriceHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSpotPriceHistoryResponseBody self = new DescribeSpotPriceHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSpotPriceHistoryResponseBody setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public DescribeSpotPriceHistoryResponseBody setNextOffset(Integer nextOffset) {
        this.nextOffset = nextOffset;
        return this;
    }
    public Integer getNextOffset() {
        return this.nextOffset;
    }

    public DescribeSpotPriceHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSpotPriceHistoryResponseBody setSpotPrices(DescribeSpotPriceHistoryResponseBodySpotPrices spotPrices) {
        this.spotPrices = spotPrices;
        return this;
    }
    public DescribeSpotPriceHistoryResponseBodySpotPrices getSpotPrices() {
        return this.spotPrices;
    }

    public static class DescribeSpotPriceHistoryResponseBodySpotPricesSpotPriceType extends TeaModel {
        // The instance type of the preemptible instance.
        @NameInMap("InstanceType")
        public String instanceType;

        // Indicates whether the preemptible instance is I/O optimized.
        @NameInMap("IoOptimized")
        public String ioOptimized;

        // The network type of the preemptible instance.
        @NameInMap("NetworkType")
        public String networkType;

        // The price for a pay-as-you-go instance that has the same configuration as the specified preemptible instance.
        @NameInMap("OriginPrice")
        public Float originPrice;

        // The spot price of the preemptible instance.
        @NameInMap("SpotPrice")
        public Float spotPrice;

        // The time that corresponds to the queried spot price. The time is in the `yyyy-MM-ddTHH:mm:ssZ` format.
        @NameInMap("Timestamp")
        public String timestamp;

        // The zone ID of the preemptible instance.
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeSpotPriceHistoryResponseBodySpotPricesSpotPriceType build(java.util.Map<String, ?> map) throws Exception {
            DescribeSpotPriceHistoryResponseBodySpotPricesSpotPriceType self = new DescribeSpotPriceHistoryResponseBodySpotPricesSpotPriceType();
            return TeaModel.build(map, self);
        }

        public DescribeSpotPriceHistoryResponseBodySpotPricesSpotPriceType setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeSpotPriceHistoryResponseBodySpotPricesSpotPriceType setIoOptimized(String ioOptimized) {
            this.ioOptimized = ioOptimized;
            return this;
        }
        public String getIoOptimized() {
            return this.ioOptimized;
        }

        public DescribeSpotPriceHistoryResponseBodySpotPricesSpotPriceType setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeSpotPriceHistoryResponseBodySpotPricesSpotPriceType setOriginPrice(Float originPrice) {
            this.originPrice = originPrice;
            return this;
        }
        public Float getOriginPrice() {
            return this.originPrice;
        }

        public DescribeSpotPriceHistoryResponseBodySpotPricesSpotPriceType setSpotPrice(Float spotPrice) {
            this.spotPrice = spotPrice;
            return this;
        }
        public Float getSpotPrice() {
            return this.spotPrice;
        }

        public DescribeSpotPriceHistoryResponseBodySpotPricesSpotPriceType setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

        public DescribeSpotPriceHistoryResponseBodySpotPricesSpotPriceType setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeSpotPriceHistoryResponseBodySpotPrices extends TeaModel {
        @NameInMap("SpotPriceType")
        public java.util.List<DescribeSpotPriceHistoryResponseBodySpotPricesSpotPriceType> spotPriceType;

        public static DescribeSpotPriceHistoryResponseBodySpotPrices build(java.util.Map<String, ?> map) throws Exception {
            DescribeSpotPriceHistoryResponseBodySpotPrices self = new DescribeSpotPriceHistoryResponseBodySpotPrices();
            return TeaModel.build(map, self);
        }

        public DescribeSpotPriceHistoryResponseBodySpotPrices setSpotPriceType(java.util.List<DescribeSpotPriceHistoryResponseBodySpotPricesSpotPriceType> spotPriceType) {
            this.spotPriceType = spotPriceType;
            return this;
        }
        public java.util.List<DescribeSpotPriceHistoryResponseBodySpotPricesSpotPriceType> getSpotPriceType() {
            return this.spotPriceType;
        }

    }

}
