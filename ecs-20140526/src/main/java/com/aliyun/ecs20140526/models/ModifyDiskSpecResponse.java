// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyDiskSpecResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TaskId")
    @Validation(required = true)
    public String taskId;

    public static ModifyDiskSpecResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDiskSpecResponse self = new ModifyDiskSpecResponse();
        return TeaModel.build(map, self);
    }

}
