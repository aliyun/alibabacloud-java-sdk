// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class ListAiAppRiskEventRequest extends TeaModel {
    /**
     * <p>The application ID. This parameter is required.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>id-xxx</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The end time.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-02 16:08:38</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The start time.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-01 16:08:38</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static ListAiAppRiskEventRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAiAppRiskEventRequest self = new ListAiAppRiskEventRequest();
        return TeaModel.build(map, self);
    }

    public ListAiAppRiskEventRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListAiAppRiskEventRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListAiAppRiskEventRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListAiAppRiskEventRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
