// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class SetApisAuthoritiesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetApisAuthoritiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetApisAuthoritiesResponseBody self = new SetApisAuthoritiesResponseBody();
        return TeaModel.build(map, self);
    }

    public SetApisAuthoritiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
