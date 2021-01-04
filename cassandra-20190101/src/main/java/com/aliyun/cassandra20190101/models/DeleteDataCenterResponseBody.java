// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class DeleteDataCenterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDataCenterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataCenterResponseBody self = new DeleteDataCenterResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDataCenterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
