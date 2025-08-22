// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class DeleteRegistryNamespaceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1D0CD708-E433-5F13-8A42-823C95FC756C</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DeleteRegistryNamespaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRegistryNamespaceResponseBody self = new DeleteRegistryNamespaceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRegistryNamespaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
