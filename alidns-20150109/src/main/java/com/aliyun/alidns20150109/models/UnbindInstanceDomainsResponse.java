// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UnbindInstanceDomainsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("SuccessCount")
    @Validation(required = true)
    public Integer successCount;

    @NameInMap("FailedCount")
    @Validation(required = true)
    public Integer failedCount;

    public static UnbindInstanceDomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindInstanceDomainsResponse self = new UnbindInstanceDomainsResponse();
        return TeaModel.build(map, self);
    }

}
