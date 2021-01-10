// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DeleteVersionWhiteDevicesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteVersionWhiteDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteVersionWhiteDevicesResponseBody self = new DeleteVersionWhiteDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteVersionWhiteDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
