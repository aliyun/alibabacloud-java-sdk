// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcallcenter20200701.models;

import com.aliyun.tea.*;

public class AbortCasesRequest extends TeaModel {
    @NameInMap("CampaignId")
    public String campaignId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PhoneNumberList")
    public java.util.List<String> phoneNumberList;

    public static AbortCasesRequest build(java.util.Map<String, ?> map) throws Exception {
        AbortCasesRequest self = new AbortCasesRequest();
        return TeaModel.build(map, self);
    }

    public AbortCasesRequest setCampaignId(String campaignId) {
        this.campaignId = campaignId;
        return this;
    }
    public String getCampaignId() {
        return this.campaignId;
    }

    public AbortCasesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AbortCasesRequest setPhoneNumberList(java.util.List<String> phoneNumberList) {
        this.phoneNumberList = phoneNumberList;
        return this;
    }
    public java.util.List<String> getPhoneNumberList() {
        return this.phoneNumberList;
    }

}
