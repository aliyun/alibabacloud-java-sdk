// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateDeviceFormResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateDeviceFormResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeviceFormResponseBody self = new UpdateDeviceFormResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDeviceFormResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
