// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.es_serverless20220822.models;

import com.aliyun.tea.*;

public class GetRegionInfoResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    public static GetRegionInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRegionInfoResponseBody self = new GetRegionInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRegionInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
