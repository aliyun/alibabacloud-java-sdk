// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateRemindRequest extends TeaModel {
    @NameInMap("AlertInterval")
    public Integer alertInterval;

    @NameInMap("AlertMethods")
    public String alertMethods;

    @NameInMap("AlertTargets")
    public String alertTargets;

    @NameInMap("AlertUnit")
    public String alertUnit;

    @NameInMap("BaselineIds")
    public String baselineIds;

    @NameInMap("BizProcessIds")
    public String bizProcessIds;

    @NameInMap("Detail")
    public String detail;

    @NameInMap("DndEnd")
    public String dndEnd;

    @NameInMap("MaxAlertTimes")
    public Integer maxAlertTimes;

    @NameInMap("NodeIds")
    public String nodeIds;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("RemindName")
    public String remindName;

    @NameInMap("RemindType")
    public String remindType;

    @NameInMap("RemindUnit")
    public String remindUnit;

    @NameInMap("RobotUrls")
    public String robotUrls;

    public static CreateRemindRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRemindRequest self = new CreateRemindRequest();
        return TeaModel.build(map, self);
    }

    public CreateRemindRequest setAlertInterval(Integer alertInterval) {
        this.alertInterval = alertInterval;
        return this;
    }
    public Integer getAlertInterval() {
        return this.alertInterval;
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

    public CreateRemindRequest setAlertUnit(String alertUnit) {
        this.alertUnit = alertUnit;
        return this;
    }
    public String getAlertUnit() {
        return this.alertUnit;
    }

    public CreateRemindRequest setBaselineIds(String baselineIds) {
        this.baselineIds = baselineIds;
        return this;
    }
    public String getBaselineIds() {
        return this.baselineIds;
    }

    public CreateRemindRequest setBizProcessIds(String bizProcessIds) {
        this.bizProcessIds = bizProcessIds;
        return this;
    }
    public String getBizProcessIds() {
        return this.bizProcessIds;
    }

    public CreateRemindRequest setDetail(String detail) {
        this.detail = detail;
        return this;
    }
    public String getDetail() {
        return this.detail;
    }

    public CreateRemindRequest setDndEnd(String dndEnd) {
        this.dndEnd = dndEnd;
        return this;
    }
    public String getDndEnd() {
        return this.dndEnd;
    }

    public CreateRemindRequest setMaxAlertTimes(Integer maxAlertTimes) {
        this.maxAlertTimes = maxAlertTimes;
        return this;
    }
    public Integer getMaxAlertTimes() {
        return this.maxAlertTimes;
    }

    public CreateRemindRequest setNodeIds(String nodeIds) {
        this.nodeIds = nodeIds;
        return this;
    }
    public String getNodeIds() {
        return this.nodeIds;
    }

    public CreateRemindRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateRemindRequest setRemindName(String remindName) {
        this.remindName = remindName;
        return this;
    }
    public String getRemindName() {
        return this.remindName;
    }

    public CreateRemindRequest setRemindType(String remindType) {
        this.remindType = remindType;
        return this;
    }
    public String getRemindType() {
        return this.remindType;
    }

    public CreateRemindRequest setRemindUnit(String remindUnit) {
        this.remindUnit = remindUnit;
        return this;
    }
    public String getRemindUnit() {
        return this.remindUnit;
    }

    public CreateRemindRequest setRobotUrls(String robotUrls) {
        this.robotUrls = robotUrls;
        return this;
    }
    public String getRobotUrls() {
        return this.robotUrls;
    }

}
