// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class ModifyResourceMetaResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyResourceMetaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyResourceMetaResponseBody self = new ModifyResourceMetaResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyResourceMetaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
