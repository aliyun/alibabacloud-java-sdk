// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListChartDataForServiceGroupResponseBody extends TeaModel {
    // data
    @NameInMap("data")
    public java.util.List<ListChartDataForServiceGroupResponseBodyData> data;

    // Id of the request
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
        // 根据影响等级时间等级分组统计数量
        @NameInMap("effectionLevel")
        public java.util.Map<String, ?> effectionLevel;

        // 升级事件数
        @NameInMap("escalationIncidentCount")
        public Long escalationIncidentCount;

        // 时间总数
        @NameInMap("incidentCount")
        public Long incidentCount;

        // 当日平均响应时间单位秒
        @NameInMap("meanTimeToAcknowledge")
        public Long meanTimeToAcknowledge;

        // 当日平均完结时间单位秒
        @NameInMap("meanTimeToRepair")
        public Long meanTimeToRepair;

        // 时间
        @NameInMap("time")
        public String time;

        // 总平均响应时间
        @NameInMap("totalMeanTimeToAcknowledge")
        public Long totalMeanTimeToAcknowledge;

        // 总平均完结时间
        @NameInMap("totalMeanTimeToRepair")
        public Long totalMeanTimeToRepair;

        // 未响应升级事件数
        @NameInMap("unAcknowledgedEscalationIncidentCount")
        public Long unAcknowledgedEscalationIncidentCount;

        // 未完结升级事件数
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
