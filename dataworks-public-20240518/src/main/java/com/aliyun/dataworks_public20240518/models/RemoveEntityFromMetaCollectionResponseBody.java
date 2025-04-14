// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class RemoveEntityFromMetaCollectionResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6D6CD444-DFA0-5180-9763-4A8730F2B382</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveEntityFromMetaCollectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveEntityFromMetaCollectionResponseBody self = new RemoveEntityFromMetaCollectionResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveEntityFromMetaCollectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
