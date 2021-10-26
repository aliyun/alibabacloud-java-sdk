// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class RemoveAppsAuthoritiesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveAppsAuthoritiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveAppsAuthoritiesResponseBody self = new RemoveAppsAuthoritiesResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveAppsAuthoritiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
