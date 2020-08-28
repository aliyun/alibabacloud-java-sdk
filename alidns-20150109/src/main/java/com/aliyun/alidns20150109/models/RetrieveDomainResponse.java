// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class RetrieveDomainResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static RetrieveDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        RetrieveDomainResponse self = new RetrieveDomainResponse();
        return TeaModel.build(map, self);
    }

}
