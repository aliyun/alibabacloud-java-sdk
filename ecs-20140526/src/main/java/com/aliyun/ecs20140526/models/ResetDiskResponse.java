// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ResetDiskResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ResetDiskResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetDiskResponse self = new ResetDiskResponse();
        return TeaModel.build(map, self);
    }

}
