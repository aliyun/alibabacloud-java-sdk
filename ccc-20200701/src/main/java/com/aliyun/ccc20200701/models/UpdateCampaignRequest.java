// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class UpdateCampaignRequest extends TeaModel {
    @NameInMap("CallableTime")
    public String callableTime;

    @NameInMap("CampaignId")
    public String campaignId;

    @NameInMap("ContactFlowId")
    public String contactFlowId;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Name")
    public String name;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("StrategyParameters")
    public String strategyParameters;

    public static UpdateCampaignRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCampaignRequest self = new UpdateCampaignRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCampaignRequest setCallableTime(String callableTime) {
        this.callableTime = callableTime;
        return this;
    }
    public String getCallableTime() {
        return this.callableTime;
    }

    public UpdateCampaignRequest setCampaignId(String campaignId) {
        this.campaignId = campaignId;
        return this;
    }
    public String getCampaignId() {
        return this.campaignId;
    }

    public UpdateCampaignRequest setContactFlowId(String contactFlowId) {
        this.contactFlowId = contactFlowId;
        return this;
    }
    public String getContactFlowId() {
        return this.contactFlowId;
    }

    public UpdateCampaignRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public UpdateCampaignRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateCampaignRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateCampaignRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public UpdateCampaignRequest setStrategyParameters(String strategyParameters) {
        this.strategyParameters = strategyParameters;
        return this;
    }
    public String getStrategyParameters() {
        return this.strategyParameters;
    }

}
