// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DeleteCodeSourceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>code-20210111103721-85qz78ia96lu</p>
     */
    @NameInMap("CodeSourceId")
    public String codeSourceId;

    /**
     * <strong>example:</strong>
     * <p>5A14FA81-DD4E-******-6343FE44B941</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteCodeSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCodeSourceResponseBody self = new DeleteCodeSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCodeSourceResponseBody setCodeSourceId(String codeSourceId) {
        this.codeSourceId = codeSourceId;
        return this;
    }
    public String getCodeSourceId() {
        return this.codeSourceId;
    }

    public DeleteCodeSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
