// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DeleteVersionAllBlackDevicesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteVersionAllBlackDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteVersionAllBlackDevicesResponseBody self = new DeleteVersionAllBlackDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteVersionAllBlackDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
