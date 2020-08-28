// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class GetKubernetesTriggerRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("query")
    @Validation(required = true)
    public GetKubernetesTriggerQuery query;

    public static GetKubernetesTriggerRequest build(java.util.Map<String, ?> map) throws Exception {
        GetKubernetesTriggerRequest self = new GetKubernetesTriggerRequest();
        return TeaModel.build(map, self);
    }

}
