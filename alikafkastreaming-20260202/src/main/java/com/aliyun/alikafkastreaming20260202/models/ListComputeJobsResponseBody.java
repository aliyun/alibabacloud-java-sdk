// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafkastreaming20260202.models;

import com.aliyun.tea.*;

public class ListComputeJobsResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public java.util.List<ListComputeJobsResponseBodyData> data;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

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
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CuLimit")
        public Double cuLimit;

        @NameInMap("CuReserved")
        public Double cuReserved;

        @NameInMap("CuUsed")
        public Double cuUsed;

        @NameInMap("DebugMode")
        public Integer debugMode;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("JobName")
        public String jobName;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Remark")
        public String remark;

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
