// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.jarvis_public20180621.models;

import com.aliyun.tea.*;

public class CreateConsoleAccessWhiteListResponseBody extends TeaModel {
    @NameInMap("Module")
    public String module;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateConsoleAccessWhiteListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateConsoleAccessWhiteListResponseBody self = new CreateConsoleAccessWhiteListResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateConsoleAccessWhiteListResponseBody setModule(String module) {
        this.module = module;
        return this;
    }
    public String getModule() {
        return this.module;
    }

    public CreateConsoleAccessWhiteListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
