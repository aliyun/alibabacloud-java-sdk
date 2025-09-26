// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class PublishRuntimeVersionInput extends TeaModel {
    /**
     * <p>此版本的描述</p>
     */
    @NameInMap("description")
    public String description;

    public static PublishRuntimeVersionInput build(java.util.Map<String, ?> map) throws Exception {
        PublishRuntimeVersionInput self = new PublishRuntimeVersionInput();
        return TeaModel.build(map, self);
    }

    public PublishRuntimeVersionInput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
