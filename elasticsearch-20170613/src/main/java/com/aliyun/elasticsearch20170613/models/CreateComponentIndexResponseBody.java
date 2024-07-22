// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class CreateComponentIndexResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>C20022BA-5382-4339-89FB-30AF48A05431</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Result")
    public Boolean result;

    public static CreateComponentIndexResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateComponentIndexResponseBody self = new CreateComponentIndexResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateComponentIndexResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateComponentIndexResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
