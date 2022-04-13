// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateDedicatedBlockStorageClusterResponseBody extends TeaModel {
    @NameInMap("DedicatedBlockStorageClusterId")
    public String dedicatedBlockStorageClusterId;

    @NameInMap("DedicatedBlockStorageClusterOrderId")
    public String dedicatedBlockStorageClusterOrderId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateDedicatedBlockStorageClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDedicatedBlockStorageClusterResponseBody self = new CreateDedicatedBlockStorageClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDedicatedBlockStorageClusterResponseBody setDedicatedBlockStorageClusterId(String dedicatedBlockStorageClusterId) {
        this.dedicatedBlockStorageClusterId = dedicatedBlockStorageClusterId;
        return this;
    }
    public String getDedicatedBlockStorageClusterId() {
        return this.dedicatedBlockStorageClusterId;
    }

    public CreateDedicatedBlockStorageClusterResponseBody setDedicatedBlockStorageClusterOrderId(String dedicatedBlockStorageClusterOrderId) {
        this.dedicatedBlockStorageClusterOrderId = dedicatedBlockStorageClusterOrderId;
        return this;
    }
    public String getDedicatedBlockStorageClusterOrderId() {
        return this.dedicatedBlockStorageClusterOrderId;
    }

    public CreateDedicatedBlockStorageClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
