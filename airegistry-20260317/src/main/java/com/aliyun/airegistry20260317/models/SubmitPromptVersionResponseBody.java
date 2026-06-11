// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class SubmitPromptVersionResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    public static SubmitPromptVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitPromptVersionResponseBody self = new SubmitPromptVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitPromptVersionResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public SubmitPromptVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
