// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DetachDiskRequest extends TeaModel {
    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("DiskId")
    @Validation(required = true)
    public String diskId;

    @NameInMap("DeleteWithInstance")
    public Boolean deleteWithInstance;

    public static DetachDiskRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachDiskRequest self = new DetachDiskRequest();
        return TeaModel.build(map, self);
    }

}
