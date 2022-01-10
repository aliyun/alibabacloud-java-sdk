// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetImagesStatisticsResponseBody extends TeaModel {
    // 镜像总数
    @NameInMap("Count")
    public Long count;

    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static GetImagesStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetImagesStatisticsResponseBody self = new GetImagesStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetImagesStatisticsResponseBody setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public GetImagesStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
