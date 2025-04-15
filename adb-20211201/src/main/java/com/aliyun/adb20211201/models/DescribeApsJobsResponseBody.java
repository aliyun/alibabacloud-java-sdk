// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeApsJobsResponseBody extends TeaModel {
    /**
     * <p>The queried APS jobs.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("APSJobs")
    public java.util.List<DescribeApsJobsResponseBodyAPSJobs> APSJobs;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The status code. A value of 200 indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The returned message. Valid values:</p>
     * <ul>
     * <li>If the request was successful, a success message is returned.****</li>
     * <li>If the request failed, an error message is returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>-7F9D-5DBD-993E-</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static DescribeApsJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApsJobsResponseBody self = new DescribeApsJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApsJobsResponseBody setAPSJobs(java.util.List<DescribeApsJobsResponseBodyAPSJobs> APSJobs) {
        this.APSJobs = APSJobs;
        return this;
    }
    public java.util.List<DescribeApsJobsResponseBodyAPSJobs> getAPSJobs() {
        return this.APSJobs;
    }

    public DescribeApsJobsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeApsJobsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeApsJobsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeApsJobsResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeApsJobsResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeApsJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApsJobsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeApsJobsResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeApsJobsResponseBodyAPSJobs extends TeaModel {
        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>aps-******</p>
         */
        @NameInMap("ApsJobId")
        public String apsJobId;

        /**
         * <p>The name of the APS job.</p>
         * 
         * <strong>example:</strong>
         * <p>data-sync-******</p>
         */
        @NameInMap("ApsJobName")
        public String apsJobName;

        /**
         * <p>The time when the APS job was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-06-28 15:00:04</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The synchronization latency.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Delay")
        public Long delay;

        /**
         * <p>The destination cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-*******</p>
         */
        @NameInMap("DestinationInstanceID")
        public String destinationInstanceID;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        @NameInMap("ErrMessage")
        public String errMessage;

        /**
         * <p>The progress.</p>
         * 
         * <strong>example:</strong>
         * <p>30: The progress is 30%.</p>
         */
        @NameInMap("Projress")
        public String projress;

        /**
         * <p>The ID of the source instance or cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-******</p>
         */
        @NameInMap("SourceInstanceID")
        public String sourceInstanceID;

        /**
         * <p>The status of the APS job.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The status of the task.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("SubStatus")
        public String subStatus;

        public static DescribeApsJobsResponseBodyAPSJobs build(java.util.Map<String, ?> map) throws Exception {
            DescribeApsJobsResponseBodyAPSJobs self = new DescribeApsJobsResponseBodyAPSJobs();
            return TeaModel.build(map, self);
        }

        public DescribeApsJobsResponseBodyAPSJobs setApsJobId(String apsJobId) {
            this.apsJobId = apsJobId;
            return this;
        }
        public String getApsJobId() {
            return this.apsJobId;
        }

        public DescribeApsJobsResponseBodyAPSJobs setApsJobName(String apsJobName) {
            this.apsJobName = apsJobName;
            return this;
        }
        public String getApsJobName() {
            return this.apsJobName;
        }

        public DescribeApsJobsResponseBodyAPSJobs setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeApsJobsResponseBodyAPSJobs setDelay(Long delay) {
            this.delay = delay;
            return this;
        }
        public Long getDelay() {
            return this.delay;
        }

        public DescribeApsJobsResponseBodyAPSJobs setDestinationInstanceID(String destinationInstanceID) {
            this.destinationInstanceID = destinationInstanceID;
            return this;
        }
        public String getDestinationInstanceID() {
            return this.destinationInstanceID;
        }

        public DescribeApsJobsResponseBodyAPSJobs setErrMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }
        public String getErrMessage() {
            return this.errMessage;
        }

        public DescribeApsJobsResponseBodyAPSJobs setProjress(String projress) {
            this.projress = projress;
            return this;
        }
        public String getProjress() {
            return this.projress;
        }

        public DescribeApsJobsResponseBodyAPSJobs setSourceInstanceID(String sourceInstanceID) {
            this.sourceInstanceID = sourceInstanceID;
            return this;
        }
        public String getSourceInstanceID() {
            return this.sourceInstanceID;
        }

        public DescribeApsJobsResponseBodyAPSJobs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeApsJobsResponseBodyAPSJobs setSubStatus(String subStatus) {
            this.subStatus = subStatus;
            return this;
        }
        public String getSubStatus() {
            return this.subStatus;
        }

    }

}
