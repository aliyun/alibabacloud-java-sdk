// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeDiagnoseReportsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Reports")
    public java.util.List<DescribeDiagnoseReportsResponseBodyReports> reports;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>ECA123C6-107B-5F70-A177-740A7224C996</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDiagnoseReportsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiagnoseReportsResponseBody self = new DescribeDiagnoseReportsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDiagnoseReportsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDiagnoseReportsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDiagnoseReportsResponseBody setReports(java.util.List<DescribeDiagnoseReportsResponseBodyReports> reports) {
        this.reports = reports;
        return this;
    }
    public java.util.List<DescribeDiagnoseReportsResponseBodyReports> getReports() {
        return this.reports;
    }

    public DescribeDiagnoseReportsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDiagnoseReportsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDiagnoseReportsResponseBodyReportsDetails extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>AccountArrearage</p>
         */
        @NameInMap("DiagnoseType")
        public String diagnoseType;

        /**
         * <strong>example:</strong>
         * <p>VSwitchIdNotFound</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <strong>example:</strong>
         * <p>sg-280ih****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeDiagnoseReportsResponseBodyReportsDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeDiagnoseReportsResponseBodyReportsDetails self = new DescribeDiagnoseReportsResponseBodyReportsDetails();
            return TeaModel.build(map, self);
        }

        public DescribeDiagnoseReportsResponseBodyReportsDetails setDiagnoseType(String diagnoseType) {
            this.diagnoseType = diagnoseType;
            return this;
        }
        public String getDiagnoseType() {
            return this.diagnoseType;
        }

        public DescribeDiagnoseReportsResponseBodyReportsDetails setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeDiagnoseReportsResponseBodyReportsDetails setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeDiagnoseReportsResponseBodyReportsDetails setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeDiagnoseReportsResponseBodyReports extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2024-08-23T02:22:30Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Details")
        public java.util.List<DescribeDiagnoseReportsResponseBodyReportsDetails> details;

        /**
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("DiagnoseStatus")
        public String diagnoseStatus;

        /**
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        @NameInMap("ProcessStatus")
        public String processStatus;

        /**
         * <strong>example:</strong>
         * <p>cn-qingdao</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>dr-bp14p0cjp7wvjob5l6hk</p>
         */
        @NameInMap("ReportId")
        public String reportId;

        /**
         * <strong>example:</strong>
         * <p>asg-bp124uve5iph3*****</p>
         */
        @NameInMap("ScalingGroupId")
        public String scalingGroupId;

        /**
         * <strong>example:</strong>
         * <p>161456884*******</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static DescribeDiagnoseReportsResponseBodyReports build(java.util.Map<String, ?> map) throws Exception {
            DescribeDiagnoseReportsResponseBodyReports self = new DescribeDiagnoseReportsResponseBodyReports();
            return TeaModel.build(map, self);
        }

        public DescribeDiagnoseReportsResponseBodyReports setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeDiagnoseReportsResponseBodyReports setDetails(java.util.List<DescribeDiagnoseReportsResponseBodyReportsDetails> details) {
            this.details = details;
            return this;
        }
        public java.util.List<DescribeDiagnoseReportsResponseBodyReportsDetails> getDetails() {
            return this.details;
        }

        public DescribeDiagnoseReportsResponseBodyReports setDiagnoseStatus(String diagnoseStatus) {
            this.diagnoseStatus = diagnoseStatus;
            return this;
        }
        public String getDiagnoseStatus() {
            return this.diagnoseStatus;
        }

        public DescribeDiagnoseReportsResponseBodyReports setProcessStatus(String processStatus) {
            this.processStatus = processStatus;
            return this;
        }
        public String getProcessStatus() {
            return this.processStatus;
        }

        public DescribeDiagnoseReportsResponseBodyReports setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDiagnoseReportsResponseBodyReports setReportId(String reportId) {
            this.reportId = reportId;
            return this;
        }
        public String getReportId() {
            return this.reportId;
        }

        public DescribeDiagnoseReportsResponseBodyReports setScalingGroupId(String scalingGroupId) {
            this.scalingGroupId = scalingGroupId;
            return this;
        }
        public String getScalingGroupId() {
            return this.scalingGroupId;
        }

        public DescribeDiagnoseReportsResponseBodyReports setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
