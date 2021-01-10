// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DeleteAllVersionGroupDevicesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAllVersionGroupDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAllVersionGroupDevicesResponseBody self = new DeleteAllVersionGroupDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAllVersionGroupDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
