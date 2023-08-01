// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ImportKeyPairResponseBody extends TeaModel {
    /**
     * <p>The fingerprint of the key pair. The MD5 message-digest algorithm is used based on the public key fingerprint format defined in RFC 4716.</p>
     */
    @NameInMap("KeyPairFingerPrint")
    public String keyPairFingerPrint;

    /**
     * <p>The name of the key pair.</p>
     */
    @NameInMap("KeyPairName")
    public String keyPairName;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ImportKeyPairResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImportKeyPairResponseBody self = new ImportKeyPairResponseBody();
        return TeaModel.build(map, self);
    }

    public ImportKeyPairResponseBody setKeyPairFingerPrint(String keyPairFingerPrint) {
        this.keyPairFingerPrint = keyPairFingerPrint;
        return this;
    }
    public String getKeyPairFingerPrint() {
        return this.keyPairFingerPrint;
    }

    public ImportKeyPairResponseBody setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public ImportKeyPairResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
