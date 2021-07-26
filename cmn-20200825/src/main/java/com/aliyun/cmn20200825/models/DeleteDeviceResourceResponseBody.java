// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeleteDeviceResourceResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDeviceResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeviceResourceResponseBody self = new DeleteDeviceResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDeviceResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
