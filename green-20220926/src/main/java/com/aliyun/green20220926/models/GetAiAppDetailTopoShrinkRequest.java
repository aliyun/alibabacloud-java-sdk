// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetAiAppDetailTopoShrinkRequest extends TeaModel {
    /**
     * <p>The application ID that identifies a specific AI application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>id-xxx</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The time query.</p>
     */
    @NameInMap("TimeQuery")
    public String timeQueryShrink;

    public static GetAiAppDetailTopoShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAiAppDetailTopoShrinkRequest self = new GetAiAppDetailTopoShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetAiAppDetailTopoShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetAiAppDetailTopoShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetAiAppDetailTopoShrinkRequest setTimeQueryShrink(String timeQueryShrink) {
        this.timeQueryShrink = timeQueryShrink;
        return this;
    }
    public String getTimeQueryShrink() {
        return this.timeQueryShrink;
    }

}
