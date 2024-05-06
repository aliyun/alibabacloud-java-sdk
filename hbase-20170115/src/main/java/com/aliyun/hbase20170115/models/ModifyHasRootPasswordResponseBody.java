// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class ModifyHasRootPasswordResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyHasRootPasswordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyHasRootPasswordResponseBody self = new ModifyHasRootPasswordResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyHasRootPasswordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
