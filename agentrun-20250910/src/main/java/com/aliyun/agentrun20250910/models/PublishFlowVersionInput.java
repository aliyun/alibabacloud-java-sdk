// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class PublishFlowVersionInput extends TeaModel {
    /**
     * <p>工作流版本的描述信息</p>
     * 
     * <strong>example:</strong>
     * <p>Version 1.0 - Initial release</p>
     */
    @NameInMap("description")
    public String description;

    public static PublishFlowVersionInput build(java.util.Map<String, ?> map) throws Exception {
        PublishFlowVersionInput self = new PublishFlowVersionInput();
        return TeaModel.build(map, self);
    }

    public PublishFlowVersionInput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
