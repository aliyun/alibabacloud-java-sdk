// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CreateKubernetesTriggerResponseBody extends TeaModel {
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    @NameInMap("cluster_id")
    @Validation(required = true)
    public String clusterId;

    @NameInMap("project_id")
    @Validation(required = true)
    public String projectId;

    @NameInMap("action")
    @Validation(required = true)
    public String action;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static CreateKubernetesTriggerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateKubernetesTriggerResponseBody self = new CreateKubernetesTriggerResponseBody();
        return TeaModel.build(map, self);
    }

}
