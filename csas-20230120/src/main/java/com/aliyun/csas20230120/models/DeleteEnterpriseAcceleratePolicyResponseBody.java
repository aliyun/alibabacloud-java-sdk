// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DeleteEnterpriseAcceleratePolicyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2CABFEBB-0CE7-575E-833A-266F75D46713</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteEnterpriseAcceleratePolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteEnterpriseAcceleratePolicyResponseBody self = new DeleteEnterpriseAcceleratePolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteEnterpriseAcceleratePolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
