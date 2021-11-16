// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListDataReportForUserResponseBody extends TeaModel {
    // 个人统计数据
    @NameInMap("data")
    public java.util.List<ListDataReportForUserResponseBodyData> data;

    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    // 总条数
    @NameInMap("totalCount")
    public Long totalCount;

    public static ListDataReportForUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataReportForUserResponseBody self = new ListDataReportForUserResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataReportForUserResponseBody setData(java.util.List<ListDataReportForUserResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListDataReportForUserResponseBodyData> getData() {
        return this.data;
    }

    public ListDataReportForUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataReportForUserResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListDataReportForUserResponseBodyData extends TeaModel {
        // 分配事件数量
        @NameInMap("distributionIncidentCount")
        public Long distributionIncidentCount;

        // 升级事件数量
        @NameInMap("escalationIncidentCount")
        public Long escalationIncidentCount;

        // 完结事件数量
        @NameInMap("finishIncidentNumber")
        public Long finishIncidentNumber;

        // 完结率
        @NameInMap("finishProportion")
        public String finishProportion;

        // MRRA
        @NameInMap("meanTimeToAcknowledge")
        public String meanTimeToAcknowledge;

        // MTTA
        @NameInMap("meanTimeToRepair")
        public String meanTimeToRepair;

        // 未响应升级数
        @NameInMap("unAcknowledgedEscalationIncidentCount")
        public Long unAcknowledgedEscalationIncidentCount;

        // 非分配完结数
        @NameInMap("unDistributionIncidentCount")
        public Long unDistributionIncidentCount;

        // 未完结事件数
        @NameInMap("unFinishEscalationIncidentCount")
        public Long unFinishEscalationIncidentCount;

        // 用户ID
        @NameInMap("userId")
        public Long userId;

        // 用户名字
        @NameInMap("userName")
        public String userName;

        public static ListDataReportForUserResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDataReportForUserResponseBodyData self = new ListDataReportForUserResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDataReportForUserResponseBodyData setDistributionIncidentCount(Long distributionIncidentCount) {
            this.distributionIncidentCount = distributionIncidentCount;
            return this;
        }
        public Long getDistributionIncidentCount() {
            return this.distributionIncidentCount;
        }

        public ListDataReportForUserResponseBodyData setEscalationIncidentCount(Long escalationIncidentCount) {
            this.escalationIncidentCount = escalationIncidentCount;
            return this;
        }
        public Long getEscalationIncidentCount() {
            return this.escalationIncidentCount;
        }

        public ListDataReportForUserResponseBodyData setFinishIncidentNumber(Long finishIncidentNumber) {
            this.finishIncidentNumber = finishIncidentNumber;
            return this;
        }
        public Long getFinishIncidentNumber() {
            return this.finishIncidentNumber;
        }

        public ListDataReportForUserResponseBodyData setFinishProportion(String finishProportion) {
            this.finishProportion = finishProportion;
            return this;
        }
        public String getFinishProportion() {
            return this.finishProportion;
        }

        public ListDataReportForUserResponseBodyData setMeanTimeToAcknowledge(String meanTimeToAcknowledge) {
            this.meanTimeToAcknowledge = meanTimeToAcknowledge;
            return this;
        }
        public String getMeanTimeToAcknowledge() {
            return this.meanTimeToAcknowledge;
        }

        public ListDataReportForUserResponseBodyData setMeanTimeToRepair(String meanTimeToRepair) {
            this.meanTimeToRepair = meanTimeToRepair;
            return this;
        }
        public String getMeanTimeToRepair() {
            return this.meanTimeToRepair;
        }

        public ListDataReportForUserResponseBodyData setUnAcknowledgedEscalationIncidentCount(Long unAcknowledgedEscalationIncidentCount) {
            this.unAcknowledgedEscalationIncidentCount = unAcknowledgedEscalationIncidentCount;
            return this;
        }
        public Long getUnAcknowledgedEscalationIncidentCount() {
            return this.unAcknowledgedEscalationIncidentCount;
        }

        public ListDataReportForUserResponseBodyData setUnDistributionIncidentCount(Long unDistributionIncidentCount) {
            this.unDistributionIncidentCount = unDistributionIncidentCount;
            return this;
        }
        public Long getUnDistributionIncidentCount() {
            return this.unDistributionIncidentCount;
        }

        public ListDataReportForUserResponseBodyData setUnFinishEscalationIncidentCount(Long unFinishEscalationIncidentCount) {
            this.unFinishEscalationIncidentCount = unFinishEscalationIncidentCount;
            return this;
        }
        public Long getUnFinishEscalationIncidentCount() {
            return this.unFinishEscalationIncidentCount;
        }

        public ListDataReportForUserResponseBodyData setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public ListDataReportForUserResponseBodyData setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
