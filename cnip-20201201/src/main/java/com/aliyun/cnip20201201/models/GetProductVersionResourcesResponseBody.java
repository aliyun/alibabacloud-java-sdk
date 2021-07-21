// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class GetProductVersionResourcesResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static GetProductVersionResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProductVersionResourcesResponseBody self = new GetProductVersionResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProductVersionResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
