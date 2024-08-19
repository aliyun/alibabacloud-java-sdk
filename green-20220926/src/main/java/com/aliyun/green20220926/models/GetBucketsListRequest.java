// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetBucketsListRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetBucketsListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBucketsListRequest self = new GetBucketsListRequest();
        return TeaModel.build(map, self);
    }

    public GetBucketsListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
