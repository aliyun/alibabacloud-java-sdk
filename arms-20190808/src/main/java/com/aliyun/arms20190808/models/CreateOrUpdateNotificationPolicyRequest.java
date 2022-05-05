// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateOrUpdateNotificationPolicyRequest extends TeaModel {
    // 升级规则ID
    @NameInMap("EscalationPolicyId")
    public Long escalationPolicyId;

    // 分组规则
    @NameInMap("GroupRule")
    public String groupRule;

    // 通知策略ID
    @NameInMap("Id")
    public Long id;

    // 集成ID
    @NameInMap("IntegrationId")
    public Long integrationId;

    // 事件匹配规则列表
    @NameInMap("MatchingRules")
    public String matchingRules;

    // 通知策略名称
    @NameInMap("Name")
    public String name;

    // 通知规则,通知对象，必填
    @NameInMap("NotifyRule")
    public String notifyRule;

    // 通知模板
    @NameInMap("NotifyTemplate")
    public String notifyTemplate;

    // 是否重复通知,不填默认为true，需要必填重复通知时间间隔；false，需要必填升级规则ID
    @NameInMap("Repeat")
    public Boolean repeat;

    // 重复通知时间间隔,单位：s
    @NameInMap("RepeatInterval")
    public Long repeatInterval;

    // 是否发送恢,不填默认为：true复通知
    @NameInMap("SendRecoverMessage")
    public Boolean sendRecoverMessage;

    public static CreateOrUpdateNotificationPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateNotificationPolicyRequest self = new CreateOrUpdateNotificationPolicyRequest();
        return TeaModel.build(map, self);
    }

    public CreateOrUpdateNotificationPolicyRequest setEscalationPolicyId(Long escalationPolicyId) {
        this.escalationPolicyId = escalationPolicyId;
        return this;
    }
    public Long getEscalationPolicyId() {
        return this.escalationPolicyId;
    }

    public CreateOrUpdateNotificationPolicyRequest setGroupRule(String groupRule) {
        this.groupRule = groupRule;
        return this;
    }
    public String getGroupRule() {
        return this.groupRule;
    }

    public CreateOrUpdateNotificationPolicyRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CreateOrUpdateNotificationPolicyRequest setIntegrationId(Long integrationId) {
        this.integrationId = integrationId;
        return this;
    }
    public Long getIntegrationId() {
        return this.integrationId;
    }

    public CreateOrUpdateNotificationPolicyRequest setMatchingRules(String matchingRules) {
        this.matchingRules = matchingRules;
        return this;
    }
    public String getMatchingRules() {
        return this.matchingRules;
    }

    public CreateOrUpdateNotificationPolicyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateOrUpdateNotificationPolicyRequest setNotifyRule(String notifyRule) {
        this.notifyRule = notifyRule;
        return this;
    }
    public String getNotifyRule() {
        return this.notifyRule;
    }

    public CreateOrUpdateNotificationPolicyRequest setNotifyTemplate(String notifyTemplate) {
        this.notifyTemplate = notifyTemplate;
        return this;
    }
    public String getNotifyTemplate() {
        return this.notifyTemplate;
    }

    public CreateOrUpdateNotificationPolicyRequest setRepeat(Boolean repeat) {
        this.repeat = repeat;
        return this;
    }
    public Boolean getRepeat() {
        return this.repeat;
    }

    public CreateOrUpdateNotificationPolicyRequest setRepeatInterval(Long repeatInterval) {
        this.repeatInterval = repeatInterval;
        return this;
    }
    public Long getRepeatInterval() {
        return this.repeatInterval;
    }

    public CreateOrUpdateNotificationPolicyRequest setSendRecoverMessage(Boolean sendRecoverMessage) {
        this.sendRecoverMessage = sendRecoverMessage;
        return this;
    }
    public Boolean getSendRecoverMessage() {
        return this.sendRecoverMessage;
    }

}
