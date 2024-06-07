// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DeleteUserDevicesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteUserDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserDevicesResponseBody self = new DeleteUserDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteUserDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
