// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ListFaultReportsResponseBody extends TeaModel {
    /**
     * <p>The details of the access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The pagination token.</p>
     * 
     * <strong>example:</strong>
     * <p>DA4F08D</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The fault report details.</p>
     */
    @NameInMap("Reports")
    public java.util.List<ListFaultReportsResponseBodyReports> reports;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DA4F08D4-DA54-5407-84B9-108C71D75B17</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListFaultReportsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFaultReportsResponseBody self = new ListFaultReportsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFaultReportsResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListFaultReportsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListFaultReportsResponseBody setReports(java.util.List<ListFaultReportsResponseBodyReports> reports) {
        this.reports = reports;
        return this;
    }
    public java.util.List<ListFaultReportsResponseBodyReports> getReports() {
        return this.reports;
    }

    public ListFaultReportsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListFaultReportsResponseBodyReports extends TeaModel {
        /**
         * <p>The time when the fault report was created. The time is in the YYYY-MM-DD HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-11-07 17:41:33</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the fault report.</p>
         * 
         * <strong>example:</strong>
         * <p>GPU 0 reporting XID 79 (fallen off bus)</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The diagnosis type.</p>
         * 
         * <strong>example:</strong>
         * <p>QUICK</p>
         */
        @NameInMap("DiagnosisType")
        public String diagnosisType;

        /**
         * <p>The time when the fault report was resolved. The time is in the YYYY-MM-DD HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-11-07 17:41:33</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>e01-3A244BE3</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The fault report ID.</p>
         * 
         * <strong>example:</strong>
         * <p>100184932123</p>
         */
        @NameInMap("ReportId")
        public String reportId;

        /**
         * <p>The status of the fault report.</p>
         * 
         * <strong>example:</strong>
         * <p>Processing</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListFaultReportsResponseBodyReports build(java.util.Map<String, ?> map) throws Exception {
            ListFaultReportsResponseBodyReports self = new ListFaultReportsResponseBodyReports();
            return TeaModel.build(map, self);
        }

        public ListFaultReportsResponseBodyReports setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListFaultReportsResponseBodyReports setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListFaultReportsResponseBodyReports setDiagnosisType(String diagnosisType) {
            this.diagnosisType = diagnosisType;
            return this;
        }
        public String getDiagnosisType() {
            return this.diagnosisType;
        }

        public ListFaultReportsResponseBodyReports setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public ListFaultReportsResponseBodyReports setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public ListFaultReportsResponseBodyReports setReportId(String reportId) {
            this.reportId = reportId;
            return this;
        }
        public String getReportId() {
            return this.reportId;
        }

        public ListFaultReportsResponseBodyReports setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
