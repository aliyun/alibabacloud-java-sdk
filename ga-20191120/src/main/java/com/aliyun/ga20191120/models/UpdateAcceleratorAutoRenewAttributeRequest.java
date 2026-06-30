// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateAcceleratorAutoRenewAttributeRequest extends TeaModel {
    /**
     * <p>The ID of the Global Accelerator instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ga-bp17frjjh0udz4qz****</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>Specifies whether to enable auto-renewal for the instance. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Auto-renewal is enabled.</p>
     * </li>
     * <li><p><strong>false</strong> (default): Auto-renewal is disabled.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>You must specify at least one of <strong>AutoRenew</strong> and <strong>RenewalStatus</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The auto-renewal duration. Unit: month.</p>
     * <p>Valid values: <strong>1</strong> to <strong>12</strong>.</p>
     * <blockquote>
     * <p>This parameter takes effect only when <strong>AutoRenew</strong> is set to <strong>true</strong>.</p>
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
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The name of the Global Accelerator instance.</p>
     * <p>The name must be 1 to 128 characters in length, start with a letter or a Chinese character, and can contain letters, digits, underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The region ID of the Global Accelerator instance. Set the value to <strong>cn-hangzhou</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The auto-renewal status of the Global Accelerator instance. Valid values:</p>
     * <ul>
     * <li><p><strong>AutoRenewal</strong>: The instance is configured for auto-renewal.</p>
     * </li>
     * <li><p><strong>Normal</strong>: The instance is configured for manual renewal.</p>
     * </li>
     * <li><p>NotRenewal: The instance is not renewed. The system does not send expiration reminders, but sends a non-renewal reminder three days before the expiration date. You can change the renewal status from <strong>NotRenewal</strong> to <strong>Normal</strong> to manually renew the instance, or change the renewal status to <strong>AutoRenewal</strong>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><p>You must specify at least one of <strong>AutoRenew</strong> and <strong>RenewalStatus</strong>.</p>
     * </li>
     * <li><p>The <strong>RenewalStatus</strong> parameter takes precedence over the <strong>AutoRenew</strong> parameter. If you do not specify <strong>RenewalStatus</strong>, the value of <strong>AutoRenew</strong> is used.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("RenewalStatus")
    public String renewalStatus;

    public static UpdateAcceleratorAutoRenewAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAcceleratorAutoRenewAttributeRequest self = new UpdateAcceleratorAutoRenewAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAcceleratorAutoRenewAttributeRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public UpdateAcceleratorAutoRenewAttributeRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public UpdateAcceleratorAutoRenewAttributeRequest setAutoRenewDuration(Integer autoRenewDuration) {
        this.autoRenewDuration = autoRenewDuration;
        return this;
    }
    public Integer getAutoRenewDuration() {
        return this.autoRenewDuration;
    }

    public UpdateAcceleratorAutoRenewAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateAcceleratorAutoRenewAttributeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateAcceleratorAutoRenewAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateAcceleratorAutoRenewAttributeRequest setRenewalStatus(String renewalStatus) {
        this.renewalStatus = renewalStatus;
        return this;
    }
    public String getRenewalStatus() {
        return this.renewalStatus;
    }

}
