// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class UntagResourceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static UntagResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        UntagResourceResponse self = new UntagResourceResponse();
        return TeaModel.build(map, self);
    }

}
