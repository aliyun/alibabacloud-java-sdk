// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SearchTraceAppByNameRequest extends TeaModel {
    @NameInMap("TraceAppName")
    public String traceAppName;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    public static SearchTraceAppByNameRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchTraceAppByNameRequest self = new SearchTraceAppByNameRequest();
        return TeaModel.build(map, self);
    }

}
