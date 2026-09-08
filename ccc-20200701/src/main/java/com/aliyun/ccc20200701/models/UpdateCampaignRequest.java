// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class UpdateCampaignRequest extends TeaModel {
    /**
     * <p>Callable time, supports multiple time segments.</p>
     * 
     * <strong>example:</strong>
     * <p>[
     *       {
     *             &quot;beginTime&quot;: &quot;09:00:00&quot;,
     *             &quot;endTime&quot;: &quot;12:00:00&quot;
     *       }
     * ]</p>
     */
    @NameInMap("CallableTime")
    public String callableTime;

    /**
     * <p>Predictive outbound campaign ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ab11908b-6ebc-4b0c-b51e-3e17c7060</p>
     */
    @NameInMap("CampaignId")
    public String campaignId;

    /**
     * <p>Contact stream ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3a310f56-4d30-4081-ba24-5d87a3b7262e</p>
     */
    @NameInMap("ContactFlowId")
    public String contactFlowId;

    /**
     * <p>End time, in Unix timestamp format, in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1689933600000</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>Cloud Contact Center instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Predictive outbound campaign name.</p>
     * 
     * <strong>example:</strong>
     * <p>云联络中心测试</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Start time, in Unix timestamp format, in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1689901200000</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>Policy parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>PACING策略，参考参数
     * {
     *       &quot;ratio&quot;: 2
     * }</p>
     * <p>PID策略，参考参数
     * {
     *     &quot;abandonRate&quot;:5,
     *     &quot;historicalConnectedRate&quot;:45
     * }</p>
     */
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
