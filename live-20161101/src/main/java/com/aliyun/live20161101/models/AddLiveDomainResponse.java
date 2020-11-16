// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveDomainResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static AddLiveDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLiveDomainResponse self = new AddLiveDomainResponse();
        return TeaModel.build(map, self);
    }

    public AddLiveDomainResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
