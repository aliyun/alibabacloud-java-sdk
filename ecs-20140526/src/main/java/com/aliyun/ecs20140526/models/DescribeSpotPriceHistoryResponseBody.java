// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSpotPriceHistoryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Currency")
    public String currency;

    @NameInMap("NextOffset")
    public Integer nextOffset;

    @NameInMap("SpotPrices")
    public java.util.List<DescribeSpotPriceHistoryResponseBodySpotPrices> spotPrices;

    public static DescribeSpotPriceHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSpotPriceHistoryResponseBody self = new DescribeSpotPriceHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSpotPriceHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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

    public DescribeSpotPriceHistoryResponseBody setSpotPrices(java.util.List<DescribeSpotPriceHistoryResponseBodySpotPrices> spotPrices) {
        this.spotPrices = spotPrices;
        return this;
    }
    public java.util.List<DescribeSpotPriceHistoryResponseBodySpotPrices> getSpotPrices() {
        return this.spotPrices;
    }

    public static class DescribeSpotPriceHistoryResponseBodySpotPrices extends TeaModel {
        @NameInMap("IoOptimized")
        public String ioOptimized;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("SpotPrice")
        public Float spotPrice;

        @NameInMap("Timestamp")
        public String timestamp;

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("OriginPrice")
        public Float originPrice;

        public static DescribeSpotPriceHistoryResponseBodySpotPrices build(java.util.Map<String, ?> map) throws Exception {
            DescribeSpotPriceHistoryResponseBodySpotPrices self = new DescribeSpotPriceHistoryResponseBodySpotPrices();
            return TeaModel.build(map, self);
        }

        public DescribeSpotPriceHistoryResponseBodySpotPrices setIoOptimized(String ioOptimized) {
            this.ioOptimized = ioOptimized;
            return this;
        }
        public String getIoOptimized() {
            return this.ioOptimized;
        }

        public DescribeSpotPriceHistoryResponseBodySpotPrices setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeSpotPriceHistoryResponseBodySpotPrices setSpotPrice(Float spotPrice) {
            this.spotPrice = spotPrice;
            return this;
        }
        public Float getSpotPrice() {
            return this.spotPrice;
        }

        public DescribeSpotPriceHistoryResponseBodySpotPrices setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

        public DescribeSpotPriceHistoryResponseBodySpotPrices setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeSpotPriceHistoryResponseBodySpotPrices setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeSpotPriceHistoryResponseBodySpotPrices setOriginPrice(Float originPrice) {
            this.originPrice = originPrice;
            return this;
        }
        public Float getOriginPrice() {
            return this.originPrice;
        }

    }

}
