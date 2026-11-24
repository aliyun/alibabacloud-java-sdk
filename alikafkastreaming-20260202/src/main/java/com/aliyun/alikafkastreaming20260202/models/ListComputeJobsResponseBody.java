// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafkastreaming20260202.models;

import com.aliyun.tea.*;

public class ListComputeJobsResponseBody extends TeaModel {
    /**
     * <p>The return code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListComputeJobsResponseBodyData> data;

    /**
     * <p>The maximum number of returned entries.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJvZmZzZXQiOjIwfQ==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>062D8E8B-8D47-5DCC-BB12-5A1D93C3A66B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of records that match the query conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Total")
    public Long total;

    public static ListComputeJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListComputeJobsResponseBody self = new ListComputeJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListComputeJobsResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ListComputeJobsResponseBody setData(java.util.List<ListComputeJobsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListComputeJobsResponseBodyData> getData() {
        return this.data;
    }

    public ListComputeJobsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListComputeJobsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListComputeJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListComputeJobsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListComputeJobsResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListComputeJobsResponseBodyData extends TeaModel {
        /**
         * <p>The creation time.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-02T16:00:00Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The CU limit for the job.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        @NameInMap("CuLimit")
        public Double cuLimit;

        /**
         * <p>The reserved CUs for the job.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("CuReserved")
        public Double cuReserved;

        /**
         * <p>The number of CUs used.</p>
         * 
         * <strong>example:</strong>
         * <p>1.5</p>
         */
        @NameInMap("CuUsed")
        public Double cuUsed;

        /**
         * <p>Specifies whether the job is a debug job. Valid values: 0: No. 1: Yes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DebugMode")
        public Integer debugMode;

        /**
         * <p>The compute instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>alikafka_streaming-cn-a1b2c3d4</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the compute job.</p>
         * 
         * <strong>example:</strong>
         * <p>order_enrichment</p>
         */
        @NameInMap("JobName")
        public String jobName;

        /**
         * <p>The owner of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890123456</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The job remark.</p>
         * 
         * <strong>example:</strong>
         * <p>Real-time order stream cleansing</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The job status.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListComputeJobsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListComputeJobsResponseBodyData self = new ListComputeJobsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListComputeJobsResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListComputeJobsResponseBodyData setCuLimit(Double cuLimit) {
            this.cuLimit = cuLimit;
            return this;
        }
        public Double getCuLimit() {
            return this.cuLimit;
        }

        public ListComputeJobsResponseBodyData setCuReserved(Double cuReserved) {
            this.cuReserved = cuReserved;
            return this;
        }
        public Double getCuReserved() {
            return this.cuReserved;
        }

        public ListComputeJobsResponseBodyData setCuUsed(Double cuUsed) {
            this.cuUsed = cuUsed;
            return this;
        }
        public Double getCuUsed() {
            return this.cuUsed;
        }

        public ListComputeJobsResponseBodyData setDebugMode(Integer debugMode) {
            this.debugMode = debugMode;
            return this;
        }
        public Integer getDebugMode() {
            return this.debugMode;
        }

        public ListComputeJobsResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListComputeJobsResponseBodyData setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public ListComputeJobsResponseBodyData setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListComputeJobsResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListComputeJobsResponseBodyData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListComputeJobsResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
