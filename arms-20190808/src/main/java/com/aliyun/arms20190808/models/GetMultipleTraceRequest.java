// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetMultipleTraceRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("TraceIDs")
    public java.util.List<String> traceIDs;

    public static GetMultipleTraceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMultipleTraceRequest self = new GetMultipleTraceRequest();
        return TeaModel.build(map, self);
    }

}
