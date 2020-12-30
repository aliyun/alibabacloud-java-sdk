// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ModifyResourceQueueResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyResourceQueueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyResourceQueueResponseBody self = new ModifyResourceQueueResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyResourceQueueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
