// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CreateKubernetesTriggerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateKubernetesTriggerResponseBody body;

    public static CreateKubernetesTriggerResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateKubernetesTriggerResponse self = new CreateKubernetesTriggerResponse();
        return TeaModel.build(map, self);
    }

}
