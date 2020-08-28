// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CreateKeyRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("KeyUsage")
    public String keyUsage;

    @NameInMap("Origin")
    public String origin;

    @NameInMap("ProtectionLevel")
    public String protectionLevel;

    @NameInMap("EnableAutomaticRotation")
    public Boolean enableAutomaticRotation;

    @NameInMap("RotationInterval")
    public String rotationInterval;

    @NameInMap("KeySpec")
    public String keySpec;

    public static CreateKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateKeyRequest self = new CreateKeyRequest();
        return TeaModel.build(map, self);
    }

}
