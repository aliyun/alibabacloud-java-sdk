// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class QueryBuyerDomainTradeRecordsResponseBody extends TeaModel {
    @NameInMap("Module")
    public QueryBuyerDomainTradeRecordsResponseBodyModule module;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>8F5BC888-521D-503A-A79B-CEDC9A23D716</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryBuyerDomainTradeRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryBuyerDomainTradeRecordsResponseBody self = new QueryBuyerDomainTradeRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryBuyerDomainTradeRecordsResponseBody setModule(QueryBuyerDomainTradeRecordsResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public QueryBuyerDomainTradeRecordsResponseBodyModule getModule() {
        return this.module;
    }

    public QueryBuyerDomainTradeRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryBuyerDomainTradeRecordsResponseBodyModuleData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>T2023122019031400****</p>
         */
        @NameInMap("BizId")
        public String bizId;

        /**
         * <strong>example:</strong>
         * <p>RMB</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <strong>example:</strong>
         * <p>2025-07-07 23:59:59</p>
         */
        @NameInMap("DeliveryTime")
        public String deliveryTime;

        /**
         * <strong>example:</strong>
         * <p>kythelmet.cn</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <strong>example:</strong>
         * <p>2025-07-07 23:59:59</p>
         */
        @NameInMap("PayTime")
        public String payTime;

        /**
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>5b05d1f7-26f0-4ad7-97d9-ac96fd9b65ba</p>
         */
        @NameInMap("TradeId")
        public String tradeId;

        /**
         * <strong>example:</strong>
         * <p>27660.0</p>
         */
        @NameInMap("TradePrice")
        public Float tradePrice;

        /**
         * <strong>example:</strong>
         * <p>FIX_PRICE</p>
         */
        @NameInMap("TradeType")
        public String tradeType;

        public static QueryBuyerDomainTradeRecordsResponseBodyModuleData build(java.util.Map<String, ?> map) throws Exception {
            QueryBuyerDomainTradeRecordsResponseBodyModuleData self = new QueryBuyerDomainTradeRecordsResponseBodyModuleData();
            return TeaModel.build(map, self);
        }

        public QueryBuyerDomainTradeRecordsResponseBodyModuleData setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public QueryBuyerDomainTradeRecordsResponseBodyModuleData setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public QueryBuyerDomainTradeRecordsResponseBodyModuleData setDeliveryTime(String deliveryTime) {
            this.deliveryTime = deliveryTime;
            return this;
        }
        public String getDeliveryTime() {
            return this.deliveryTime;
        }

        public QueryBuyerDomainTradeRecordsResponseBodyModuleData setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public QueryBuyerDomainTradeRecordsResponseBodyModuleData setPayTime(String payTime) {
            this.payTime = payTime;
            return this;
        }
        public String getPayTime() {
            return this.payTime;
        }

        public QueryBuyerDomainTradeRecordsResponseBodyModuleData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryBuyerDomainTradeRecordsResponseBodyModuleData setTradeId(String tradeId) {
            this.tradeId = tradeId;
            return this;
        }
        public String getTradeId() {
            return this.tradeId;
        }

        public QueryBuyerDomainTradeRecordsResponseBodyModuleData setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
        }

        public QueryBuyerDomainTradeRecordsResponseBodyModuleData setTradeType(String tradeType) {
            this.tradeType = tradeType;
            return this;
        }
        public String getTradeType() {
            return this.tradeType;
        }

    }

    public static class QueryBuyerDomainTradeRecordsResponseBodyModule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPageNum")
        public Integer currentPageNum;

        @NameInMap("Data")
        public java.util.List<QueryBuyerDomainTradeRecordsResponseBodyModuleData> data;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>294</p>
         */
        @NameInMap("TotalItemNum")
        public Integer totalItemNum;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("TotalPageNum")
        public Integer totalPageNum;

        public static QueryBuyerDomainTradeRecordsResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            QueryBuyerDomainTradeRecordsResponseBodyModule self = new QueryBuyerDomainTradeRecordsResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public QueryBuyerDomainTradeRecordsResponseBodyModule setCurrentPageNum(Integer currentPageNum) {
            this.currentPageNum = currentPageNum;
            return this;
        }
        public Integer getCurrentPageNum() {
            return this.currentPageNum;
        }

        public QueryBuyerDomainTradeRecordsResponseBodyModule setData(java.util.List<QueryBuyerDomainTradeRecordsResponseBodyModuleData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryBuyerDomainTradeRecordsResponseBodyModuleData> getData() {
            return this.data;
        }

        public QueryBuyerDomainTradeRecordsResponseBodyModule setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryBuyerDomainTradeRecordsResponseBodyModule setTotalItemNum(Integer totalItemNum) {
            this.totalItemNum = totalItemNum;
            return this;
        }
        public Integer getTotalItemNum() {
            return this.totalItemNum;
        }

        public QueryBuyerDomainTradeRecordsResponseBodyModule setTotalPageNum(Integer totalPageNum) {
            this.totalPageNum = totalPageNum;
            return this;
        }
        public Integer getTotalPageNum() {
            return this.totalPageNum;
        }

    }

}
