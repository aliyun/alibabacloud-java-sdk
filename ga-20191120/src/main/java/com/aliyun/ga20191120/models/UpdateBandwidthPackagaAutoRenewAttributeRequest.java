// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateBandwidthPackagaAutoRenewAttributeRequest extends TeaModel {
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    @NameInMap("AutoRenewDuration")
    public Integer autoRenewDuration;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Name")
    public String name;

    @NameInMap("RegionId")
    public String regionId;

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
