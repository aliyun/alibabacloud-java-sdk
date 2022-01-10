// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetCodeSourcesStatisticsResponseBody extends TeaModel {
    // 此用户可以查看的代码的数目
    @NameInMap("Count")
    public Long count;

    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static GetCodeSourcesStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCodeSourcesStatisticsResponseBody self = new GetCodeSourcesStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCodeSourcesStatisticsResponseBody setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public GetCodeSourcesStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
