// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class AddVersionBlackDevicesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AddVersionBlackDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddVersionBlackDevicesResponseBody self = new AddVersionBlackDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public AddVersionBlackDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
