// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetExecuteTimeRequest extends TeaModel {
    /**
     * <p>Region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetExecuteTimeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetExecuteTimeRequest self = new GetExecuteTimeRequest();
        return TeaModel.build(map, self);
    }

    public GetExecuteTimeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
