// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ModifyClusterResponseBody extends TeaModel {
    @NameInMap("cluster_id")
    @Validation(required = true)
    public String clusterId;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("task_id")
    @Validation(required = true)
    public String taskId;

    public static ModifyClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterResponseBody self = new ModifyClusterResponseBody();
        return TeaModel.build(map, self);
    }

}
