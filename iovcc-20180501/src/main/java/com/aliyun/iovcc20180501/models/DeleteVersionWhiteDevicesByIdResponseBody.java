// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DeleteVersionWhiteDevicesByIdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteVersionWhiteDevicesByIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteVersionWhiteDevicesByIdResponseBody self = new DeleteVersionWhiteDevicesByIdResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteVersionWhiteDevicesByIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
