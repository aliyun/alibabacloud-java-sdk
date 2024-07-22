// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DeleteIndexTemplateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>A0761F7E-0B50-46B9-8CAA-EBB3A420****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Result")
    public Boolean result;

    public static DeleteIndexTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteIndexTemplateResponseBody self = new DeleteIndexTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteIndexTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteIndexTemplateResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
