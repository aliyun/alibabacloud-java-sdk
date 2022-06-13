// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class UpdateBatchOperateCardsTaskResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateBatchOperateCardsTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateBatchOperateCardsTaskResponseBody self = new UpdateBatchOperateCardsTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateBatchOperateCardsTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
