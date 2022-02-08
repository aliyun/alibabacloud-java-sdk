// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class StartDISyncInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static StartDISyncInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartDISyncInstanceResponseBody self = new StartDISyncInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public StartDISyncInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
