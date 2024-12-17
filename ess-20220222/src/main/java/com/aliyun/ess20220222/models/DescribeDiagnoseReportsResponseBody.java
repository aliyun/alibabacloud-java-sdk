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
     * <p>The diagnostic reports.</p>
     */
    @NameInMap("Reports")
    public java.util.List<DescribeDiagnoseReportsResponseBodyReports> reports;

    /**
     * <p>The ID of the request.</p>
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
         * <li>AccountArrearage: Checks whether your Alibaba Cloud account has overdue payments.</li>
         * <li>AccountNotEnoughBalance: Checks whether the balance of your Alibaba Cloud account at the China site (aliyun.com) is greater than or equal to CNY 100.</li>
         * <li>ElasticStrength: Checks whether the instance types that are specified in the scaling configuration are sufficient.</li>
         * <li>VSwitch: Checks whether a specific vSwitch can work as expected. For example, if a vSwitch is deleted, the vSwitch cannot provide services and an exception occurs.</li>
         * <li>SecurityGroup: Checks whether a specific security group can work as expected. For example, if a security group is deleted, the security group cannot provide services and an exception occurs.</li>
         * <li>KeyPair: Checks whether the key pair is available. If the specified key pair is deleted, specify another key pair for the scaling group.</li>
         * <li>SlbBackendServerQuota: Checks whether the number of ECS instances that are added to the default server group and the vServer groups of the SLB instances associated with the scaling group has reached the upper limit.</li>
         * <li>AlbBackendServerQuota: Checks whether the number of ECS instances that are added to the backend server groups of the ALB instances associated with the scaling group has reached the upper limit.</li>
         * <li>NlbBackendServerQuota: Checks whether the number of ECS instances that are added to the backend server groups of the NLB instances associated with the scaling group has reached the upper limit.</li>
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
         * <li>VSwitchIdNotFound: The vSwitch does not exist.</li>
         * <li>SecurityGroupNotFound: The security group does not exist.</li>
         * <li>KeyPairNotFound: The key pair does not exist.</li>
         * <li>SlbBackendServerQuotaExceeded: The number of ECS instances that are added to the default server group and the vServer groups of the SLB instances associated with the scaling group has reached the upper limit.</li>
         * <li>AlbBackendServerQuotaExceeded: The number of ECS instances that are attached to the ALB instances of the scaling group has reached the upper limit.</li>
         * <li>NlbBackendServerQuotaExceeded: The number of ECS instances that are attached to the NLB instances of the scaling group has reached the upper limit.</li>
         * <li>AccountArrearage: Your account has overdue payments.</li>
         * <li>AccountNotEnoughBalance: The balance of your Alibaba Cloud account is less than CNY 100.</li>
         * <li>ElasticStrengthAlert: The inventory levels are lower than expected.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VSwitchIdNotFound</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The ID of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-280ih****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The status of the diagnostic item. Valid values:</p>
         * <ul>
         * <li>Normal: The diagnostic result is normal.</li>
         * <li>Warn: The diagnostic result is warning.</li>
         * <li>Critical: The diagnostic result is critical.</li>
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
         * <p>The time when the diagnostic report was created.</p>
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
         * <p>The status of the diagnostic item. Only the severe status is displayed in the diagnostic report. Valid values:</p>
         * <ul>
         * <li>Normal: The diagnostic result is normal.</li>
         * <li>Warn: The diagnostic result is warning.</li>
         * <li>Critical: The diagnostic result is critical.</li>
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
         * <li>processing: The diagnosis is in progress.</li>
         * <li>Finished: The diagnosis is complete.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        @NameInMap("ProcessStatus")
        public String processStatus;

        /**
         * <p>The ID of the region.</p>
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
