// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeleteDevicePropertyResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDevicePropertyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDevicePropertyResponseBody self = new DeleteDevicePropertyResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDevicePropertyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
