// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class ModifyClusterNetTypeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyClusterNetTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterNetTypeResponseBody self = new ModifyClusterNetTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyClusterNetTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
