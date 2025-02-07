// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateHttpsApplicationConfigurationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>35C66C7B-671H-4297-9187-2C4477247A78</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateHttpsApplicationConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateHttpsApplicationConfigurationResponseBody self = new UpdateHttpsApplicationConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateHttpsApplicationConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
