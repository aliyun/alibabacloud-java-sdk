// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ScaleOutClusterResponseBody extends TeaModel {
    @NameInMap("cluster_id")
    @Validation(required = true)
    public String clusterId;

    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    @NameInMap("task_id")
    @Validation(required = true)
    public String taskId;

    @NameInMap("instanceId")
    @Validation(required = true)
    public String instanceId;

    public static ScaleOutClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ScaleOutClusterResponseBody self = new ScaleOutClusterResponseBody();
        return TeaModel.build(map, self);
    }

}
