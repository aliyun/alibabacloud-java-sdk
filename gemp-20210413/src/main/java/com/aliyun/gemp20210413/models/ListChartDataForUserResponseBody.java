// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListChartDataForUserResponseBody extends TeaModel {
    // data
    @NameInMap("data")
    public java.util.List<ListChartDataForUserResponseBodyData> data;

    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static ListChartDataForUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListChartDataForUserResponseBody self = new ListChartDataForUserResponseBody();
        return TeaModel.build(map, self);
    }

    public ListChartDataForUserResponseBody setData(java.util.List<ListChartDataForUserResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListChartDataForUserResponseBodyData> getData() {
        return this.data;
    }

    public ListChartDataForUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListChartDataForUserResponseBodyData extends TeaModel {
        @NameInMap("effectionLevel")
        public java.util.Map<String, ?> effectionLevel;

        @NameInMap("escalationIncidentCount")
        public Long escalationIncidentCount;

        @NameInMap("incidentCount")
        public Long incidentCount;

        @NameInMap("meanTimeToAcknowledge")
        public Long meanTimeToAcknowledge;

        @NameInMap("meanTimeToRepair")
        public Long meanTimeToRepair;

        @NameInMap("time")
        public String time;

        @NameInMap("totalMeanTimeToAcknowledge")
        public Long totalMeanTimeToAcknowledge;

        @NameInMap("totalMeanTimeToRepair")
        public Long totalMeanTimeToRepair;

        @NameInMap("unAcknowledgedEscalationIncidentCount")
        public Long unAcknowledgedEscalationIncidentCount;

        @NameInMap("unFinishEscalationIncidentCount")
        public Long unFinishEscalationIncidentCount;

        public static ListChartDataForUserResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListChartDataForUserResponseBodyData self = new ListChartDataForUserResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListChartDataForUserResponseBodyData setEffectionLevel(java.util.Map<String, ?> effectionLevel) {
            this.effectionLevel = effectionLevel;
            return this;
        }
        public java.util.Map<String, ?> getEffectionLevel() {
            return this.effectionLevel;
        }

        public ListChartDataForUserResponseBodyData setEscalationIncidentCount(Long escalationIncidentCount) {
            this.escalationIncidentCount = escalationIncidentCount;
            return this;
        }
        public Long getEscalationIncidentCount() {
            return this.escalationIncidentCount;
        }

        public ListChartDataForUserResponseBodyData setIncidentCount(Long incidentCount) {
            this.incidentCount = incidentCount;
            return this;
        }
        public Long getIncidentCount() {
            return this.incidentCount;
        }

        public ListChartDataForUserResponseBodyData setMeanTimeToAcknowledge(Long meanTimeToAcknowledge) {
            this.meanTimeToAcknowledge = meanTimeToAcknowledge;
            return this;
        }
        public Long getMeanTimeToAcknowledge() {
            return this.meanTimeToAcknowledge;
        }

        public ListChartDataForUserResponseBodyData setMeanTimeToRepair(Long meanTimeToRepair) {
            this.meanTimeToRepair = meanTimeToRepair;
            return this;
        }
        public Long getMeanTimeToRepair() {
            return this.meanTimeToRepair;
        }

        public ListChartDataForUserResponseBodyData setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public ListChartDataForUserResponseBodyData setTotalMeanTimeToAcknowledge(Long totalMeanTimeToAcknowledge) {
            this.totalMeanTimeToAcknowledge = totalMeanTimeToAcknowledge;
            return this;
        }
        public Long getTotalMeanTimeToAcknowledge() {
            return this.totalMeanTimeToAcknowledge;
        }

        public ListChartDataForUserResponseBodyData setTotalMeanTimeToRepair(Long totalMeanTimeToRepair) {
            this.totalMeanTimeToRepair = totalMeanTimeToRepair;
            return this;
        }
        public Long getTotalMeanTimeToRepair() {
            return this.totalMeanTimeToRepair;
        }

        public ListChartDataForUserResponseBodyData setUnAcknowledgedEscalationIncidentCount(Long unAcknowledgedEscalationIncidentCount) {
            this.unAcknowledgedEscalationIncidentCount = unAcknowledgedEscalationIncidentCount;
            return this;
        }
        public Long getUnAcknowledgedEscalationIncidentCount() {
            return this.unAcknowledgedEscalationIncidentCount;
        }

        public ListChartDataForUserResponseBodyData setUnFinishEscalationIncidentCount(Long unFinishEscalationIncidentCount) {
            this.unFinishEscalationIncidentCount = unFinishEscalationIncidentCount;
            return this;
        }
        public Long getUnFinishEscalationIncidentCount() {
            return this.unFinishEscalationIncidentCount;
        }

    }

}
