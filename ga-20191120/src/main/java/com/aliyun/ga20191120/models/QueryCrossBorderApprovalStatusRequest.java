// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class QueryCrossBorderApprovalStatusRequest extends TeaModel {
    /**
     * <p>The region ID of the GA instance. Set the value to <strong>cn-hangzhou</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
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
