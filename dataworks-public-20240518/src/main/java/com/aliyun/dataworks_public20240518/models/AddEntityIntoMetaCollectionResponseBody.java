// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class AddEntityIntoMetaCollectionResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>C99E2BE6-9DEA-5C2E-8F51-1DDCFEADE490</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddEntityIntoMetaCollectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddEntityIntoMetaCollectionResponseBody self = new AddEntityIntoMetaCollectionResponseBody();
        return TeaModel.build(map, self);
    }

    public AddEntityIntoMetaCollectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
