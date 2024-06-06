// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetGwpBenchmarkSummaryResponseBody extends TeaModel {
    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("data")
    public GetGwpBenchmarkSummaryResponseBodyData data;

    /**
     * <p>The ID of the request. The value is unique for each request. This facilitates subsequent troubleshooting.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetGwpBenchmarkSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGwpBenchmarkSummaryResponseBody self = new GetGwpBenchmarkSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGwpBenchmarkSummaryResponseBody setData(GetGwpBenchmarkSummaryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetGwpBenchmarkSummaryResponseBodyData getData() {
        return this.data;
    }

    public GetGwpBenchmarkSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetGwpBenchmarkSummaryResponseBodyDataItems extends TeaModel {
        /**
         * <p>Name of carbon reduction details.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Percentage of emissions. The value is of the string type. Two decimal places are reserved for numbers. For example, "99.01" indicates the 99.01% of this type of emissions to the total emissions. Note that the returned string itself does not contain a percent sign.</p>
         */
        @NameInMap("percent")
        public String percent;

        /**
         * <p>Emission amount is presented with four decimal places. Normally, modeling doesn\\"t result in negative values, but users can represent carbon reductions as negatives. The amount, paired with the unit, defines the emissions. Both are dynamically adjusted. If emissions exceed `1000 kgCO₂e/productUnit`, they convert to `tCO₂e/productUnit`. If they fall below `1 kgCO₂e/productUnit`, they convert to `gCO₂e/productUnit`. Otherwise, they stay in `kgCO₂e/productUnit`.</p>
         */
        @NameInMap("quantity")
        public Long quantity;

        /**
         * <p>Unit of emissions. The default value is `kgCO₂e/productUnit.` `productUnit` is the unit selected for the product. The unit value is changed to `tCO₂e/productUnit` or `gCO₂e/productUnit`. For more information, see the remarks in the quantity column.</p>
         */
        @NameInMap("unit")
        public String unit;

        public static GetGwpBenchmarkSummaryResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            GetGwpBenchmarkSummaryResponseBodyDataItems self = new GetGwpBenchmarkSummaryResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public GetGwpBenchmarkSummaryResponseBodyDataItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetGwpBenchmarkSummaryResponseBodyDataItems setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public GetGwpBenchmarkSummaryResponseBodyDataItems setQuantity(Long quantity) {
            this.quantity = quantity;
            return this;
        }
        public Long getQuantity() {
            return this.quantity;
        }

        public GetGwpBenchmarkSummaryResponseBodyDataItems setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

    }

    public static class GetGwpBenchmarkSummaryResponseBodyData extends TeaModel {
        /**
         * <p>Carbon Reduction Contribution Top4 Details.</p>
         */
        @NameInMap("items")
        public java.util.List<GetGwpBenchmarkSummaryResponseBodyDataItems> items;

        /**
         * <p>Emission amount is presented with four decimal places. Normally, modeling doesn\\"t result in negative values, but users can represent carbon reductions as negatives. The amount, paired with the unit, defines the emissions. Both are dynamically adjusted. If emissions exceed `1000 kgCO₂e/productUnit`, they convert to `tCO₂e/productUnit`. If they fall below `1 kgCO₂e/productUnit`, they convert to `gCO₂e/productUnit`. Otherwise, they stay in `kgCO₂e/productUnit`.</p>
         */
        @NameInMap("quantity")
        public Long quantity;

        /**
         * <p>Unit of emissions. The default value is `kgCO₂e/productUnit.` `productUnit` is the unit selected for the product. The unit value is changed to `tCO₂e/productUnit` or `gCO₂e/productUnit`. For more information, see the remarks in the quantity column.</p>
         */
        @NameInMap("unit")
        public String unit;

        public static GetGwpBenchmarkSummaryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetGwpBenchmarkSummaryResponseBodyData self = new GetGwpBenchmarkSummaryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetGwpBenchmarkSummaryResponseBodyData setItems(java.util.List<GetGwpBenchmarkSummaryResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<GetGwpBenchmarkSummaryResponseBodyDataItems> getItems() {
            return this.items;
        }

        public GetGwpBenchmarkSummaryResponseBodyData setQuantity(Long quantity) {
            this.quantity = quantity;
            return this;
        }
        public Long getQuantity() {
            return this.quantity;
        }

        public GetGwpBenchmarkSummaryResponseBodyData setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

    }

}
