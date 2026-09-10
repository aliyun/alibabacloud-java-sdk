// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class GetLhmDWResourceGroupStatusRequest extends TeaModel {
    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    public static GetLhmDWResourceGroupStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLhmDWResourceGroupStatusRequest self = new GetLhmDWResourceGroupStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetLhmDWResourceGroupStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
