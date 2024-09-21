// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetGwpBenchmarkListResponseBody extends TeaModel {
    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("data")
    public GetGwpBenchmarkListResponseBodyData data;

    /**
     * <p>The ID of the request. The value is unique for each request. This facilitates subsequent troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>A8AEC6D9-A359-5169-BD1A-BD848BA60D65</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetGwpBenchmarkListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGwpBenchmarkListResponseBody self = new GetGwpBenchmarkListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGwpBenchmarkListResponseBody setData(GetGwpBenchmarkListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetGwpBenchmarkListResponseBodyData getData() {
        return this.data;
    }

    public GetGwpBenchmarkListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetGwpBenchmarkListResponseBodyDataItems extends TeaModel {
        /**
         * <p><code>activeReduction=benchmarkEmission-carbonEmission</code> Generally, baseline emissions are greater than inventory emissions. Maintain four decimal places. Unit pertains to a higher-level unit.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2169</p>
         */
        @NameInMap("activeReduction")
        public Double activeReduction;

        /**
         * <p>Benchmark emissions. Maintain four decimal places. Unit pertains to a higher-level unit.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0108</p>
         */
        @NameInMap("benchmarkEmission")
        public Double benchmarkEmission;

        /**
         * <p>Benchmark name</p>
         * 
         * <strong>example:</strong>
         * <p>old-energy</p>
         */
        @NameInMap("benchmarkName")
        public String benchmarkName;

        /**
         * <p>Inventory emissions. Maintain four decimal places. Unit pertains to a higher-level unit.</p>
         * 
         * <strong>example:</strong>
         * <p>-0.2061</p>
         */
        @NameInMap("carbonEmission")
        public Double carbonEmission;

        /**
         * <p>name</p>
         * 
         * <strong>example:</strong>
         * <p>new-energy</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Unused temporarily.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("percent")
        public String percent;

        public static GetGwpBenchmarkListResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            GetGwpBenchmarkListResponseBodyDataItems self = new GetGwpBenchmarkListResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public GetGwpBenchmarkListResponseBodyDataItems setActiveReduction(Double activeReduction) {
            this.activeReduction = activeReduction;
            return this;
        }
        public Double getActiveReduction() {
            return this.activeReduction;
        }

        public GetGwpBenchmarkListResponseBodyDataItems setBenchmarkEmission(Double benchmarkEmission) {
            this.benchmarkEmission = benchmarkEmission;
            return this;
        }
        public Double getBenchmarkEmission() {
            return this.benchmarkEmission;
        }

        public GetGwpBenchmarkListResponseBodyDataItems setBenchmarkName(String benchmarkName) {
            this.benchmarkName = benchmarkName;
            return this;
        }
        public String getBenchmarkName() {
            return this.benchmarkName;
        }

        public GetGwpBenchmarkListResponseBodyDataItems setCarbonEmission(Double carbonEmission) {
            this.carbonEmission = carbonEmission;
            return this;
        }
        public Double getCarbonEmission() {
            return this.carbonEmission;
        }

        public GetGwpBenchmarkListResponseBodyDataItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetGwpBenchmarkListResponseBodyDataItems setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

    }

    public static class GetGwpBenchmarkListResponseBodyData extends TeaModel {
        /**
         * <p>Active carbon reduction ranking list.</p>
         */
        @NameInMap("items")
        public java.util.List<GetGwpBenchmarkListResponseBodyDataItems> items;

        /**
         * <p>unit of emissions. The default value is <code>kgCO₂e/productUnit</code>. 
         * The <code>productUnit</code> is the unit selected for the product. The unit value is changed to <code>tCO₂e/productUnit</code> or <code>gCO₂e/productUnit</code>. For more information, see the remarks in the quantity column.</p>
         * 
         * <strong>example:</strong>
         * <p>kgCO₂e/kg</p>
         */
        @NameInMap("unit")
        public String unit;

        public static GetGwpBenchmarkListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetGwpBenchmarkListResponseBodyData self = new GetGwpBenchmarkListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetGwpBenchmarkListResponseBodyData setItems(java.util.List<GetGwpBenchmarkListResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<GetGwpBenchmarkListResponseBodyDataItems> getItems() {
            return this.items;
        }

        public GetGwpBenchmarkListResponseBodyData setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

    }

}
