// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeCheckJobsResponseBody extends TeaModel {
    @NameInMap("CheckJobs")
    public java.util.List<DescribeCheckJobsResponseBodyCheckJobs> checkJobs;

    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("ErrCode")
    public String errCode;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageRecordCount")
    public Long pageRecordCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalRecordCount")
    public Long totalRecordCount;

    public static DescribeCheckJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCheckJobsResponseBody self = new DescribeCheckJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCheckJobsResponseBody setCheckJobs(java.util.List<DescribeCheckJobsResponseBodyCheckJobs> checkJobs) {
        this.checkJobs = checkJobs;
        return this;
    }
    public java.util.List<DescribeCheckJobsResponseBodyCheckJobs> getCheckJobs() {
        return this.checkJobs;
    }

    public DescribeCheckJobsResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public DescribeCheckJobsResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public DescribeCheckJobsResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeCheckJobsResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeCheckJobsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeCheckJobsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCheckJobsResponseBody setPageRecordCount(Long pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Long getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeCheckJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCheckJobsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeCheckJobsResponseBody setTotalRecordCount(Long totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Long getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeCheckJobsResponseBodyCheckJobs extends TeaModel {
        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("CheckPoint")
        public Long checkPoint;

        @NameInMap("CheckType")
        public Integer checkType;

        @NameInMap("DiffCount")
        public Long diffCount;

        @NameInMap("DiffSum")
        public Long diffSum;

        @NameInMap("DtsInstanceID")
        public String dtsInstanceID;

        @NameInMap("DtsJobId")
        public String dtsJobId;

        @NameInMap("FinishCount")
        public Long finishCount;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("InstanceClass")
        public String instanceClass;

        @NameInMap("JobName")
        public String jobName;

        @NameInMap("JobStepId")
        public String jobStepId;

        @NameInMap("ParentJobType")
        public String parentJobType;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static DescribeCheckJobsResponseBodyCheckJobs build(java.util.Map<String, ?> map) throws Exception {
            DescribeCheckJobsResponseBodyCheckJobs self = new DescribeCheckJobsResponseBodyCheckJobs();
            return TeaModel.build(map, self);
        }

        public DescribeCheckJobsResponseBodyCheckJobs setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeCheckJobsResponseBodyCheckJobs setCheckPoint(Long checkPoint) {
            this.checkPoint = checkPoint;
            return this;
        }
        public Long getCheckPoint() {
            return this.checkPoint;
        }

        public DescribeCheckJobsResponseBodyCheckJobs setCheckType(Integer checkType) {
            this.checkType = checkType;
            return this;
        }
        public Integer getCheckType() {
            return this.checkType;
        }

        public DescribeCheckJobsResponseBodyCheckJobs setDiffCount(Long diffCount) {
            this.diffCount = diffCount;
            return this;
        }
        public Long getDiffCount() {
            return this.diffCount;
        }

        public DescribeCheckJobsResponseBodyCheckJobs setDiffSum(Long diffSum) {
            this.diffSum = diffSum;
            return this;
        }
        public Long getDiffSum() {
            return this.diffSum;
        }

        public DescribeCheckJobsResponseBodyCheckJobs setDtsInstanceID(String dtsInstanceID) {
            this.dtsInstanceID = dtsInstanceID;
            return this;
        }
        public String getDtsInstanceID() {
            return this.dtsInstanceID;
        }

        public DescribeCheckJobsResponseBodyCheckJobs setDtsJobId(String dtsJobId) {
            this.dtsJobId = dtsJobId;
            return this;
        }
        public String getDtsJobId() {
            return this.dtsJobId;
        }

        public DescribeCheckJobsResponseBodyCheckJobs setFinishCount(Long finishCount) {
            this.finishCount = finishCount;
            return this;
        }
        public Long getFinishCount() {
            return this.finishCount;
        }

        public DescribeCheckJobsResponseBodyCheckJobs setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeCheckJobsResponseBodyCheckJobs setInstanceClass(String instanceClass) {
            this.instanceClass = instanceClass;
            return this;
        }
        public String getInstanceClass() {
            return this.instanceClass;
        }

        public DescribeCheckJobsResponseBodyCheckJobs setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public DescribeCheckJobsResponseBodyCheckJobs setJobStepId(String jobStepId) {
            this.jobStepId = jobStepId;
            return this;
        }
        public String getJobStepId() {
            return this.jobStepId;
        }

        public DescribeCheckJobsResponseBodyCheckJobs setParentJobType(String parentJobType) {
            this.parentJobType = parentJobType;
            return this;
        }
        public String getParentJobType() {
            return this.parentJobType;
        }

        public DescribeCheckJobsResponseBodyCheckJobs setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeCheckJobsResponseBodyCheckJobs setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeCheckJobsResponseBodyCheckJobs setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
