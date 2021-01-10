// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DeleteVersionGroupDeviceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteVersionGroupDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteVersionGroupDeviceResponseBody self = new DeleteVersionGroupDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteVersionGroupDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
