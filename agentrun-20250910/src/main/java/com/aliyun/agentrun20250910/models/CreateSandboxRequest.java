// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CreateSandboxRequest extends TeaModel {
    /**
     * <p>创建沙箱所需的配置信息，包括模板名称、沙箱名称等</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public CreateSandboxInput body;

    public static CreateSandboxRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSandboxRequest self = new CreateSandboxRequest();
        return TeaModel.build(map, self);
    }

    public CreateSandboxRequest setBody(CreateSandboxInput body) {
        this.body = body;
        return this;
    }
    public CreateSandboxInput getBody() {
        return this.body;
    }

}
