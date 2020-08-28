// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DeleteKeyMaterialResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteKeyMaterialResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteKeyMaterialResponse self = new DeleteKeyMaterialResponse();
        return TeaModel.build(map, self);
    }

}
