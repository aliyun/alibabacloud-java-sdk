// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class CreateStorageCollectorResponseBody extends TeaModel {
    @NameInMap("Id")
    public String id;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateStorageCollectorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateStorageCollectorResponseBody self = new CreateStorageCollectorResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateStorageCollectorResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateStorageCollectorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateStorageCollectorResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
