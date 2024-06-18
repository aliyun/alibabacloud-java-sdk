// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class UpdateServiceInstanceAttributeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0CB2E0A9-B4DF-5C16-86AD-C511C483144B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateServiceInstanceAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceInstanceAttributeResponseBody self = new UpdateServiceInstanceAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateServiceInstanceAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
