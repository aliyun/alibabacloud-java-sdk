// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class DeleteAccessKeyResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAccessKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAccessKeyResponseBody self = new DeleteAccessKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAccessKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
