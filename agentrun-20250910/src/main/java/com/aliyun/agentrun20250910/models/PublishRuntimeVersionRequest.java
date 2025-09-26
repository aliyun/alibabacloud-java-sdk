// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class PublishRuntimeVersionRequest extends TeaModel {
    @NameInMap("body")
    public PublishRuntimeVersionInput body;

    public static PublishRuntimeVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishRuntimeVersionRequest self = new PublishRuntimeVersionRequest();
        return TeaModel.build(map, self);
    }

    public PublishRuntimeVersionRequest setBody(PublishRuntimeVersionInput body) {
        this.body = body;
        return this;
    }
    public PublishRuntimeVersionInput getBody() {
        return this.body;
    }

}
