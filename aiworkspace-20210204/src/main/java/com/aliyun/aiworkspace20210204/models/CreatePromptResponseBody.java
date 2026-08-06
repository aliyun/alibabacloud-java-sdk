// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreatePromptResponseBody extends TeaModel {
    /**
     * <p>The prompt ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pmt-axbxtc****xxx</p>
     */
    @NameInMap("PromptId")
    public String promptId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5A14FA81-DD4E-******-6343FE44B941</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreatePromptResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePromptResponseBody self = new CreatePromptResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePromptResponseBody setPromptId(String promptId) {
        this.promptId = promptId;
        return this;
    }
    public String getPromptId() {
        return this.promptId;
    }

    public CreatePromptResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
