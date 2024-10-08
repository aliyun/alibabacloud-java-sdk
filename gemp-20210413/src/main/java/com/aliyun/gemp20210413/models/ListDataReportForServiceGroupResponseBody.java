// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListDataReportForServiceGroupResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<ListDataReportForServiceGroupResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Long pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSIze")
    public Long pageSIze;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxxxx</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("escalationIncidentCount")
        public Long escalationIncidentCount;

        /**
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("finishIncidentCount")
        public Long finishIncidentCount;

        /**
         * <strong>example:</strong>
         * <p>19%</p>
         */
        @NameInMap("finishProportion")
        public String finishProportion;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("incidentCount")
        public Long incidentCount;

        /**
         * <p>MRRA</p>
         * 
         * <strong>example:</strong>
         * <p>3分19秒</p>
         */
        @NameInMap("meanTimeToAcknowledge")
        public Long meanTimeToAcknowledge;

        /**
         * <p>MTTR</p>
         * 
         * <strong>example:</strong>
         * <p>3分19秒</p>
         */
        @NameInMap("meanTimeToRepair")
        public Long meanTimeToRepair;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("serviceGroupId")
        public Long serviceGroupId;

        /**
         * <strong>example:</strong>
         * <p>服务组</p>
         */
        @NameInMap("serviceGroupName")
        public String serviceGroupName;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("unAcknowledgedEscalationIncidentCount")
        public Long unAcknowledgedEscalationIncidentCount;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
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

        public ListDataReportForServiceGroupResponseBodyData setFinishIncidentCount(Long finishIncidentCount) {
            this.finishIncidentCount = finishIncidentCount;
            return this;
        }
        public Long getFinishIncidentCount() {
            return this.finishIncidentCount;
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
