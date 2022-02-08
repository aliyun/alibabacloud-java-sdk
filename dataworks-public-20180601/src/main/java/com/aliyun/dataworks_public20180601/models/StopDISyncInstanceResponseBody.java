// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class StopDISyncInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static StopDISyncInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopDISyncInstanceResponseBody self = new StopDISyncInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public StopDISyncInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
