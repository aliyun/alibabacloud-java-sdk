// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ModifyTenantMemoryConfigResponseBody extends TeaModel {
    /**
     * <p>The unique identifier of the request, which can be used for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>01A1CEEB-CDFF-18F9-B2BF-9997600D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyTenantMemoryConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyTenantMemoryConfigResponseBody self = new ModifyTenantMemoryConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyTenantMemoryConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
