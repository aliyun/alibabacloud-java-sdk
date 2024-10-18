// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetOssCheckStatResponseBody extends TeaModel {
    @NameInMap("BarChart")
    public GetOssCheckStatResponseBodyBarChart barChart;

    /**
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetOssCheckStatResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOssCheckStatResponseBody self = new GetOssCheckStatResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOssCheckStatResponseBody setBarChart(GetOssCheckStatResponseBodyBarChart barChart) {
        this.barChart = barChart;
        return this;
    }
    public GetOssCheckStatResponseBodyBarChart getBarChart() {
        return this.barChart;
    }

    public GetOssCheckStatResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetOssCheckStatResponseBodyBarChartY extends TeaModel {
        @NameInMap("Data")
        public java.util.List<Long> data;

        /**
         * <strong>example:</strong>
         * <p>document_detection</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetOssCheckStatResponseBodyBarChartY build(java.util.Map<String, ?> map) throws Exception {
            GetOssCheckStatResponseBodyBarChartY self = new GetOssCheckStatResponseBodyBarChartY();
            return TeaModel.build(map, self);
        }

        public GetOssCheckStatResponseBodyBarChartY setData(java.util.List<Long> data) {
            this.data = data;
            return this;
        }
        public java.util.List<Long> getData() {
            return this.data;
        }

        public GetOssCheckStatResponseBodyBarChartY setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetOssCheckStatResponseBodyBarChart extends TeaModel {
        @NameInMap("X")
        public java.util.List<String> x;

        @NameInMap("Y")
        public java.util.List<GetOssCheckStatResponseBodyBarChartY> y;

        public static GetOssCheckStatResponseBodyBarChart build(java.util.Map<String, ?> map) throws Exception {
            GetOssCheckStatResponseBodyBarChart self = new GetOssCheckStatResponseBodyBarChart();
            return TeaModel.build(map, self);
        }

        public GetOssCheckStatResponseBodyBarChart setX(java.util.List<String> x) {
            this.x = x;
            return this;
        }
        public java.util.List<String> getX() {
            return this.x;
        }

        public GetOssCheckStatResponseBodyBarChart setY(java.util.List<GetOssCheckStatResponseBodyBarChartY> y) {
            this.y = y;
            return this;
        }
        public java.util.List<GetOssCheckStatResponseBodyBarChartY> getY() {
            return this.y;
        }

    }

}
