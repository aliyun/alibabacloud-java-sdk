// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteDiskResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteDiskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDiskResponse self = new DeleteDiskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDiskResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
