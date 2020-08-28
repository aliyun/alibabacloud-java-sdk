// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SearchTraceAppByPageRequest extends TeaModel {
    @NameInMap("TraceAppName")
    public String traceAppName;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    public static SearchTraceAppByPageRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchTraceAppByPageRequest self = new SearchTraceAppByPageRequest();
        return TeaModel.build(map, self);
    }

}
