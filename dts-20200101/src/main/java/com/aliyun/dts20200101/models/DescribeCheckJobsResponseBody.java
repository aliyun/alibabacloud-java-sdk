// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeCheckJobsResponseBody extends TeaModel {
    /**
     * <p>Item information check.</p>
     */
    @NameInMap("CheckJobs")
    public java.util.List<DescribeCheckJobsResponseBodyCheckJobs> checkJobs;

    /**
     * <p>Dynamic error code, this parameter will be deprecated soon.</p>
     * 
     * <strong>example:</strong>
     * <p>403</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <p>Dynamic error message, used to replace the <strong>%s</strong> in the <strong>errmessage</strong> return parameter. If <strong>errmessage</strong> returns <strong>thevalueofinputparameter%sisnotvalid</strong>, and <strong>dynamicmessage</strong> returns <em>[1,2,3]</em>, it indicates that the request parameter <strong>dtsjobid</strong> is invalid.</p>
     * 
     * <strong>example:</strong>
     * <p>present environment is not support,so skip.</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>Error code returned when the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>InternalError</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>Error message returned when the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>The request processing has failed due to some unknown error.</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>Status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The maximum number of records that can be displayed on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageRecordCount")
    public Long pageRecordCount;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FC1D920B-AB89-52A9-AA5F-AA724C4205E8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>Total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
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
        /**
         * <p>Billing type, return values: - <strong>POSTPAY</strong>: Pay-as-you-go (postpaid). - <strong>PREPAY</strong>: Subscription (prepaid).</p>
         * 
         * <strong>example:</strong>
         * <p>POSTPAY</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>checkpoint</p>
         * 
         * <strong>example:</strong>
         * <p>1111****</p>
         */
        @NameInMap("CheckPoint")
        public Long checkPoint;

        /**
         * <p>Data validation method, with values:</p>
         * <ul>
         * <li><strong>1</strong>: Full validation. - <strong>2</strong>: Incremental validation.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CheckType")
        public Integer checkType;

        /**
         * <p>Number of rows with data inconsistency</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DiffCount")
        public Long diffCount;

        /**
         * <p>Synchronization initialization progress, in percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DiffSum")
        public Long diffSum;

        /**
         * <p>Migration, synchronization, or subscription instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dtsz8tc99sy2158b36</p>
         */
        @NameInMap("DtsInstanceID")
        public String dtsInstanceID;

        /**
         * <p>Migration, synchronization, or subscription task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>n08o6si4q338b1x</p>
         */
        @NameInMap("DtsJobId")
        public String dtsJobId;

        /**
         * <p>The number of data rows in the table that have completed validation.</p>
         * 
         * <strong>example:</strong>
         * <p>15094</p>
         */
        @NameInMap("FinishCount")
        public Long finishCount;

        /**
         * <p>DTS task ID. In most cases, there is no need to set this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>c3d12dii27t632g</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>Instance specification.</p>
         * 
         * <strong>example:</strong>
         * <p>SMALL</p>
         */
        @NameInMap("InstanceClass")
        public String instanceClass;

        /**
         * <p>Check the name of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>dtstest</p>
         */
        @NameInMap("JobName")
        public String jobName;

        /**
         * <p>Task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>as0e1ks426bq3z0</p>
         */
        @NameInMap("JobStepId")
        public String jobStepId;

        /**
         * <p>This parameter will be deprecated.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("ParentJobType")
        public String parentJobType;

        /**
         * <p>Region ID to which it belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>Check result, return values: -<strong>0</strong>: Check passed -<strong>1</strong>: Check failed</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>Verify the total number of rows in the data.</p>
         * 
         * <strong>example:</strong>
         * <p>159</p>
         */
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
