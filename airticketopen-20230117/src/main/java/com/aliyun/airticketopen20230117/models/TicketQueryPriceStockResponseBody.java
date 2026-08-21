// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class TicketQueryPriceStockResponseBody extends TeaModel {
    @NameInMap("Data")
    public TicketQueryPriceStockResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>ScenicIdInvalid</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>ScenicId不合法</p>
     */
    @NameInMap("ErrorMsg")
    public String errorMsg;

    /**
     * <strong>example:</strong>
     * <p>51593418-8C73-5E47-8BA8-3F1D4A00CC0B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static TicketQueryPriceStockResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TicketQueryPriceStockResponseBody self = new TicketQueryPriceStockResponseBody();
        return TeaModel.build(map, self);
    }

    public TicketQueryPriceStockResponseBody setData(TicketQueryPriceStockResponseBodyData data) {
        this.data = data;
        return this;
    }
    public TicketQueryPriceStockResponseBodyData getData() {
        return this.data;
    }

    public TicketQueryPriceStockResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public TicketQueryPriceStockResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public TicketQueryPriceStockResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TicketQueryPriceStockResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class TicketQueryPriceStockResponseBodyDataCalendarPriceStocksDistributionPrice extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("Amount")
        public Long amount;

        /**
         * <strong>example:</strong>
         * <p>USD</p>
         */
        @NameInMap("CurrencyCode")
        public String currencyCode;

        public static TicketQueryPriceStockResponseBodyDataCalendarPriceStocksDistributionPrice build(java.util.Map<String, ?> map) throws Exception {
            TicketQueryPriceStockResponseBodyDataCalendarPriceStocksDistributionPrice self = new TicketQueryPriceStockResponseBodyDataCalendarPriceStocksDistributionPrice();
            return TeaModel.build(map, self);
        }

        public TicketQueryPriceStockResponseBodyDataCalendarPriceStocksDistributionPrice setAmount(Long amount) {
            this.amount = amount;
            return this;
        }
        public Long getAmount() {
            return this.amount;
        }

        public TicketQueryPriceStockResponseBodyDataCalendarPriceStocksDistributionPrice setCurrencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
            return this;
        }
        public String getCurrencyCode() {
            return this.currencyCode;
        }

    }

    public static class TicketQueryPriceStockResponseBodyDataCalendarPriceStocksMarketPrice extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("Amount")
        public Long amount;

        /**
         * <strong>example:</strong>
         * <p>USD</p>
         */
        @NameInMap("CurrencyCode")
        public String currencyCode;

        public static TicketQueryPriceStockResponseBodyDataCalendarPriceStocksMarketPrice build(java.util.Map<String, ?> map) throws Exception {
            TicketQueryPriceStockResponseBodyDataCalendarPriceStocksMarketPrice self = new TicketQueryPriceStockResponseBodyDataCalendarPriceStocksMarketPrice();
            return TeaModel.build(map, self);
        }

        public TicketQueryPriceStockResponseBodyDataCalendarPriceStocksMarketPrice setAmount(Long amount) {
            this.amount = amount;
            return this;
        }
        public Long getAmount() {
            return this.amount;
        }

        public TicketQueryPriceStockResponseBodyDataCalendarPriceStocksMarketPrice setCurrencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
            return this;
        }
        public String getCurrencyCode() {
            return this.currencyCode;
        }

    }

    public static class TicketQueryPriceStockResponseBodyDataCalendarPriceStocksSuggestedPrice extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("Amount")
        public Long amount;

        /**
         * <strong>example:</strong>
         * <p>USD</p>
         */
        @NameInMap("CurrencyCode")
        public String currencyCode;

        public static TicketQueryPriceStockResponseBodyDataCalendarPriceStocksSuggestedPrice build(java.util.Map<String, ?> map) throws Exception {
            TicketQueryPriceStockResponseBodyDataCalendarPriceStocksSuggestedPrice self = new TicketQueryPriceStockResponseBodyDataCalendarPriceStocksSuggestedPrice();
            return TeaModel.build(map, self);
        }

        public TicketQueryPriceStockResponseBodyDataCalendarPriceStocksSuggestedPrice setAmount(Long amount) {
            this.amount = amount;
            return this;
        }
        public Long getAmount() {
            return this.amount;
        }

        public TicketQueryPriceStockResponseBodyDataCalendarPriceStocksSuggestedPrice setCurrencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
            return this;
        }
        public String getCurrencyCode() {
            return this.currencyCode;
        }

    }

    public static class TicketQueryPriceStockResponseBodyDataCalendarPriceStocks extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2026-10-01</p>
         */
        @NameInMap("Date")
        public String date;

        @NameInMap("DistributionPrice")
        public TicketQueryPriceStockResponseBodyDataCalendarPriceStocksDistributionPrice distributionPrice;

        @NameInMap("MarketPrice")
        public TicketQueryPriceStockResponseBodyDataCalendarPriceStocksMarketPrice marketPrice;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Stock")
        public Long stock;

        @NameInMap("SuggestedPrice")
        public TicketQueryPriceStockResponseBodyDataCalendarPriceStocksSuggestedPrice suggestedPrice;

        public static TicketQueryPriceStockResponseBodyDataCalendarPriceStocks build(java.util.Map<String, ?> map) throws Exception {
            TicketQueryPriceStockResponseBodyDataCalendarPriceStocks self = new TicketQueryPriceStockResponseBodyDataCalendarPriceStocks();
            return TeaModel.build(map, self);
        }

        public TicketQueryPriceStockResponseBodyDataCalendarPriceStocks setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public TicketQueryPriceStockResponseBodyDataCalendarPriceStocks setDistributionPrice(TicketQueryPriceStockResponseBodyDataCalendarPriceStocksDistributionPrice distributionPrice) {
            this.distributionPrice = distributionPrice;
            return this;
        }
        public TicketQueryPriceStockResponseBodyDataCalendarPriceStocksDistributionPrice getDistributionPrice() {
            return this.distributionPrice;
        }

        public TicketQueryPriceStockResponseBodyDataCalendarPriceStocks setMarketPrice(TicketQueryPriceStockResponseBodyDataCalendarPriceStocksMarketPrice marketPrice) {
            this.marketPrice = marketPrice;
            return this;
        }
        public TicketQueryPriceStockResponseBodyDataCalendarPriceStocksMarketPrice getMarketPrice() {
            return this.marketPrice;
        }

        public TicketQueryPriceStockResponseBodyDataCalendarPriceStocks setStock(Long stock) {
            this.stock = stock;
            return this;
        }
        public Long getStock() {
            return this.stock;
        }

        public TicketQueryPriceStockResponseBodyDataCalendarPriceStocks setSuggestedPrice(TicketQueryPriceStockResponseBodyDataCalendarPriceStocksSuggestedPrice suggestedPrice) {
            this.suggestedPrice = suggestedPrice;
            return this;
        }
        public TicketQueryPriceStockResponseBodyDataCalendarPriceStocksSuggestedPrice getSuggestedPrice() {
            return this.suggestedPrice;
        }

    }

    public static class TicketQueryPriceStockResponseBodyDataNormalPriceStockDistributionPrice extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("Amount")
        public Long amount;

        /**
         * <strong>example:</strong>
         * <p>USD</p>
         */
        @NameInMap("CurrencyCode")
        public String currencyCode;

        public static TicketQueryPriceStockResponseBodyDataNormalPriceStockDistributionPrice build(java.util.Map<String, ?> map) throws Exception {
            TicketQueryPriceStockResponseBodyDataNormalPriceStockDistributionPrice self = new TicketQueryPriceStockResponseBodyDataNormalPriceStockDistributionPrice();
            return TeaModel.build(map, self);
        }

        public TicketQueryPriceStockResponseBodyDataNormalPriceStockDistributionPrice setAmount(Long amount) {
            this.amount = amount;
            return this;
        }
        public Long getAmount() {
            return this.amount;
        }

        public TicketQueryPriceStockResponseBodyDataNormalPriceStockDistributionPrice setCurrencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
            return this;
        }
        public String getCurrencyCode() {
            return this.currencyCode;
        }

    }

    public static class TicketQueryPriceStockResponseBodyDataNormalPriceStockMarketPrice extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("Amount")
        public Long amount;

        /**
         * <strong>example:</strong>
         * <p>USD</p>
         */
        @NameInMap("CurrencyCode")
        public String currencyCode;

        public static TicketQueryPriceStockResponseBodyDataNormalPriceStockMarketPrice build(java.util.Map<String, ?> map) throws Exception {
            TicketQueryPriceStockResponseBodyDataNormalPriceStockMarketPrice self = new TicketQueryPriceStockResponseBodyDataNormalPriceStockMarketPrice();
            return TeaModel.build(map, self);
        }

        public TicketQueryPriceStockResponseBodyDataNormalPriceStockMarketPrice setAmount(Long amount) {
            this.amount = amount;
            return this;
        }
        public Long getAmount() {
            return this.amount;
        }

        public TicketQueryPriceStockResponseBodyDataNormalPriceStockMarketPrice setCurrencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
            return this;
        }
        public String getCurrencyCode() {
            return this.currencyCode;
        }

    }

    public static class TicketQueryPriceStockResponseBodyDataNormalPriceStockSuggestedPrice extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("Amount")
        public Long amount;

        /**
         * <strong>example:</strong>
         * <p>USD</p>
         */
        @NameInMap("CurrencyCode")
        public String currencyCode;

        public static TicketQueryPriceStockResponseBodyDataNormalPriceStockSuggestedPrice build(java.util.Map<String, ?> map) throws Exception {
            TicketQueryPriceStockResponseBodyDataNormalPriceStockSuggestedPrice self = new TicketQueryPriceStockResponseBodyDataNormalPriceStockSuggestedPrice();
            return TeaModel.build(map, self);
        }

        public TicketQueryPriceStockResponseBodyDataNormalPriceStockSuggestedPrice setAmount(Long amount) {
            this.amount = amount;
            return this;
        }
        public Long getAmount() {
            return this.amount;
        }

        public TicketQueryPriceStockResponseBodyDataNormalPriceStockSuggestedPrice setCurrencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
            return this;
        }
        public String getCurrencyCode() {
            return this.currencyCode;
        }

    }

    public static class TicketQueryPriceStockResponseBodyDataNormalPriceStock extends TeaModel {
        @NameInMap("DistributionPrice")
        public TicketQueryPriceStockResponseBodyDataNormalPriceStockDistributionPrice distributionPrice;

        @NameInMap("MarketPrice")
        public TicketQueryPriceStockResponseBodyDataNormalPriceStockMarketPrice marketPrice;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Stock")
        public Long stock;

        @NameInMap("SuggestedPrice")
        public TicketQueryPriceStockResponseBodyDataNormalPriceStockSuggestedPrice suggestedPrice;

        public static TicketQueryPriceStockResponseBodyDataNormalPriceStock build(java.util.Map<String, ?> map) throws Exception {
            TicketQueryPriceStockResponseBodyDataNormalPriceStock self = new TicketQueryPriceStockResponseBodyDataNormalPriceStock();
            return TeaModel.build(map, self);
        }

        public TicketQueryPriceStockResponseBodyDataNormalPriceStock setDistributionPrice(TicketQueryPriceStockResponseBodyDataNormalPriceStockDistributionPrice distributionPrice) {
            this.distributionPrice = distributionPrice;
            return this;
        }
        public TicketQueryPriceStockResponseBodyDataNormalPriceStockDistributionPrice getDistributionPrice() {
            return this.distributionPrice;
        }

        public TicketQueryPriceStockResponseBodyDataNormalPriceStock setMarketPrice(TicketQueryPriceStockResponseBodyDataNormalPriceStockMarketPrice marketPrice) {
            this.marketPrice = marketPrice;
            return this;
        }
        public TicketQueryPriceStockResponseBodyDataNormalPriceStockMarketPrice getMarketPrice() {
            return this.marketPrice;
        }

        public TicketQueryPriceStockResponseBodyDataNormalPriceStock setStock(Long stock) {
            this.stock = stock;
            return this;
        }
        public Long getStock() {
            return this.stock;
        }

        public TicketQueryPriceStockResponseBodyDataNormalPriceStock setSuggestedPrice(TicketQueryPriceStockResponseBodyDataNormalPriceStockSuggestedPrice suggestedPrice) {
            this.suggestedPrice = suggestedPrice;
            return this;
        }
        public TicketQueryPriceStockResponseBodyDataNormalPriceStockSuggestedPrice getSuggestedPrice() {
            return this.suggestedPrice;
        }

    }

    public static class TicketQueryPriceStockResponseBodyData extends TeaModel {
        @NameInMap("CalendarPriceStocks")
        public java.util.List<TicketQueryPriceStockResponseBodyDataCalendarPriceStocks> calendarPriceStocks;

        @NameInMap("NormalPriceStock")
        public TicketQueryPriceStockResponseBodyDataNormalPriceStock normalPriceStock;

        /**
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("ProductId")
        public String productId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("StockType")
        public Integer stockType;

        public static TicketQueryPriceStockResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TicketQueryPriceStockResponseBodyData self = new TicketQueryPriceStockResponseBodyData();
            return TeaModel.build(map, self);
        }

        public TicketQueryPriceStockResponseBodyData setCalendarPriceStocks(java.util.List<TicketQueryPriceStockResponseBodyDataCalendarPriceStocks> calendarPriceStocks) {
            this.calendarPriceStocks = calendarPriceStocks;
            return this;
        }
        public java.util.List<TicketQueryPriceStockResponseBodyDataCalendarPriceStocks> getCalendarPriceStocks() {
            return this.calendarPriceStocks;
        }

        public TicketQueryPriceStockResponseBodyData setNormalPriceStock(TicketQueryPriceStockResponseBodyDataNormalPriceStock normalPriceStock) {
            this.normalPriceStock = normalPriceStock;
            return this;
        }
        public TicketQueryPriceStockResponseBodyDataNormalPriceStock getNormalPriceStock() {
            return this.normalPriceStock;
        }

        public TicketQueryPriceStockResponseBodyData setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public TicketQueryPriceStockResponseBodyData setStockType(Integer stockType) {
            this.stockType = stockType;
            return this;
        }
        public Integer getStockType() {
            return this.stockType;
        }

    }

}
