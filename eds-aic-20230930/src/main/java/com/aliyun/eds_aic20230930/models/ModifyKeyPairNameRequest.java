// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class ModifyKeyPairNameRequest extends TeaModel {
    /**
     * <p>The ID of the ADB key pair.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>kp-6v2q33ae4tw3a****</p>
     */
    @NameInMap("KeyPairId")
    public String keyPairId;

    /**
     * <p>The name of the ADB key pair.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>newKeyPairName</p>
     */
    @NameInMap("NewKeyPairName")
    public String newKeyPairName;

    public static ModifyKeyPairNameRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyKeyPairNameRequest self = new ModifyKeyPairNameRequest();
        return TeaModel.build(map, self);
    }

    public ModifyKeyPairNameRequest setKeyPairId(String keyPairId) {
        this.keyPairId = keyPairId;
        return this;
    }
    public String getKeyPairId() {
        return this.keyPairId;
    }

    public ModifyKeyPairNameRequest setNewKeyPairName(String newKeyPairName) {
        this.newKeyPairName = newKeyPairName;
        return this;
    }
    public String getNewKeyPairName() {
        return this.newKeyPairName;
    }

}
