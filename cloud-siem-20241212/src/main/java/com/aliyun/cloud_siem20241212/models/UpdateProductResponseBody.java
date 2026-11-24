// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class UpdateProductResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateProductResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateProductResponseBody self = new UpdateProductResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateProductResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
