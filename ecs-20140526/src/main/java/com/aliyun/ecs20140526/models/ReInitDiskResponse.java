// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ReInitDiskResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ReInitDiskResponse build(java.util.Map<String, ?> map) throws Exception {
        ReInitDiskResponse self = new ReInitDiskResponse();
        return TeaModel.build(map, self);
    }

}
