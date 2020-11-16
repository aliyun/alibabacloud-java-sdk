// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveDomainMappingResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteLiveDomainMappingResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveDomainMappingResponse self = new DeleteLiveDomainMappingResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLiveDomainMappingResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
