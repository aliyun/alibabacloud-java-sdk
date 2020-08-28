// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AttachDiskRequest extends TeaModel {
    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("DiskId")
    @Validation(required = true)
    public String diskId;

    @NameInMap("Device")
    public String device;

    @NameInMap("DeleteWithInstance")
    public Boolean deleteWithInstance;

    @NameInMap("Bootable")
    public Boolean bootable;

    @NameInMap("Password")
    public String password;

    @NameInMap("KeyPairName")
    public String keyPairName;

    public static AttachDiskRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachDiskRequest self = new AttachDiskRequest();
        return TeaModel.build(map, self);
    }

}
