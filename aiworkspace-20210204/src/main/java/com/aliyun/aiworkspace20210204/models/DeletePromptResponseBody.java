// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DeletePromptResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A0F049F0-8D69-5BAC-8F10-B******A34C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeletePromptResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePromptResponseBody self = new DeletePromptResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePromptResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
