// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class GetKubernetesTriggerQuery extends TeaModel {
    @NameInMap("Namespace")
    @Validation(required = true)
    public String namespace;

    @NameInMap("Type")
    @Validation(required = true)
    public String type;

    @NameInMap("Name")
    @Validation(required = true)
    public String name;

    public static GetKubernetesTriggerQuery build(java.util.Map<String, ?> map) throws Exception {
        GetKubernetesTriggerQuery self = new GetKubernetesTriggerQuery();
        return TeaModel.build(map, self);
    }

}
