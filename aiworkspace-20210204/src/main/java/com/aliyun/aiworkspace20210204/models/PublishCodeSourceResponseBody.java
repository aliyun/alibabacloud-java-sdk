// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class PublishCodeSourceResponseBody extends TeaModel {
    // 被删除的代码源配置ID
    @NameInMap("CodeSourceId")
    public String codeSourceId;

    @NameInMap("RequestId")
    public String requestId;

    public static PublishCodeSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PublishCodeSourceResponseBody self = new PublishCodeSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public PublishCodeSourceResponseBody setCodeSourceId(String codeSourceId) {
        this.codeSourceId = codeSourceId;
        return this;
    }
    public String getCodeSourceId() {
        return this.codeSourceId;
    }

    public PublishCodeSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
