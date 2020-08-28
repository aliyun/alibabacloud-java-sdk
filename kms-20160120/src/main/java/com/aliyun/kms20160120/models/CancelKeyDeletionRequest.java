// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CancelKeyDeletionRequest extends TeaModel {
    @NameInMap("KeyId")
    @Validation(required = true)
    public String keyId;

    public static CancelKeyDeletionRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelKeyDeletionRequest self = new CancelKeyDeletionRequest();
        return TeaModel.build(map, self);
    }

}
