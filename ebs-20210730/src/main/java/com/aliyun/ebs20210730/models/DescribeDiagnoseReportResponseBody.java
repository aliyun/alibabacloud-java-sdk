// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeDiagnoseReportResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>f07b150eadfa1d7a</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("Reports")
    public java.util.List<DescribeDiagnoseReportResponseBodyReports> reports;

    /**
     * <strong>example:</strong>
     * <p>AAA478A0-BEE6-1D42-BEB6-A9CFEAD6****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDiagnoseReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiagnoseReportResponseBody self = new DescribeDiagnoseReportResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDiagnoseReportResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeDiagnoseReportResponseBody setReports(java.util.List<DescribeDiagnoseReportResponseBodyReports> reports) {
        this.reports = reports;
        return this;
    }
    public java.util.List<DescribeDiagnoseReportResponseBodyReports> getReports() {
        return this.reports;
    }

    public DescribeDiagnoseReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDiagnoseReportResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDiagnoseReportResponseBodyReportsEvents extends TeaModel {
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>DiskIOPSExceedDiskMaxLimit</p>
         */
        @NameInMap("EventName")
        public String eventName;

        /**
         * <strong>example:</strong>
         * <p>ResizeDisk</p>
         */
        @NameInMap("RecommendAction")
        public String recommendAction;

        /**
         * <strong>example:</strong>
         * <p>4096</p>
         */
        @NameInMap("RecommendParams")
        public String recommendParams;

        /**
         * <strong>example:</strong>
         * <p>Warn</p>
         */
        @NameInMap("Severity")
        public String severity;

        @NameInMap("StartTime")
        public Long startTime;

        public static DescribeDiagnoseReportResponseBodyReportsEvents build(java.util.Map<String, ?> map) throws Exception {
            DescribeDiagnoseReportResponseBodyReportsEvents self = new DescribeDiagnoseReportResponseBodyReportsEvents();
            return TeaModel.build(map, self);
        }

        public DescribeDiagnoseReportResponseBodyReportsEvents setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDiagnoseReportResponseBodyReportsEvents setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public DescribeDiagnoseReportResponseBodyReportsEvents setRecommendAction(String recommendAction) {
            this.recommendAction = recommendAction;
            return this;
        }
        public String getRecommendAction() {
            return this.recommendAction;
        }

        public DescribeDiagnoseReportResponseBodyReportsEvents setRecommendParams(String recommendParams) {
            this.recommendParams = recommendParams;
            return this;
        }
        public String getRecommendParams() {
            return this.recommendParams;
        }

        public DescribeDiagnoseReportResponseBodyReportsEvents setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

        public DescribeDiagnoseReportResponseBodyReportsEvents setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

    public static class DescribeDiagnoseReportResponseBodyReports extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>196380451****</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <strong>example:</strong>
         * <p>1727239294</p>
         */
        @NameInMap("CreationTime")
        public Long creationTime;

        /**
         * <strong>example:</strong>
         * <p>1727239294</p>
         */
        @NameInMap("DiagnoseEndTime")
        public Long diagnoseEndTime;

        /**
         * <strong>example:</strong>
         * <p>1727229294</p>
         */
        @NameInMap("DiagnoseStartTime")
        public Long diagnoseStartTime;

        /**
         * <strong>example:</strong>
         * <p>Performance</p>
         */
        @NameInMap("DiagnoseType")
        public String diagnoseType;

        @NameInMap("Events")
        public java.util.List<DescribeDiagnoseReportResponseBodyReportsEvents> events;

        /**
         * <strong>example:</strong>
         * <p>1727239295</p>
         */
        @NameInMap("FinishedTime")
        public Long finishedTime;

        /**
         * <strong>example:</strong>
         * <p>cn-zhangjiakou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>report-sag8d****</p>
         */
        @NameInMap("ReportId")
        public String reportId;

        /**
         * <strong>example:</strong>
         * <p>d-wz95ycu****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <strong>example:</strong>
         * <p>Disk</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <strong>example:</strong>
         * <p>Warn</p>
         */
        @NameInMap("Severity")
        public String severity;

        /**
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeDiagnoseReportResponseBodyReports build(java.util.Map<String, ?> map) throws Exception {
            DescribeDiagnoseReportResponseBodyReports self = new DescribeDiagnoseReportResponseBodyReports();
            return TeaModel.build(map, self);
        }

        public DescribeDiagnoseReportResponseBodyReports setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public DescribeDiagnoseReportResponseBodyReports setCreationTime(Long creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public Long getCreationTime() {
            return this.creationTime;
        }

        public DescribeDiagnoseReportResponseBodyReports setDiagnoseEndTime(Long diagnoseEndTime) {
            this.diagnoseEndTime = diagnoseEndTime;
            return this;
        }
        public Long getDiagnoseEndTime() {
            return this.diagnoseEndTime;
        }

        public DescribeDiagnoseReportResponseBodyReports setDiagnoseStartTime(Long diagnoseStartTime) {
            this.diagnoseStartTime = diagnoseStartTime;
            return this;
        }
        public Long getDiagnoseStartTime() {
            return this.diagnoseStartTime;
        }

        public DescribeDiagnoseReportResponseBodyReports setDiagnoseType(String diagnoseType) {
            this.diagnoseType = diagnoseType;
            return this;
        }
        public String getDiagnoseType() {
            return this.diagnoseType;
        }

        public DescribeDiagnoseReportResponseBodyReports setEvents(java.util.List<DescribeDiagnoseReportResponseBodyReportsEvents> events) {
            this.events = events;
            return this;
        }
        public java.util.List<DescribeDiagnoseReportResponseBodyReportsEvents> getEvents() {
            return this.events;
        }

        public DescribeDiagnoseReportResponseBodyReports setFinishedTime(Long finishedTime) {
            this.finishedTime = finishedTime;
            return this;
        }
        public Long getFinishedTime() {
            return this.finishedTime;
        }

        public DescribeDiagnoseReportResponseBodyReports setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDiagnoseReportResponseBodyReports setReportId(String reportId) {
            this.reportId = reportId;
            return this;
        }
        public String getReportId() {
            return this.reportId;
        }

        public DescribeDiagnoseReportResponseBodyReports setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeDiagnoseReportResponseBodyReports setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribeDiagnoseReportResponseBodyReports setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

        public DescribeDiagnoseReportResponseBodyReports setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
