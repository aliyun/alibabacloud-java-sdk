// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ResizeClusterV2ResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ClusterId")
    public String clusterId;

    public static ResizeClusterV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResizeClusterV2ResponseBody self = new ResizeClusterV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public ResizeClusterV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ResizeClusterV2ResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
