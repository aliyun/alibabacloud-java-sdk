// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DeleteDtsJobsRequest extends TeaModel {
    @NameInMap("DtsJobIds")
    public String dtsJobIds;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteDtsJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDtsJobsRequest self = new DeleteDtsJobsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDtsJobsRequest setDtsJobIds(String dtsJobIds) {
        this.dtsJobIds = dtsJobIds;
        return this;
    }
    public String getDtsJobIds() {
        return this.dtsJobIds;
    }

    public DeleteDtsJobsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
