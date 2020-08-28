// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CancelKeyDeletionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static CancelKeyDeletionResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelKeyDeletionResponse self = new CancelKeyDeletionResponse();
        return TeaModel.build(map, self);
    }

}
