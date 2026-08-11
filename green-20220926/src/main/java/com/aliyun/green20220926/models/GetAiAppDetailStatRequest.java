// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetAiAppDetailStatRequest extends TeaModel {
    /**
     * <p>The ID of the AI application. This parameter is required.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>id-xxx</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The end time of the query.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-07-09 10:30:00</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the region where the application resides.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The start time of the query.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-09-10 14:48:01</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static GetAiAppDetailStatRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAiAppDetailStatRequest self = new GetAiAppDetailStatRequest();
        return TeaModel.build(map, self);
    }

    public GetAiAppDetailStatRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetAiAppDetailStatRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetAiAppDetailStatRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetAiAppDetailStatRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
