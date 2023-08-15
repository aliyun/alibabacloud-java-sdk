// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class GetLdpsResourceCostResponseBody extends TeaModel {
    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("TotalResource")
    public Long totalResource;

    public static GetLdpsResourceCostResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLdpsResourceCostResponseBody self = new GetLdpsResourceCostResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLdpsResourceCostResponseBody setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetLdpsResourceCostResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetLdpsResourceCostResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public GetLdpsResourceCostResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLdpsResourceCostResponseBody setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public GetLdpsResourceCostResponseBody setTotalResource(Long totalResource) {
        this.totalResource = totalResource;
        return this;
    }
    public Long getTotalResource() {
        return this.totalResource;
    }

}
