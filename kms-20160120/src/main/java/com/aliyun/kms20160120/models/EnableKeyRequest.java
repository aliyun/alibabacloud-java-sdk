// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class EnableKeyRequest extends TeaModel {
    @NameInMap("KeyId")
    @Validation(required = true)
    public String keyId;

    public static EnableKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableKeyRequest self = new EnableKeyRequest();
        return TeaModel.build(map, self);
    }

}
