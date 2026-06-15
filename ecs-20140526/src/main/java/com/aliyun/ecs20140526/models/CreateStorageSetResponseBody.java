// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateStorageSetResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StorageSetId")
    public String storageSetId;

    public static CreateStorageSetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateStorageSetResponseBody self = new CreateStorageSetResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateStorageSetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateStorageSetResponseBody setStorageSetId(String storageSetId) {
        this.storageSetId = storageSetId;
        return this;
    }
    public String getStorageSetId() {
        return this.storageSetId;
    }

}
