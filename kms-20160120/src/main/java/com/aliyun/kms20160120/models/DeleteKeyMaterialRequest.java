// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DeleteKeyMaterialRequest extends TeaModel {
    @NameInMap("KeyId")
    @Validation(required = true)
    public String keyId;

    public static DeleteKeyMaterialRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteKeyMaterialRequest self = new DeleteKeyMaterialRequest();
        return TeaModel.build(map, self);
    }

}
