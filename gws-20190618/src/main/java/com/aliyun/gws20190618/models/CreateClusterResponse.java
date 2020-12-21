// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gws20190618.models;

import com.aliyun.tea.*;

public class CreateClusterResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ClusterId")
    @Validation(required = true)
    public String clusterId;

    public static CreateClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterResponse self = new CreateClusterResponse();
        return TeaModel.build(map, self);
    }

    public CreateClusterResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateClusterResponse setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
