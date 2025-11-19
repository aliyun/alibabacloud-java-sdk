// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class PublishRuntimeVersionInput extends TeaModel {
    /**
     * <p>此版本的描述</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>发布此版本的用户或系统标识</p>
     * 
     * <strong>example:</strong>
     * <p>user123</p>
     */
    @NameInMap("publisher")
    public String publisher;

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

    public PublishRuntimeVersionInput setPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }
    public String getPublisher() {
        return this.publisher;
    }

}
