// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class QueryServicePackAndPriceResponseBody extends TeaModel {
    @NameInMap("OriginalPrice")
    public Float originalPrice;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DiscountPrice")
    public Float discountPrice;

    @NameInMap("Currency")
    public String currency;

    @NameInMap("ServicePack")
    public java.util.List<QueryServicePackAndPriceResponseBodyServicePack> servicePack;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TradePrice")
    public Float tradePrice;

    @NameInMap("OriginalAmount")
    public Integer originalAmount;

    @NameInMap("ChargeAmount")
    public Integer chargeAmount;

    public static QueryServicePackAndPriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryServicePackAndPriceResponseBody self = new QueryServicePackAndPriceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryServicePackAndPriceResponseBody setOriginalPrice(Float originalPrice) {
        this.originalPrice = originalPrice;
        return this;
    }
    public Float getOriginalPrice() {
        return this.originalPrice;
    }

    public QueryServicePackAndPriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryServicePackAndPriceResponseBody setDiscountPrice(Float discountPrice) {
        this.discountPrice = discountPrice;
        return this;
    }
    public Float getDiscountPrice() {
        return this.discountPrice;
    }

    public QueryServicePackAndPriceResponseBody setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public QueryServicePackAndPriceResponseBody setServicePack(java.util.List<QueryServicePackAndPriceResponseBodyServicePack> servicePack) {
        this.servicePack = servicePack;
        return this;
    }
    public java.util.List<QueryServicePackAndPriceResponseBodyServicePack> getServicePack() {
        return this.servicePack;
    }

    public QueryServicePackAndPriceResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public QueryServicePackAndPriceResponseBody setTradePrice(Float tradePrice) {
        this.tradePrice = tradePrice;
        return this;
    }
    public Float getTradePrice() {
        return this.tradePrice;
    }

    public QueryServicePackAndPriceResponseBody setOriginalAmount(Integer originalAmount) {
        this.originalAmount = originalAmount;
        return this;
    }
    public Integer getOriginalAmount() {
        return this.originalAmount;
    }

    public QueryServicePackAndPriceResponseBody setChargeAmount(Integer chargeAmount) {
        this.chargeAmount = chargeAmount;
        return this;
    }
    public Integer getChargeAmount() {
        return this.chargeAmount;
    }

    public static class QueryServicePackAndPriceResponseBodyServicePack extends TeaModel {
        @NameInMap("EndTime")
        public Integer endTime;

        @NameInMap("Capacity")
        public Integer capacity;

        @NameInMap("StartTime")
        public Integer startTime;

        @NameInMap("InstanceName")
        public String instanceName;

        public static QueryServicePackAndPriceResponseBodyServicePack build(java.util.Map<String, ?> map) throws Exception {
            QueryServicePackAndPriceResponseBodyServicePack self = new QueryServicePackAndPriceResponseBodyServicePack();
            return TeaModel.build(map, self);
        }

        public QueryServicePackAndPriceResponseBodyServicePack setEndTime(Integer endTime) {
            this.endTime = endTime;
            return this;
        }
        public Integer getEndTime() {
            return this.endTime;
        }

        public QueryServicePackAndPriceResponseBodyServicePack setCapacity(Integer capacity) {
            this.capacity = capacity;
            return this;
        }
        public Integer getCapacity() {
            return this.capacity;
        }

        public QueryServicePackAndPriceResponseBodyServicePack setStartTime(Integer startTime) {
            this.startTime = startTime;
            return this;
        }
        public Integer getStartTime() {
            return this.startTime;
        }

        public QueryServicePackAndPriceResponseBodyServicePack setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

    }

}
