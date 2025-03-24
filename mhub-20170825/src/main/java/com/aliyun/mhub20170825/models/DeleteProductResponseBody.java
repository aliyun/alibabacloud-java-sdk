// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mhub20170825.models;

import com.aliyun.tea.*;

public class DeleteProductResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>PRODUCT_NOT_ALONE</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>126D4DDD-05A5-49B1-B18C-39C4A929BFB2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteProductResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteProductResponseBody self = new DeleteProductResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteProductResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteProductResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
