// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafkastreaming20260202.models;

import com.aliyun.tea.*;

public class GetComputeJobResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public GetComputeJobResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetComputeJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetComputeJobResponseBody self = new GetComputeJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetComputeJobResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetComputeJobResponseBody setData(GetComputeJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetComputeJobResponseBodyData getData() {
        return this.data;
    }

    public GetComputeJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetComputeJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetComputeJobResponseBodyData extends TeaModel {
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

        @NameInMap("DeployedSql")
        public String deployedSql;

        @NameInMap("DraftSql")
        public String draftSql;

        @NameInMap("HistoryInfos")
        public String historyInfos;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("JobConfig")
        public String jobConfig;

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

        @NameInMap("UpgradeMode")
        public String upgradeMode;

        public static GetComputeJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetComputeJobResponseBodyData self = new GetComputeJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetComputeJobResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetComputeJobResponseBodyData setCuLimit(Double cuLimit) {
            this.cuLimit = cuLimit;
            return this;
        }
        public Double getCuLimit() {
            return this.cuLimit;
        }

        public GetComputeJobResponseBodyData setCuReserved(Double cuReserved) {
            this.cuReserved = cuReserved;
            return this;
        }
        public Double getCuReserved() {
            return this.cuReserved;
        }

        public GetComputeJobResponseBodyData setCuUsed(Double cuUsed) {
            this.cuUsed = cuUsed;
            return this;
        }
        public Double getCuUsed() {
            return this.cuUsed;
        }

        public GetComputeJobResponseBodyData setDebugMode(Integer debugMode) {
            this.debugMode = debugMode;
            return this;
        }
        public Integer getDebugMode() {
            return this.debugMode;
        }

        public GetComputeJobResponseBodyData setDeployedSql(String deployedSql) {
            this.deployedSql = deployedSql;
            return this;
        }
        public String getDeployedSql() {
            return this.deployedSql;
        }

        public GetComputeJobResponseBodyData setDraftSql(String draftSql) {
            this.draftSql = draftSql;
            return this;
        }
        public String getDraftSql() {
            return this.draftSql;
        }

        public GetComputeJobResponseBodyData setHistoryInfos(String historyInfos) {
            this.historyInfos = historyInfos;
            return this;
        }
        public String getHistoryInfos() {
            return this.historyInfos;
        }

        public GetComputeJobResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetComputeJobResponseBodyData setJobConfig(String jobConfig) {
            this.jobConfig = jobConfig;
            return this;
        }
        public String getJobConfig() {
            return this.jobConfig;
        }

        public GetComputeJobResponseBodyData setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public GetComputeJobResponseBodyData setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetComputeJobResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetComputeJobResponseBodyData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public GetComputeJobResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetComputeJobResponseBodyData setUpgradeMode(String upgradeMode) {
            this.upgradeMode = upgradeMode;
            return this;
        }
        public String getUpgradeMode() {
            return this.upgradeMode;
        }

    }

}
