// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class UpdateComponentToProductResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static UpdateComponentToProductResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateComponentToProductResponseBody self = new UpdateComponentToProductResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateComponentToProductResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
