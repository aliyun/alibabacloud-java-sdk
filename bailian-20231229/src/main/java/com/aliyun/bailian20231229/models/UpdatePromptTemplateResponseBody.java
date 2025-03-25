// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class UpdatePromptTemplateResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FE9B6CBF-47E6-5D76-9C5D-B814DD5ABxxx</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdatePromptTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdatePromptTemplateResponseBody self = new UpdatePromptTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdatePromptTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
