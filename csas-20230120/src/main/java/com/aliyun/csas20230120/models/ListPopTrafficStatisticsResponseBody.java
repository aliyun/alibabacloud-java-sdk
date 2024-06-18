// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListPopTrafficStatisticsResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>EFE7EBB2-449D-5BBB-B381-CA7839BC1649</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TrafficData")
    public java.util.List<ListPopTrafficStatisticsResponseBodyTrafficData> trafficData;

    public static ListPopTrafficStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPopTrafficStatisticsResponseBody self = new ListPopTrafficStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPopTrafficStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPopTrafficStatisticsResponseBody setTrafficData(java.util.List<ListPopTrafficStatisticsResponseBodyTrafficData> trafficData) {
        this.trafficData = trafficData;
        return this;
    }
    public java.util.List<ListPopTrafficStatisticsResponseBodyTrafficData> getTrafficData() {
        return this.trafficData;
    }

    public static class ListPopTrafficStatisticsResponseBodyTrafficDataDatapoints extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>15325</p>
         */
        @NameInMap("Average")
        public Double average;

        /**
         * <strong>example:</strong>
         * <p>2023-12-06 15:29:00</p>
         */
        @NameInMap("DateTime")
        public String dateTime;

        public static ListPopTrafficStatisticsResponseBodyTrafficDataDatapoints build(java.util.Map<String, ?> map) throws Exception {
            ListPopTrafficStatisticsResponseBodyTrafficDataDatapoints self = new ListPopTrafficStatisticsResponseBodyTrafficDataDatapoints();
            return TeaModel.build(map, self);
        }

        public ListPopTrafficStatisticsResponseBodyTrafficDataDatapoints setAverage(Double average) {
            this.average = average;
            return this;
        }
        public Double getAverage() {
            return this.average;
        }

        public ListPopTrafficStatisticsResponseBodyTrafficDataDatapoints setDateTime(String dateTime) {
            this.dateTime = dateTime;
            return this;
        }
        public String getDateTime() {
            return this.dateTime;
        }

    }

    public static class ListPopTrafficStatisticsResponseBodyTrafficData extends TeaModel {
        @NameInMap("Datapoints")
        public java.util.List<ListPopTrafficStatisticsResponseBodyTrafficDataDatapoints> datapoints;

        /**
         * <strong>example:</strong>
         * <p>InternetTx</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        public static ListPopTrafficStatisticsResponseBodyTrafficData build(java.util.Map<String, ?> map) throws Exception {
            ListPopTrafficStatisticsResponseBodyTrafficData self = new ListPopTrafficStatisticsResponseBodyTrafficData();
            return TeaModel.build(map, self);
        }

        public ListPopTrafficStatisticsResponseBodyTrafficData setDatapoints(java.util.List<ListPopTrafficStatisticsResponseBodyTrafficDataDatapoints> datapoints) {
            this.datapoints = datapoints;
            return this;
        }
        public java.util.List<ListPopTrafficStatisticsResponseBodyTrafficDataDatapoints> getDatapoints() {
            return this.datapoints;
        }

        public ListPopTrafficStatisticsResponseBodyTrafficData setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

    }

}
