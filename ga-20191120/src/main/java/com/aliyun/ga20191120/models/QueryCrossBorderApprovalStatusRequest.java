// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class QueryCrossBorderApprovalStatusRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static QueryCrossBorderApprovalStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCrossBorderApprovalStatusRequest self = new QueryCrossBorderApprovalStatusRequest();
        return TeaModel.build(map, self);
    }

    public QueryCrossBorderApprovalStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
