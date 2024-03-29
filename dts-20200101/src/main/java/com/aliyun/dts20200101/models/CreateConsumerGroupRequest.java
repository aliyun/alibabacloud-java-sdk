// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class CreateConsumerGroupRequest extends TeaModel {
    /**
     * <p>The ID of the Alibaba Cloud account. You do not need to specify this parameter because this parameter will be removed in the future.</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    /**
     * <p>The name of the consumer group. The name cannot exceed 128 characters in length. We recommend that you use an informative name for easy identification.</p>
     */
    @NameInMap("ConsumerGroupName")
    public String consumerGroupName;

    /**
     * <p>The password that corresponds to the username of the consumer group.</p>
     * <br>
     * <p>*   A password must contain two or more of the following characters: uppercase letters, lowercase letters, digits, and special characters.</p>
     * <p>*   A password must be 8 to 32 characters in length.</p>
     */
    @NameInMap("ConsumerGroupPassword")
    public String consumerGroupPassword;

    /**
     * <p>The username of the consumer group.</p>
     * <br>
     * <p>*   A username must contain one or more of the following characters: uppercase letters, lowercase letters, digits, and underscores (\_).</p>
     * <p>*   A username cannot exceed 16 characters in length.</p>
     */
    @NameInMap("ConsumerGroupUserName")
    public String consumerGroupUserName;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of the change tracking instance. You can call the DescribeSubscriptionInstances operation to query the instance ID.</p>
     */
    @NameInMap("SubscriptionInstanceId")
    public String subscriptionInstanceId;

    public static CreateConsumerGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateConsumerGroupRequest self = new CreateConsumerGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateConsumerGroupRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public CreateConsumerGroupRequest setConsumerGroupName(String consumerGroupName) {
        this.consumerGroupName = consumerGroupName;
        return this;
    }
    public String getConsumerGroupName() {
        return this.consumerGroupName;
    }

    public CreateConsumerGroupRequest setConsumerGroupPassword(String consumerGroupPassword) {
        this.consumerGroupPassword = consumerGroupPassword;
        return this;
    }
    public String getConsumerGroupPassword() {
        return this.consumerGroupPassword;
    }

    public CreateConsumerGroupRequest setConsumerGroupUserName(String consumerGroupUserName) {
        this.consumerGroupUserName = consumerGroupUserName;
        return this;
    }
    public String getConsumerGroupUserName() {
        return this.consumerGroupUserName;
    }

    public CreateConsumerGroupRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public CreateConsumerGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateConsumerGroupRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateConsumerGroupRequest setSubscriptionInstanceId(String subscriptionInstanceId) {
        this.subscriptionInstanceId = subscriptionInstanceId;
        return this;
    }
    public String getSubscriptionInstanceId() {
        return this.subscriptionInstanceId;
    }

}
