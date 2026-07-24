// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafkastreaming20260202.models;

import com.aliyun.tea.*;

public class ListComputeInstancesResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public java.util.List<ListComputeInstancesResponseBodyData> data;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListComputeInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListComputeInstancesResponseBody self = new ListComputeInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListComputeInstancesResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ListComputeInstancesResponseBody setData(java.util.List<ListComputeInstancesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListComputeInstancesResponseBodyData> getData() {
        return this.data;
    }

    public ListComputeInstancesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListComputeInstancesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListComputeInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListComputeInstancesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListComputeInstancesResponseBodyData extends TeaModel {
        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Cu")
        public Integer cu;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("ServiceStatus")
        public String serviceStatus;

        @NameInMap("TotalJobs")
        public Long totalJobs;

        @NameInMap("TotalRunningJobs")
        public Long totalRunningJobs;

        public static ListComputeInstancesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListComputeInstancesResponseBodyData self = new ListComputeInstancesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListComputeInstancesResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListComputeInstancesResponseBodyData setCu(Integer cu) {
            this.cu = cu;
            return this;
        }
        public Integer getCu() {
            return this.cu;
        }

        public ListComputeInstancesResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListComputeInstancesResponseBodyData setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListComputeInstancesResponseBodyData setServiceStatus(String serviceStatus) {
            this.serviceStatus = serviceStatus;
            return this;
        }
        public String getServiceStatus() {
            return this.serviceStatus;
        }

        public ListComputeInstancesResponseBodyData setTotalJobs(Long totalJobs) {
            this.totalJobs = totalJobs;
            return this;
        }
        public Long getTotalJobs() {
            return this.totalJobs;
        }

        public ListComputeInstancesResponseBodyData setTotalRunningJobs(Long totalRunningJobs) {
            this.totalRunningJobs = totalRunningJobs;
            return this;
        }
        public Long getTotalRunningJobs() {
            return this.totalRunningJobs;
        }

    }

}
