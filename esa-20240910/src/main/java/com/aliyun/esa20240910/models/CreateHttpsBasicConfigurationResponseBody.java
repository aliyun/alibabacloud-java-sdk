// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateHttpsBasicConfigurationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>352816096987136</p>
     */
    @NameInMap("ConfigId")
    public Long configId;

    /**
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateHttpsBasicConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateHttpsBasicConfigurationResponseBody self = new CreateHttpsBasicConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateHttpsBasicConfigurationResponseBody setConfigId(Long configId) {
        this.configId = configId;
        return this;
    }
    public Long getConfigId() {
        return this.configId;
    }

    public CreateHttpsBasicConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
