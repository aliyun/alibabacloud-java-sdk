// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateRemindRequest extends TeaModel {
    @NameInMap("RemindName")
    public String remindName;

    @NameInMap("DndEnd")
    public String dndEnd;

    @NameInMap("RemindUnit")
    public String remindUnit;

    @NameInMap("NodeIds")
    public String nodeIds;

    @NameInMap("BaselineIds")
    public String baselineIds;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("BizProcessIds")
    public String bizProcessIds;

    @NameInMap("RemindType")
    public String remindType;

    @NameInMap("MaxAlertTimes")
    public Integer maxAlertTimes;

    @NameInMap("AlertInterval")
    public Integer alertInterval;

    @NameInMap("Detail")
    public String detail;

    @NameInMap("AlertUnit")
    public String alertUnit;

    @NameInMap("AlertMethods")
    public String alertMethods;

    @NameInMap("AlertTargets")
    public String alertTargets;

    @NameInMap("RobotUrls")
    public String robotUrls;

    public static CreateRemindRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRemindRequest self = new CreateRemindRequest();
        return TeaModel.build(map, self);
    }

    public CreateRemindRequest setRemindName(String remindName) {
        this.remindName = remindName;
        return this;
    }
    public String getRemindName() {
        return this.remindName;
    }

    public CreateRemindRequest setDndEnd(String dndEnd) {
        this.dndEnd = dndEnd;
        return this;
    }
    public String getDndEnd() {
        return this.dndEnd;
    }

    public CreateRemindRequest setRemindUnit(String remindUnit) {
        this.remindUnit = remindUnit;
        return this;
    }
    public String getRemindUnit() {
        return this.remindUnit;
    }

    public CreateRemindRequest setNodeIds(String nodeIds) {
        this.nodeIds = nodeIds;
        return this;
    }
    public String getNodeIds() {
        return this.nodeIds;
    }

    public CreateRemindRequest setBaselineIds(String baselineIds) {
        this.baselineIds = baselineIds;
        return this;
    }
    public String getBaselineIds() {
        return this.baselineIds;
    }

    public CreateRemindRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateRemindRequest setBizProcessIds(String bizProcessIds) {
        this.bizProcessIds = bizProcessIds;
        return this;
    }
    public String getBizProcessIds() {
        return this.bizProcessIds;
    }

    public CreateRemindRequest setRemindType(String remindType) {
        this.remindType = remindType;
        return this;
    }
    public String getRemindType() {
        return this.remindType;
    }

    public CreateRemindRequest setMaxAlertTimes(Integer maxAlertTimes) {
        this.maxAlertTimes = maxAlertTimes;
        return this;
    }
    public Integer getMaxAlertTimes() {
        return this.maxAlertTimes;
    }

    public CreateRemindRequest setAlertInterval(Integer alertInterval) {
        this.alertInterval = alertInterval;
        return this;
    }
    public Integer getAlertInterval() {
        return this.alertInterval;
    }

    public CreateRemindRequest setDetail(String detail) {
        this.detail = detail;
        return this;
    }
    public String getDetail() {
        return this.detail;
    }

    public CreateRemindRequest setAlertUnit(String alertUnit) {
        this.alertUnit = alertUnit;
        return this;
    }
    public String getAlertUnit() {
        return this.alertUnit;
    }

    public CreateRemindRequest setAlertMethods(String alertMethods) {
        this.alertMethods = alertMethods;
        return this;
    }
    public String getAlertMethods() {
        return this.alertMethods;
    }

    public CreateRemindRequest setAlertTargets(String alertTargets) {
        this.alertTargets = alertTargets;
        return this;
    }
    public String getAlertTargets() {
        return this.alertTargets;
    }

    public CreateRemindRequest setRobotUrls(String robotUrls) {
        this.robotUrls = robotUrls;
        return this;
    }
    public String getRobotUrls() {
        return this.robotUrls;
    }

}
