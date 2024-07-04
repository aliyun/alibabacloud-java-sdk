// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20180528.models;

import com.aliyun.tea.*;

public class BindInputBucketResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static BindInputBucketResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindInputBucketResponseBody self = new BindInputBucketResponseBody();
        return TeaModel.build(map, self);
    }

    public BindInputBucketResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
