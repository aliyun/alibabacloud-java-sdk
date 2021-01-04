// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.batchcompute20151111.models;

import com.aliyun.tea.*;

public class ReportTaskStatusRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static ReportTaskStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ReportTaskStatusRequest self = new ReportTaskStatusRequest();
        return TeaModel.build(map, self);
    }

    public ReportTaskStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
