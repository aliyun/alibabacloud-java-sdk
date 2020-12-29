// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class PublishRouteEntriesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static PublishRouteEntriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PublishRouteEntriesResponseBody self = new PublishRouteEntriesResponseBody();
        return TeaModel.build(map, self);
    }

    public PublishRouteEntriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
