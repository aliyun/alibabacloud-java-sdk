// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CreateKeyVersionRequest extends TeaModel {
    @NameInMap("KeyId")
    @Validation(required = true)
    public String keyId;

    public static CreateKeyVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateKeyVersionRequest self = new CreateKeyVersionRequest();
        return TeaModel.build(map, self);
    }

}
