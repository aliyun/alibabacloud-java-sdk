// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateDiskResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DiskId")
    @Validation(required = true)
    public String diskId;

    public static CreateDiskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDiskResponse self = new CreateDiskResponse();
        return TeaModel.build(map, self);
    }

}
