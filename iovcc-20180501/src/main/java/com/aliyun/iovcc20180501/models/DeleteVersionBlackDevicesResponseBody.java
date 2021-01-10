// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DeleteVersionBlackDevicesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteVersionBlackDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteVersionBlackDevicesResponseBody self = new DeleteVersionBlackDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteVersionBlackDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
