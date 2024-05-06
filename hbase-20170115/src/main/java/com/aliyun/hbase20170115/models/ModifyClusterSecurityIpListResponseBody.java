// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class ModifyClusterSecurityIpListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyClusterSecurityIpListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterSecurityIpListResponseBody self = new ModifyClusterSecurityIpListResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyClusterSecurityIpListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
