// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ModifyAccountPasswordResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyAccountPasswordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccountPasswordResponseBody self = new ModifyAccountPasswordResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAccountPasswordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
