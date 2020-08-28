// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateKeyPairResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("KeyPairId")
    @Validation(required = true)
    public String keyPairId;

    @NameInMap("KeyPairName")
    @Validation(required = true)
    public String keyPairName;

    @NameInMap("KeyPairFingerPrint")
    @Validation(required = true)
    public String keyPairFingerPrint;

    @NameInMap("PrivateKeyBody")
    @Validation(required = true)
    public String privateKeyBody;

    public static CreateKeyPairResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateKeyPairResponse self = new CreateKeyPairResponse();
        return TeaModel.build(map, self);
    }

}
