// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class CreateAppSessionBatchResponseBody extends TeaModel {
    // 自定义会话id
    @NameInMap("CustomTaskId")
    public String customTaskId;

    // 平台会话id
    @NameInMap("PlatformTaskId")
    public String platformTaskId;

    // 请求id
    @NameInMap("RequestId")
    public String requestId;

    public static CreateAppSessionBatchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAppSessionBatchResponseBody self = new CreateAppSessionBatchResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAppSessionBatchResponseBody setCustomTaskId(String customTaskId) {
        this.customTaskId = customTaskId;
        return this;
    }
    public String getCustomTaskId() {
        return this.customTaskId;
    }

    public CreateAppSessionBatchResponseBody setPlatformTaskId(String platformTaskId) {
        this.platformTaskId = platformTaskId;
        return this;
    }
    public String getPlatformTaskId() {
        return this.platformTaskId;
    }

    public CreateAppSessionBatchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
