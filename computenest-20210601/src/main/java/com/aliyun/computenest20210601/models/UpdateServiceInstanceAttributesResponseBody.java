// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class UpdateServiceInstanceAttributesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>06BF8F22-02DC-4750-83DF-3FFC11C065EA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateServiceInstanceAttributesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceInstanceAttributesResponseBody self = new UpdateServiceInstanceAttributesResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateServiceInstanceAttributesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
