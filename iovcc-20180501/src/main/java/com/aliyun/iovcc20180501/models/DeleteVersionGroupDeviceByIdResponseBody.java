// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DeleteVersionGroupDeviceByIdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteVersionGroupDeviceByIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteVersionGroupDeviceByIdResponseBody self = new DeleteVersionGroupDeviceByIdResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteVersionGroupDeviceByIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
