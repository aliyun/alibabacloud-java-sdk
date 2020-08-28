// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DeleteKubernetesTriggerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteKubernetesTriggerResponseBody body;

    public static DeleteKubernetesTriggerResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteKubernetesTriggerResponse self = new DeleteKubernetesTriggerResponse();
        return TeaModel.build(map, self);
    }

}
