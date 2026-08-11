// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateDomainMetaResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>019F68A7-D149-5BE5-9B35-5D59BAE545B3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateDomainMetaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDomainMetaResponseBody self = new UpdateDomainMetaResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDomainMetaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
