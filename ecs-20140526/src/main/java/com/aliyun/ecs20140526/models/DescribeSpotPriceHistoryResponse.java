// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSpotPriceHistoryResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("NextOffset")
    @Validation(required = true)
    public Integer nextOffset;

    @NameInMap("Currency")
    @Validation(required = true)
    public String currency;

    @NameInMap("SpotPrices")
    @Validation(required = true)
    public DescribeSpotPriceHistoryResponseSpotPrices spotPrices;

    public static DescribeSpotPriceHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSpotPriceHistoryResponse self = new DescribeSpotPriceHistoryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSpotPriceHistoryResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSpotPriceHistoryResponse setNextOffset(Integer nextOffset) {
        this.nextOffset = nextOffset;
        return this;
    }
    public Integer getNextOffset() {
        return this.nextOffset;
    }

    public DescribeSpotPriceHistoryResponse setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public DescribeSpotPriceHistoryResponse setSpotPrices(DescribeSpotPriceHistoryResponseSpotPrices spotPrices) {
        this.spotPrices = spotPrices;
        return this;
    }
    public DescribeSpotPriceHistoryResponseSpotPrices getSpotPrices() {
        return this.spotPrices;
    }

    public static class DescribeSpotPriceHistoryResponseSpotPricesSpotPriceType extends TeaModel {
        @NameInMap("ZoneId")
        @Validation(required = true)
        public String zoneId;

        @NameInMap("InstanceType")
        @Validation(required = true)
        public String instanceType;

        @NameInMap("IoOptimized")
        @Validation(required = true)
        public String ioOptimized;

        @NameInMap("Timestamp")
        @Validation(required = true)
        public String timestamp;

        @NameInMap("NetworkType")
        @Validation(required = true)
        public String networkType;

        @NameInMap("SpotPrice")
        @Validation(required = true)
        public Float spotPrice;

        @NameInMap("OriginPrice")
        @Validation(required = true)
        public Float originPrice;

        public static DescribeSpotPriceHistoryResponseSpotPricesSpotPriceType build(java.util.Map<String, ?> map) throws Exception {
            DescribeSpotPriceHistoryResponseSpotPricesSpotPriceType self = new DescribeSpotPriceHistoryResponseSpotPricesSpotPriceType();
            return TeaModel.build(map, self);
        }

        public DescribeSpotPriceHistoryResponseSpotPricesSpotPriceType setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeSpotPriceHistoryResponseSpotPricesSpotPriceType setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeSpotPriceHistoryResponseSpotPricesSpotPriceType setIoOptimized(String ioOptimized) {
            this.ioOptimized = ioOptimized;
            return this;
        }
        public String getIoOptimized() {
            return this.ioOptimized;
        }

        public DescribeSpotPriceHistoryResponseSpotPricesSpotPriceType setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

        public DescribeSpotPriceHistoryResponseSpotPricesSpotPriceType setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeSpotPriceHistoryResponseSpotPricesSpotPriceType setSpotPrice(Float spotPrice) {
            this.spotPrice = spotPrice;
            return this;
        }
        public Float getSpotPrice() {
            return this.spotPrice;
        }

        public DescribeSpotPriceHistoryResponseSpotPricesSpotPriceType setOriginPrice(Float originPrice) {
            this.originPrice = originPrice;
            return this;
        }
        public Float getOriginPrice() {
            return this.originPrice;
        }

    }

    public static class DescribeSpotPriceHistoryResponseSpotPrices extends TeaModel {
        @NameInMap("SpotPriceType")
        @Validation(required = true)
        public java.util.List<DescribeSpotPriceHistoryResponseSpotPricesSpotPriceType> spotPriceType;

        public static DescribeSpotPriceHistoryResponseSpotPrices build(java.util.Map<String, ?> map) throws Exception {
            DescribeSpotPriceHistoryResponseSpotPrices self = new DescribeSpotPriceHistoryResponseSpotPrices();
            return TeaModel.build(map, self);
        }

        public DescribeSpotPriceHistoryResponseSpotPrices setSpotPriceType(java.util.List<DescribeSpotPriceHistoryResponseSpotPricesSpotPriceType> spotPriceType) {
            this.spotPriceType = spotPriceType;
            return this;
        }
        public java.util.List<DescribeSpotPriceHistoryResponseSpotPricesSpotPriceType> getSpotPriceType() {
            return this.spotPriceType;
        }

    }

}
