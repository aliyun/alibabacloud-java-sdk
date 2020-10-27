// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteStorageSetResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteStorageSetResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteStorageSetResponse self = new DeleteStorageSetResponse();
        return TeaModel.build(map, self);
    }

    public DeleteStorageSetResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
