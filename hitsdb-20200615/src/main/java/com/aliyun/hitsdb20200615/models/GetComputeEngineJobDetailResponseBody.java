// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class GetComputeEngineJobDetailResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Configs")
    public java.util.Map<String, ?> configs;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("Endpoint")
    public String endpoint;

    @NameInMap("ExtraInfo")
    public java.util.Map<String, ?> extraInfo;

    @NameInMap("FinishTime")
    public String finishTime;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("JobName")
    public String jobName;

    @NameInMap("JobType")
    public String jobType;

    @NameInMap("LastErrorCode")
    public String lastErrorCode;

    @NameInMap("LastErrorInfo")
    public String lastErrorInfo;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("State")
    public String state;

    public static GetComputeEngineJobDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetComputeEngineJobDetailResponseBody self = new GetComputeEngineJobDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetComputeEngineJobDetailResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetComputeEngineJobDetailResponseBody setConfigs(java.util.Map<String, ?> configs) {
        this.configs = configs;
        return this;
    }
    public java.util.Map<String, ?> getConfigs() {
        return this.configs;
    }

    public GetComputeEngineJobDetailResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetComputeEngineJobDetailResponseBody setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public GetComputeEngineJobDetailResponseBody setExtraInfo(java.util.Map<String, ?> extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public java.util.Map<String, ?> getExtraInfo() {
        return this.extraInfo;
    }

    public GetComputeEngineJobDetailResponseBody setFinishTime(String finishTime) {
        this.finishTime = finishTime;
        return this;
    }
    public String getFinishTime() {
        return this.finishTime;
    }

    public GetComputeEngineJobDetailResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public GetComputeEngineJobDetailResponseBody setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public GetComputeEngineJobDetailResponseBody setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public GetComputeEngineJobDetailResponseBody setLastErrorCode(String lastErrorCode) {
        this.lastErrorCode = lastErrorCode;
        return this;
    }
    public String getLastErrorCode() {
        return this.lastErrorCode;
    }

    public GetComputeEngineJobDetailResponseBody setLastErrorInfo(String lastErrorInfo) {
        this.lastErrorInfo = lastErrorInfo;
        return this;
    }
    public String getLastErrorInfo() {
        return this.lastErrorInfo;
    }

    public GetComputeEngineJobDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetComputeEngineJobDetailResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
