// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class GetKubernetesTriggerResponseBody extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

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

    @NameInMap("token")
    @Validation(required = true)
    public String token;

    public static GetKubernetesTriggerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetKubernetesTriggerResponseBody self = new GetKubernetesTriggerResponseBody();
        return TeaModel.build(map, self);
    }

}
