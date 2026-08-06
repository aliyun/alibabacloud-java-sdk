// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class UpdatePromptResponseBody extends TeaModel {
    /**
     * <p>The modification result.</p>
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

    public static UpdatePromptResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdatePromptResponseBody self = new UpdatePromptResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdatePromptResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public UpdatePromptResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
