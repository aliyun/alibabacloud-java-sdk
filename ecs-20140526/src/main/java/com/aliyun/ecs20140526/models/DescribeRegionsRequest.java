// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeRegionsRequest extends TeaModel {
    /**
     * <p>The natural language that is used to filter responses. For more information, visit [RFC 7231](https://tools.ietf.org/html/rfc7231). Valid values:</p>
     * <br>
     * <p>*   zh-CN: Chinese</p>
     * <p>*   en-US: English</p>
     * <p>*   ja: Japanese</p>
     * <br>
     * <p>Default value: zh-CN.</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The billing method of the instance. For more information, see [Billing overview](https://help.aliyun.com/document_detail/25398.html). Valid values:</p>
     * <br>
     * <p>*   PrePaid: subscription. If this parameter is set to PrePaid, make sure that you have sufficient balance or credits in your account. Otherwise, the InvalidPayMethod error code is returned.</p>
     * <p>*   PostPaid: pay-as-you-go.</p>
     * <br>
     * <p>Default value: PostPaid.</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The type of the resource. Valid values:</p>
     * <br>
     * <p>*   instance: Elastic Compute Service (ECS) instance</p>
     * <p>*   disk: disk</p>
     * <p>*   reservedinstance: reserved instance</p>
     * <p>*   scu: storage capacity unit (SCU)</p>
     * <br>
     * <p>Default value: instance.</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    public static DescribeRegionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionsRequest self = new DescribeRegionsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRegionsRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public DescribeRegionsRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public DescribeRegionsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeRegionsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeRegionsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeRegionsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeRegionsRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
