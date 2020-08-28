// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyRouterInterfaceSpecResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Spec")
    @Validation(required = true)
    public String spec;

    public static ModifyRouterInterfaceSpecResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyRouterInterfaceSpecResponse self = new ModifyRouterInterfaceSpecResponse();
        return TeaModel.build(map, self);
    }

}
