// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class DeleteLogStoreResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>6276D891-*****-55B2-87B9-74D413F7****。</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteLogStoreResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLogStoreResponseBody self = new DeleteLogStoreResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLogStoreResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
