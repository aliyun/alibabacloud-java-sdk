// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class GetMultipleTraceRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TraceIDs")
    public java.util.List<String> traceIDs;

    public static GetMultipleTraceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMultipleTraceRequest self = new GetMultipleTraceRequest();
        return TeaModel.build(map, self);
    }

    public GetMultipleTraceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetMultipleTraceRequest setTraceIDs(java.util.List<String> traceIDs) {
        this.traceIDs = traceIDs;
        return this;
    }
    public java.util.List<String> getTraceIDs() {
        return this.traceIDs;
    }

}
