// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CreateTemplateRequest extends TeaModel {
    /**
     * <p>创建模板所需的完整配置信息，包括模板名称、类型、资源规格、网络配置等</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public CreateTemplateInput body;

    public static CreateTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTemplateRequest self = new CreateTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateTemplateRequest setBody(CreateTemplateInput body) {
        this.body = body;
        return this;
    }
    public CreateTemplateInput getBody() {
        return this.body;
    }

}
