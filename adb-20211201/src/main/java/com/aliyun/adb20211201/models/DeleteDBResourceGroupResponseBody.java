// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DeleteDBResourceGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDBResourceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDBResourceGroupResponseBody self = new DeleteDBResourceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDBResourceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
