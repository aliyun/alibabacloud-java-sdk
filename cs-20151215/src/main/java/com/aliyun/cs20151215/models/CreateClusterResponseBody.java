// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CreateClusterResponseBody extends TeaModel {
    @NameInMap("cluster_id")
    @Validation(required = true)
    public String clusterId;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("task_id")
    @Validation(required = true)
    public String taskId;

    public static CreateClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterResponseBody self = new CreateClusterResponseBody();
        return TeaModel.build(map, self);
    }

}
