// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateCodeSourceResponseBody extends TeaModel {
    // 创建的代码源配置的ID
    @NameInMap("CodeSourceId")
    public String codeSourceId;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    public static CreateCodeSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCodeSourceResponseBody self = new CreateCodeSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCodeSourceResponseBody setCodeSourceId(String codeSourceId) {
        this.codeSourceId = codeSourceId;
        return this;
    }
    public String getCodeSourceId() {
        return this.codeSourceId;
    }

    public CreateCodeSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
