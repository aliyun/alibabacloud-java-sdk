// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeleteDeviceResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeviceResponseBody self = new DeleteDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
