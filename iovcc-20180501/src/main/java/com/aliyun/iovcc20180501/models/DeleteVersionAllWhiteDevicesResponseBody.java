// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DeleteVersionAllWhiteDevicesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteVersionAllWhiteDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteVersionAllWhiteDevicesResponseBody self = new DeleteVersionAllWhiteDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteVersionAllWhiteDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
