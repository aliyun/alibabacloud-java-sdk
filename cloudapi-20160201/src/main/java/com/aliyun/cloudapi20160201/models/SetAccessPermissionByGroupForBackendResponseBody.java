// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class SetAccessPermissionByGroupForBackendResponseBody extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RequestId")
    public String requestId;

    public static SetAccessPermissionByGroupForBackendResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetAccessPermissionByGroupForBackendResponseBody self = new SetAccessPermissionByGroupForBackendResponseBody();
        return TeaModel.build(map, self);
    }

    public SetAccessPermissionByGroupForBackendResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SetAccessPermissionByGroupForBackendResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
