// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeDiagnoseReportResponseBody extends TeaModel {
    /**
     * <p>The pagination token returned in this call.</p>
     * 
     * <strong>example:</strong>
     * <p>f07b150eadfa1d7a</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The list of diagnostic reports.</p>
     */
    @NameInMap("Reports")
    public java.util.List<DescribeDiagnoseReportResponseBodyReports> reports;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AAA478A0-BEE6-1D42-BEB6-A9CFEAD6****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
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
        /**
         * <p>The event description.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The issue name. Valid values:</p>
         * <ul>
         * <li>NoSnapshot: data protection</li>
         * <li>BurstIOTriggered: I/O burst</li>
         * <li>CostOptimizationNeeded: cost optimization</li>
         * <li>DiskSpecNotMatchedWithInstance: instance and cloud disk specification mismatch</li>
         * <li>DiskIONo4kAligned: non-4K-aligned read/write</li>
         * <li>DiskIOHang: IOHang occurred on the cloud disk</li>
         * <li>InstanceIOPSExceedInstanceMaxLimit: instance IOPS reached the upper limit</li>
         * <li>InstanceBPSExceedInstanceMaxLimit: instance BPS reached the upper limit</li>
         * <li>DiskIOPSExceedInstanceMaxLimit: cloud disk IOPS reached the instance upper limit</li>
         * <li>DiskBPSExceedInstanceMaxLimit: cloud disk BPS reached the instance upper limit</li>
         * <li>DiskIOPSExceedDiskMaxLimit: cloud disk IOPS reached the cloud disk upper limit</li>
         * <li>DiskBPSExceedDiskMaxLimit: cloud disk BPS reached the cloud disk upper limit</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DiskIOPSExceedDiskMaxLimit</p>
         */
        @NameInMap("EventName")
        public String eventName;

        /**
         * <p>The recommended action after the event occurs. Valid values:</p>
         * <ul>
         * <li>ModifyDiskSpec: change cloud disk specifications</li>
         * <li>CreateSnapshot: create a snapshot</li>
         * <li>ResizeDisk: expand the cloud disk</li>
         * <li>AdjustProvision: adjust provisioned performance</li>
         * <li>ModifyInstanceSpec: change instance specifications</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ResizeDisk</p>
         */
        @NameInMap("RecommendAction")
        public String recommendAction;

        /**
         * <p>The parameters for the recommended action after the event occurs.</p>
         * 
         * <strong>example:</strong>
         * <p>4096</p>
         */
        @NameInMap("RecommendParams")
        public String recommendParams;

        /**
         * <p>The severity level of the diagnosed issue. The severity levels in ascending order are:</p>
         * <ul>
         * <li>Info: Associated information that may be related to an anomaly.</li>
         * <li>Warn: Associated information that may cause an anomaly.</li>
         * <li>Critical: A critical anomaly exists.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Warn</p>
         */
        @NameInMap("Severity")
        public String severity;

        /**
         * <p>The start timestamp of the event, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1755756214000</p>
         */
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
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>196380451****</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <p>The time when the diagnostic report was created, in Unix/POSIX timestamp (seconds).</p>
         * 
         * <strong>example:</strong>
         * <p>1727239294</p>
         */
        @NameInMap("CreationTime")
        public Long creationTime;

        /**
         * <p>The end timestamp of the resource diagnosis.</p>
         * 
         * <strong>example:</strong>
         * <p>1727239294</p>
         */
        @NameInMap("DiagnoseEndTime")
        public Long diagnoseEndTime;

        /**
         * <p>The start timestamp of the resource diagnosis.</p>
         * 
         * <strong>example:</strong>
         * <p>1727229294</p>
         */
        @NameInMap("DiagnoseStartTime")
        public Long diagnoseStartTime;

        /**
         * <p>The type of diagnosis.</p>
         * 
         * <strong>example:</strong>
         * <p>Performance</p>
         */
        @NameInMap("DiagnoseType")
        public String diagnoseType;

        /**
         * <p>The list of diagnosed issues.</p>
         */
        @NameInMap("Events")
        public java.util.List<DescribeDiagnoseReportResponseBodyReportsEvents> events;

        /**
         * <p>The time when the diagnostic report was completed, in Unix/POSIX timestamp (seconds).</p>
         * 
         * <strong>example:</strong>
         * <p>1727239295</p>
         */
        @NameInMap("FinishedTime")
        public Long finishedTime;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-zhangjiakou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The diagnostic report ID.</p>
         * 
         * <strong>example:</strong>
         * <p>report-sag8d****</p>
         */
        @NameInMap("ReportId")
        public String reportId;

        /**
         * <p>The resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>d-wz95ycu****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The resource type. Valid values:</p>
         * <ul>
         * <li>Disk</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Disk</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The severity level of the diagnosis. The severity levels in ascending order are:</p>
         * <ul>
         * <li>Info: Associated information that may be related to an anomaly.</li>
         * <li>Warn: Associated information that may cause an anomaly.</li>
         * <li>Critical: A critical anomaly exists.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Warn</p>
         */
        @NameInMap("Severity")
        public String severity;

        /**
         * <p>The status of the diagnostic report. Valid values:</p>
         * <ul>
         * <li>Running</li>
         * <li>Success</li>
         * <li>TimeOut</li>
         * <li>Fail</li>
         * </ul>
         * <p>The Severity and Events fields are valid only when Status is set to Success.</p>
         * 
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
