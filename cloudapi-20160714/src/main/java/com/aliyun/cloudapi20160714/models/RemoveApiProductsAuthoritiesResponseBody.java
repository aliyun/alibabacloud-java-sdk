// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class RemoveApiProductsAuthoritiesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveApiProductsAuthoritiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveApiProductsAuthoritiesResponseBody self = new RemoveApiProductsAuthoritiesResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveApiProductsAuthoritiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
