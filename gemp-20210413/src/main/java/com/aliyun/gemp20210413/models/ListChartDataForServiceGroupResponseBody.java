// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListChartDataForServiceGroupResponseBody extends TeaModel {
    /**
     * <p>data</p>
     */
    @NameInMap("data")
    public java.util.List<ListChartDataForServiceGroupResponseBodyData> data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1231212</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListChartDataForServiceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListChartDataForServiceGroupResponseBody self = new ListChartDataForServiceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ListChartDataForServiceGroupResponseBody setData(java.util.List<ListChartDataForServiceGroupResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListChartDataForServiceGroupResponseBodyData> getData() {
        return this.data;
    }

    public ListChartDataForServiceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListChartDataForServiceGroupResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{&quot;P1HIGH&quot;:32}</p>
         */
        @NameInMap("effectionLevel")
        public java.util.Map<String, ?> effectionLevel;

        /**
         * <strong>example:</strong>
         * <p>43</p>
         */
        @NameInMap("escalationIncidentCount")
        public Long escalationIncidentCount;

        /**
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("incidentCount")
        public Long incidentCount;

        /**
         * <strong>example:</strong>
         * <p>323</p>
         */
        @NameInMap("meanTimeToAcknowledge")
        public Long meanTimeToAcknowledge;

        /**
         * <strong>example:</strong>
         * <p>4343</p>
         */
        @NameInMap("meanTimeToRepair")
        public Long meanTimeToRepair;

        /**
         * <strong>example:</strong>
         * <p>2021-09-09</p>
         */
        @NameInMap("time")
        public String time;

        /**
         * <strong>example:</strong>
         * <p>3334</p>
         */
        @NameInMap("totalMeanTimeToAcknowledge")
        public Long totalMeanTimeToAcknowledge;

        /**
         * <strong>example:</strong>
         * <p>4343</p>
         */
        @NameInMap("totalMeanTimeToRepair")
        public Long totalMeanTimeToRepair;

        /**
         * <strong>example:</strong>
         * <p>23</p>
         */
        @NameInMap("unAcknowledgedEscalationIncidentCount")
        public Long unAcknowledgedEscalationIncidentCount;

        /**
         * <strong>example:</strong>
         * <p>23</p>
         */
        @NameInMap("unFinishEscalationIncidentCount")
        public Long unFinishEscalationIncidentCount;

        public static ListChartDataForServiceGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListChartDataForServiceGroupResponseBodyData self = new ListChartDataForServiceGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListChartDataForServiceGroupResponseBodyData setEffectionLevel(java.util.Map<String, ?> effectionLevel) {
            this.effectionLevel = effectionLevel;
            return this;
        }
        public java.util.Map<String, ?> getEffectionLevel() {
            return this.effectionLevel;
        }

        public ListChartDataForServiceGroupResponseBodyData setEscalationIncidentCount(Long escalationIncidentCount) {
            this.escalationIncidentCount = escalationIncidentCount;
            return this;
        }
        public Long getEscalationIncidentCount() {
            return this.escalationIncidentCount;
        }

        public ListChartDataForServiceGroupResponseBodyData setIncidentCount(Long incidentCount) {
            this.incidentCount = incidentCount;
            return this;
        }
        public Long getIncidentCount() {
            return this.incidentCount;
        }

        public ListChartDataForServiceGroupResponseBodyData setMeanTimeToAcknowledge(Long meanTimeToAcknowledge) {
            this.meanTimeToAcknowledge = meanTimeToAcknowledge;
            return this;
        }
        public Long getMeanTimeToAcknowledge() {
            return this.meanTimeToAcknowledge;
        }

        public ListChartDataForServiceGroupResponseBodyData setMeanTimeToRepair(Long meanTimeToRepair) {
            this.meanTimeToRepair = meanTimeToRepair;
            return this;
        }
        public Long getMeanTimeToRepair() {
            return this.meanTimeToRepair;
        }

        public ListChartDataForServiceGroupResponseBodyData setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public ListChartDataForServiceGroupResponseBodyData setTotalMeanTimeToAcknowledge(Long totalMeanTimeToAcknowledge) {
            this.totalMeanTimeToAcknowledge = totalMeanTimeToAcknowledge;
            return this;
        }
        public Long getTotalMeanTimeToAcknowledge() {
            return this.totalMeanTimeToAcknowledge;
        }

        public ListChartDataForServiceGroupResponseBodyData setTotalMeanTimeToRepair(Long totalMeanTimeToRepair) {
            this.totalMeanTimeToRepair = totalMeanTimeToRepair;
            return this;
        }
        public Long getTotalMeanTimeToRepair() {
            return this.totalMeanTimeToRepair;
        }

        public ListChartDataForServiceGroupResponseBodyData setUnAcknowledgedEscalationIncidentCount(Long unAcknowledgedEscalationIncidentCount) {
            this.unAcknowledgedEscalationIncidentCount = unAcknowledgedEscalationIncidentCount;
            return this;
        }
        public Long getUnAcknowledgedEscalationIncidentCount() {
            return this.unAcknowledgedEscalationIncidentCount;
        }

        public ListChartDataForServiceGroupResponseBodyData setUnFinishEscalationIncidentCount(Long unFinishEscalationIncidentCount) {
            this.unFinishEscalationIncidentCount = unFinishEscalationIncidentCount;
            return this;
        }
        public Long getUnFinishEscalationIncidentCount() {
            return this.unFinishEscalationIncidentCount;
        }

    }

}
