// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class MigrateDesktopsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static MigrateDesktopsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MigrateDesktopsResponseBody self = new MigrateDesktopsResponseBody();
        return TeaModel.build(map, self);
    }

    public MigrateDesktopsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
