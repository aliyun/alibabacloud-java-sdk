// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ReplaceSystemDiskRequest extends TeaModel {
    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("SystemDisk")
    @Validation(required = true)
    public ReplaceSystemDiskRequestSystemDisk systemDisk;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("UseAdditionalService")
    public Boolean useAdditionalService;

    @NameInMap("Password")
    public String password;

    @NameInMap("PasswordInherit")
    public Boolean passwordInherit;

    @NameInMap("KeyPairName")
    public String keyPairName;

    @NameInMap("DiskId")
    public String diskId;

    @NameInMap("Platform")
    public String platform;

    @NameInMap("Architecture")
    public String architecture;

    @NameInMap("SecurityEnhancementStrategy")
    public String securityEnhancementStrategy;

    public static ReplaceSystemDiskRequest build(java.util.Map<String, ?> map) throws Exception {
        ReplaceSystemDiskRequest self = new ReplaceSystemDiskRequest();
        return TeaModel.build(map, self);
    }

    public static class ReplaceSystemDiskRequestSystemDisk extends TeaModel {
        @NameInMap("Size")
        public Integer size;

        public static ReplaceSystemDiskRequestSystemDisk build(java.util.Map<String, ?> map) throws Exception {
            ReplaceSystemDiskRequestSystemDisk self = new ReplaceSystemDiskRequestSystemDisk();
            return TeaModel.build(map, self);
        }

    }

}
