// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateBackendModelResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>4be6b110b7aa40b0bf0c83cc00b3bd86</p>
     */
    @NameInMap("BackendModelId")
    public String backendModelId;

    /**
     * <strong>example:</strong>
     * <p>64411ECF-FAF7-5E3C-BA7B-E4A1F15A28CA</p>
     */
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
