// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateEnterpriseAccelerateTargetResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>D1AE33DD-0D46-59CD-8340-92BEA2BDD0F1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateEnterpriseAccelerateTargetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEnterpriseAccelerateTargetResponseBody self = new CreateEnterpriseAccelerateTargetResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEnterpriseAccelerateTargetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
