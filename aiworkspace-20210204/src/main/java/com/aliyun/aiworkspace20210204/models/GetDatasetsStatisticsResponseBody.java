// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetDatasetsStatisticsResponseBody extends TeaModel {
    // Count
    @NameInMap("Count")
    public Long count;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static GetDatasetsStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDatasetsStatisticsResponseBody self = new GetDatasetsStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDatasetsStatisticsResponseBody setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public GetDatasetsStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
