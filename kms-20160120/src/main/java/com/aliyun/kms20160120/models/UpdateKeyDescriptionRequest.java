// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class UpdateKeyDescriptionRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("KeyId")
    public String keyId;

    public static UpdateKeyDescriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateKeyDescriptionRequest self = new UpdateKeyDescriptionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateKeyDescriptionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateKeyDescriptionRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

}
