// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class SetAppsAuthToApiProductResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetAppsAuthToApiProductResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetAppsAuthToApiProductResponseBody self = new SetAppsAuthToApiProductResponseBody();
        return TeaModel.build(map, self);
    }

    public SetAppsAuthToApiProductResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
