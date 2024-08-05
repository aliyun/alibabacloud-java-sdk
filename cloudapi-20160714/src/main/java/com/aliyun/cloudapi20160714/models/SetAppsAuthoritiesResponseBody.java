// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class SetAppsAuthoritiesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>D6E46F10-F26C-4AA0-BB69-FE2743D9AE62</p>
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
