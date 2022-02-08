// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class UpdateDISyncTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateDISyncTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDISyncTaskResponseBody self = new UpdateDISyncTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDISyncTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
