// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class UpdateChatDispatchRuleRequest extends TeaModel {
    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("Timeout")
    public Integer timeout;

    @NameInMap("HeartTimeout")
    public Integer heartTimeout;

    @NameInMap("OfflineNotice")
    public String offlineNotice;

    @NameInMap("NoAgentNotice")
    public String noAgentNotice;

    @NameInMap("Level")
    public Integer level;

    @NameInMap("SkillGroupList")
    public String skillGroupList;

    @NameInMap("EnableWorkTime")
    public String enableWorkTime;

    @NameInMap("WorkTime")
    public String workTime;

    @NameInMap("MemberEnqueueNotice")
    public String memberEnqueueNotice;

    @NameInMap("MemberDispatchNotice")
    public String memberDispatchNotice;

    @NameInMap("EnableMemberDispatchNotice")
    public Boolean enableMemberDispatchNotice;

    @NameInMap("MemberSessionRemoveNotice")
    public String memberSessionRemoveNotice;

    @NameInMap("LeaveNoticeMessage")
    public String leaveNoticeMessage;

    @NameInMap("MemberLongSessionBeginTime")
    public String memberLongSessionBeginTime;

    @NameInMap("MemberQueueHeartTimeout")
    public Integer memberQueueHeartTimeout;

    @NameInMap("AgentCloseSessionNotice")
    public String agentCloseSessionNotice;

    @NameInMap("MemberCloseSessionNotice")
    public String memberCloseSessionNotice;

    @NameInMap("AgentSwitchQueueNotice")
    public String agentSwitchQueueNotice;

    @NameInMap("AgentOfflineSwitchQueueNotice")
    public String agentOfflineSwitchQueueNotice;

    @NameInMap("OperatorId")
    public Long operatorId;

    public static UpdateChatDispatchRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateChatDispatchRuleRequest self = new UpdateChatDispatchRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateChatDispatchRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public UpdateChatDispatchRuleRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public UpdateChatDispatchRuleRequest setHeartTimeout(Integer heartTimeout) {
        this.heartTimeout = heartTimeout;
        return this;
    }
    public Integer getHeartTimeout() {
        return this.heartTimeout;
    }

    public UpdateChatDispatchRuleRequest setOfflineNotice(String offlineNotice) {
        this.offlineNotice = offlineNotice;
        return this;
    }
    public String getOfflineNotice() {
        return this.offlineNotice;
    }

    public UpdateChatDispatchRuleRequest setNoAgentNotice(String noAgentNotice) {
        this.noAgentNotice = noAgentNotice;
        return this;
    }
    public String getNoAgentNotice() {
        return this.noAgentNotice;
    }

    public UpdateChatDispatchRuleRequest setLevel(Integer level) {
        this.level = level;
        return this;
    }
    public Integer getLevel() {
        return this.level;
    }

    public UpdateChatDispatchRuleRequest setSkillGroupList(String skillGroupList) {
        this.skillGroupList = skillGroupList;
        return this;
    }
    public String getSkillGroupList() {
        return this.skillGroupList;
    }

    public UpdateChatDispatchRuleRequest setEnableWorkTime(String enableWorkTime) {
        this.enableWorkTime = enableWorkTime;
        return this;
    }
    public String getEnableWorkTime() {
        return this.enableWorkTime;
    }

    public UpdateChatDispatchRuleRequest setWorkTime(String workTime) {
        this.workTime = workTime;
        return this;
    }
    public String getWorkTime() {
        return this.workTime;
    }

    public UpdateChatDispatchRuleRequest setMemberEnqueueNotice(String memberEnqueueNotice) {
        this.memberEnqueueNotice = memberEnqueueNotice;
        return this;
    }
    public String getMemberEnqueueNotice() {
        return this.memberEnqueueNotice;
    }

    public UpdateChatDispatchRuleRequest setMemberDispatchNotice(String memberDispatchNotice) {
        this.memberDispatchNotice = memberDispatchNotice;
        return this;
    }
    public String getMemberDispatchNotice() {
        return this.memberDispatchNotice;
    }

    public UpdateChatDispatchRuleRequest setEnableMemberDispatchNotice(Boolean enableMemberDispatchNotice) {
        this.enableMemberDispatchNotice = enableMemberDispatchNotice;
        return this;
    }
    public Boolean getEnableMemberDispatchNotice() {
        return this.enableMemberDispatchNotice;
    }

    public UpdateChatDispatchRuleRequest setMemberSessionRemoveNotice(String memberSessionRemoveNotice) {
        this.memberSessionRemoveNotice = memberSessionRemoveNotice;
        return this;
    }
    public String getMemberSessionRemoveNotice() {
        return this.memberSessionRemoveNotice;
    }

    public UpdateChatDispatchRuleRequest setLeaveNoticeMessage(String leaveNoticeMessage) {
        this.leaveNoticeMessage = leaveNoticeMessage;
        return this;
    }
    public String getLeaveNoticeMessage() {
        return this.leaveNoticeMessage;
    }

    public UpdateChatDispatchRuleRequest setMemberLongSessionBeginTime(String memberLongSessionBeginTime) {
        this.memberLongSessionBeginTime = memberLongSessionBeginTime;
        return this;
    }
    public String getMemberLongSessionBeginTime() {
        return this.memberLongSessionBeginTime;
    }

    public UpdateChatDispatchRuleRequest setMemberQueueHeartTimeout(Integer memberQueueHeartTimeout) {
        this.memberQueueHeartTimeout = memberQueueHeartTimeout;
        return this;
    }
    public Integer getMemberQueueHeartTimeout() {
        return this.memberQueueHeartTimeout;
    }

    public UpdateChatDispatchRuleRequest setAgentCloseSessionNotice(String agentCloseSessionNotice) {
        this.agentCloseSessionNotice = agentCloseSessionNotice;
        return this;
    }
    public String getAgentCloseSessionNotice() {
        return this.agentCloseSessionNotice;
    }

    public UpdateChatDispatchRuleRequest setMemberCloseSessionNotice(String memberCloseSessionNotice) {
        this.memberCloseSessionNotice = memberCloseSessionNotice;
        return this;
    }
    public String getMemberCloseSessionNotice() {
        return this.memberCloseSessionNotice;
    }

    public UpdateChatDispatchRuleRequest setAgentSwitchQueueNotice(String agentSwitchQueueNotice) {
        this.agentSwitchQueueNotice = agentSwitchQueueNotice;
        return this;
    }
    public String getAgentSwitchQueueNotice() {
        return this.agentSwitchQueueNotice;
    }

    public UpdateChatDispatchRuleRequest setAgentOfflineSwitchQueueNotice(String agentOfflineSwitchQueueNotice) {
        this.agentOfflineSwitchQueueNotice = agentOfflineSwitchQueueNotice;
        return this;
    }
    public String getAgentOfflineSwitchQueueNotice() {
        return this.agentOfflineSwitchQueueNotice;
    }

    public UpdateChatDispatchRuleRequest setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public Long getOperatorId() {
        return this.operatorId;
    }

}
