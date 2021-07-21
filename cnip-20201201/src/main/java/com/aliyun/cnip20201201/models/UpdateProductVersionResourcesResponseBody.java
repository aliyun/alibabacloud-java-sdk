// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class UpdateProductVersionResourcesResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static UpdateProductVersionResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateProductVersionResourcesResponseBody self = new UpdateProductVersionResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateProductVersionResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
