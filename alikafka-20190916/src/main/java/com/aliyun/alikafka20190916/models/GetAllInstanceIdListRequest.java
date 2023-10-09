// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class GetAllInstanceIdListRequest extends TeaModel {
    /**
     * <p>The region ID of the instance. This parameter is reserved.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetAllInstanceIdListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAllInstanceIdListRequest self = new GetAllInstanceIdListRequest();
        return TeaModel.build(map, self);
    }

    public GetAllInstanceIdListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
