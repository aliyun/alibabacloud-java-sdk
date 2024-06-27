// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateExtensionsResponseBody extends TeaModel {
    /**
     * <p>The name of the extension that you want to install. Multiple extension names are separated with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>citext, dblink</p>
     */
    @NameInMap("Extensions")
    public String extensions;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
     */
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
