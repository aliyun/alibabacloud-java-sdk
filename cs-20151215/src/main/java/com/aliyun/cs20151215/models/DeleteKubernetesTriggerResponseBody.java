// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DeleteKubernetesTriggerResponseBody extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteKubernetesTriggerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteKubernetesTriggerResponseBody self = new DeleteKubernetesTriggerResponseBody();
        return TeaModel.build(map, self);
    }

}
