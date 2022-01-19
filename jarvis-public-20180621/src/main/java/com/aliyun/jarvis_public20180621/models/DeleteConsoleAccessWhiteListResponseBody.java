// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.jarvis_public20180621.models;

import com.aliyun.tea.*;

public class DeleteConsoleAccessWhiteListResponseBody extends TeaModel {
    @NameInMap("Module")
    public String module;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteConsoleAccessWhiteListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteConsoleAccessWhiteListResponseBody self = new DeleteConsoleAccessWhiteListResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteConsoleAccessWhiteListResponseBody setModule(String module) {
        this.module = module;
        return this;
    }
    public String getModule() {
        return this.module;
    }

    public DeleteConsoleAccessWhiteListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
