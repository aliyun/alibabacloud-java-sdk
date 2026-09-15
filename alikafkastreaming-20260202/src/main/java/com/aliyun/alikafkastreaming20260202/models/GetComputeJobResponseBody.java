// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafkastreaming20260202.models;

import com.aliyun.tea.*;

public class GetComputeJobResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public GetComputeJobResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>062D8E8B-8D47-5DCC-BB12-5A1D93C3A66B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
         * 
         * <strong>example:</strong>
         * <p>2026-09-02T16:00:00Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        @NameInMap("CuLimit")
        public Double cuLimit;

        /**
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("CuReserved")
        public Double cuReserved;

        /**
         * <strong>example:</strong>
         * <p>1.5</p>
         */
        @NameInMap("CuUsed")
        public Double cuUsed;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DebugMode")
        public Integer debugMode;

        /**
         * <strong>example:</strong>
         * <p>INSERT INTO sink_table SELECT * FROM source_table;</p>
         */
        @NameInMap("DeployedSql")
        public String deployedSql;

        /**
         * <strong>example:</strong>
         * <p>INSERT INTO sink_table SELECT * FROM source_table;</p>
         */
        @NameInMap("DraftSql")
        public String draftSql;

        /**
         * <strong>example:</strong>
         * <p>SQL 校验或编译失败：Column \&quot;xxx\&quot; not found</p>
         */
        @NameInMap("ErrorMsg")
        public String errorMsg;

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-11T04:33:03Z</p>
         */
        @NameInMap("ExpirationTime")
        public String expirationTime;

        /**
         * <strong>example:</strong>
         * <p>alikafka_streaming-cn-hangzhou-a1b2c3d4</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>order_enrichment</p>
         */
        @NameInMap("JobName")
        public String jobName;

        /**
         * <strong>example:</strong>
         * <p>1234567890123456</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>订单流实时清洗</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>savepoint</p>
         */
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

        public GetComputeJobResponseBodyData setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public GetComputeJobResponseBodyData setExpirationTime(String expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }
        public String getExpirationTime() {
            return this.expirationTime;
        }

        public GetComputeJobResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
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
