// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ImportKeyPairRequest extends TeaModel {
    @NameInMap("Version")
    @Validation(required = true)
    public String version;

    @NameInMap("KeyPairName")
    @Validation(required = true)
    public String keyPairName;

    @NameInMap("PublicKeyBody")
    @Validation(required = true)
    public String publicKeyBody;

    public static ImportKeyPairRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportKeyPairRequest self = new ImportKeyPairRequest();
        return TeaModel.build(map, self);
    }

    public ImportKeyPairRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public ImportKeyPairRequest setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public ImportKeyPairRequest setPublicKeyBody(String publicKeyBody) {
        this.publicKeyBody = publicKeyBody;
        return this;
    }
    public String getPublicKeyBody() {
        return this.publicKeyBody;
    }

}
