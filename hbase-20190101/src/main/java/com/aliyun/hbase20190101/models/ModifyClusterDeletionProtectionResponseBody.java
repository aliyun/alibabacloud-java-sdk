// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ModifyClusterDeletionProtectionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyClusterDeletionProtectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterDeletionProtectionResponseBody self = new ModifyClusterDeletionProtectionResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyClusterDeletionProtectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
