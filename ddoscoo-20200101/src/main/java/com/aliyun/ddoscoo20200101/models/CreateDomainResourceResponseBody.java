// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class CreateDomainResourceResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
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
