// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class ImportKeyPairRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("KeyPairName")
    public String keyPairName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PublicKeyBody")
    public String publicKeyBody;

    public static ImportKeyPairRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportKeyPairRequest self = new ImportKeyPairRequest();
        return TeaModel.build(map, self);
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
