// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ModifyCampaignNumbersRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6badb397-<strong><strong>-</strong></strong>-21019d382a09</p>
     */
    @NameInMap("CampaignId")
    public String campaignId;

    /**
     * <strong>example:</strong>
     * <p>3971876649-<strong><strong>-</strong></strong>-098763a382a09</p>
     */
    @NameInMap("InstGroupId")
    public String instGroupId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("NumberList")
    public java.util.List<String> numberList;

    public static ModifyCampaignNumbersRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCampaignNumbersRequest self = new ModifyCampaignNumbersRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCampaignNumbersRequest setCampaignId(String campaignId) {
        this.campaignId = campaignId;
        return this;
    }
    public String getCampaignId() {
        return this.campaignId;
    }

    public ModifyCampaignNumbersRequest setInstGroupId(String instGroupId) {
        this.instGroupId = instGroupId;
        return this;
    }
    public String getInstGroupId() {
        return this.instGroupId;
    }

    public ModifyCampaignNumbersRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyCampaignNumbersRequest setNumberList(java.util.List<String> numberList) {
        this.numberList = numberList;
        return this;
    }
    public java.util.List<String> getNumberList() {
        return this.numberList;
    }

}
