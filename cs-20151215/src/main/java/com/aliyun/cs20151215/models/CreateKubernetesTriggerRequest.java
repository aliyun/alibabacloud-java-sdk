// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CreateKubernetesTriggerRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateKubernetesTriggerBody body;

    public static CreateKubernetesTriggerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateKubernetesTriggerRequest self = new CreateKubernetesTriggerRequest();
        return TeaModel.build(map, self);
    }

}
