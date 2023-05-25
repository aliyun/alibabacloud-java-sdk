// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateBackendModelResponseBody extends TeaModel {
    @NameInMap("BackendModelId")
    public String backendModelId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateBackendModelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateBackendModelResponseBody self = new CreateBackendModelResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateBackendModelResponseBody setBackendModelId(String backendModelId) {
        this.backendModelId = backendModelId;
        return this;
    }
    public String getBackendModelId() {
        return this.backendModelId;
    }

    public CreateBackendModelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
