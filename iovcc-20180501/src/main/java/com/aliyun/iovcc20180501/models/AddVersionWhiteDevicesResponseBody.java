// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class AddVersionWhiteDevicesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AddVersionWhiteDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddVersionWhiteDevicesResponseBody self = new AddVersionWhiteDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public AddVersionWhiteDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
