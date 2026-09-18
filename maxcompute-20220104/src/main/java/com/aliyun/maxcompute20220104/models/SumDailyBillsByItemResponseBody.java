// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class SumDailyBillsByItemResponseBody extends TeaModel {
    /**
     * <p>The response data.</p>
     */
    @NameInMap("data")
    public SumDailyBillsByItemResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("httpCode")
    public Integer httpCode;

    /**
     * <p>The unique identifier for the request.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static SumDailyBillsByItemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SumDailyBillsByItemResponseBody self = new SumDailyBillsByItemResponseBody();
        return TeaModel.build(map, self);
    }

    public SumDailyBillsByItemResponseBody setData(SumDailyBillsByItemResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SumDailyBillsByItemResponseBodyData getData() {
        return this.data;
    }

    public SumDailyBillsByItemResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public SumDailyBillsByItemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SumDailyBillsByItemResponseBodyDataItemSummaryBillsDailySumBillsItemBills extends TeaModel {
        /**
         * <p>The cost of the item.</p>
         */
        @NameInMap("cost")
        public String cost;

        /**
         * <p>The currency of the cost.</p>
         */
        @NameInMap("currency")
        public String currency;

        /**
         * <p>The name of the billable item.</p>
         */
        @NameInMap("itemName")
        public String itemName;

        /**
         * <p>The item\&quot;s percentage of the daily total cost.</p>
         */
        @NameInMap("percentage")
        public Double percentage;

        public static SumDailyBillsByItemResponseBodyDataItemSummaryBillsDailySumBillsItemBills build(java.util.Map<String, ?> map) throws Exception {
            SumDailyBillsByItemResponseBodyDataItemSummaryBillsDailySumBillsItemBills self = new SumDailyBillsByItemResponseBodyDataItemSummaryBillsDailySumBillsItemBills();
            return TeaModel.build(map, self);
        }

        public SumDailyBillsByItemResponseBodyDataItemSummaryBillsDailySumBillsItemBills setCost(String cost) {
            this.cost = cost;
            return this;
        }
        public String getCost() {
            return this.cost;
        }

        public SumDailyBillsByItemResponseBodyDataItemSummaryBillsDailySumBillsItemBills setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public SumDailyBillsByItemResponseBodyDataItemSummaryBillsDailySumBillsItemBills setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }
        public String getItemName() {
            return this.itemName;
        }

        public SumDailyBillsByItemResponseBodyDataItemSummaryBillsDailySumBillsItemBills setPercentage(Double percentage) {
            this.percentage = percentage;
            return this;
        }
        public Double getPercentage() {
            return this.percentage;
        }

    }

    public static class SumDailyBillsByItemResponseBodyDataItemSummaryBillsDailySumBills extends TeaModel {
        /**
         * <p>The cost for the day.</p>
         */
        @NameInMap("cost")
        public String cost;

        /**
         * <p>The currency of the cost.</p>
         */
        @NameInMap("currency")
        public String currency;

        /**
         * <p>The date. Format: YYYYMMDD.</p>
         */
        @NameInMap("dateTime")
        public String dateTime;

        /**
         * <p>An array of detailed bills for the item on the specified day.</p>
         */
        @NameInMap("itemBills")
        public java.util.List<SumDailyBillsByItemResponseBodyDataItemSummaryBillsDailySumBillsItemBills> itemBills;

        public static SumDailyBillsByItemResponseBodyDataItemSummaryBillsDailySumBills build(java.util.Map<String, ?> map) throws Exception {
            SumDailyBillsByItemResponseBodyDataItemSummaryBillsDailySumBills self = new SumDailyBillsByItemResponseBodyDataItemSummaryBillsDailySumBills();
            return TeaModel.build(map, self);
        }

        public SumDailyBillsByItemResponseBodyDataItemSummaryBillsDailySumBills setCost(String cost) {
            this.cost = cost;
            return this;
        }
        public String getCost() {
            return this.cost;
        }

        public SumDailyBillsByItemResponseBodyDataItemSummaryBillsDailySumBills setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public SumDailyBillsByItemResponseBodyDataItemSummaryBillsDailySumBills setDateTime(String dateTime) {
            this.dateTime = dateTime;
            return this;
        }
        public String getDateTime() {
            return this.dateTime;
        }

        public SumDailyBillsByItemResponseBodyDataItemSummaryBillsDailySumBills setItemBills(java.util.List<SumDailyBillsByItemResponseBodyDataItemSummaryBillsDailySumBillsItemBills> itemBills) {
            this.itemBills = itemBills;
            return this;
        }
        public java.util.List<SumDailyBillsByItemResponseBodyDataItemSummaryBillsDailySumBillsItemBills> getItemBills() {
            return this.itemBills;
        }

    }

    public static class SumDailyBillsByItemResponseBodyDataItemSummaryBills extends TeaModel {
        /**
         * <p>The currency of the cost.</p>
         */
        @NameInMap("currency")
        public String currency;

        /**
         * <p>An array of daily cost summaries for the item.</p>
         */
        @NameInMap("dailySumBills")
        public java.util.List<SumDailyBillsByItemResponseBodyDataItemSummaryBillsDailySumBills> dailySumBills;

        /**
         * <p>The name of the billable item.</p>
         */
        @NameInMap("itemName")
        public String itemName;

        /**
         * <p>The item\&quot;s percentage of the total cost.</p>
         */
        @NameInMap("percentage")
        public Double percentage;

        /**
         * <p>The specification code of the item.</p>
         */
        @NameInMap("specCode")
        public String specCode;

        /**
         * <p>The total cost of the item.</p>
         */
        @NameInMap("totalCost")
        public String totalCost;

        public static SumDailyBillsByItemResponseBodyDataItemSummaryBills build(java.util.Map<String, ?> map) throws Exception {
            SumDailyBillsByItemResponseBodyDataItemSummaryBills self = new SumDailyBillsByItemResponseBodyDataItemSummaryBills();
            return TeaModel.build(map, self);
        }

        public SumDailyBillsByItemResponseBodyDataItemSummaryBills setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public SumDailyBillsByItemResponseBodyDataItemSummaryBills setDailySumBills(java.util.List<SumDailyBillsByItemResponseBodyDataItemSummaryBillsDailySumBills> dailySumBills) {
            this.dailySumBills = dailySumBills;
            return this;
        }
        public java.util.List<SumDailyBillsByItemResponseBodyDataItemSummaryBillsDailySumBills> getDailySumBills() {
            return this.dailySumBills;
        }

        public SumDailyBillsByItemResponseBodyDataItemSummaryBills setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }
        public String getItemName() {
            return this.itemName;
        }

        public SumDailyBillsByItemResponseBodyDataItemSummaryBills setPercentage(Double percentage) {
            this.percentage = percentage;
            return this;
        }
        public Double getPercentage() {
            return this.percentage;
        }

        public SumDailyBillsByItemResponseBodyDataItemSummaryBills setSpecCode(String specCode) {
            this.specCode = specCode;
            return this;
        }
        public String getSpecCode() {
            return this.specCode;
        }

        public SumDailyBillsByItemResponseBodyDataItemSummaryBills setTotalCost(String totalCost) {
            this.totalCost = totalCost;
            return this;
        }
        public String getTotalCost() {
            return this.totalCost;
        }

    }

    public static class SumDailyBillsByItemResponseBodyData extends TeaModel {
        /**
         * <p>An array of item-level cost summaries.</p>
         */
        @NameInMap("itemSummaryBills")
        public java.util.List<SumDailyBillsByItemResponseBodyDataItemSummaryBills> itemSummaryBills;

        /**
         * <p>The current page number.</p>
         */
        @NameInMap("pageNumber")
        public Long pageNumber;

        /**
         * <p>The number of entries per page.</p>
         */
        @NameInMap("pageSize")
        public Long pageSize;

        /**
         * <p>The total number of entries returned.</p>
         */
        @NameInMap("totalCount")
        public Long totalCount;

        public static SumDailyBillsByItemResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SumDailyBillsByItemResponseBodyData self = new SumDailyBillsByItemResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SumDailyBillsByItemResponseBodyData setItemSummaryBills(java.util.List<SumDailyBillsByItemResponseBodyDataItemSummaryBills> itemSummaryBills) {
            this.itemSummaryBills = itemSummaryBills;
            return this;
        }
        public java.util.List<SumDailyBillsByItemResponseBodyDataItemSummaryBills> getItemSummaryBills() {
            return this.itemSummaryBills;
        }

        public SumDailyBillsByItemResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public SumDailyBillsByItemResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public SumDailyBillsByItemResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
