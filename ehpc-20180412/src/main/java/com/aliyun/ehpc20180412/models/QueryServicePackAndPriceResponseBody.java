// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class QueryServicePackAndPriceResponseBody extends TeaModel {
    @NameInMap("ChargeAmount")
    public Integer chargeAmount;

    @NameInMap("Currency")
    public String currency;

    @NameInMap("DiscountPrice")
    public Float discountPrice;

    @NameInMap("OriginalAmount")
    public Integer originalAmount;

    @NameInMap("OriginalPrice")
    public Float originalPrice;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServicePack")
    public QueryServicePackAndPriceResponseBodyServicePack servicePack;

    @NameInMap("TradePrice")
    public Float tradePrice;

    public static QueryServicePackAndPriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryServicePackAndPriceResponseBody self = new QueryServicePackAndPriceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryServicePackAndPriceResponseBody setChargeAmount(Integer chargeAmount) {
        this.chargeAmount = chargeAmount;
        return this;
    }
    public Integer getChargeAmount() {
        return this.chargeAmount;
    }

    public QueryServicePackAndPriceResponseBody setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public QueryServicePackAndPriceResponseBody setDiscountPrice(Float discountPrice) {
        this.discountPrice = discountPrice;
        return this;
    }
    public Float getDiscountPrice() {
        return this.discountPrice;
    }

    public QueryServicePackAndPriceResponseBody setOriginalAmount(Integer originalAmount) {
        this.originalAmount = originalAmount;
        return this;
    }
    public Integer getOriginalAmount() {
        return this.originalAmount;
    }

    public QueryServicePackAndPriceResponseBody setOriginalPrice(Float originalPrice) {
        this.originalPrice = originalPrice;
        return this;
    }
    public Float getOriginalPrice() {
        return this.originalPrice;
    }

    public QueryServicePackAndPriceResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public QueryServicePackAndPriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryServicePackAndPriceResponseBody setServicePack(QueryServicePackAndPriceResponseBodyServicePack servicePack) {
        this.servicePack = servicePack;
        return this;
    }
    public QueryServicePackAndPriceResponseBodyServicePack getServicePack() {
        return this.servicePack;
    }

    public QueryServicePackAndPriceResponseBody setTradePrice(Float tradePrice) {
        this.tradePrice = tradePrice;
        return this;
    }
    public Float getTradePrice() {
        return this.tradePrice;
    }

    public static class QueryServicePackAndPriceResponseBodyServicePackServicePackInfo extends TeaModel {
        @NameInMap("Capacity")
        public Integer capacity;

        @NameInMap("EndTime")
        public Integer endTime;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("StartTime")
        public Integer startTime;

        public static QueryServicePackAndPriceResponseBodyServicePackServicePackInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryServicePackAndPriceResponseBodyServicePackServicePackInfo self = new QueryServicePackAndPriceResponseBodyServicePackServicePackInfo();
            return TeaModel.build(map, self);
        }

        public QueryServicePackAndPriceResponseBodyServicePackServicePackInfo setCapacity(Integer capacity) {
            this.capacity = capacity;
            return this;
        }
        public Integer getCapacity() {
            return this.capacity;
        }

        public QueryServicePackAndPriceResponseBodyServicePackServicePackInfo setEndTime(Integer endTime) {
            this.endTime = endTime;
            return this;
        }
        public Integer getEndTime() {
            return this.endTime;
        }

        public QueryServicePackAndPriceResponseBodyServicePackServicePackInfo setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public QueryServicePackAndPriceResponseBodyServicePackServicePackInfo setStartTime(Integer startTime) {
            this.startTime = startTime;
            return this;
        }
        public Integer getStartTime() {
            return this.startTime;
        }

    }

    public static class QueryServicePackAndPriceResponseBodyServicePack extends TeaModel {
        @NameInMap("ServicePackInfo")
        public java.util.List<QueryServicePackAndPriceResponseBodyServicePackServicePackInfo> servicePackInfo;

        public static QueryServicePackAndPriceResponseBodyServicePack build(java.util.Map<String, ?> map) throws Exception {
            QueryServicePackAndPriceResponseBodyServicePack self = new QueryServicePackAndPriceResponseBodyServicePack();
            return TeaModel.build(map, self);
        }

        public QueryServicePackAndPriceResponseBodyServicePack setServicePackInfo(java.util.List<QueryServicePackAndPriceResponseBodyServicePackServicePackInfo> servicePackInfo) {
            this.servicePackInfo = servicePackInfo;
            return this;
        }
        public java.util.List<QueryServicePackAndPriceResponseBodyServicePackServicePackInfo> getServicePackInfo() {
            return this.servicePackInfo;
        }

    }

}
