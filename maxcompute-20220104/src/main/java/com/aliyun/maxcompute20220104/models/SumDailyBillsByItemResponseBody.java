// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class SumDailyBillsByItemResponseBody extends TeaModel {
    @NameInMap("data")
    public SumDailyBillsByItemResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpCode")
    public Integer httpCode;

    /**
     * <strong>example:</strong>
     * <p>0bc3b4ab17217876841756121e1349</p>
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
         * <strong>example:</strong>
         * <p>433</p>
         */
        @NameInMap("cost")
        public String cost;

        /**
         * <strong>example:</strong>
         * <p>RMB</p>
         */
        @NameInMap("currency")
        public String currency;

        /**
         * <strong>example:</strong>
         * <p>empty</p>
         */
        @NameInMap("itemName")
        public String itemName;

        /**
         * <strong>example:</strong>
         * <p>60</p>
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
         * <strong>example:</strong>
         * <p>31</p>
         */
        @NameInMap("cost")
        public String cost;

        /**
         * <strong>example:</strong>
         * <p>RMB</p>
         */
        @NameInMap("currency")
        public String currency;

        /**
         * <strong>example:</strong>
         * <p>20260409</p>
         */
        @NameInMap("dateTime")
        public String dateTime;

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
         * <strong>example:</strong>
         * <p>RMB</p>
         */
        @NameInMap("currency")
        public String currency;

        @NameInMap("dailySumBills")
        public java.util.List<SumDailyBillsByItemResponseBodyDataItemSummaryBillsDailySumBills> dailySumBills;

        /**
         * <strong>example:</strong>
         * <p>DRStorage</p>
         */
        @NameInMap("itemName")
        public String itemName;

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("percentage")
        public Double percentage;

        /**
         * <strong>example:</strong>
         * <p>OdpsStandard</p>
         */
        @NameInMap("specCode")
        public String specCode;

        /**
         * <strong>example:</strong>
         * <p>10000</p>
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
        @NameInMap("itemSummaryBills")
        public java.util.List<SumDailyBillsByItemResponseBodyDataItemSummaryBills> itemSummaryBills;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("pageNumber")
        public Long pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public Long pageSize;

        /**
         * <strong>example:</strong>
         * <p>60</p>
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
