// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateStorageSetResponseBody extends TeaModel {
    @NameInMap("StorageSetId")
    public String storageSetId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateStorageSetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateStorageSetResponseBody self = new CreateStorageSetResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateStorageSetResponseBody setStorageSetId(String storageSetId) {
        this.storageSetId = storageSetId;
        return this;
    }
    public String getStorageSetId() {
        return this.storageSetId;
    }

    public CreateStorageSetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
