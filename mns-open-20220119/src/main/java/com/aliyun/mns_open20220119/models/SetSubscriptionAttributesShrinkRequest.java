// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class SetSubscriptionAttributesShrinkRequest extends TeaModel {
    @NameInMap("DlqPolicy")
    public String dlqPolicyShrink;

    @NameInMap("NotifyStrategy")
    public String notifyStrategy;

    /**
     * <strong>example:</strong>
     * <p>acs:ram::1234567890:role/roleName</p>
     */
    @NameInMap("StsRoleArn")
    public String stsRoleArn;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SubscriptionName")
    public String subscriptionName;

    @NameInMap("TenantRateLimitPolicy")
    public String tenantRateLimitPolicyShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TopicName")
    public String topicName;

    public static SetSubscriptionAttributesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SetSubscriptionAttributesShrinkRequest self = new SetSubscriptionAttributesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SetSubscriptionAttributesShrinkRequest setDlqPolicyShrink(String dlqPolicyShrink) {
        this.dlqPolicyShrink = dlqPolicyShrink;
        return this;
    }
    public String getDlqPolicyShrink() {
        return this.dlqPolicyShrink;
    }

    public SetSubscriptionAttributesShrinkRequest setNotifyStrategy(String notifyStrategy) {
        this.notifyStrategy = notifyStrategy;
        return this;
    }
    public String getNotifyStrategy() {
        return this.notifyStrategy;
    }

    public SetSubscriptionAttributesShrinkRequest setStsRoleArn(String stsRoleArn) {
        this.stsRoleArn = stsRoleArn;
        return this;
    }
    public String getStsRoleArn() {
        return this.stsRoleArn;
    }

    public SetSubscriptionAttributesShrinkRequest setSubscriptionName(String subscriptionName) {
        this.subscriptionName = subscriptionName;
        return this;
    }
    public String getSubscriptionName() {
        return this.subscriptionName;
    }

    public SetSubscriptionAttributesShrinkRequest setTenantRateLimitPolicyShrink(String tenantRateLimitPolicyShrink) {
        this.tenantRateLimitPolicyShrink = tenantRateLimitPolicyShrink;
        return this;
    }
    public String getTenantRateLimitPolicyShrink() {
        return this.tenantRateLimitPolicyShrink;
    }

    public SetSubscriptionAttributesShrinkRequest setTopicName(String topicName) {
        this.topicName = topicName;
        return this;
    }
    public String getTopicName() {
        return this.topicName;
    }

}
