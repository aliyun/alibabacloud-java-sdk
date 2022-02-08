// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class DeleteDISyncTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDISyncTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDISyncTaskResponseBody self = new DeleteDISyncTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDISyncTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
