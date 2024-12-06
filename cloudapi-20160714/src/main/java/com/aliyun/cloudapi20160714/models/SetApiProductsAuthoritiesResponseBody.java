// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class SetApiProductsAuthoritiesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2603F41E-77FC-59A3-840E-296578A9BDE0</p>
     */
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
