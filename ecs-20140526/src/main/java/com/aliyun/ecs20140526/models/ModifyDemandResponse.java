// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyDemandResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyDemandResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDemandResponse self = new ModifyDemandResponse();
        return TeaModel.build(map, self);
    }

}
