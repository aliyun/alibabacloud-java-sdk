// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class DeleteAccessGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAccessGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAccessGroupResponseBody self = new DeleteAccessGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAccessGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
