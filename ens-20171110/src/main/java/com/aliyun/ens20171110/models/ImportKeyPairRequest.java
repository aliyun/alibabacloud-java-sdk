// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ImportKeyPairRequest extends TeaModel {
    /**
     * <p>The name of the key pair. The name must conform to the following naming conventions:</p>
     * <br>
     * <p>*   The name must be 2 to 128 characters in length.</p>
     * <p>*   The name must start with a letter but cannot start with `http://` or `https://`.</p>
     * <p>*   The name can contain letters, digits, colons (:), underscores (\_), and hyphens (-).</p>
     * <br>
     * <p>You can specify the name of only one key pair.</p>
     */
    @NameInMap("KeyPairName")
    public String keyPairName;

    /**
     * <p>The public key of the key pair. You can specify only one public key.</p>
     */
    @NameInMap("PublicKeyBody")
    public String publicKeyBody;

    /**
     * <p>The version number. Set the value to 2017-11-10.</p>
     */
    @NameInMap("Version")
    public String version;

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

    public ImportKeyPairRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
