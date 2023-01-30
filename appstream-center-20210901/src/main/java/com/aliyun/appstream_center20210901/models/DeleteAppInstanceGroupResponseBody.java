// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class DeleteAppInstanceGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAppInstanceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppInstanceGroupResponseBody self = new DeleteAppInstanceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAppInstanceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
