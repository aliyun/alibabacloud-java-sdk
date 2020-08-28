// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AttachKeyPairRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("KeyPairName")
    @Validation(required = true)
    public String keyPairName;

    @NameInMap("InstanceIds")
    @Validation(required = true)
    public String instanceIds;

    public static AttachKeyPairRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachKeyPairRequest self = new AttachKeyPairRequest();
        return TeaModel.build(map, self);
    }

}
