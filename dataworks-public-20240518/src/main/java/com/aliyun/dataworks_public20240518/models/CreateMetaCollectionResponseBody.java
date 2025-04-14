// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateMetaCollectionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>category.123</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>E6F0DBDD-5AD****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateMetaCollectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMetaCollectionResponseBody self = new CreateMetaCollectionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMetaCollectionResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateMetaCollectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
