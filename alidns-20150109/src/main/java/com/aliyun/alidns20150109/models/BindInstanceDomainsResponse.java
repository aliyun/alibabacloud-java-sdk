// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class BindInstanceDomainsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("SuccessCount")
    @Validation(required = true)
    public Integer successCount;

    @NameInMap("FailedCount")
    @Validation(required = true)
    public Integer failedCount;

    public static BindInstanceDomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        BindInstanceDomainsResponse self = new BindInstanceDomainsResponse();
        return TeaModel.build(map, self);
    }

}
