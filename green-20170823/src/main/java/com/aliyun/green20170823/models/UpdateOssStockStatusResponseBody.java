// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class UpdateOssStockStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateOssStockStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateOssStockStatusResponseBody self = new UpdateOssStockStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateOssStockStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
