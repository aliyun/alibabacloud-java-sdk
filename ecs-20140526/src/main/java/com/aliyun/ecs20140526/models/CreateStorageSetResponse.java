// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateStorageSetResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("StorageSetId")
    @Validation(required = true)
    public String storageSetId;

    public static CreateStorageSetResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateStorageSetResponse self = new CreateStorageSetResponse();
        return TeaModel.build(map, self);
    }

    public CreateStorageSetResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateStorageSetResponse setStorageSetId(String storageSetId) {
        this.storageSetId = storageSetId;
        return this;
    }
    public String getStorageSetId() {
        return this.storageSetId;
    }

}
