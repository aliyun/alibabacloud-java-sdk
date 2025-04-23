// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class UpdateCodeSourceResponseBody extends TeaModel {
    /**
     * <p>The ID of the code build.</p>
     * 
     * <strong>example:</strong>
     * <p>code-20********</p>
     */
    @NameInMap("CodeSourceId")
    public String codeSourceId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>40325405-579C-4D82****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateCodeSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateCodeSourceResponseBody self = new UpdateCodeSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateCodeSourceResponseBody setCodeSourceId(String codeSourceId) {
        this.codeSourceId = codeSourceId;
        return this;
    }
    public String getCodeSourceId() {
        return this.codeSourceId;
    }

    public UpdateCodeSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
