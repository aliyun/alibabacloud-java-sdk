// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class BatchCreateDomainItemsResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1A4859B9-0DAD-5B40-B603-254445DC6D45</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static BatchCreateDomainItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateDomainItemsResponseBody self = new BatchCreateDomainItemsResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchCreateDomainItemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
