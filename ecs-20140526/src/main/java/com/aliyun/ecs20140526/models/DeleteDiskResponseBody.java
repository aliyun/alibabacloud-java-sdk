// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteDiskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDiskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDiskResponseBody self = new DeleteDiskResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDiskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
