// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class AddVersionGroupDevicesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AddVersionGroupDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddVersionGroupDevicesResponseBody self = new AddVersionGroupDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public AddVersionGroupDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
