// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class DeletePipelineTemplateResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    public static DeletePipelineTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePipelineTemplateResponseBody self = new DeletePipelineTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePipelineTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
