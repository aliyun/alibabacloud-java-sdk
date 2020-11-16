// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveDomainMappingResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static AddLiveDomainMappingResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLiveDomainMappingResponse self = new AddLiveDomainMappingResponse();
        return TeaModel.build(map, self);
    }

    public AddLiveDomainMappingResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
