// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class DeletePromptResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the operation is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D9E87E66-9EF0-5C10-A5E6-924020A0C9B7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeletePromptResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePromptResponseBody self = new DeletePromptResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePromptResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public DeletePromptResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
