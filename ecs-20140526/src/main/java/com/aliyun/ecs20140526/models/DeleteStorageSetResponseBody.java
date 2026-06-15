// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteStorageSetResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteStorageSetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteStorageSetResponseBody self = new DeleteStorageSetResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteStorageSetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
