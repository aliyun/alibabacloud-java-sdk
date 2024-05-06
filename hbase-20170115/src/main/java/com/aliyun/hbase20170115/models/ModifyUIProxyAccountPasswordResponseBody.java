// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class ModifyUIProxyAccountPasswordResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyUIProxyAccountPasswordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyUIProxyAccountPasswordResponseBody self = new ModifyUIProxyAccountPasswordResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyUIProxyAccountPasswordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
