// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateDeviceResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeviceResponseBody self = new UpdateDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
