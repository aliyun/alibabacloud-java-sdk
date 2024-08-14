// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DeleteKeyMaterialRequest extends TeaModel {
    /**
     * <p>The globally unique ID of the CMK.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234abcd-12ab-34cd-56ef-12345678****</p>
     */
    @NameInMap("KeyId")
    public String keyId;

    public static DeleteKeyMaterialRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteKeyMaterialRequest self = new DeleteKeyMaterialRequest();
        return TeaModel.build(map, self);
    }

    public DeleteKeyMaterialRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

}
