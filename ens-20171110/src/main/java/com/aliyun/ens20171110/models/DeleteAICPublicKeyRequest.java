// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteAICPublicKeyRequest extends TeaModel {
    /**
     * <p>Public Key Name</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mykey</p>
     */
    @NameInMap("KeyName")
    public String keyName;

    public static DeleteAICPublicKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAICPublicKeyRequest self = new DeleteAICPublicKeyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAICPublicKeyRequest setKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }
    public String getKeyName() {
        return this.keyName;
    }

}
