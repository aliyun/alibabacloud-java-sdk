// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateKeyPairRequest extends TeaModel {
    /**
     * <p>The name of the key pair. The name must conform to the following naming conventions:</p>
     * <br>
     * <p>*   The name must be 2 to 128 characters in length, and can contain letters, digits, colons (:), underscores (\_), and hyphens (-).</p>
     * <p>*   It must start with a letter but cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("KeyPairName")
    public String keyPairName;

    public static CreateKeyPairRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateKeyPairRequest self = new CreateKeyPairRequest();
        return TeaModel.build(map, self);
    }

    public CreateKeyPairRequest setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

}
