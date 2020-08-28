// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class GetKubernetesTriggerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public java.util.List<GetKubernetesTriggerResponseBody> body;

    public static GetKubernetesTriggerResponse build(java.util.Map<String, ?> map) throws Exception {
        GetKubernetesTriggerResponse self = new GetKubernetesTriggerResponse();
        return TeaModel.build(map, self);
    }

}
