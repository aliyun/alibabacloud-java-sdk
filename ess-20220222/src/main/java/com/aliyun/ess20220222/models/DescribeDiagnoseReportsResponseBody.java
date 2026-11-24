// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeDiagnoseReportsResponseBody extends TeaModel {
    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The list of diagnostic reports.</p>
     */
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
     * <p>The total number of diagnostic reports.</p>
     * 
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
         * <p>The type of the diagnostic item. Valid values:</p>
         * <ul>
         * <li><p>AccountArrearage: account overdue payment. Checks whether the user account has overdue payments.</p>
         * </li>
         * <li><p>AccountNotEnoughBalance: insufficient account balance. Checks whether the balance of a user account on the China site is greater than or equal to CNY 100.</p>
         * </li>
         * <li><p>ElasticStrength: inventory health. Checks the inventory health of the instance type configured for the scaling group.</p>
         * </li>
         * <li><p>VSwitch: vSwitch status. Checks whether the vSwitch is active, such as whether it is deleted.</p>
         * </li>
         * <li><p>SecurityGroup: security group status. Checks whether the security group is active, such as whether it is deleted.</p>
         * </li>
         * <li><p>KeyPair: key pair status. Checks whether the key pair is active, such as whether it is deleted.</p>
         * </li>
         * <li><p>SlbBackendServerQuota: number of instances mounted to the SLB instance in the scaling group. Checks whether the number of ECS instances mounted to the default server group and virtual service groups of the SLB instance exceeds the quota.</p>
         * </li>
         * <li><p>AlbBackendServerQuota: number of instances mounted to the ALB instance in the scaling group. Checks whether the number of ECS instances mounted to the server groups of the ALB instance exceeds the quota.</p>
         * </li>
         * <li><p>NlbBackendServerQuota: number of instances mounted to the NLB instance in the scaling group. Checks whether the number of ECS instances mounted to the server groups of the NLB instance exceeds the quota.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AccountArrearage</p>
         */
        @NameInMap("DiagnoseType")
        public String diagnoseType;

        /**
         * <p>The error code of the diagnostic item. Valid values:</p>
         * <ul>
         * <li><p>VSwitchIdNotFound: the vSwitch does not exist.</p>
         * </li>
         * <li><p>SecurityGroupNotFound: the security group does not exist.</p>
         * </li>
         * <li><p>KeyPairNotFound: the key pair does not exist.</p>
         * </li>
         * <li><p>SlbBackendServerQuotaExceeded: the number of ECS instances mounted to the default server group and virtual service groups of the SLB instance exceeds the quota.</p>
         * </li>
         * <li><p>AlbBackendServerQuotaExceeded: the number of ECS instances mounted to the server groups of the ALB instance exceeds the quota.</p>
         * </li>
         * <li><p>NlbBackendServerQuotaExceeded: the number of ECS instances mounted to the server groups of the NLB instance exceeds the quota.</p>
         * </li>
         * <li><p>AccountArrearage: the account has overdue payments.</p>
         * </li>
         * <li><p>AccountNotEnoughBalance: the account balance is insufficient (less than CNY 100).</p>
         * </li>
         * <li><p>ElasticStrengthAlert: the inventory health is poor.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VSwitchIdNotFound</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-280ih****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The diagnostic status of the diagnostic item. Valid values:</p>
         * <ul>
         * <li><p>Normal: the diagnostic result is normal.</p>
         * </li>
         * <li><p>Warn: the diagnostic result is a warning.</p>
         * </li>
         * <li><p>Critical: the diagnostic result is critical.</p>
         * </li>
         * </ul>
         * 
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
         * <p>The time when the diagnostic report was created. The time is displayed in UTC and follows the ISO 8601 standard in the YYYY-MM-DDTHH:mm:ssZ format.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-08-23T02:22:30Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The details of the diagnostic report.</p>
         */
        @NameInMap("Details")
        public java.util.List<DescribeDiagnoseReportsResponseBodyReportsDetails> details;

        /**
         * <p>The diagnostic status. The value is the most severe status among the diagnostic details. Valid values:</p>
         * <ul>
         * <li><p>Normal: the diagnostic result is normal.</p>
         * </li>
         * <li><p>Warn: the diagnostic result is a warning.</p>
         * </li>
         * <li><p>Critical: the diagnostic result is critical.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("DiagnoseStatus")
        public String diagnoseStatus;

        /**
         * <p>The status of the diagnostic report. Valid values:</p>
         * <ul>
         * <li><p>Processing: in progress.</p>
         * </li>
         * <li><p>Finished: completed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        @NameInMap("ProcessStatus")
        public String processStatus;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-qingdao</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the diagnostic report.</p>
         * 
         * <strong>example:</strong>
         * <p>dr-bp14p0cjp7wvjob5l6hk</p>
         */
        @NameInMap("ReportId")
        public String reportId;

        /**
         * <p>The ID of the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>asg-bp124uve5iph3*****</p>
         */
        @NameInMap("ScalingGroupId")
        public String scalingGroupId;

        /**
         * <p>The user ID of the scaling group.</p>
         * 
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
