// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class CreateClusterHostGroupResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("HostGroupId")
    public String hostGroupId;

    public static CreateClusterHostGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterHostGroupResponseBody self = new CreateClusterHostGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateClusterHostGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateClusterHostGroupResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateClusterHostGroupResponseBody setHostGroupId(String hostGroupId) {
        this.hostGroupId = hostGroupId;
        return this;
    }
    public String getHostGroupId() {
        return this.hostGroupId;
    }

}
