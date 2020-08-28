// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DetachDiskResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DetachDiskResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachDiskResponse self = new DetachDiskResponse();
        return TeaModel.build(map, self);
    }

}
