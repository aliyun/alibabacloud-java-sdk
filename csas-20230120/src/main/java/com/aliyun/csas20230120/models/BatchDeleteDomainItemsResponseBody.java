// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class BatchDeleteDomainItemsResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>0C76C4AD-5E46-555D-981B-CB004C37F41A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static BatchDeleteDomainItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteDomainItemsResponseBody self = new BatchDeleteDomainItemsResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchDeleteDomainItemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
