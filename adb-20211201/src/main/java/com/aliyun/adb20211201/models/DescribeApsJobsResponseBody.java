// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeApsJobsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("APSJobs")
    public java.util.List<DescribeApsJobsResponseBodyAPSJobs> APSJobs;

    /**
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <strong>example:</strong>
     * <p><strong><strong><strong>-7F9D-5DBD-993E-</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
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
         * <strong>example:</strong>
         * <p>aps-******</p>
         */
        @NameInMap("ApsJobId")
        public String apsJobId;

        /**
         * <strong>example:</strong>
         * <p>data-sync-******</p>
         */
        @NameInMap("ApsJobName")
        public String apsJobName;

        /**
         * <strong>example:</strong>
         * <p>2022-06-28 15:00:04</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Delay")
        public Long delay;

        /**
         * <strong>example:</strong>
         * <p>amv-*******</p>
         */
        @NameInMap("DestinationInstanceID")
        public String destinationInstanceID;

        /**
         * <strong>example:</strong>
         * <p>OK</p>
         */
        @NameInMap("ErrMessage")
        public String errMessage;

        @NameInMap("Projress")
        public String projress;

        /**
         * <strong>example:</strong>
         * <p>pc-******</p>
         */
        @NameInMap("SourceInstanceID")
        public String sourceInstanceID;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("Status")
        public String status;

        /**
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
