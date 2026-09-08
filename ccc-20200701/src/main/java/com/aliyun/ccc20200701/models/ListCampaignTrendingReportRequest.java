// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListCampaignTrendingReportRequest extends TeaModel {
    /**
     * <p>The ID of the predictive outbound calling Activity.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6badb397-a8b5-40b6-21019d382a09</p>
     */
    @NameInMap("CampaignId")
    public String campaignId;

    /**
     * <p>The end time. This parameter is optional. The default value is the end time of the predictive outbound dialing activity.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-10-14 20:59:59</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Start Time. This parameter is optional. The default value is the Start Time of the predictive outbound calling Activity.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-10-14 00:00:00</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static ListCampaignTrendingReportRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCampaignTrendingReportRequest self = new ListCampaignTrendingReportRequest();
        return TeaModel.build(map, self);
    }

    public ListCampaignTrendingReportRequest setCampaignId(String campaignId) {
        this.campaignId = campaignId;
        return this;
    }
    public String getCampaignId() {
        return this.campaignId;
    }

    public ListCampaignTrendingReportRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListCampaignTrendingReportRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListCampaignTrendingReportRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
