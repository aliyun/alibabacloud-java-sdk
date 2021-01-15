// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateDevicePropertyResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateDevicePropertyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDevicePropertyResponseBody self = new UpdateDevicePropertyResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDevicePropertyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
