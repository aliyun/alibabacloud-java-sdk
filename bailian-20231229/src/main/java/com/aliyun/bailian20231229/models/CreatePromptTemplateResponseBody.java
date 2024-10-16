// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class CreatePromptTemplateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>6e49109bfeb94a39bb268f4e483ccxxx</p>
     */
    @NameInMap("promptTemplateId")
    public String promptTemplateId;

    /**
     * <strong>example:</strong>
     * <p>FE9B6CBF-47E6-5D76-9C5D-B814DD5ABxxx</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreatePromptTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePromptTemplateResponseBody self = new CreatePromptTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePromptTemplateResponseBody setPromptTemplateId(String promptTemplateId) {
        this.promptTemplateId = promptTemplateId;
        return this;
    }
    public String getPromptTemplateId() {
        return this.promptTemplateId;
    }

    public CreatePromptTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
