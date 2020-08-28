// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class EnableKeyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static EnableKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableKeyResponse self = new EnableKeyResponse();
        return TeaModel.build(map, self);
    }

}
