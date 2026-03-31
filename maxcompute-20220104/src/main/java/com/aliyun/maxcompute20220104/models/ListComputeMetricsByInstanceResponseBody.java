// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListComputeMetricsByInstanceResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("data")
    public ListComputeMetricsByInstanceResponseBodyData data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>OBJECT_NOT_EXIST</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>This object does not exist.</p>
     */
    @NameInMap("errorMsg")
    public String errorMsg;

    /**
     * <p>The HTTP status code.</p>
     * <ul>
     * <li>1xx: informational response. The request is received and is being processed.</li>
     * <li>2xx: success. The request is successfully received, understood, and accepted by the server.</li>
     * <li>3xx: redirection. The request is redirected, and further actions are required to complete the request.</li>
     * <li>4xx: client error. The request contains invalid request parameters or syntaxes, or specific request conditions cannot be met.</li>
     * <li>5xx: server error. The server cannot meet requirements due to other reasons.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpCode")
    public Integer httpCode;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0bc059b717363029839908920ea631</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListComputeMetricsByInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListComputeMetricsByInstanceResponseBody self = new ListComputeMetricsByInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListComputeMetricsByInstanceResponseBody setData(ListComputeMetricsByInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListComputeMetricsByInstanceResponseBodyData getData() {
        return this.data;
    }

    public ListComputeMetricsByInstanceResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListComputeMetricsByInstanceResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ListComputeMetricsByInstanceResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public ListComputeMetricsByInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListComputeMetricsByInstanceResponseBodyDataInstanceComputeMetrics extends TeaModel {
        /**
         * <p>The end time of the job execution.</p>
         * 
         * <strong>example:</strong>
         * <p>1710432000000</p>
         */
        @NameInMap("endTime")
        public Long endTime;

        /**
         * <p>The job(instance) ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20240730****ddlr</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The owner of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN$7632***@aliyun.com</p>
         */
        @NameInMap("jobOwner")
        public String jobOwner;

        /**
         * <p>The name of the project.</p>
         * 
         * <strong>example:</strong>
         * <p>odps_porject</p>
         */
        @NameInMap("projectName")
        public String projectName;

        /**
         * <p>The signature of the SQL job.</p>
         * 
         * <strong>example:</strong>
         * <p>pqrs12345tuv</p>
         */
        @NameInMap("signature")
        public String signature;

        /**
         * <p>Specifications Type, specifies the resource package that you select when you purchase the MaxCompute service.</p>
         * <ul>
         * <li><p>OdpsStandard: the pay-as-you-go resource package.</p>
         * </li>
         * <li><p>OdpsSpot: the pay-as-you-go spot resource package.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OdpsStandard</p>
         */
        @NameInMap("specCode")
        public String specCode;

        /**
         * <p>The submission time of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>1610432000000</p>
         */
        @NameInMap("submitTime")
        public Long submitTime;

        /**
         * <p>Metering types.</p>
         * <ul>
         * <li><p>ComputationSql: the metering data of SQL jobs that involve internal tables.</p>
         * </li>
         * <li><p>ComputationSqlOTS: the metering data of SQL jobs that involve Tablestore external tables.</p>
         * </li>
         * <li><p>ComputationSqlOSS: the metering data of SQL jobs that involve OSS external tables.</p>
         * </li>
         * <li><p>MapReduce: the metering data of MapReduce jobs.</p>
         * </li>
         * <li><p>spark: the metering data of Spark jobs.</p>
         * </li>
         * <li><p>mars: the metering data of Mars jobs.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ComputationSql</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The unit of computing resource usage</p>
         * 
         * <strong>example:</strong>
         * <p>GB</p>
         */
        @NameInMap("unit")
        public String unit;

        /**
         * <p>The computing resource usage is calculated based on the following items:</p>
         * <ul>
         * <li><p>Amount of scanned data in the unit of GB. For the jobs whose metering types are ComputationSql, ComputationSqlOTS, or ComputationSqlOSS, they are billed based on the amount of scanned data. The computing resource usage of such a job is calculated by using the following formula: Amount of scanned data × Complexity. The complexity is fixed at 1 for the jobs whose metering types are ComputationSqlOTS or ComputationSqlOSS.</p>
         * </li>
         * <li><p>CU-hours. For the jobs whose metering types are MapReduce, spark, or mars, they are billed based on CU-hours.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("usage")
        public Double usage;

        public static ListComputeMetricsByInstanceResponseBodyDataInstanceComputeMetrics build(java.util.Map<String, ?> map) throws Exception {
            ListComputeMetricsByInstanceResponseBodyDataInstanceComputeMetrics self = new ListComputeMetricsByInstanceResponseBodyDataInstanceComputeMetrics();
            return TeaModel.build(map, self);
        }

        public ListComputeMetricsByInstanceResponseBodyDataInstanceComputeMetrics setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListComputeMetricsByInstanceResponseBodyDataInstanceComputeMetrics setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListComputeMetricsByInstanceResponseBodyDataInstanceComputeMetrics setJobOwner(String jobOwner) {
            this.jobOwner = jobOwner;
            return this;
        }
        public String getJobOwner() {
            return this.jobOwner;
        }

        public ListComputeMetricsByInstanceResponseBodyDataInstanceComputeMetrics setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListComputeMetricsByInstanceResponseBodyDataInstanceComputeMetrics setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

        public ListComputeMetricsByInstanceResponseBodyDataInstanceComputeMetrics setSpecCode(String specCode) {
            this.specCode = specCode;
            return this;
        }
        public String getSpecCode() {
            return this.specCode;
        }

        public ListComputeMetricsByInstanceResponseBodyDataInstanceComputeMetrics setSubmitTime(Long submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public Long getSubmitTime() {
            return this.submitTime;
        }

        public ListComputeMetricsByInstanceResponseBodyDataInstanceComputeMetrics setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListComputeMetricsByInstanceResponseBodyDataInstanceComputeMetrics setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public ListComputeMetricsByInstanceResponseBodyDataInstanceComputeMetrics setUsage(Double usage) {
            this.usage = usage;
            return this;
        }
        public Double getUsage() {
            return this.usage;
        }

    }

    public static class ListComputeMetricsByInstanceResponseBodyData extends TeaModel {
        /**
         * <p>List of pay-as-you-go job compute usage.</p>
         */
        @NameInMap("instanceComputeMetrics")
        public java.util.List<ListComputeMetricsByInstanceResponseBodyDataInstanceComputeMetrics> instanceComputeMetrics;

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pageNumber")
        public Long pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public Long pageSize;

        /**
         * <p>The total number of results returned.</p>
         * 
         * <strong>example:</strong>
         * <p>64</p>
         */
        @NameInMap("totalCount")
        public Long totalCount;

        public static ListComputeMetricsByInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListComputeMetricsByInstanceResponseBodyData self = new ListComputeMetricsByInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListComputeMetricsByInstanceResponseBodyData setInstanceComputeMetrics(java.util.List<ListComputeMetricsByInstanceResponseBodyDataInstanceComputeMetrics> instanceComputeMetrics) {
            this.instanceComputeMetrics = instanceComputeMetrics;
            return this;
        }
        public java.util.List<ListComputeMetricsByInstanceResponseBodyDataInstanceComputeMetrics> getInstanceComputeMetrics() {
            return this.instanceComputeMetrics;
        }

        public ListComputeMetricsByInstanceResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public ListComputeMetricsByInstanceResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListComputeMetricsByInstanceResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
