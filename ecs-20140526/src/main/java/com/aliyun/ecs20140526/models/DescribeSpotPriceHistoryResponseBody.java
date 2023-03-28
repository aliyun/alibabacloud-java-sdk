// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSpotPriceHistoryResponseBody extends TeaModel {
    @NameInMap("Currency")
    public String currency;

    @NameInMap("NextOffset")
    public Integer nextOffset;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("IoOptimized")
        public String ioOptimized;

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("OriginPrice")
        public Float originPrice;

        @NameInMap("SpotPrice")
        public Float spotPrice;

        @NameInMap("Timestamp")
        public String timestamp;

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
