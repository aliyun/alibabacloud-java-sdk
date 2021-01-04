// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.batchcompute20151111.models;

import com.aliyun.tea.*;

public class ReportWorkerStatusRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static ReportWorkerStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ReportWorkerStatusRequest self = new ReportWorkerStatusRequest();
        return TeaModel.build(map, self);
    }

    public ReportWorkerStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
