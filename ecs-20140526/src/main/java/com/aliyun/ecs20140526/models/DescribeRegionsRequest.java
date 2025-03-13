// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeRegionsRequest extends TeaModel {
    /**
     * <p>The natural language that is used to filter responses. For more information, see <a href="https://tools.ietf.org/html/rfc7231">RFC 7231</a>. Valid values:</p>
     * <ul>
     * <li>zh-CN: Simplified Chinese</li>
     * <li>zh_TW: Traditional Chinese</li>
     * <li>en-US: English</li>
     * <li>ja: Japanese</li>
     * <li>fr: French</li>
     * <li>de: German</li>
     * <li>ko: Korean</li>
     * </ul>
     * <p>Default value: zh-CN.</p>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The billing method of the instance.  For more information, see <a href="https://help.aliyun.com/document_detail/25398.html">Billing overview</a>.
     *  Valid values:</p>
     * <ul>
     * <li>PrePaid: subscription. If you set this parameter to PrePaid, make sure that you have sufficient balance or credits in your account. Otherwise, the InvalidPayMethod error code is returned.</li>
     * <li>PostPaid: pay-as-you-go.
     * SpotWithPriceLimit: preemptible instance for which a maximum hourly price is specified.</li>
     * <li>SpotAsPriceGo: preemptible instance for which the market price at the time of purchase is automatically used as the bid price. The market price can be up to the pay-as-you-go price.</li>
     * </ul>
     * <p>Default value: PostPaid.</p>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
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
     * <p>The type of resource. Valid values:</p>
     * <ul>
     * <li>instance: Elastic Compute Service (ECS) instance</li>
     * <li>disk: disk</li>
     * <li>reservedinstance: reserved instance</li>
     * <li>scu: storage capacity unit (SCU)</li>
     * </ul>
     * <p>Default value: instance.</p>
     * 
     * <strong>example:</strong>
     * <p>instance</p>
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
