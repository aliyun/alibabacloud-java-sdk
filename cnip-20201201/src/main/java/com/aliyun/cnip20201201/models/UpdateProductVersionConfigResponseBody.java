// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class UpdateProductVersionConfigResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static UpdateProductVersionConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateProductVersionConfigResponseBody self = new UpdateProductVersionConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateProductVersionConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
