// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class RemovePermissionPolicyFromAccessConfigurationResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9B13E4EE-3853-5852-9165-597C32AD8FB7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RemovePermissionPolicyFromAccessConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemovePermissionPolicyFromAccessConfigurationResponseBody self = new RemovePermissionPolicyFromAccessConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public RemovePermissionPolicyFromAccessConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
