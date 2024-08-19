// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetBackupBucketsListRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetBackupBucketsListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBackupBucketsListRequest self = new GetBackupBucketsListRequest();
        return TeaModel.build(map, self);
    }

    public GetBackupBucketsListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
