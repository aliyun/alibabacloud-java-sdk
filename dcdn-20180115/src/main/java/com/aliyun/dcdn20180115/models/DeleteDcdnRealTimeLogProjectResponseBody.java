// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DeleteDcdnRealTimeLogProjectResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDcdnRealTimeLogProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDcdnRealTimeLogProjectResponseBody self = new DeleteDcdnRealTimeLogProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDcdnRealTimeLogProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
