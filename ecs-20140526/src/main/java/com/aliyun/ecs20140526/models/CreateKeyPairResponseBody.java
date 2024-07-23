// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateKeyPairResponseBody extends TeaModel {
    /**
     * <p>The fingerprint of the key pair. The message-digest algorithm 5 (MD5) is used based on the public key fingerprint format defined in RFC 4716. For more information, see <a href="https://tools.ietf.org/html/rfc4716">RFC 4716</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>89:f0:ba:62:ac:b8:aa:e1:61:5e:fd:81:69:86:6d:6b:f0:c0:5a:**</p>
     */
    @NameInMap("KeyPairFingerPrint")
    public String keyPairFingerPrint;

    /**
     * <p>The ID of the key pair.</p>
     * 
     * <strong>example:</strong>
     * <p>ssh-bp67acfmxazb4p****</p>
     */
    @NameInMap("KeyPairId")
    public String keyPairId;

    /**
     * <p>The name of the key pair.</p>
     * 
     * <strong>example:</strong>
     * <p>testKeyPairName</p>
     */
    @NameInMap("KeyPairName")
    public String keyPairName;

    /**
     * <p>The private key of the key pair. The private key is encoded with PEM in the PKCS#8 format.</p>
     * 
     * <strong>example:</strong>
     * <p>MIIEpAIBAAKCAQEAtReyMzLIcBH78EV2zj****</p>
     */
    @NameInMap("PrivateKeyBody")
    public String privateKeyBody;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
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
