// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetEpdSummaryResponseBody extends TeaModel {
    /**
     * <p>Response parameters</p>
     */
    @NameInMap("data")
    public java.util.List<GetEpdSummaryResponseBodyData> data;

    /**
     * <p>The ID of the request. The value is unique for each request. This facilitates subsequent troubleshooting.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetEpdSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEpdSummaryResponseBody self = new GetEpdSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEpdSummaryResponseBody setData(java.util.List<GetEpdSummaryResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetEpdSummaryResponseBodyData> getData() {
        return this.data;
    }

    public GetEpdSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetEpdSummaryResponseBodyData extends TeaModel {
        /**
         * <p>Emissions. The result is maintained up to 31 decimal places for precise intermediate calculation and subsequently truncated for display. It is advised to pair the emissions figure with the unit of the environmental impact result for a comprehensive understanding.</p>
         */
        @NameInMap("carbonEmission")
        public Double carbonEmission;

        /**
         * <p>The evaluation index adopted for the environmental impact</p>
         */
        @NameInMap("indicator")
        public String indicator;

        /**
         * <p>The category key. The environmental impact category. Currently, a maximum of 19 categories are supported. Enumeration refers to [Carbon Footprint Appendices](https://carbon-doc.oss-cn-hangzhou.aliyuncs.com/CarbonFootprintAppendices-en.pdf).</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>Calculation method standard</p>
         */
        @NameInMap("method")
        public String method;

        /**
         * <p>The name of the category.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Category num: the unique serial number of the environmental impact category. A maximum of 19 categories are supported. Enumeration refers to [Carbon Footprint Appendices](https://carbon-doc.oss-cn-hangzhou.aliyuncs.com/CarbonFootprintAppendices-en.pdf).</p>
         */
        @NameInMap("num")
        public Long num;

        /**
         * <p>Environmental impact result Value Unit.</p>
         */
        @NameInMap("preUnit")
        public String preUnit;

        /**
         * <p>The data status. 1 indicates that the calculation is accurate, 2 indicates that the default data is used, and 3 indicates that the missing factor uses the value of 0.</p>
         */
        @NameInMap("state")
        public Long state;

        public static GetEpdSummaryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetEpdSummaryResponseBodyData self = new GetEpdSummaryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetEpdSummaryResponseBodyData setCarbonEmission(Double carbonEmission) {
            this.carbonEmission = carbonEmission;
            return this;
        }
        public Double getCarbonEmission() {
            return this.carbonEmission;
        }

        public GetEpdSummaryResponseBodyData setIndicator(String indicator) {
            this.indicator = indicator;
            return this;
        }
        public String getIndicator() {
            return this.indicator;
        }

        public GetEpdSummaryResponseBodyData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetEpdSummaryResponseBodyData setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public GetEpdSummaryResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetEpdSummaryResponseBodyData setNum(Long num) {
            this.num = num;
            return this;
        }
        public Long getNum() {
            return this.num;
        }

        public GetEpdSummaryResponseBodyData setPreUnit(String preUnit) {
            this.preUnit = preUnit;
            return this;
        }
        public String getPreUnit() {
            return this.preUnit;
        }

        public GetEpdSummaryResponseBodyData setState(Long state) {
            this.state = state;
            return this;
        }
        public Long getState() {
            return this.state;
        }

    }

}
