// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class UpdateScheduleRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("FailureStrategy")
    public String failureStrategy;

    @NameInMap("ProcessCode")
    public Long processCode;

    @NameInMap("ProcessInstancePriority")
    public String processInstancePriority;

    @NameInMap("ProjectCode")
    public Long projectCode;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ReleaseState")
    public String releaseState;

    @NameInMap("ScheduleId")
    public Long scheduleId;

    @NameInMap("ScheduleParamJson")
    public String scheduleParamJson;

    @NameInMap("WarningType")
    public String warningType;

    public static UpdateScheduleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateScheduleRequest self = new UpdateScheduleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateScheduleRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public UpdateScheduleRequest setFailureStrategy(String failureStrategy) {
        this.failureStrategy = failureStrategy;
        return this;
    }
    public String getFailureStrategy() {
        return this.failureStrategy;
    }

    public UpdateScheduleRequest setProcessCode(Long processCode) {
        this.processCode = processCode;
        return this;
    }
    public Long getProcessCode() {
        return this.processCode;
    }

    public UpdateScheduleRequest setProcessInstancePriority(String processInstancePriority) {
        this.processInstancePriority = processInstancePriority;
        return this;
    }
    public String getProcessInstancePriority() {
        return this.processInstancePriority;
    }

    public UpdateScheduleRequest setProjectCode(Long projectCode) {
        this.projectCode = projectCode;
        return this;
    }
    public Long getProjectCode() {
        return this.projectCode;
    }

    public UpdateScheduleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateScheduleRequest setReleaseState(String releaseState) {
        this.releaseState = releaseState;
        return this;
    }
    public String getReleaseState() {
        return this.releaseState;
    }

    public UpdateScheduleRequest setScheduleId(Long scheduleId) {
        this.scheduleId = scheduleId;
        return this;
    }
    public Long getScheduleId() {
        return this.scheduleId;
    }

    public UpdateScheduleRequest setScheduleParamJson(String scheduleParamJson) {
        this.scheduleParamJson = scheduleParamJson;
        return this;
    }
    public String getScheduleParamJson() {
        return this.scheduleParamJson;
    }

    public UpdateScheduleRequest setWarningType(String warningType) {
        this.warningType = warningType;
        return this;
    }
    public String getWarningType() {
        return this.warningType;
    }

}
