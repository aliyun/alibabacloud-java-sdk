// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListCampaignTrendingReportRequest extends TeaModel {
    // 活动ID
    @NameInMap("CampaignId")
    public String campaignId;

    // 结束时间
    @NameInMap("EndTime")
    public Long endTime;

    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    // 开始时间
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
