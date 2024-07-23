// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ImportKeyPairResponseBody extends TeaModel {
    /**
     * <p>The fingerprint of the key pair. The MD5 message-digest algorithm is used based on the public key fingerprint format defined in RFC 4716.</p>
     * 
     * <strong>example:</strong>
     * <p>89:f0:ba:62:ac:b8:aa:e1:61:5e:fd:81:69:86:6d:6b:f0:c0:5a:**</p>
     */
    @NameInMap("KeyPairFingerPrint")
    public String keyPairFingerPrint;

    /**
     * <p>The name of the key pair.</p>
     * 
     * <strong>example:</strong>
     * <p>testKeyPairName</p>
     */
    @NameInMap("KeyPairName")
    public String keyPairName;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
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
