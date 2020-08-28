// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ImportKeyPairResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("KeyPairName")
    @Validation(required = true)
    public String keyPairName;

    @NameInMap("KeyPairFingerPrint")
    @Validation(required = true)
    public String keyPairFingerPrint;

    public static ImportKeyPairResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportKeyPairResponse self = new ImportKeyPairResponse();
        return TeaModel.build(map, self);
    }

}
