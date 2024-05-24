// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class DeleteTaskTemplateResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    public static DeleteTaskTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteTaskTemplateResponseBody self = new DeleteTaskTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteTaskTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
