// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeleteDeviceFormResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDeviceFormResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeviceFormResponseBody self = new DeleteDeviceFormResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDeviceFormResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
