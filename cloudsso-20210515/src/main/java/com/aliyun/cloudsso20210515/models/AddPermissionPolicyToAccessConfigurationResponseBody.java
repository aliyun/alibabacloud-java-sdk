// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class AddPermissionPolicyToAccessConfigurationResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B7C6E839-FB65-59BE-B753-003AA8AF7DF7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddPermissionPolicyToAccessConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddPermissionPolicyToAccessConfigurationResponseBody self = new AddPermissionPolicyToAccessConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public AddPermissionPolicyToAccessConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
