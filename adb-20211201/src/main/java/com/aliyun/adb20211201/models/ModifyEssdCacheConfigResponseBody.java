// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifyEssdCacheConfigResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>115F9CCA-EF2E-5F91-AB60-4961D52FEAB4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyEssdCacheConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyEssdCacheConfigResponseBody self = new ModifyEssdCacheConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyEssdCacheConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
