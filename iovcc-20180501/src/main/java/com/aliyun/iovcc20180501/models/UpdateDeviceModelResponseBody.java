// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class UpdateDeviceModelResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateDeviceModelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeviceModelResponseBody self = new UpdateDeviceModelResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDeviceModelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
