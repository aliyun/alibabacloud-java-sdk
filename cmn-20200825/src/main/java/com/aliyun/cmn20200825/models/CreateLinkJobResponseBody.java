// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateLinkJobResponseBody extends TeaModel {
    // 若创建接口为异步实现，则需返回明确的JobId。
    @NameInMap("Content")
    public String content;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static CreateLinkJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkJobResponseBody self = new CreateLinkJobResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLinkJobResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateLinkJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
