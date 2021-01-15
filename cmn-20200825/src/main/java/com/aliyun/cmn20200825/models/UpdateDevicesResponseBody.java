// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateDevicesResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDevicesResponseBody self = new UpdateDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
