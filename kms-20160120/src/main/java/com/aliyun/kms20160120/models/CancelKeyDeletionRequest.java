// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CancelKeyDeletionRequest extends TeaModel {
    /**
     * <p>The ID of the CMK. The ID must be globally unique.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("KeyId")
    public String keyId;

    public static CancelKeyDeletionRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelKeyDeletionRequest self = new CancelKeyDeletionRequest();
        return TeaModel.build(map, self);
    }

    public CancelKeyDeletionRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

}
