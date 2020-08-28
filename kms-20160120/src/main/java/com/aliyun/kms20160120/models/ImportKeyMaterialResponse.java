// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ImportKeyMaterialResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ImportKeyMaterialResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportKeyMaterialResponse self = new ImportKeyMaterialResponse();
        return TeaModel.build(map, self);
    }

}
