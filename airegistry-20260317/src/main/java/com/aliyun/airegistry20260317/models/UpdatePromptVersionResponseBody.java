// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class UpdatePromptVersionResponseBody extends TeaModel {
    @NameInMap("Data")
    public Boolean data;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdatePromptVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdatePromptVersionResponseBody self = new UpdatePromptVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdatePromptVersionResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public UpdatePromptVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
