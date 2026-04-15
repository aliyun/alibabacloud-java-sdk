// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ConvertFlowDSLRequest extends TeaModel {
    /**
     * <p>包含待转换的工作流DSL内容和转换选项，支持多种DSL格式（如Dify、n8n等）以及inline和base64两种输入方式</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public ConvertFlowDSLInput body;

    public static ConvertFlowDSLRequest build(java.util.Map<String, ?> map) throws Exception {
        ConvertFlowDSLRequest self = new ConvertFlowDSLRequest();
        return TeaModel.build(map, self);
    }

    public ConvertFlowDSLRequest setBody(ConvertFlowDSLInput body) {
        this.body = body;
        return this;
    }
    public ConvertFlowDSLInput getBody() {
        return this.body;
    }

}
