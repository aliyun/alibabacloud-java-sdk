// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateBandwidthPackagaAutoRenewAttributeRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable auto-renewal. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong> (default)</li>
     * </ul>
     * <blockquote>
     * <p> You must specify <strong>AutoRenew</strong> or <strong>RenewalStatus</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The auto-renewal duration. Unit: months. Valid values: <strong>1</strong> to <strong>12</strong>.</p>
     * <blockquote>
     * <p>This parameter takes effect only if <strong>AutoRenew</strong> is set to <strong>true</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AutoRenewDuration")
    public Integer autoRenewDuration;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the bandwidth plan.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gbwp-bp1sgzldyj6b4q7cx****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the bandwidth plan.</p>
     * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The name must start with a letter.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the region where the Global Accelerator (GA) instance is deployed. Set the value to <strong>cn-hangzhou</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The auto-renewal status of the bandwidth plan. Valid values:</p>
     * <ul>
     * <li><strong>AutoRenewal</strong>: The bandwidth plan is automatically renewed.</li>
     * <li><strong>Normal</strong>: You must manually renew the bandwidth plan.</li>
     * <li><strong>NotRenewal</strong>: The bandwidth plan is not renewed after it expires. The system sends only a non-renewal reminder three days before the expiration date. To renew a bandwidth plan for which you set RenewalStatus to NotRenewal, you can change the value of RenewalStatus from NotRenewal to Normal, and then manually renew the bandwidth plan. You can also set RenewalStatus to <strong>AutoRenewal</strong>.<blockquote>
     * <ul>
     * <li>You must specify <strong>AutoRenew</strong> or <strong>RenewalStatus</strong>.</li>
     * <li><strong>RenewalStatus</strong> takes precedence over <strong>AutoRenew</strong>. If you do not specify <strong>RenewalStatus</strong>, <strong>AutoRenew</strong> is used.</li>
     * </ul>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("RenewalStatus")
    public String renewalStatus;

    public static UpdateBandwidthPackagaAutoRenewAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBandwidthPackagaAutoRenewAttributeRequest self = new UpdateBandwidthPackagaAutoRenewAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBandwidthPackagaAutoRenewAttributeRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public UpdateBandwidthPackagaAutoRenewAttributeRequest setAutoRenewDuration(Integer autoRenewDuration) {
        this.autoRenewDuration = autoRenewDuration;
        return this;
    }
    public Integer getAutoRenewDuration() {
        return this.autoRenewDuration;
    }

    public UpdateBandwidthPackagaAutoRenewAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateBandwidthPackagaAutoRenewAttributeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateBandwidthPackagaAutoRenewAttributeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateBandwidthPackagaAutoRenewAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateBandwidthPackagaAutoRenewAttributeRequest setRenewalStatus(String renewalStatus) {
        this.renewalStatus = renewalStatus;
        return this;
    }
    public String getRenewalStatus() {
        return this.renewalStatus;
    }

}
