// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListTrafficStatisticsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>6276D891-*****-55B2-87B9-74D413F7****。</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TrafficStatistics")
    public java.util.List<ListTrafficStatisticsResponseBodyTrafficStatistics> trafficStatistics;

    public static ListTrafficStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTrafficStatisticsResponseBody self = new ListTrafficStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTrafficStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTrafficStatisticsResponseBody setTrafficStatistics(java.util.List<ListTrafficStatisticsResponseBodyTrafficStatistics> trafficStatistics) {
        this.trafficStatistics = trafficStatistics;
        return this;
    }
    public java.util.List<ListTrafficStatisticsResponseBodyTrafficStatistics> getTrafficStatistics() {
        return this.trafficStatistics;
    }

    public static class ListTrafficStatisticsResponseBodyTrafficStatisticsTrafficStatisticData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>20250815。</p>
         */
        @NameInMap("TrafficStatisticTime")
        public Long trafficStatisticTime;

        /**
         * <strong>example:</strong>
         * <p>1.699814。</p>
         */
        @NameInMap("TrafficStatisticValue")
        public Double trafficStatisticValue;

        public static ListTrafficStatisticsResponseBodyTrafficStatisticsTrafficStatisticData build(java.util.Map<String, ?> map) throws Exception {
            ListTrafficStatisticsResponseBodyTrafficStatisticsTrafficStatisticData self = new ListTrafficStatisticsResponseBodyTrafficStatisticsTrafficStatisticData();
            return TeaModel.build(map, self);
        }

        public ListTrafficStatisticsResponseBodyTrafficStatisticsTrafficStatisticData setTrafficStatisticTime(Long trafficStatisticTime) {
            this.trafficStatisticTime = trafficStatisticTime;
            return this;
        }
        public Long getTrafficStatisticTime() {
            return this.trafficStatisticTime;
        }

        public ListTrafficStatisticsResponseBodyTrafficStatisticsTrafficStatisticData setTrafficStatisticValue(Double trafficStatisticValue) {
            this.trafficStatisticValue = trafficStatisticValue;
            return this;
        }
        public Double getTrafficStatisticValue() {
            return this.trafficStatisticValue;
        }

    }

    public static class ListTrafficStatisticsResponseBodyTrafficStatistics extends TeaModel {
        @NameInMap("TrafficStatisticData")
        public java.util.List<ListTrafficStatisticsResponseBodyTrafficStatisticsTrafficStatisticData> trafficStatisticData;

        /**
         * <strong>example:</strong>
         * <p>all。</p>
         */
        @NameInMap("TrafficStatisticTarget")
        public String trafficStatisticTarget;

        public static ListTrafficStatisticsResponseBodyTrafficStatistics build(java.util.Map<String, ?> map) throws Exception {
            ListTrafficStatisticsResponseBodyTrafficStatistics self = new ListTrafficStatisticsResponseBodyTrafficStatistics();
            return TeaModel.build(map, self);
        }

        public ListTrafficStatisticsResponseBodyTrafficStatistics setTrafficStatisticData(java.util.List<ListTrafficStatisticsResponseBodyTrafficStatisticsTrafficStatisticData> trafficStatisticData) {
            this.trafficStatisticData = trafficStatisticData;
            return this;
        }
        public java.util.List<ListTrafficStatisticsResponseBodyTrafficStatisticsTrafficStatisticData> getTrafficStatisticData() {
            return this.trafficStatisticData;
        }

        public ListTrafficStatisticsResponseBodyTrafficStatistics setTrafficStatisticTarget(String trafficStatisticTarget) {
            this.trafficStatisticTarget = trafficStatisticTarget;
            return this;
        }
        public String getTrafficStatisticTarget() {
            return this.trafficStatisticTarget;
        }

    }

}
