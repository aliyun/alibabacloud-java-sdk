// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateBackendResponseBody extends TeaModel {
    @NameInMap("BackendId")
    public String backendId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateBackendResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateBackendResponseBody self = new CreateBackendResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateBackendResponseBody setBackendId(String backendId) {
        this.backendId = backendId;
        return this;
    }
    public String getBackendId() {
        return this.backendId;
    }

    public CreateBackendResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
