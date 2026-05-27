// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class SumBillsResponseBody extends TeaModel {
    @NameInMap("data")
    public SumBillsResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpCode")
    public Integer httpCode;

    /**
     * <strong>example:</strong>
     * <p>BB66A390-4EF7-557E-9489-7F98D6F44002</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static SumBillsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SumBillsResponseBody self = new SumBillsResponseBody();
        return TeaModel.build(map, self);
    }

    public SumBillsResponseBody setData(SumBillsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SumBillsResponseBodyData getData() {
        return this.data;
    }

    public SumBillsResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public SumBillsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SumBillsResponseBodyDataItemBills extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>123.56</p>
         */
        @NameInMap("cost")
        public String cost;

        /**
         * <strong>example:</strong>
         * <p>CNY</p>
         */
        @NameInMap("currency")
        public String currency;

        /**
         * <strong>example:</strong>
         * <p>projectName</p>
         */
        @NameInMap("itemName")
        public String itemName;

        /**
         * <strong>example:</strong>
         * <p>56.12</p>
         */
        @NameInMap("percentage")
        public Double percentage;

        public static SumBillsResponseBodyDataItemBills build(java.util.Map<String, ?> map) throws Exception {
            SumBillsResponseBodyDataItemBills self = new SumBillsResponseBodyDataItemBills();
            return TeaModel.build(map, self);
        }

        public SumBillsResponseBodyDataItemBills setCost(String cost) {
            this.cost = cost;
            return this;
        }
        public String getCost() {
            return this.cost;
        }

        public SumBillsResponseBodyDataItemBills setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public SumBillsResponseBodyDataItemBills setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }
        public String getItemName() {
            return this.itemName;
        }

        public SumBillsResponseBodyDataItemBills setPercentage(Double percentage) {
            this.percentage = percentage;
            return this;
        }
        public Double getPercentage() {
            return this.percentage;
        }

    }

    public static class SumBillsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CNY</p>
         */
        @NameInMap("currency")
        public String currency;

        @NameInMap("itemBills")
        public java.util.List<SumBillsResponseBodyDataItemBills> itemBills;

        /**
         * <strong>example:</strong>
         * <p>123.56</p>
         */
        @NameInMap("totalCost")
        public String totalCost;

        public static SumBillsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SumBillsResponseBodyData self = new SumBillsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SumBillsResponseBodyData setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public SumBillsResponseBodyData setItemBills(java.util.List<SumBillsResponseBodyDataItemBills> itemBills) {
            this.itemBills = itemBills;
            return this;
        }
        public java.util.List<SumBillsResponseBodyDataItemBills> getItemBills() {
            return this.itemBills;
        }

        public SumBillsResponseBodyData setTotalCost(String totalCost) {
            this.totalCost = totalCost;
            return this;
        }
        public String getTotalCost() {
            return this.totalCost;
        }

    }

}
