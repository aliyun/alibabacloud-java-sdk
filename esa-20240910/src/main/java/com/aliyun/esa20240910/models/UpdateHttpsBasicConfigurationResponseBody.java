// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateHttpsBasicConfigurationResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0AEDAF20-4DDF-4165-8750-47FF9C1929C9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateHttpsBasicConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateHttpsBasicConfigurationResponseBody self = new UpdateHttpsBasicConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateHttpsBasicConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
