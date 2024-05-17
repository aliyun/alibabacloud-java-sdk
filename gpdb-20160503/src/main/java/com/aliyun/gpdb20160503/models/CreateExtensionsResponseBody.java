// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateExtensionsResponseBody extends TeaModel {
    @NameInMap("Extensions")
    public String extensions;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateExtensionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateExtensionsResponseBody self = new CreateExtensionsResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateExtensionsResponseBody setExtensions(String extensions) {
        this.extensions = extensions;
        return this;
    }
    public String getExtensions() {
        return this.extensions;
    }

    public CreateExtensionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
