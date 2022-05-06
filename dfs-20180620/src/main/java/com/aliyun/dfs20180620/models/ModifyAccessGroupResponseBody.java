// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class ModifyAccessGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyAccessGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccessGroupResponseBody self = new ModifyAccessGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAccessGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
