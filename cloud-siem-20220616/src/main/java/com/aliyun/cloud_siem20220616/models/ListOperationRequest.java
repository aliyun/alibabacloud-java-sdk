// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListOperationRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static ListOperationRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOperationRequest self = new ListOperationRequest();
        return TeaModel.build(map, self);
    }

    public ListOperationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
