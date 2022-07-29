// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateOrUpdateNotificationPolicyRequest extends TeaModel {
    @NameInMap("EscalationPolicyId")
    public Long escalationPolicyId;

    @NameInMap("GroupRule")
    public String groupRule;

    @NameInMap("Id")
    public Long id;

    @NameInMap("IntegrationId")
    public Long integrationId;

    @NameInMap("MatchingRules")
    public String matchingRules;

    @NameInMap("Name")
    public String name;

    @NameInMap("NotifyRule")
    public String notifyRule;

    @NameInMap("NotifyTemplate")
    public String notifyTemplate;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Repeat")
    public Boolean repeat;

    @NameInMap("RepeatInterval")
    public Long repeatInterval;

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

    public CreateOrUpdateNotificationPolicyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
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
