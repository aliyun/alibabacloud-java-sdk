// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DeleteExtensionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteExtensionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteExtensionResponseBody self = new DeleteExtensionResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteExtensionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
