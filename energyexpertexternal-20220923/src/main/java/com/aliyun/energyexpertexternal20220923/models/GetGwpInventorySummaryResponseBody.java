// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetGwpInventorySummaryResponseBody extends TeaModel {
    /**
     * <p>The returned results.</p>
     */
    @NameInMap("data")
    public GetGwpInventorySummaryResponseBodyData data;

    /**
     * <p>The ID of the request. The value is unique for each request. This facilitates subsequent troubleshooting.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetGwpInventorySummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGwpInventorySummaryResponseBody self = new GetGwpInventorySummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGwpInventorySummaryResponseBody setData(GetGwpInventorySummaryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetGwpInventorySummaryResponseBodyData getData() {
        return this.data;
    }

    public GetGwpInventorySummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetGwpInventorySummaryResponseBodyDataItems extends TeaModel {
        /**
         * <p>Inventory resource type name.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Percentage.</p>
         */
        @NameInMap("percent")
        public String percent;

        /**
         * <p>Quantity.</p>
         */
        @NameInMap("quantity")
        public Double quantity;

        /**
         * <p>The unit.</p>
         */
        @NameInMap("unit")
        public String unit;

        public static GetGwpInventorySummaryResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            GetGwpInventorySummaryResponseBodyDataItems self = new GetGwpInventorySummaryResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public GetGwpInventorySummaryResponseBodyDataItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetGwpInventorySummaryResponseBodyDataItems setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public GetGwpInventorySummaryResponseBodyDataItems setQuantity(Double quantity) {
            this.quantity = quantity;
            return this;
        }
        public Double getQuantity() {
            return this.quantity;
        }

        public GetGwpInventorySummaryResponseBodyDataItems setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

    }

    public static class GetGwpInventorySummaryResponseBodyData extends TeaModel {
        /**
         * <p>Top 4 types of carbon footprint contribution.</p>
         */
        @NameInMap("items")
        public java.util.List<GetGwpInventorySummaryResponseBodyDataItems> items;

        /**
         * <p>The emission quantity.</p>
         */
        @NameInMap("quantity")
        public Double quantity;

        /**
         * <p>The time when the result was generated, in the millisecond timestamp format.</p>
         */
        @NameInMap("resultGenerateTime")
        public Long resultGenerateTime;

        /**
         * <p>Emission Unit.</p>
         */
        @NameInMap("unit")
        public String unit;

        public static GetGwpInventorySummaryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetGwpInventorySummaryResponseBodyData self = new GetGwpInventorySummaryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetGwpInventorySummaryResponseBodyData setItems(java.util.List<GetGwpInventorySummaryResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<GetGwpInventorySummaryResponseBodyDataItems> getItems() {
            return this.items;
        }

        public GetGwpInventorySummaryResponseBodyData setQuantity(Double quantity) {
            this.quantity = quantity;
            return this;
        }
        public Double getQuantity() {
            return this.quantity;
        }

        public GetGwpInventorySummaryResponseBodyData setResultGenerateTime(Long resultGenerateTime) {
            this.resultGenerateTime = resultGenerateTime;
            return this;
        }
        public Long getResultGenerateTime() {
            return this.resultGenerateTime;
        }

        public GetGwpInventorySummaryResponseBodyData setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

    }

}
