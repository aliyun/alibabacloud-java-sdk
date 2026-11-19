// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetAiAppDetailRequest extends TeaModel {
    /**
     * <p>The AI application ID. This parameter is required. The AppId is derived from AI applications on integrated external AI platforms, such as Model Studio and Dify. Before calling this API, you must call InitAiAppScan to initiate the activation and then call ConfirmAiAppScan to confirm the activation of the AI application detection service. To obtain a valid AppId, you can call ListAiAppByPage to query the list of integrated applications.</p>
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
     * <p>2026-01-02 00:00:00</p>
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
     * <p>2026-01-01 00:00:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static GetAiAppDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAiAppDetailRequest self = new GetAiAppDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetAiAppDetailRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetAiAppDetailRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetAiAppDetailRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetAiAppDetailRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
