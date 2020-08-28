// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ReplaceSystemDiskResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DiskId")
    @Validation(required = true)
    public String diskId;

    public static ReplaceSystemDiskResponse build(java.util.Map<String, ?> map) throws Exception {
        ReplaceSystemDiskResponse self = new ReplaceSystemDiskResponse();
        return TeaModel.build(map, self);
    }

}
