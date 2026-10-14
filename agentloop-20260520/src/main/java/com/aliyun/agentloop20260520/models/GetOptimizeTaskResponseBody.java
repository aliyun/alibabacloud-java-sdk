// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class GetOptimizeTaskResponseBody extends TeaModel {
    @NameInMap("checkpoint")
    public java.util.Map<String, ?> checkpoint;

    /**
     * <strong>example:</strong>
     * <p>{&quot;ioVersion&quot;:2,&quot;inputs&quot;:{&quot;experienceLibrary&quot;:{&quot;type&quot;:&quot;dataset&quot;,&quot;dataset&quot;:&quot;experiences&quot;},&quot;trajectory&quot;:{&quot;type&quot;:&quot;sls&quot;,&quot;project&quot;:&quot;my-project&quot;,&quot;logstore&quot;:&quot;agent-trajectory&quot;,&quot;format&quot;:&quot;atif&quot;},&quot;prompt&quot;:{&quot;type&quot;:&quot;inline&quot;,&quot;format&quot;:&quot;markdown&quot;,&quot;content&quot;:&quot;# Guidance\\nExtract evidence-backed tool contracts.&quot;}},&quot;outputs&quot;:{&quot;changePlan&quot;:{&quot;type&quot;:&quot;dataset&quot;,&quot;dataset&quot;:&quot;experience-plans&quot;}},&quot;operators&quot;:[&quot;tool_contract&quot;],&quot;application&quot;:{&quot;mode&quot;:&quot;manual&quot;}}</p>
     */
    @NameInMap("config")
    public java.util.Map<String, ?> config;

    /**
     * <strong>example:</strong>
     * <p>2026-08-12T10:00:00Z</p>
     */
    @NameInMap("createTime")
    public String createTime;

    /**
     * <strong>example:</strong>
     * <p>2026-08-13T16:00:00Z</p>
     */
    @NameInMap("nextTriggerTime")
    public String nextTriggerTime;

    /**
     * <strong>example:</strong>
     * <p>efficiency-analysis</p>
     */
    @NameInMap("optimizeTaskName")
    public String optimizeTaskName;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>9ACFB10A-1B2C-3D4E-5F6G-7H8I9J0K1L2M</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>EfficiencyAnalysis</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <strong>example:</strong>
     * <p>2026-08-12T10:00:00Z</p>
     */
    @NameInMap("updateTime")
    public String updateTime;

    public static GetOptimizeTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOptimizeTaskResponseBody self = new GetOptimizeTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOptimizeTaskResponseBody setCheckpoint(java.util.Map<String, ?> checkpoint) {
        this.checkpoint = checkpoint;
        return this;
    }
    public java.util.Map<String, ?> getCheckpoint() {
        return this.checkpoint;
    }

    public GetOptimizeTaskResponseBody setConfig(java.util.Map<String, ?> config) {
        this.config = config;
        return this;
    }
    public java.util.Map<String, ?> getConfig() {
        return this.config;
    }

    public GetOptimizeTaskResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetOptimizeTaskResponseBody setNextTriggerTime(String nextTriggerTime) {
        this.nextTriggerTime = nextTriggerTime;
        return this;
    }
    public String getNextTriggerTime() {
        return this.nextTriggerTime;
    }

    public GetOptimizeTaskResponseBody setOptimizeTaskName(String optimizeTaskName) {
        this.optimizeTaskName = optimizeTaskName;
        return this;
    }
    public String getOptimizeTaskName() {
        return this.optimizeTaskName;
    }

    public GetOptimizeTaskResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetOptimizeTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOptimizeTaskResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetOptimizeTaskResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public GetOptimizeTaskResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

}
