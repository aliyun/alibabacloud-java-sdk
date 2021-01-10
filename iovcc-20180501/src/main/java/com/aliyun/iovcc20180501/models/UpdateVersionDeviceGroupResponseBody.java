// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class UpdateVersionDeviceGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateVersionDeviceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateVersionDeviceGroupResponseBody self = new UpdateVersionDeviceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateVersionDeviceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
