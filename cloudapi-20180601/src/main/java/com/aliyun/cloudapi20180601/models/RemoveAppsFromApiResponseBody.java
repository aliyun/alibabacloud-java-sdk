// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20180601.models;

import com.aliyun.tea.*;

public class RemoveAppsFromApiResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveAppsFromApiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveAppsFromApiResponseBody self = new RemoveAppsFromApiResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveAppsFromApiResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
