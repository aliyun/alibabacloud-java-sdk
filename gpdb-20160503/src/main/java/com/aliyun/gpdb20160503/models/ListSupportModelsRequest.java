// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ListSupportModelsRequest extends TeaModel {
    /**
     * <p>The region ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ListSupportModelsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSupportModelsRequest self = new ListSupportModelsRequest();
        return TeaModel.build(map, self);
    }

    public ListSupportModelsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
