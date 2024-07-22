// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateIndexTemplateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>F99407AB-2FA9-489E-A259-40CF6DCC****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>my-template</p>
     */
    @NameInMap("Result")
    public String result;

    public static UpdateIndexTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateIndexTemplateResponseBody self = new UpdateIndexTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateIndexTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateIndexTemplateResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
