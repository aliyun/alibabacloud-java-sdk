// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceVpcAttributeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyInstanceVpcAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceVpcAttributeResponse self = new ModifyInstanceVpcAttributeResponse();
        return TeaModel.build(map, self);
    }

}
