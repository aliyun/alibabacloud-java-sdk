// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class RemoveApisAuthoritiesResponseBody extends TeaModel {
    /**
     * <p>Revokes the access permissions on multiple APIs from a specified app.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveApisAuthoritiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveApisAuthoritiesResponseBody self = new RemoveApisAuthoritiesResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveApisAuthoritiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
