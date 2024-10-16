// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class DeletePromptTemplateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>FE9B6CBF-47E6-5D76-9C5D-B814DD5ABxxx</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DeletePromptTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePromptTemplateResponseBody self = new DeletePromptTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePromptTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
