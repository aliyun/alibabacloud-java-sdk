// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CreateRegistryNamespaceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>iac</p>
     */
    @NameInMap("namespaceName")
    public String namespaceName;

    /**
     * <strong>example:</strong>
     * <p>B4672AE3-C313-5B7A-BB24-45345570D398</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateRegistryNamespaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRegistryNamespaceResponseBody self = new CreateRegistryNamespaceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRegistryNamespaceResponseBody setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
        return this;
    }
    public String getNamespaceName() {
        return this.namespaceName;
    }

    public CreateRegistryNamespaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
