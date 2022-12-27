// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateKeyPairResponseBody extends TeaModel {
    // The fingerprint of the key pair. The message-digest algorithm 5 (MD5) is used based on the public key fingerprint format defined in RFC 4716. For more information, see [RFC 4716](https://tools.ietf.org/html/rfc4716).
    @NameInMap("KeyPairFingerPrint")
    public String keyPairFingerPrint;

    // The ID of the SSH key pair.
    @NameInMap("KeyPairId")
    public String keyPairId;

    // The name of the SSH key pair.
    @NameInMap("KeyPairName")
    public String keyPairName;

    // The private key of the key pair. The private key is encoded with PEM in the PKCS#8 format.
    @NameInMap("PrivateKeyBody")
    public String privateKeyBody;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static CreateKeyPairResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateKeyPairResponseBody self = new CreateKeyPairResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateKeyPairResponseBody setKeyPairFingerPrint(String keyPairFingerPrint) {
        this.keyPairFingerPrint = keyPairFingerPrint;
        return this;
    }
    public String getKeyPairFingerPrint() {
        return this.keyPairFingerPrint;
    }

    public CreateKeyPairResponseBody setKeyPairId(String keyPairId) {
        this.keyPairId = keyPairId;
        return this;
    }
    public String getKeyPairId() {
        return this.keyPairId;
    }

    public CreateKeyPairResponseBody setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public CreateKeyPairResponseBody setPrivateKeyBody(String privateKeyBody) {
        this.privateKeyBody = privateKeyBody;
        return this;
    }
    public String getPrivateKeyBody() {
        return this.privateKeyBody;
    }

    public CreateKeyPairResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
