// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcallcenter20200701.models;

import com.aliyun.tea.*;

public class AbortCasesShrinkRequest extends TeaModel {
    @NameInMap("CampaignId")
    public String campaignId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PhoneNumberList")
    public String phoneNumberListShrink;

    public static AbortCasesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AbortCasesShrinkRequest self = new AbortCasesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AbortCasesShrinkRequest setCampaignId(String campaignId) {
        this.campaignId = campaignId;
        return this;
    }
    public String getCampaignId() {
        return this.campaignId;
    }

    public AbortCasesShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AbortCasesShrinkRequest setPhoneNumberListShrink(String phoneNumberListShrink) {
        this.phoneNumberListShrink = phoneNumberListShrink;
        return this;
    }
    public String getPhoneNumberListShrink() {
        return this.phoneNumberListShrink;
    }

}
