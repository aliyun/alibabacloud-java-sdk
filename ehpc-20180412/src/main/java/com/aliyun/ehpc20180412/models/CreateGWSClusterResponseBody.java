// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class CreateGWSClusterResponseBody extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateGWSClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateGWSClusterResponseBody self = new CreateGWSClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateGWSClusterResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateGWSClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
