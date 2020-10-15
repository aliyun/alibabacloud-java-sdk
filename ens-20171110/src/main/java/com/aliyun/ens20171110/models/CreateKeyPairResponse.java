// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateKeyPairResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("KeyPairId")
    @Validation(required = true)
    public String keyPairId;

    @NameInMap("PrivateKeyBody")
    @Validation(required = true)
    public String privateKeyBody;

    @NameInMap("KeyPairName")
    @Validation(required = true)
    public String keyPairName;

    @NameInMap("KeyPairFingerPrint")
    @Validation(required = true)
    public String keyPairFingerPrint;

    public static CreateKeyPairResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateKeyPairResponse self = new CreateKeyPairResponse();
        return TeaModel.build(map, self);
    }

    public CreateKeyPairResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateKeyPairResponse setKeyPairId(String keyPairId) {
        this.keyPairId = keyPairId;
        return this;
    }
    public String getKeyPairId() {
        return this.keyPairId;
    }

    public CreateKeyPairResponse setPrivateKeyBody(String privateKeyBody) {
        this.privateKeyBody = privateKeyBody;
        return this;
    }
    public String getPrivateKeyBody() {
        return this.privateKeyBody;
    }

    public CreateKeyPairResponse setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public CreateKeyPairResponse setKeyPairFingerPrint(String keyPairFingerPrint) {
        this.keyPairFingerPrint = keyPairFingerPrint;
        return this;
    }
    public String getKeyPairFingerPrint() {
        return this.keyPairFingerPrint;
    }

}
