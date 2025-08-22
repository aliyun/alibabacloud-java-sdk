// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class UpdateRegistryNamespaceAttributeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("namespaceName")
    public String namespaceName;

    /**
     * <strong>example:</strong>
     * <p>CA5C5B39-D1DC-5309-8E97-B9A91DA21094</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateRegistryNamespaceAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateRegistryNamespaceAttributeResponseBody self = new UpdateRegistryNamespaceAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateRegistryNamespaceAttributeResponseBody setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
        return this;
    }
    public String getNamespaceName() {
        return this.namespaceName;
    }

    public UpdateRegistryNamespaceAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
