// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class SetApiProductsAuthoritiesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetApiProductsAuthoritiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetApiProductsAuthoritiesResponseBody self = new SetApiProductsAuthoritiesResponseBody();
        return TeaModel.build(map, self);
    }

    public SetApiProductsAuthoritiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
