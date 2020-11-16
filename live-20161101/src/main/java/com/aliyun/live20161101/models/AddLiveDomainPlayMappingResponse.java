// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveDomainPlayMappingResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static AddLiveDomainPlayMappingResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLiveDomainPlayMappingResponse self = new AddLiveDomainPlayMappingResponse();
        return TeaModel.build(map, self);
    }

    public AddLiveDomainPlayMappingResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
