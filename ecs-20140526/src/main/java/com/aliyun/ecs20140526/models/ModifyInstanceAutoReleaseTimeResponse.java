// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceAutoReleaseTimeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyInstanceAutoReleaseTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceAutoReleaseTimeResponse self = new ModifyInstanceAutoReleaseTimeResponse();
        return TeaModel.build(map, self);
    }

}
