// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DisableKeyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DisableKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableKeyResponse self = new DisableKeyResponse();
        return TeaModel.build(map, self);
    }

}
