// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class CreatePromptResponseBody extends TeaModel {
    /**
     * <p>Draft version number of the created prompt</p>
     * 
     * <strong>example:</strong>
     * <p>0.0.1</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>D9E87E66-9EF0-5C10-A5E6-924020A0C9B7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreatePromptResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePromptResponseBody self = new CreatePromptResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePromptResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CreatePromptResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
