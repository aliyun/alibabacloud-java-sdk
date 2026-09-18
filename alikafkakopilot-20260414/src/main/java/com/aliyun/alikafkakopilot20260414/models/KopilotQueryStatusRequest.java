// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafkakopilot20260414.models;

import com.aliyun.tea.*;

public class KopilotQueryStatusRequest extends TeaModel {
    /**
     * <p>The account ID of the owner.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1590639435720201</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static KopilotQueryStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        KopilotQueryStatusRequest self = new KopilotQueryStatusRequest();
        return TeaModel.build(map, self);
    }

    public KopilotQueryStatusRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public KopilotQueryStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
