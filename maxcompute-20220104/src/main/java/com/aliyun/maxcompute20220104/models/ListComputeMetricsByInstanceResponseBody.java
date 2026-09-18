// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListComputeMetricsByInstanceResponseBody extends TeaModel {
    /**
     * <p>The response data.</p>
     */
    @NameInMap("data")
    public ListComputeMetricsByInstanceResponseBodyData data;

    /**
     * <p>The HTTP status code. Valid values:</p>
     * <ul>
     * <li>1xx: Informational response. The request has been received and is being processed.</li>
     * <li>2xx: Success. The request has been successfully received, understood, and accepted by the server.</li>
     * <li>3xx: Redirection. The request is redirected, and further action is required to complete the request.</li>
     * <li>4xx: Client error. The request contains invalid parameters, bad syntax, or specific request conditions cannot be fulfilled.</li>
     * <li>5xx: Server error. The server cannot fulfill the request due to other reasons.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpCode")
    public Integer httpCode;

    /**
     * <p>The request ID.</p>
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
         * <p>The job end time. This value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1710432000000</p>
         */
        @NameInMap("endTime")
        public Long endTime;

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20240730****ddlr</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The job owner.</p>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN$7632***@aliyun.com</p>
         */
        @NameInMap("jobOwner")
        public String jobOwner;

        /**
         * <p>The project name.</p>
         * 
         * <strong>example:</strong>
         * <p>odps_porject</p>
         */
        @NameInMap("projectName")
        public String projectName;

        /**
         * <p>The SQL job signature.</p>
         * 
         * <strong>example:</strong>
         * <p>pqrs12345tuv</p>
         */
        @NameInMap("signature")
        public String signature;

        /**
         * <p>The specification type. Valid values:</p>
         * <ul>
         * <li>OdpsStandard: the pay-as-you-go billing method Standard Edition.</li>
         * <li>OdpsSpot: the pay-as-you-go billing method Off-peak Edition.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OdpsStandard</p>
         */
        @NameInMap("specCode")
        public String specCode;

        /**
         * <p>The job submit time. This value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1610432000000</p>
         */
        @NameInMap("submitTime")
        public Long submitTime;

        /**
         * <p>The metering type. Valid values:</p>
         * <ul>
         * <li><p>ComputationSql: metering data of SQL jobs that operate on internal tables.</p>
         * </li>
         * <li><p>ComputationSqlOTS: metering data of SQL jobs that operate on OTS external tables.</p>
         * </li>
         * <li><p>ComputationSqlOSS: metering data of SQL jobs that operate on OSS external tables.</p>
         * </li>
         * <li><p>MapReduce: metering data of MapReduce jobs.</p>
         * </li>
         * <li><p>spark: metering data of Spark jobs.</p>
         * </li>
         * <li><p>mars: metering data of Mars jobs.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ComputationSql</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The unit of compute usage.</p>
         * 
         * <strong>example:</strong>
         * <p>GB</p>
         */
        @NameInMap("unit")
        public String unit;

        /**
         * <p>The compute usage.</p>
         * <ul>
         * <li><p>For scan-based billing types, the unit is GB. This includes the ComputationSql, ComputationSqlOTS, and ComputationSqlOSS billing types, which are billed based on the amount of data scanned. The compute usage is calculated as the scan volume × complexity for each job. The complexity for ComputationSqlOTS and ComputationSqlOSS types is fixed at 1.</p>
         * </li>
         * <li><p>For CU-hour-based billing types, the unit is CU-hours. This includes the MapReduce, spark, and mars billing types, which are billed based on CU-hours.</p>
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
         * <p>The list of pay-as-you-go job compute usage.</p>
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
         * <p>The total number of entries returned.</p>
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
