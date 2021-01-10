// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class PublishAppVersionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static PublishAppVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PublishAppVersionResponseBody self = new PublishAppVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public PublishAppVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
