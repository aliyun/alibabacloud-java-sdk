// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListDataReportForServiceGroupResponseBody extends TeaModel {
    // 统计数据
    @NameInMap("data")
    public java.util.List<ListDataReportForServiceGroupResponseBodyData> data;

    // 当前页
    @NameInMap("pageNumber")
    public Long pageNumber;

    // 页大小
    @NameInMap("pageSIze")
    public Long pageSIze;

    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    // 总数
    @NameInMap("totalCount")
    public Long totalCount;

    public static ListDataReportForServiceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataReportForServiceGroupResponseBody self = new ListDataReportForServiceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataReportForServiceGroupResponseBody setData(java.util.List<ListDataReportForServiceGroupResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListDataReportForServiceGroupResponseBodyData> getData() {
        return this.data;
    }

    public ListDataReportForServiceGroupResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListDataReportForServiceGroupResponseBody setPageSIze(Long pageSIze) {
        this.pageSIze = pageSIze;
        return this;
    }
    public Long getPageSIze() {
        return this.pageSIze;
    }

    public ListDataReportForServiceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataReportForServiceGroupResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListDataReportForServiceGroupResponseBodyData extends TeaModel {
        // 升级事件数量
        @NameInMap("escalationIncidentCount")
        public Long escalationIncidentCount;

        // 完结率
        @NameInMap("finishProportion")
        public String finishProportion;

        // 事件数量
        @NameInMap("incidentCount")
        public Long incidentCount;

        // MRRA
        @NameInMap("meanTimeToAcknowledge")
        public Long meanTimeToAcknowledge;

        // MTTR
        @NameInMap("meanTimeToRepair")
        public Long meanTimeToRepair;

        // 服务组ID
        @NameInMap("serviceGroupId")
        public Long serviceGroupId;

        // 服务组名字
        @NameInMap("serviceGroupName")
        public String serviceGroupName;

        // 未响应升级事件数量
        @NameInMap("unAcknowledgedEscalationIncidentCount")
        public Long unAcknowledgedEscalationIncidentCount;

        // 未完成升级事件数量
        @NameInMap("unFinishEscalationIncidentCount")
        public Long unFinishEscalationIncidentCount;

        public static ListDataReportForServiceGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDataReportForServiceGroupResponseBodyData self = new ListDataReportForServiceGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDataReportForServiceGroupResponseBodyData setEscalationIncidentCount(Long escalationIncidentCount) {
            this.escalationIncidentCount = escalationIncidentCount;
            return this;
        }
        public Long getEscalationIncidentCount() {
            return this.escalationIncidentCount;
        }

        public ListDataReportForServiceGroupResponseBodyData setFinishProportion(String finishProportion) {
            this.finishProportion = finishProportion;
            return this;
        }
        public String getFinishProportion() {
            return this.finishProportion;
        }

        public ListDataReportForServiceGroupResponseBodyData setIncidentCount(Long incidentCount) {
            this.incidentCount = incidentCount;
            return this;
        }
        public Long getIncidentCount() {
            return this.incidentCount;
        }

        public ListDataReportForServiceGroupResponseBodyData setMeanTimeToAcknowledge(Long meanTimeToAcknowledge) {
            this.meanTimeToAcknowledge = meanTimeToAcknowledge;
            return this;
        }
        public Long getMeanTimeToAcknowledge() {
            return this.meanTimeToAcknowledge;
        }

        public ListDataReportForServiceGroupResponseBodyData setMeanTimeToRepair(Long meanTimeToRepair) {
            this.meanTimeToRepair = meanTimeToRepair;
            return this;
        }
        public Long getMeanTimeToRepair() {
            return this.meanTimeToRepair;
        }

        public ListDataReportForServiceGroupResponseBodyData setServiceGroupId(Long serviceGroupId) {
            this.serviceGroupId = serviceGroupId;
            return this;
        }
        public Long getServiceGroupId() {
            return this.serviceGroupId;
        }

        public ListDataReportForServiceGroupResponseBodyData setServiceGroupName(String serviceGroupName) {
            this.serviceGroupName = serviceGroupName;
            return this;
        }
        public String getServiceGroupName() {
            return this.serviceGroupName;
        }

        public ListDataReportForServiceGroupResponseBodyData setUnAcknowledgedEscalationIncidentCount(Long unAcknowledgedEscalationIncidentCount) {
            this.unAcknowledgedEscalationIncidentCount = unAcknowledgedEscalationIncidentCount;
            return this;
        }
        public Long getUnAcknowledgedEscalationIncidentCount() {
            return this.unAcknowledgedEscalationIncidentCount;
        }

        public ListDataReportForServiceGroupResponseBodyData setUnFinishEscalationIncidentCount(Long unFinishEscalationIncidentCount) {
            this.unFinishEscalationIncidentCount = unFinishEscalationIncidentCount;
            return this;
        }
        public Long getUnFinishEscalationIncidentCount() {
            return this.unFinishEscalationIncidentCount;
        }

    }

}
