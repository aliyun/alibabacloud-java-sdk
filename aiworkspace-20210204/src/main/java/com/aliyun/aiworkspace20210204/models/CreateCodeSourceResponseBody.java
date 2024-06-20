// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateCodeSourceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>code-20********</p>
     */
    @NameInMap("CodeSourceId")
    public String codeSourceId;

    /**
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3**********</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateCodeSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCodeSourceResponseBody self = new CreateCodeSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCodeSourceResponseBody setCodeSourceId(String codeSourceId) {
        this.codeSourceId = codeSourceId;
        return this;
    }
    public String getCodeSourceId() {
        return this.codeSourceId;
    }

    public CreateCodeSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
