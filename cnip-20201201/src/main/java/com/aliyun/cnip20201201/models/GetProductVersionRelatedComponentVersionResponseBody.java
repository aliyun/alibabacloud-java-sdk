// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class GetProductVersionRelatedComponentVersionResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static GetProductVersionRelatedComponentVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProductVersionRelatedComponentVersionResponseBody self = new GetProductVersionRelatedComponentVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProductVersionRelatedComponentVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
