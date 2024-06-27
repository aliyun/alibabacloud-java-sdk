// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ModifyConsumerGroupPasswordRequest extends TeaModel {
    /**
     * <p>The ID of the Alibaba Cloud account. You do not need to specify this parameter because this parameter will be removed in the future.</p>
     * 
     * <strong>example:</strong>
     * <p>12323344****</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    /**
     * <p>The ID of the consumer group.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/122886.html">DescribeConsumerGroup</a> operation to query the consumer group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dtswc411cg617p****</p>
     */
    @NameInMap("ConsumerGroupID")
    public String consumerGroupID;

    /**
     * <p>The name of the consumer group. You can call the <a href="https://help.aliyun.com/document_detail/122886.html">DescribeConsumerGroup</a> operation to query the consumer group name.</p>
     */
    @NameInMap("ConsumerGroupName")
    public String consumerGroupName;

    /**
     * <p>The current password of the consumer group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Test123456</p>
     */
    @NameInMap("ConsumerGroupPassword")
    public String consumerGroupPassword;

    /**
     * <p>The username of the consumer group. You can call the <a href="https://help.aliyun.com/document_detail/122886.html">DescribeConsumerGroup</a> operation to query the username.</p>
     * 
     * <strong>example:</strong>
     * <p>dtstest</p>
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dtsg2m10r1x15a****</p>
     */
    @NameInMap("SubscriptionInstanceId")
    public String subscriptionInstanceId;

    /**
     * <p>The new password of the consumer group.</p>
     * <ul>
     * <li>A password must contain two or more of the following characters: uppercase letters, lowercase letters, digits, and special characters.</li>
     * <li>A password must be 8 to 32 characters in length.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Test654321</p>
     */
    @NameInMap("consumerGroupNewPassword")
    public String consumerGroupNewPassword;

    public static ModifyConsumerGroupPasswordRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyConsumerGroupPasswordRequest self = new ModifyConsumerGroupPasswordRequest();
        return TeaModel.build(map, self);
    }

    public ModifyConsumerGroupPasswordRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public ModifyConsumerGroupPasswordRequest setConsumerGroupID(String consumerGroupID) {
        this.consumerGroupID = consumerGroupID;
        return this;
    }
    public String getConsumerGroupID() {
        return this.consumerGroupID;
    }

    public ModifyConsumerGroupPasswordRequest setConsumerGroupName(String consumerGroupName) {
        this.consumerGroupName = consumerGroupName;
        return this;
    }
    public String getConsumerGroupName() {
        return this.consumerGroupName;
    }

    public ModifyConsumerGroupPasswordRequest setConsumerGroupPassword(String consumerGroupPassword) {
        this.consumerGroupPassword = consumerGroupPassword;
        return this;
    }
    public String getConsumerGroupPassword() {
        return this.consumerGroupPassword;
    }

    public ModifyConsumerGroupPasswordRequest setConsumerGroupUserName(String consumerGroupUserName) {
        this.consumerGroupUserName = consumerGroupUserName;
        return this;
    }
    public String getConsumerGroupUserName() {
        return this.consumerGroupUserName;
    }

    public ModifyConsumerGroupPasswordRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public ModifyConsumerGroupPasswordRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyConsumerGroupPasswordRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ModifyConsumerGroupPasswordRequest setSubscriptionInstanceId(String subscriptionInstanceId) {
        this.subscriptionInstanceId = subscriptionInstanceId;
        return this;
    }
    public String getSubscriptionInstanceId() {
        return this.subscriptionInstanceId;
    }

    public ModifyConsumerGroupPasswordRequest setConsumerGroupNewPassword(String consumerGroupNewPassword) {
        this.consumerGroupNewPassword = consumerGroupNewPassword;
        return this;
    }
    public String getConsumerGroupNewPassword() {
        return this.consumerGroupNewPassword;
    }

}
