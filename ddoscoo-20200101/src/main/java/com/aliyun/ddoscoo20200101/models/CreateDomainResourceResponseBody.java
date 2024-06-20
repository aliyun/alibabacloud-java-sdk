// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class CreateDomainResourceResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>39499F01-19D9-4EA4-A0E9-C6014BA5CDBE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDomainResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDomainResourceResponseBody self = new CreateDomainResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDomainResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
