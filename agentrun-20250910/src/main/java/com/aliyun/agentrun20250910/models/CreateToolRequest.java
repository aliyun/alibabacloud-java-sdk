// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CreateToolRequest extends TeaModel {
    /**
     * <p>创建工具的请求参数，包含工具的所有配置信息</p>
     */
    @NameInMap("body")
    public CreateToolInputV2 body;

    public static CreateToolRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateToolRequest self = new CreateToolRequest();
        return TeaModel.build(map, self);
    }

    public CreateToolRequest setBody(CreateToolInputV2 body) {
        this.body = body;
        return this;
    }
    public CreateToolInputV2 getBody() {
        return this.body;
    }

}
