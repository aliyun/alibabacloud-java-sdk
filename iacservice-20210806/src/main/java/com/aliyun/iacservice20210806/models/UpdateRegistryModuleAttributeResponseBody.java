// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class UpdateRegistryModuleAttributeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>127A5B81-D1E7-5E33-8D44-B89507C4B81F</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateRegistryModuleAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateRegistryModuleAttributeResponseBody self = new UpdateRegistryModuleAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateRegistryModuleAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
