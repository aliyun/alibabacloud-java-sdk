// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class UpdateModuleAttributeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>CA05185E-6B90-5941-98D4-7212688AECC8</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateModuleAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateModuleAttributeResponseBody self = new UpdateModuleAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateModuleAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
