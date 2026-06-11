// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DeleteContextStoreAPIKeyResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>264C3E89-XXXX-XXXX-XXXX-CE9C2196C7DC</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DeleteContextStoreAPIKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteContextStoreAPIKeyResponseBody self = new DeleteContextStoreAPIKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteContextStoreAPIKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
