// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSpotPriceHistoryResponseBody extends TeaModel {
    /**
     * <p>The instance type of the spot instance.</p>
     * 
     * <strong>example:</strong>
     * <p>CNY</p>
     */
    @NameInMap("Currency")
    public String currency;

    /**
     * <p>The network type of the spot instance.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("NextOffset")
    public Integer nextOffset;

    /**
     * <p>The instance type of the spot instance.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The zone ID of the spot instance.</p>
     */
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
        /**
         * <p>The instance type of the spot instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.g5.large</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>Details about the price history of the spot instance.</p>
         * 
         * <strong>example:</strong>
         * <p>optimized</p>
         */
        @NameInMap("IoOptimized")
        public String ioOptimized;

        /**
         * <p>Queries the price history of a spot instance within the last 30 days.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <p>The price for a pay-as-you-go instance that has the same configuration as the specified spot instance.</p>
         * 
         * <strong>example:</strong>
         * <p>0.354</p>
         */
        @NameInMap("OriginPrice")
        public Float originPrice;

        /**
         * <p>The price for a pay-as-you-go instance that has the same configurations as the spot instance.</p>
         * 
         * <strong>example:</strong>
         * <p>0.036</p>
         */
        @NameInMap("SpotPrice")
        public Float spotPrice;

        /**
         * <p>The currency unit of the price.</p>
         * <p>Alibaba Cloud China site (aliyun.com): CNY.</p>
         * <p>Alibaba Cloud International site (alibabacloud.com): USD.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-11-19T06:00:00Z</p>
         */
        @NameInMap("Timestamp")
        public String timestamp;

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-c</p>
         */
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
