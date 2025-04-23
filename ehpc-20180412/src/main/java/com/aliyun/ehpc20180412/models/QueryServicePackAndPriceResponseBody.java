// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class QueryServicePackAndPriceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>167</p>
     */
    @NameInMap("ChargeAmount")
    public Integer chargeAmount;

    /**
     * <strong>example:</strong>
     * <p>CNY</p>
     */
    @NameInMap("Currency")
    public String currency;

    /**
     * <strong>example:</strong>
     * <p>0.418</p>
     */
    @NameInMap("DiscountPrice")
    public Float discountPrice;

    /**
     * <strong>example:</strong>
     * <p>3191</p>
     */
    @NameInMap("OriginalAmount")
    public Integer originalAmount;

    /**
     * <strong>example:</strong>
     * <p>3.34</p>
     */
    @NameInMap("OriginalPrice")
    public Float originalPrice;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>3B2E8108-7068-413E-BCA7-CAAB25D46408</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServicePack")
    public QueryServicePackAndPriceResponseBodyServicePack servicePack;

    /**
     * <strong>example:</strong>
     * <p>2.922</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("Capacity")
        public Integer capacity;

        /**
         * <strong>example:</strong>
         * <p>1612705988</p>
         */
        @NameInMap("EndTime")
        public Integer endTime;

        /**
         * <strong>example:</strong>
         * <p>EHPCBAG-cn-78v12vbme0****</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <strong>example:</strong>
         * <p>1610027588</p>
         */
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
