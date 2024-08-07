// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteDevicesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>2AF861B4-0ECC-130C-B100-21A01E02****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDevicesResponseBody self = new DeleteDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
