// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class AddCasesShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CampaignId")
    public String campaignId;

    @NameInMap("CaseList")
    public String caseListShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static AddCasesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddCasesShrinkRequest self = new AddCasesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddCasesShrinkRequest setCampaignId(String campaignId) {
        this.campaignId = campaignId;
        return this;
    }
    public String getCampaignId() {
        return this.campaignId;
    }

    public AddCasesShrinkRequest setCaseListShrink(String caseListShrink) {
        this.caseListShrink = caseListShrink;
        return this;
    }
    public String getCaseListShrink() {
        return this.caseListShrink;
    }

    public AddCasesShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
