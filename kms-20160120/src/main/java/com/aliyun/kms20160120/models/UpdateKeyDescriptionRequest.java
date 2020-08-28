// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class UpdateKeyDescriptionRequest extends TeaModel {
    @NameInMap("KeyId")
    @Validation(required = true)
    public String keyId;

    @NameInMap("Description")
    @Validation(required = true)
    public String description;

    public static UpdateKeyDescriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateKeyDescriptionRequest self = new UpdateKeyDescriptionRequest();
        return TeaModel.build(map, self);
    }

}
