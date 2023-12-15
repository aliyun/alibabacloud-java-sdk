// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20181219.models;

import com.aliyun.tea.*;

public class GetTraceRequest extends TeaModel {
    @NameInMap("AppType")
    public String appType;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TraceID")
    public String traceID;

    public static GetTraceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTraceRequest self = new GetTraceRequest();
        return TeaModel.build(map, self);
    }

    public GetTraceRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public GetTraceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetTraceRequest setTraceID(String traceID) {
        this.traceID = traceID;
        return this;
    }
    public String getTraceID() {
        return this.traceID;
    }

}
