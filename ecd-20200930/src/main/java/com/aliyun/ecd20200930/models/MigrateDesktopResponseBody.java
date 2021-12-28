// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class MigrateDesktopResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static MigrateDesktopResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MigrateDesktopResponseBody self = new MigrateDesktopResponseBody();
        return TeaModel.build(map, self);
    }

    public MigrateDesktopResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
