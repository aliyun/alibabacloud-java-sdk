// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class CreateKeyPairRequest extends TeaModel {
    /**
     * <p>The name of the key pair. The name must be 2 to 128 characters in length and can contain letters, digits, colons (:), underscores (_), and hyphens (-). The name must start with a letter but cannot start with http:// or https://.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testKeyPairName</p>
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
