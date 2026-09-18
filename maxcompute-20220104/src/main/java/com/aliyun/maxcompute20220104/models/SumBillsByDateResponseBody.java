// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class SumBillsByDateResponseBody extends TeaModel {
    /**
     * <p>The list of results.</p>
     */
    @NameInMap("data")
    public java.util.List<SumBillsByDateResponseBodyData> data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpCode")
    public Integer httpCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BB66A390-4EF7-557E-9489-7F98D6F44002</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static SumBillsByDateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SumBillsByDateResponseBody self = new SumBillsByDateResponseBody();
        return TeaModel.build(map, self);
    }

    public SumBillsByDateResponseBody setData(java.util.List<SumBillsByDateResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<SumBillsByDateResponseBodyData> getData() {
        return this.data;
    }

    public SumBillsByDateResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public SumBillsByDateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SumBillsByDateResponseBodyDataItemBills extends TeaModel {
        /**
         * <p>The cost.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("cost")
        public String cost;

        /**
         * <p>The currency. This is a fixed value.</p>
         * 
         * <strong>example:</strong>
         * <p>RMB</p>
         */
        @NameInMap("currency")
        public String currency;

        /**
         * <p>The name of the item. The value of this parameter depends on the <code>statsType</code> parameter in the request. If <code>statsType</code> is <code>PROJECT</code>, this parameter indicates the instance name. If <code>statsType</code> is <code>FEE_ITEM</code>, this parameter can be a value such as <code>DRStorage</code>, <code>ComputationSql</code>, or <code>Storage</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>projectName</p>
         */
        @NameInMap("itemName")
        public String itemName;

        /**
         * <p>The item\&quot;s cost as a percentage of the total daily cost. This value does not include a percent sign (%).</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("percentage")
        public Double percentage;

        public static SumBillsByDateResponseBodyDataItemBills build(java.util.Map<String, ?> map) throws Exception {
            SumBillsByDateResponseBodyDataItemBills self = new SumBillsByDateResponseBodyDataItemBills();
            return TeaModel.build(map, self);
        }

        public SumBillsByDateResponseBodyDataItemBills setCost(String cost) {
            this.cost = cost;
            return this;
        }
        public String getCost() {
            return this.cost;
        }

        public SumBillsByDateResponseBodyDataItemBills setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public SumBillsByDateResponseBodyDataItemBills setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }
        public String getItemName() {
            return this.itemName;
        }

        public SumBillsByDateResponseBodyDataItemBills setPercentage(Double percentage) {
            this.percentage = percentage;
            return this;
        }
        public Double getPercentage() {
            return this.percentage;
        }

    }

    public static class SumBillsByDateResponseBodyData extends TeaModel {
        /**
         * <p>The total cost for the specified <code>dateTime</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("cost")
        public String cost;

        /**
         * <p>The currency. This is a fixed value.</p>
         * 
         * <strong>example:</strong>
         * <p>RMB</p>
         */
        @NameInMap("currency")
        public String currency;

        /**
         * <p>The date of the statistics, in <code>yyyyMMdd</code> format.</p>
         * 
         * <strong>example:</strong>
         * <p>20250719</p>
         */
        @NameInMap("dateTime")
        public String dateTime;

        /**
         * <p>A list of billable items.</p>
         */
        @NameInMap("itemBills")
        public java.util.List<SumBillsByDateResponseBodyDataItemBills> itemBills;

        public static SumBillsByDateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SumBillsByDateResponseBodyData self = new SumBillsByDateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SumBillsByDateResponseBodyData setCost(String cost) {
            this.cost = cost;
            return this;
        }
        public String getCost() {
            return this.cost;
        }

        public SumBillsByDateResponseBodyData setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public SumBillsByDateResponseBodyData setDateTime(String dateTime) {
            this.dateTime = dateTime;
            return this;
        }
        public String getDateTime() {
            return this.dateTime;
        }

        public SumBillsByDateResponseBodyData setItemBills(java.util.List<SumBillsByDateResponseBodyDataItemBills> itemBills) {
            this.itemBills = itemBills;
            return this;
        }
        public java.util.List<SumBillsByDateResponseBodyDataItemBills> getItemBills() {
            return this.itemBills;
        }

    }

}
