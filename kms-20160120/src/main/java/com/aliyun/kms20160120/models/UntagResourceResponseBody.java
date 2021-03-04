// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class UntagResourceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UntagResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UntagResourceResponseBody self = new UntagResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public UntagResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
