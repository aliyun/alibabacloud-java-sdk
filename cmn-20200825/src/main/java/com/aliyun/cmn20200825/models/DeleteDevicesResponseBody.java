// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeleteDevicesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDevicesResponseBody self = new DeleteDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
