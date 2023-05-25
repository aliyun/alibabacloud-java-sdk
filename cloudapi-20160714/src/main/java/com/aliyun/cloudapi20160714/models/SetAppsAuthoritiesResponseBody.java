// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class SetAppsAuthoritiesResponseBody extends TeaModel {
    /**
     * <p>Grants access permissions on a specified API to multiple apps.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetAppsAuthoritiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetAppsAuthoritiesResponseBody self = new SetAppsAuthoritiesResponseBody();
        return TeaModel.build(map, self);
    }

    public SetAppsAuthoritiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
