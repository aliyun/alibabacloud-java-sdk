// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SearchTraceAppByNameRequest extends TeaModel {
    @NameInMap("TraceAppName")
    public String traceAppName;

    @NameInMap("RegionId")
    public String regionId;

    public static SearchTraceAppByNameRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchTraceAppByNameRequest self = new SearchTraceAppByNameRequest();
        return TeaModel.build(map, self);
    }

    public SearchTraceAppByNameRequest setTraceAppName(String traceAppName) {
        this.traceAppName = traceAppName;
        return this;
    }
    public String getTraceAppName() {
        return this.traceAppName;
    }

    public SearchTraceAppByNameRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
